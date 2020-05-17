package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'search'> */
@js.native
trait PickImplsearchSearch extends js.Object {
  var search: String = js.native
}

object PickImplsearchSearch {
  @scala.inline
  def apply(search: String): PickImplsearchSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchSearch]
  }
  @scala.inline
  implicit class PickImplsearchSearchOps[Self <: PickImplsearchSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

