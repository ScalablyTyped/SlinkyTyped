package typingsSlinky.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'number'> */
@js.native
trait PickImplnumber extends js.Object {
  var number: String = js.native
}

object PickImplnumber {
  @scala.inline
  def apply(number: String): PickImplnumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnumber]
  }
  @scala.inline
  implicit class PickImplnumberOps[Self <: PickImplnumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

