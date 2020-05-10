package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  var body_html: String = js.native
  var handle: String = js.native
  var id: String = js.native
  var image: Image = js.native
  var metafields: js.Array[_] = js.native
  var published: Boolean = js.native
  var published_at: String = js.native
  var published_scope: String = js.native
  var sort_order: String = js.native
  var template_suffix: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
}

object Collection {
  @scala.inline
  def apply(
    body_html: String,
    handle: String,
    id: String,
    image: Image,
    metafields: js.Array[_],
    published: Boolean,
    published_at: String,
    published_scope: String,
    sort_order: String,
    template_suffix: String,
    title: String,
    updated_at: String
  ): Collection = {
    val __obj = js.Dynamic.literal(body_html = body_html.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], published_scope = published_scope.asInstanceOf[js.Any], sort_order = sort_order.asInstanceOf[js.Any], template_suffix = template_suffix.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody_html(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetafields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished_scope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort_order(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

