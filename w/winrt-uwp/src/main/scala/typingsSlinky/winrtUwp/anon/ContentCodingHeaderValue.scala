package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentCodingHeaderValue extends js.Object {
  /** The HttpContentCodingHeaderValue version of the string. */ var contentCodingHeaderValue: HttpContentCodingHeaderValue = js.native
  /** true if input is valid HttpContentCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ContentCodingHeaderValue {
  @scala.inline
  def apply(contentCodingHeaderValue: HttpContentCodingHeaderValue, returnValue: Boolean): ContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingHeaderValue = contentCodingHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCodingHeaderValue]
  }
  @scala.inline
  implicit class ContentCodingHeaderValueOps[Self <: ContentCodingHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentCodingHeaderValue(value: HttpContentCodingHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCodingHeaderValue")(value.asInstanceOf[js.Any])
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

