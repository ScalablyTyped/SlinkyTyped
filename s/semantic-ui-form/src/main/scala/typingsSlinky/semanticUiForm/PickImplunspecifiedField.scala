package typingsSlinky.semanticUiForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, 'unspecifiedField'> */
@js.native
trait PickImplunspecifiedField extends js.Object {
  var unspecifiedField: String = js.native
}

object PickImplunspecifiedField {
  @scala.inline
  def apply(unspecifiedField: String): PickImplunspecifiedField = {
    val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplunspecifiedField]
  }
  @scala.inline
  implicit class PickImplunspecifiedFieldOps[Self <: PickImplunspecifiedField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnspecifiedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecifiedField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

