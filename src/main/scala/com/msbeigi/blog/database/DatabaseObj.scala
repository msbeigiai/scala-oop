package com.msbeigi.blog.database

import com.msbeigi.blog.domain.Domains.*
import com.msbeigi.blog.repositorie.Repositories.PostRepository

import scala.collection.mutable.Seq
import java.time.LocalDateTime
import scala.collection.mutable

object DatabaseObj {

  val posts: mutable.Seq[Post] = mutable.Seq (
    Post(1, "What skill needs Scala developer", "The post body", LocalDateTime.now(), LocalDateTime.now()),
    Post(2, "The most safest countries in the world", "The post body", LocalDateTime.now(), LocalDateTime.now()),
    Post(3, "Where to travel?", "The post body", LocalDateTime.now(), LocalDateTime.now()),
    Post(4, "How to make best cooks", "The post body", LocalDateTime.now(), LocalDateTime.now())
  )


  class PostDatabase extends PostRepository {
    private var dbPosts: mutable.Seq[Post] = posts
    override def findPostById(id: Int): Option[Post] = dbPosts.find(_.id == id)
    override def addPost(post: Post): mutable.Seq[Post] = {
      dbPosts = dbPosts :+ post
      dbPosts
    }
    override def allPosts: mutable.Seq[Post] = dbPosts
  }

}
