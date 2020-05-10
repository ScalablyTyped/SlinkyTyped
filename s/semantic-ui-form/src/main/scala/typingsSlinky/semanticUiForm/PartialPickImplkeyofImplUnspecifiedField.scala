package typingsSlinky.semanticUiForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TextSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplUnspecifiedField extends js.Object {
  var unspecifiedField: js.UndefOr[String] = js.native
  var unspecifiedRule: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplUnspecifiedField {
  @scala.inline
  def apply(): PartialPickImplkeyofImplUnspecifiedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplUnspecifiedField]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplUnspecifiedFieldOps[Self <: PartialPickImplkeyofImplUnspecifiedField] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutUnspecifiedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecifiedField")(js.undefined)
        ret
    }
    @scala.inline
    def withUnspecifiedRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecifiedRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnspecifiedRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecifiedRule")(js.undefined)
        ret
    }
  }
  
}

