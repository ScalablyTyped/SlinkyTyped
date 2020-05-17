package typingsSlinky.semanticUiForm.anon

import typingsSlinky.semanticUiForm.semanticUiFormStrings.blur
import typingsSlinky.semanticUiForm.semanticUiFormStrings.change
import typingsSlinky.semanticUiForm.semanticUiFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'on'> */
@js.native
trait PickImplon extends js.Object {
  var on: submit | blur | change = js.native
}

object PickImplon {
  @scala.inline
  def apply(on: submit | blur | change): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  @scala.inline
  implicit class PickImplonOps[Self <: PickImplon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: submit | blur | change): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

