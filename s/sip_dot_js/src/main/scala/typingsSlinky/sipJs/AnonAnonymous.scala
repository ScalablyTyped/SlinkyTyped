package typingsSlinky.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnonymous extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.native
  var outbound: js.UndefOr[Boolean] = js.native
}

object AnonAnonymous {
  @scala.inline
  def apply(): AnonAnonymous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnonymous]
  }
  @scala.inline
  implicit class AnonAnonymousOps[Self <: AnonAnonymous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withOutbound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutbound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound")(js.undefined)
        ret
    }
  }
  
}

