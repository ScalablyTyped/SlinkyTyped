package typingsSlinky.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsLink extends js.Object {
  var isLink: Boolean = js.native
}

object AnonIsLink {
  @scala.inline
  def apply(isLink: Boolean): AnonIsLink = {
    val __obj = js.Dynamic.literal(isLink = isLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsLink]
  }
  @scala.inline
  implicit class AnonIsLinkOps[Self <: AnonIsLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

