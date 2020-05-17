package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentCodingWithQualityHeaderValue extends js.Object {
  /** The HttpContentCodingWithQualityHeaderValue version of the string. */ var contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue = js.native
  /** true if input is valid HttpContentCodingWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue, returnValue: Boolean): ContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingWithQualityHeaderValue = contentCodingWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCodingWithQualityHeaderValue]
  }
  @scala.inline
  implicit class ContentCodingWithQualityHeaderValueOps[Self <: ContentCodingWithQualityHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentCodingWithQualityHeaderValue(value: HttpContentCodingWithQualityHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCodingWithQualityHeaderValue")(value.asInstanceOf[js.Any])
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

