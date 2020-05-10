package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPartialLinkText extends ByHash {
  var partialLinkText: String = js.native
}

object AnonPartialLinkText {
  @scala.inline
  def apply(partialLinkText: String): AnonPartialLinkText = {
    val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartialLinkText]
  }
  @scala.inline
  implicit class AnonPartialLinkTextOps[Self <: AnonPartialLinkText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartialLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialLinkText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

