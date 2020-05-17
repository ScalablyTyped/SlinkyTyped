package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchFields'> */
@js.native
trait PickImplsearchFields extends js.Object {
  var searchFields: js.Array[String] = js.native
}

object PickImplsearchFields {
  @scala.inline
  def apply(searchFields: js.Array[String]): PickImplsearchFields = {
    val __obj = js.Dynamic.literal(searchFields = searchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchFields]
  }
  @scala.inline
  implicit class PickImplsearchFieldsOps[Self <: PickImplsearchFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

