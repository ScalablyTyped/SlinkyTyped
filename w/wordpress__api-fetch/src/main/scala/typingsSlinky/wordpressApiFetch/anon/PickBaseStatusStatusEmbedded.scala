package typingsSlinky.wordpressApiFetch.anon

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.mod.Schema.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseStatus, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.Status> */
@js.native
trait PickBaseStatusStatusEmbedded
  extends Status[js.Any] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  var _links: Record[String, js.Array[Dictk]] = js.native
  var name: String = js.native
  var public: Boolean = js.native
  var queryable: Boolean = js.native
  var slug: String = js.native
}

object PickBaseStatusStatusEmbedded {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    name: String,
    public: Boolean,
    queryable: Boolean,
    slug: String
  ): PickBaseStatusStatusEmbedded = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseStatusStatusEmbedded]
  }
  @scala.inline
  implicit class PickBaseStatusStatusEmbeddedOps[Self <: PickBaseStatusStatusEmbedded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: Record[String, js.Array[Dictk]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_embedded(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_embedded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(js.undefined)
        ret
    }
  }
  
}

