package typingsSlinky.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnce extends js.Object {
  var once: js.UndefOr[Boolean] = js.native
}

object AnonOnce {
  @scala.inline
  def apply(): AnonOnce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnce]
  }
  @scala.inline
  implicit class AnonOnceOps[Self <: AnonOnce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
  }
  
}

