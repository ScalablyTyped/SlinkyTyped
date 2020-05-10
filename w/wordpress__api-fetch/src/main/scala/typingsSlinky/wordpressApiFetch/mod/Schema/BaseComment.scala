package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.AnonDictk
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.approved
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.hold
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.spam
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.trash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseComment[T /* <: Context */] extends BaseResponse {
  var author: Double = js.native
  var author_avatar_urls: Record[Double, String] = js.native
  var author_email: String = js.native
  var author_ip: String = js.native
  var author_name: String = js.native
  var author_url: String = js.native
  var author_user_agent: String = js.native
  var content: Contextual[T, js.Object, js.Object] = js.native
  var date: String = js.native
  var date_gmt: String = js.native
  var id: Double = js.native
  var link: String = js.native
  var meta: js.Array[_] = js.native
  var parent: Double = js.native
  var post: Double = js.native
  var status: approved | hold | spam | trash = js.native
  var `type`: String = js.native
}

object BaseComment {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[AnonDictk]],
    author: Double,
    author_avatar_urls: Record[Double, String],
    author_email: String,
    author_ip: String,
    author_name: String,
    author_url: String,
    author_user_agent: String,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    parent: Double,
    post: Double,
    status: approved | hold | spam | trash,
    `type`: String
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_avatar_urls = author_avatar_urls.asInstanceOf[js.Any], author_email = author_email.asInstanceOf[js.Any], author_ip = author_ip.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], author_user_agent = author_user_agent.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment[T]]
  }
  @scala.inline
  implicit class BaseCommentOps[Self[t] <: BaseComment[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAuthor(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_avatar_urls(value: Record[Double, String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_avatar_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_email(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_ip(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_name(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_url(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_user_agent(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Contextual[T, js.Object, js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate_gmt(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_gmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: approved | hold | spam | trash): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

