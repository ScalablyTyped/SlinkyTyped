package typingsSlinky.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, 'input'> */
@js.native
trait PickImplinput extends js.Object {
  var input: String = js.native
}

object PickImplinput {
  @scala.inline
  def apply(input: String): PickImplinput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinput]
  }
  @scala.inline
  implicit class PickImplinputOps[Self <: PickImplinput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

