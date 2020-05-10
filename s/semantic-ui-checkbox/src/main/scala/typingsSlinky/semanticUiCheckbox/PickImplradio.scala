package typingsSlinky.semanticUiCheckbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'radio'> */
@js.native
trait PickImplradio extends js.Object {
  var radio: String = js.native
}

object PickImplradio {
  @scala.inline
  def apply(radio: String): PickImplradio = {
    val __obj = js.Dynamic.literal(radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplradio]
  }
  @scala.inline
  implicit class PickImplradioOps[Self <: PickImplradio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

