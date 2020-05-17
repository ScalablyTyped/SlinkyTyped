package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.KO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Z extends js.Object {
  var H: typingsSlinky.screeps.screepsStrings.KH = js.native
  var O: KO = js.native
  var Z: typingsSlinky.screeps.screepsStrings.ZK = js.native
}

object Z {
  @scala.inline
  def apply(H: typingsSlinky.screeps.screepsStrings.KH, O: KO, Z: typingsSlinky.screeps.screepsStrings.ZK): Z = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Z]
  }
  @scala.inline
  implicit class ZOps[Self <: Z] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: typingsSlinky.screeps.screepsStrings.KH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: KO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: typingsSlinky.screeps.screepsStrings.ZK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

