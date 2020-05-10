package typingsSlinky.semanticUiSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'categoryName'> */
@js.native
trait PickImplcategoryName extends js.Object {
  var categoryName: String = js.native
}

object PickImplcategoryName {
  @scala.inline
  def apply(categoryName: String): PickImplcategoryName = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryName]
  }
  @scala.inline
  implicit class PickImplcategoryNameOps[Self <: PickImplcategoryName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

