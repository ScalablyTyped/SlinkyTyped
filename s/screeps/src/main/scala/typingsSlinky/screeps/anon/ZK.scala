package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZK extends js.Object {
  var ZK: typingsSlinky.screeps.screepsStrings.G = js.native
}

object ZK {
  @scala.inline
  def apply(ZK: typingsSlinky.screeps.screepsStrings.G): ZK = {
    val __obj = js.Dynamic.literal(ZK = ZK.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZK]
  }
  @scala.inline
  implicit class ZKOps[Self <: ZK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZK(value: typingsSlinky.screeps.screepsStrings.G): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

