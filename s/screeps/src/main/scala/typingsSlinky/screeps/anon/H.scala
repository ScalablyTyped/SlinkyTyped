package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.KO
import typingsSlinky.screeps.screepsStrings.LO
import typingsSlinky.screeps.screepsStrings.UO
import typingsSlinky.screeps.screepsStrings.ZO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H extends js.Object {
  var G: typingsSlinky.screeps.screepsStrings.GO = js.native
  var H: typingsSlinky.screeps.screepsStrings.OH = js.native
  var K: KO = js.native
  var L: LO = js.native
  var U: UO = js.native
  var Z: ZO = js.native
}

object H {
  @scala.inline
  def apply(
    G: typingsSlinky.screeps.screepsStrings.GO,
    H: typingsSlinky.screeps.screepsStrings.OH,
    K: KO,
    L: LO,
    U: UO,
    Z: ZO
  ): H = {
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  @scala.inline
  implicit class HOps[Self <: H] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: typingsSlinky.screeps.screepsStrings.GO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: typingsSlinky.screeps.screepsStrings.OH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: KO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("K")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: LO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: UO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: ZO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

