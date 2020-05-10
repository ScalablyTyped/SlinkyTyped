package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.AnonAddnew
import typingsSlinky.wordpressApiFetch.AnonAuthor
import typingsSlinky.wordpressApiFetch.AnonCreateposts
import typingsSlinky.wordpressApiFetch.AnonDictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseType[T /* <: Context */] extends BaseResponse {
  var capabilities: AnonCreateposts = js.native
  var description: String = js.native
  var hierarchical: Boolean = js.native
  var labels: AnonAddnew = js.native
  var name: String = js.native
  var rest_base: String = js.native
  var slug: String = js.native
  var supports: AnonAuthor = js.native
  var taxonomies: js.Array[TaxonomyKind] = js.native
  var viewable: Boolean = js.native
}

object BaseType {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[AnonDictk]],
    capabilities: AnonCreateposts,
    description: String,
    hierarchical: Boolean,
    labels: AnonAddnew,
    name: String,
    rest_base: String,
    slug: String,
    supports: AnonAuthor,
    taxonomies: js.Array[TaxonomyKind],
    viewable: Boolean
  ): BaseType[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], taxonomies = taxonomies.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseType[T]]
  }
  @scala.inline
  implicit class BaseTypeOps[Self[t] <: BaseType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCapabilities(value: AnonCreateposts): Self[T] = {
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
    def withLabels(value: AnonAddnew): Self[T] = {
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
    def withSlug(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupports(value: AnonAuthor): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxonomies(value: js.Array[TaxonomyKind]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxonomies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

