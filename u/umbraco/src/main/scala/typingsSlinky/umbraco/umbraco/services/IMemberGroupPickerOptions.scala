package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Member group picker dialog options object
  */
@js.native
trait IMemberGroupPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function = js.native
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: Boolean = js.native
}

object IMemberGroupPickerOptions {
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean): IMemberGroupPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMemberGroupPickerOptions]
  }
  @scala.inline
  implicit class IMemberGroupPickerOptionsOps[Self <: IMemberGroupPickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiPicker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

