package typingsSlinky.semanticUiForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-form.SemanticUI.Form.MetadataSettings.Param */
@js.native
trait MetadataSettings_ extends js.Object {
  var validate: js.UndefOr[String] = js.native
}

object MetadataSettings_ {
  @scala.inline
  def apply(): MetadataSettings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataSettings_]
  }
  @scala.inline
  implicit class MetadataSettings_Ops[Self <: MetadataSettings_] (val x: Self) extends AnyVal {
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

