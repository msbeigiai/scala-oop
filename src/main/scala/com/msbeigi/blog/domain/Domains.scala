package com.msbeigi.blog.domain

import com.msbeigi.blog.database.DatabaseObj.posts
import com.msbeigi.blog.repositorie.Repositories.PostRepository

import java.time.LocalDateTime
import java.util.Date

object Domains {

  abstract class Article {
    def title: String
    def body: String
    def created: LocalDateTime
    def updated: LocalDateTime
  }

  case class Post(id: Int, override val title: String = "", override val body: String = "",
                  override val created: LocalDateTime = LocalDateTime.now(), override val updated: LocalDateTime = LocalDateTime.now())
    extends Article


  def main(args: Array[String]): Unit = {
    val date: LocalDateTime = LocalDateTime.now()
    println(date)
  }

}
