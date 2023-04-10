package com.msbeigi.blog.repositorie

import com.msbeigi.blog.domain.Domains.*
import scala.collection.mutable


object Repositories {

  trait PostRepository {
    def findPostById(id: Int): Option[Post]
    def addPost(post: Post): mutable.Seq[Post]
    def allPosts: mutable.Seq[Post]
  }
}
