package typingsSlinky.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultFormsInformation extends js.Object {
  var DefaultForms: FormsInfo = js.native
  var OtherForms: js.Any = js.native
}

object DefaultFormsInformation {
  @scala.inline
  def apply(DefaultForms: FormsInfo, OtherForms: js.Any): DefaultFormsInformation = {
    val __obj = js.Dynamic.literal(DefaultForms = DefaultForms.asInstanceOf[js.Any], OtherForms = OtherForms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultFormsInformation]
  }
  @scala.inline
  implicit class DefaultFormsInformationOps[Self <: DefaultFormsInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultForms(value: FormsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherForms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherForms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

