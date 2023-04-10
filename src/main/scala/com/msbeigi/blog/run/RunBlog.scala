package com.msbeigi.blog.run

import com.msbeigi.blog.database.DatabaseObj.{PostDatabase, posts}
import com.msbeigi.blog.domain.Domains.Post
import com.msbeigi.blog.repositorie.Repositories
import com.msbeigi.blog.repositorie.Repositories.PostRepository
import com.msbeigi.blog.services.Service.PostService

import java.time.LocalDateTime


object RunBlog {

  def main(args: Array[String]): Unit = {
    val postService = new PostService
    /*println(postService.findById(1))
    println(postService.findAll)*/
    postService.addPost(Post(5, "How make a Kibab", "post description", LocalDateTime.now(), LocalDateTime.now()))
    println(postService.findAll)
    /*println(postService.findById(5))*/
  }

}
