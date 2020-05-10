package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLanguageRangeWithQualityHeaderValue extends js.Object {
  /** The HttpLanguageRangeWithQualityHeaderValue version of the string. */ var languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue = js.native
  /** true if input is valid HttpLanguageRangeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonLanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue, returnValue: Boolean): AnonLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRangeWithQualityHeaderValue = languageRangeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguageRangeWithQualityHeaderValue]
  }
  @scala.inline
  implicit class AnonLanguageRangeWithQualityHeaderValueOps[Self <: AnonLanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageRangeWithQualityHeaderValue(value: HttpLanguageRangeWithQualityHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageRangeWithQualityHeaderValue")(value.asInstanceOf[js.Any])
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

