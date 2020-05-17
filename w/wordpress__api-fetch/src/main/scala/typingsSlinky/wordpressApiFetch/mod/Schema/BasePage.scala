package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.anon.Blockversion
import typingsSlinky.wordpressApiFetch.anon.Dictk
import typingsSlinky.wordpressApiFetch.anon.Protected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T>, 'categories' | 'format' | 'sticky' | 'tags'> */
@js.native
trait BasePage[T /* <: Context */] extends Page[T] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  var _links: Record[String, js.Array[Dictk]] = js.native
  var author: Double = js.native
  var comment_status: OpenOrClosed = js.native
  var content: Contextual[T, Protected, Blockversion] = js.native
  var date: String = js.native
  var date_gmt: String = js.native
  var excerpt: Contextual[T, Protected, js.Object] = js.native
  var featured_media: Double = js.native
  var generated_slug: String = js.native
  var guid: Contextual[T, js.Object, js.Object] = js.native
  var id: Double = js.native
  var link: String = js.native
  var menu_order: Double = js.native
  var meta: js.Array[_] = js.native
  var modified: String = js.native
  var modified_gmt: String = js.native
  var parent: Double = js.native
  var password: String = js.native
  var permalink_template: String = js.native
  var ping_status: OpenOrClosed = js.native
  var slug: String = js.native
  var status: PostStatus = js.native
  var template: String = js.native
  var title: Contextual[T, js.Object, js.Object] = js.native
  var `type`: String = js.native
}

object BasePage {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    comment_status: OpenOrClosed,
    content: Contextual[T, Protected, Blockversion],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, Protected, js.Object],
    featured_media: Double,
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    menu_order: Double,
    meta: js.Array[_],
    modified: String,
    modified_gmt: String,
    parent: Double,
    password: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    status: PostStatus,
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BasePage[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], menu_order = menu_order.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePage[T]]
  }
  @scala.inline
  implicit class BasePageOps[Self[t] <: BasePage[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_links(value: Record[String, js.Array[Dictk]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
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
    def withMenu_order(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu_order")(value.asInstanceOf[js.Any])
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
    def withParent(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
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
    def with_embedded(value: Record[String, js.Array[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_embedded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(js.undefined)
        ret
    }
  }
  
}

