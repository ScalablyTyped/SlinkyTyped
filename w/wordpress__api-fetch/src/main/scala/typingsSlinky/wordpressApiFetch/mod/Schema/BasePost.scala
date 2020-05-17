package typingsSlinky.wordpressApiFetch.mod.Schema

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.anon.Blockversion
import typingsSlinky.wordpressApiFetch.anon.Dictk
import typingsSlinky.wordpressApiFetch.anon.Protected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePost[T /* <: Context */]
  extends BaseResponse
     with /* k */ StringDictionary[js.Any]
     with Post[T] {
  var author: Double = js.native
  var categories: js.Array[Double] = js.native
  var comment_status: OpenOrClosed = js.native
  var content: Contextual[T, Protected, Blockversion] = js.native
  var date: String = js.native
  var date_gmt: String = js.native
  var excerpt: Contextual[T, Protected, js.Object] = js.native
  var featured_media: Double = js.native
  var format: PostFormat = js.native
  var generated_slug: String = js.native
  var guid: Contextual[T, js.Object, js.Object] = js.native
  var id: Double = js.native
  var link: String = js.native
  var meta: js.Array[_] = js.native
  var modified: String = js.native
  var modified_gmt: String = js.native
  var password: String = js.native
  var permalink_template: String = js.native
  var ping_status: OpenOrClosed = js.native
  var slug: String = js.native
  var status: PostStatus = js.native
  var sticky: Boolean = js.native
  var tags: js.Array[String] = js.native
  var template: String = js.native
  var title: Contextual[T, js.Object, js.Object] = js.native
  var `type`: String = js.native
}

object BasePost {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    categories: js.Array[Double],
    comment_status: OpenOrClosed,
    content: Contextual[T, Protected, Blockversion],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, Protected, js.Object],
    featured_media: Double,
    format: PostFormat,
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    meta: js.Array[_],
    modified: String,
    modified_gmt: String,
    password: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    status: PostStatus,
    sticky: Boolean,
    tags: js.Array[String],
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BasePost[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePost[T]]
  }
  @scala.inline
  implicit class BasePostOps[Self[t] <: BasePost[t], T] (val x: Self[T]) extends AnyVal {
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
    def withCategories(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_status(value: OpenOrClosed): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Contextual[T, Protected, Blockversion]): Self[T] = {
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
    def withExcerpt(value: Contextual[T, Protected, js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured_media(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: PostFormat): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerated_slug(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generated_slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: Contextual[T, js.Object, js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
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
    def withModified(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified_gmt(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified_gmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermalink_template(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPing_status(value: OpenOrClosed): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ping_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PostStatus): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Contextual[T, js.Object, js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
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

