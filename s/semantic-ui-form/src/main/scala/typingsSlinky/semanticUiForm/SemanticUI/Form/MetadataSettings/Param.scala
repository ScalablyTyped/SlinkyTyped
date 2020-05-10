package typingsSlinky.semanticUiForm.SemanticUI.Form.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, 'validate'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl>> */
@js.native
trait Param extends js.Object {
  var validate: js.UndefOr[String] = js.native
}

object Param {
  @scala.inline
  def apply(): Param = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Param]
  }
  @scala.inline
  implicit class ParamOps[Self <: Param] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

