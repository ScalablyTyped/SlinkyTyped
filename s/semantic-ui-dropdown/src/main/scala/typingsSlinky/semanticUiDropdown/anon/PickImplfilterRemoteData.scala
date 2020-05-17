package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'filterRemoteData'> */
@js.native
trait PickImplfilterRemoteData extends js.Object {
  var filterRemoteData: Boolean = js.native
}

object PickImplfilterRemoteData {
  @scala.inline
  def apply(filterRemoteData: Boolean): PickImplfilterRemoteData = {
    val __obj = js.Dynamic.literal(filterRemoteData = filterRemoteData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfilterRemoteData]
  }
  @scala.inline
  implicit class PickImplfilterRemoteDataOps[Self <: PickImplfilterRemoteData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterRemoteData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRemoteData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

