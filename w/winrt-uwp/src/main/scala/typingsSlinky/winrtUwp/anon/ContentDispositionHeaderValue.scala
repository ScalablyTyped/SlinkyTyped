package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentDispositionHeaderValue extends js.Object {
  /** The HttpContentDispositionHeaderValue version of the string. */ var contentDispositionHeaderValue: HttpContentDispositionHeaderValue = js.native
  /** true if input is valid HttpContentDispositionHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ContentDispositionHeaderValue {
  @scala.inline
  def apply(contentDispositionHeaderValue: HttpContentDispositionHeaderValue, returnValue: Boolean): ContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal(contentDispositionHeaderValue = contentDispositionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDispositionHeaderValue]
  }
  @scala.inline
  implicit class ContentDispositionHeaderValueOps[Self <: ContentDispositionHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDispositionHeaderValue(value: HttpContentDispositionHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDispositionHeaderValue")(value.asInstanceOf[js.Any])
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

