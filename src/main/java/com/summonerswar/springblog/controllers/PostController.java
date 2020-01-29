package com.summonerswar.springblog.controllers;

import com.summonerswar.springblog.models.Post;
import com.summonerswar.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping(path = "/posts/{id}")
    public String singlePost(@PathVariable long id, Model model){
        Post post1 = new Post(id, "Title 1", "Description 1");
        model.addAttribute("title", post1.getTitle());
        model.addAttribute("body", post1.getBody());
        return "posts/show";
    }

    // DEPENDENCY INJECTION
    private PostRepository postDao;
    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }

    @GetMapping(path = "/posts")
    public String postsIndex(Model model){
    model.addAttribute("posts", postDao.findAll());
    //        ArrayList<Post> postList = new ArrayList<Post>();
    //        postList.add(new Post(2,"Title 2", "Description 2"));
    //        postList.add(new Post(3,"Title 3", "Description 3"));
    //        model.addAttribute("posts",postList);
        return "posts/index";
    }

    // EDIT POSTS
    @GetMapping("/posts/{id}/edit")
    public String viewEditPostForm(@PathVariable long id, Model model){
        model.addAttribute("post",postDao.getOne(id));
        return "posts/edit";
    }

    @GetMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @RequestParam String title, @RequestParam String body){ //name attribute on form determines param
        Post p = new Post(
               id,
               title,
               body
        );
        postDao.save(p);
        return "redirect:/posts";
    }

    // DELETE POST
    @PostMapping("posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }




//    @GetMapping(path = "/posts/create") // GET
//    @ResponseBody
//    public String viewCreatePost(){
//        return "This is the view form to create a post";
//    }

    @GetMapping(path = "/posts/create") // POST
    @ResponseBody
    public String submitCreatePost(){
        return "This is the submit form to create a post";
    }
}
