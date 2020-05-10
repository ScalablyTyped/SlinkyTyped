package typingsSlinky.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateposts extends js.Object {
  var create_posts: String = js.native
  var delete_others_posts: String = js.native
  var delete_post: String = js.native
  var delete_posts: String = js.native
  var delete_private_posts: String = js.native
  var delete_published_posts: String = js.native
  var edit_others_posts: String = js.native
  var edit_post: String = js.native
  var edit_posts: String = js.native
  var edit_private_posts: String = js.native
  var edit_published_posts: String = js.native
  var publish_posts: String = js.native
  var read: String = js.native
  var read_post: String = js.native
  var read_private_posts: String = js.native
}

object AnonCreateposts {
  @scala.inline
  def apply(
    create_posts: String,
    delete_others_posts: String,
    delete_post: String,
    delete_posts: String,
    delete_private_posts: String,
    delete_published_posts: String,
    edit_others_posts: String,
    edit_post: String,
    edit_posts: String,
    edit_private_posts: String,
    edit_published_posts: String,
    publish_posts: String,
    read: String,
    read_post: String,
    read_private_posts: String
  ): AnonCreateposts = {
    val __obj = js.Dynamic.literal(create_posts = create_posts.asInstanceOf[js.Any], delete_others_posts = delete_others_posts.asInstanceOf[js.Any], delete_post = delete_post.asInstanceOf[js.Any], delete_posts = delete_posts.asInstanceOf[js.Any], delete_private_posts = delete_private_posts.asInstanceOf[js.Any], delete_published_posts = delete_published_posts.asInstanceOf[js.Any], edit_others_posts = edit_others_posts.asInstanceOf[js.Any], edit_post = edit_post.asInstanceOf[js.Any], edit_posts = edit_posts.asInstanceOf[js.Any], edit_private_posts = edit_private_posts.asInstanceOf[js.Any], edit_published_posts = edit_published_posts.asInstanceOf[js.Any], publish_posts = publish_posts.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], read_post = read_post.asInstanceOf[js.Any], read_private_posts = read_private_posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateposts]
  }
  @scala.inline
  implicit class AnonCreatepostsOps[Self <: AnonCreateposts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_others_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_others_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_post(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_private_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_private_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_published_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_published_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_others_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_others_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_post(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_private_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_private_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_published_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_published_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublish_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead_post(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead_private_posts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_private_posts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

