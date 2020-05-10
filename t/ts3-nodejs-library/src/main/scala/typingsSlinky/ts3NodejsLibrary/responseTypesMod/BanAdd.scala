package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanAdd extends js.Object {
  var banid: Double = js.native
}

object BanAdd {
  @scala.inline
  def apply(banid: Double): BanAdd = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanAdd]
  }
  @scala.inline
  implicit class BanAddOps[Self <: BanAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

