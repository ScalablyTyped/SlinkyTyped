package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTypeWithQualityHeaderValue extends js.Object {
  /** The HttpMediaTypeWithQualityHeaderValue version of the string. */ var mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue = js.native
  /** true if input is valid HttpMediaTypeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object MediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue, returnValue: Boolean): MediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeWithQualityHeaderValue = mediaTypeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeWithQualityHeaderValue]
  }
  @scala.inline
  implicit class MediaTypeWithQualityHeaderValueOps[Self <: MediaTypeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaTypeWithQualityHeaderValue(value: HttpMediaTypeWithQualityHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypeWithQualityHeaderValue")(value.asInstanceOf[js.Any])
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

