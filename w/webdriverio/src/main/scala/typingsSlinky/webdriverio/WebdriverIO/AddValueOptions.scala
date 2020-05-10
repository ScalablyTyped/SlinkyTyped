package typingsSlinky.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddValueOptions extends js.Object {
  var translateToUnicode: Boolean = js.native
}

object AddValueOptions {
  @scala.inline
  def apply(translateToUnicode: Boolean): AddValueOptions = {
    val __obj = js.Dynamic.literal(translateToUnicode = translateToUnicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddValueOptions]
  }
  @scala.inline
  implicit class AddValueOptionsOps[Self <: AddValueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateToUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateToUnicode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

