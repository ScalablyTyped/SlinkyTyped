package typingsSlinky.tryghostContentApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Posts extends js.Object {
  var posts: Double = js.native
}

object Posts {
  @scala.inline
  def apply(posts: Double): Posts = {
    val __obj = js.Dynamic.literal(posts = posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Posts]
  }
  @scala.inline
  implicit class PostsOps[Self <: Posts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

