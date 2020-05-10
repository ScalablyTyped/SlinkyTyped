package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.AnonAddnewitem
import typingsSlinky.wordpressApiFetch.AnonAssignterms
import typingsSlinky.wordpressApiFetch.AnonDictk
import typingsSlinky.wordpressApiFetch.AnonPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTaxonomy[T /* <: Context */] extends BaseResponse {
  var capabilities: AnonAssignterms = js.native
  var description: String = js.native
  var hierarchical: Boolean = js.native
  var labels: AnonAddnewitem = js.native
  var name: String = js.native
  var rest_base: String = js.native
  var show_cloud: Boolean = js.native
  var slug: String = js.native
  var types: js.Array[String] = js.native
  var visibility: AnonPublic = js.native
}

object BaseTaxonomy {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[AnonDictk]],
    capabilities: AnonAssignterms,
    description: String,
    hierarchical: Boolean,
    labels: AnonAddnewitem,
    name: String,
    rest_base: String,
    show_cloud: Boolean,
    slug: String,
    types: js.Array[String],
    visibility: AnonPublic
  ): BaseTaxonomy[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], show_cloud = show_cloud.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTaxonomy[T]]
  }
  @scala.inline
  implicit class BaseTaxonomyOps[Self[t] <: BaseTaxonomy[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCapabilities(value: AnonAssignterms): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchical(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: AnonAddnewitem): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRest_base(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_cloud(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_cloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: AnonPublic): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

