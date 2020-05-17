package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.ZH
import typingsSlinky.screeps.screepsStrings.ZO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait K extends js.Object {
  var H: ZH = js.native
  var K: typingsSlinky.screeps.screepsStrings.ZK = js.native
  var O: ZO = js.native
}

object K {
  @scala.inline
  def apply(H: ZH, K: typingsSlinky.screeps.screepsStrings.ZK, O: ZO): K = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[K]
  }
  @scala.inline
  implicit class KOps[Self <: K] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: ZH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: typingsSlinky.screeps.screepsStrings.ZK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("K")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: ZO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

