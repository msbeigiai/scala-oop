package com.msbeigi.blog.services

import com.msbeigi.blog.database.DatabaseObj.{PostDatabase, posts}
import com.msbeigi.blog.domain.Domains
import com.msbeigi.blog.domain.Domains.Post
import com.msbeigi.blog.repositorie.Repositories.PostRepository
import scala.collection.mutable
object Service {

  class PostService {
    private val postRepository: PostRepository = new PostDatabase
    def findById(id: Int): Post = postRepository.findPostById(id).getOrElse(Post(0))
    def findAll: mutable.Seq[Post] = postRepository.allPosts

    def addPost(post: Post): mutable.Seq[Post] = postRepository.addPost(post)
  }

}
