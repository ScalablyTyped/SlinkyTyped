package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.AnonDictk
import typingsSlinky.wordpressApiFetch.AnonHeight
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.file
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.image
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.inherit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMedia[T /* <: Context */] extends BaseResponse {
  var alt_text: String = js.native
  var author: Double = js.native
  var caption: Contextual[T, js.Object, js.Object] = js.native
  var comment_status: OpenOrClosed = js.native
  var date: String = js.native
  var date_gmt: String = js.native
  var description: Contextual[T, js.Object, js.Object] = js.native
  var generated_slug: String = js.native
  var guid: Contextual[T, js.Object, js.Object] = js.native
  var id: Double = js.native
  var link: String = js.native
  var media_details: AnonHeight = js.native
  var media_type: file | image = js.native
  var meta: js.Array[_] = js.native
  var mime_type: String = js.native
  var modified: String = js.native
  var modified_gmt: String = js.native
  var permalink_template: String = js.native
  var ping_status: OpenOrClosed = js.native
  var post: Double | Null = js.native
  var slug: String = js.native
  var source_url: String = js.native
  var status: PostStatus | inherit = js.native
  var template: String = js.native
  var title: Contextual[T, js.Object, js.Object] = js.native
  var `type`: String = js.native
}

object BaseMedia {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[AnonDictk]],
    alt_text: String,
    author: Double,
    caption: Contextual[T, js.Object, js.Object],
    comment_status: OpenOrClosed,
    date: String,
    date_gmt: String,
    description: Contextual[T, js.Object, js.Object],
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    media_details: AnonHeight,
    media_type: file | image,
    meta: js.Array[_],
    mime_type: String,
    modified: String,
    modified_gmt: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    source_url: String,
    status: PostStatus | inherit,
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BaseMedia[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], alt_text = alt_text.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], media_details = media_details.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source_url = source_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMedia[T]]
  }
  @scala.inline
  implicit class BaseMediaOps[Self[t] <: BaseMedia[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAlt_text(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: Contextual[T, js.Object, js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_status(value: OpenOrClosed): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_status")(value.asInstanceOf[js.Any])
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
    def withDescription(value: Contextual[T, js.Object, js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
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
    def withMedia_details(value: AnonHeight): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_type(value: file | image): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime_type(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_type")(value.asInstanceOf[js.Any])
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
    def withSource_url(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PostStatus | inherit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withPost(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(null)
        ret
    }
  }
  
}

