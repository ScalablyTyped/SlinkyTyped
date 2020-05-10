package typingsSlinky.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHighlighted extends js.Object {
  var highlighted: Boolean = js.native
}

object AnonHighlighted {
  @scala.inline
  def apply(highlighted: Boolean): AnonHighlighted = {
    val __obj = js.Dynamic.literal(highlighted = highlighted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlighted]
  }
  @scala.inline
  implicit class AnonHighlightedOps[Self <: AnonHighlighted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

