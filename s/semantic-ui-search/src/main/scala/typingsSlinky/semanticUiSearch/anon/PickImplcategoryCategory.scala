package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'category'> */
@js.native
trait PickImplcategoryCategory extends js.Object {
  var category: String = js.native
}

object PickImplcategoryCategory {
  @scala.inline
  def apply(category: String): PickImplcategoryCategory = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryCategory]
  }
  @scala.inline
  implicit class PickImplcategoryCategoryOps[Self <: PickImplcategoryCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

