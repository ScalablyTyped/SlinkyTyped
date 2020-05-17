package typingsSlinky.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rtl extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.native
}

object Rtl {
  @scala.inline
  def apply(): Rtl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rtl]
  }
  @scala.inline
  implicit class RtlOps[Self <: Rtl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
  }
  
}

