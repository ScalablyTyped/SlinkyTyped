package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'transition'> */
@js.native
trait PickImpltransition extends js.Object {
  var transition: auto | String = js.native
}

object PickImpltransition {
  @scala.inline
  def apply(transition: auto | String): PickImpltransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransition]
  }
  @scala.inline
  implicit class PickImpltransitionOps[Self <: PickImpltransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransition(value: auto | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

