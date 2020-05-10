package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content picker dialog options object
  */
@js.native
trait IContentPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function = js.native
  /*should the picker return one or multiple items*/
  var multipicker: Boolean = js.native
}

object IContentPickerOptions {
  @scala.inline
  def apply(callback: js.Function, multipicker: Boolean): IContentPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multipicker = multipicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentPickerOptions]
  }
  @scala.inline
  implicit class IContentPickerOptionsOps[Self <: IContentPickerOptions] (val x: Self) extends AnyVal {
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
    def withMultipicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipicker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

