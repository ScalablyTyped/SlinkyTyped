package typingsSlinky.sharepoint.SP.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPartComponentInitInfo extends js.Object {
  var allowWebPartAdder: Boolean = js.native
  var editable: Boolean = js.native
  var isEditMode: Boolean = js.native
}

object WebPartComponentInitInfo {
  @scala.inline
  def apply(allowWebPartAdder: Boolean, editable: Boolean, isEditMode: Boolean): WebPartComponentInitInfo = {
    val __obj = js.Dynamic.literal(allowWebPartAdder = allowWebPartAdder.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], isEditMode = isEditMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPartComponentInitInfo]
  }
  @scala.inline
  implicit class WebPartComponentInitInfoOps[Self <: WebPartComponentInitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowWebPartAdder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWebPartAdder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEditMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

