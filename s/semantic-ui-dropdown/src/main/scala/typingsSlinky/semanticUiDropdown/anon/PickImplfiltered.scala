package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'filtered'> */
@js.native
trait PickImplfiltered extends js.Object {
  var filtered: String = js.native
}

object PickImplfiltered {
  @scala.inline
  def apply(filtered: String): PickImplfiltered = {
    val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfiltered]
  }
  @scala.inline
  implicit class PickImplfilteredOps[Self <: PickImplfiltered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiltered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

