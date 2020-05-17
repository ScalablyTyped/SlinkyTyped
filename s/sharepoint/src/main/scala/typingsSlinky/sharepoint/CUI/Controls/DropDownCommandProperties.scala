package typingsSlinky.sharepoint.CUI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownCommandProperties extends js.Object {
  var SelectedItemId: String = js.native
  var Value: String = js.native
}

object DropDownCommandProperties {
  @scala.inline
  def apply(SelectedItemId: String, Value: String): DropDownCommandProperties = {
    val __obj = js.Dynamic.literal(SelectedItemId = SelectedItemId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownCommandProperties]
  }
  @scala.inline
  implicit class DropDownCommandPropertiesOps[Self <: DropDownCommandProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

