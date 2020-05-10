package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLinkText extends ByHash {
  var linkText: String = js.native
}

object AnonLinkText {
  @scala.inline
  def apply(linkText: String): AnonLinkText = {
    val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinkText]
  }
  @scala.inline
  implicit class AnonLinkTextOps[Self <: AnonLinkText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

