package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXpath extends ByHash {
  var xpath: String = js.native
}

object AnonXpath {
  @scala.inline
  def apply(xpath: String): AnonXpath = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXpath]
  }
  @scala.inline
  implicit class AnonXpathOps[Self <: AnonXpath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

