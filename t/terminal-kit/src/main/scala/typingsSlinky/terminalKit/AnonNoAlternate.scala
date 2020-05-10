package typingsSlinky.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoAlternate extends js.Object {
  var noAlternate: Boolean = js.native
}

object AnonNoAlternate {
  @scala.inline
  def apply(noAlternate: Boolean): AnonNoAlternate = {
    val __obj = js.Dynamic.literal(noAlternate = noAlternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoAlternate]
  }
  @scala.inline
  implicit class AnonNoAlternateOps[Self <: AnonNoAlternate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoAlternate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAlternate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

