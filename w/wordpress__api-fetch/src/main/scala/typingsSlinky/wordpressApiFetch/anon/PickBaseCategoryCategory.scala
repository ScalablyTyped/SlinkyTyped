package typingsSlinky.wordpressApiFetch.anon

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.mod.Schema.Category
import typingsSlinky.wordpressApiFetch.mod.Schema.TaxonomyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseCategory, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Category> */
@js.native
trait PickBaseCategoryCategory
  extends Category[js.Any] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  var _links: Record[String, js.Array[Dictk]] = js.native
  var id: Double = js.native
  var link: String = js.native
  var name: String = js.native
  var slug: String = js.native
  var taxonomy: TaxonomyKind = js.native
}

object PickBaseCategoryCategory {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): PickBaseCategoryCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseCategoryCategory]
  }
  @scala.inline
  implicit class PickBaseCategoryCategoryOps[Self <: PickBaseCategoryCategory] (val x: Self) extends AnyVal {
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
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxonomy(value: TaxonomyKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxonomy")(value.asInstanceOf[js.Any])
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

