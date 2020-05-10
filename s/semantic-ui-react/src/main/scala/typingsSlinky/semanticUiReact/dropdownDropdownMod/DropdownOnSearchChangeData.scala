package typingsSlinky.semanticUiReact.dropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownOnSearchChangeData extends DropdownProps {
  @JSName("searchQuery")
  var searchQuery_DropdownOnSearchChangeData: String = js.native
}

object DropdownOnSearchChangeData {
  @scala.inline
  def apply(searchQuery: String): DropdownOnSearchChangeData = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOnSearchChangeData]
  }
  @scala.inline
  implicit class DropdownOnSearchChangeDataOps[Self <: DropdownOnSearchChangeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

