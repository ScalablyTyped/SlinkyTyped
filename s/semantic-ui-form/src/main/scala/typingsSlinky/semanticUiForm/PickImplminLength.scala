package typingsSlinky.semanticUiForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'minLength'> */
@js.native
trait PickImplminLength extends js.Object {
  var minLength: String = js.native
}

object PickImplminLength {
  @scala.inline
  def apply(minLength: String): PickImplminLength = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminLength]
  }
  @scala.inline
  implicit class PickImplminLengthOps[Self <: PickImplminLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

