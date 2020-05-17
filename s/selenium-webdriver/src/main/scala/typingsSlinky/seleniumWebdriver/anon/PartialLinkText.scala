package typingsSlinky.seleniumWebdriver.anon

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialLinkText extends ByHash {
  var partialLinkText: String = js.native
}

object PartialLinkText {
  @scala.inline
  def apply(partialLinkText: String): PartialLinkText = {
    val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLinkText]
  }
  @scala.inline
  implicit class PartialLinkTextOps[Self <: PartialLinkText] (val x: Self) extends AnyVal {
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

