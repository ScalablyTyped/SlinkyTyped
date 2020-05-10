package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMediaTypeHeaderValue extends js.Object {
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: HttpMediaTypeHeaderValue = js.native
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonMediaTypeHeaderValue {
  @scala.inline
  def apply(mediaTypeHeaderValue: HttpMediaTypeHeaderValue, returnValue: Boolean): AnonMediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaTypeHeaderValue]
  }
  @scala.inline
  implicit class AnonMediaTypeHeaderValueOps[Self <: AnonMediaTypeHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaTypeHeaderValue(value: HttpMediaTypeHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypeHeaderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

