package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsLanguage extends js.Object {
  /** An array of Language items that start at startIndex in the HttpLanguageHeaderValueCollection . */ var items: Language = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object AnonItemsLanguage {
  @scala.inline
  def apply(items: Language, returnValue: Double): AnonItemsLanguage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsLanguage]
  }
  @scala.inline
  implicit class AnonItemsLanguageOps[Self <: AnonItemsLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

