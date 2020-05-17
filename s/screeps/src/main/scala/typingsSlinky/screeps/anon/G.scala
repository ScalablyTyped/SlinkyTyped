package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.LH
import typingsSlinky.screeps.screepsStrings.ZH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait G extends js.Object {
  var G: typingsSlinky.screeps.screepsStrings.GH = js.native
  var K: typingsSlinky.screeps.screepsStrings.KH = js.native
  var L: LH = js.native
  var O: typingsSlinky.screeps.screepsStrings.OH = js.native
  var U: typingsSlinky.screeps.screepsStrings.UH = js.native
  var Z: ZH = js.native
}

object G {
  @scala.inline
  def apply(
    G: typingsSlinky.screeps.screepsStrings.GH,
    K: typingsSlinky.screeps.screepsStrings.KH,
    L: LH,
    O: typingsSlinky.screeps.screepsStrings.OH,
    U: typingsSlinky.screeps.screepsStrings.UH,
    Z: ZH
  ): G = {
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[G]
  }
  @scala.inline
  implicit class GOps[Self <: G] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: typingsSlinky.screeps.screepsStrings.GH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: typingsSlinky.screeps.screepsStrings.KH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("K")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: LH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: typingsSlinky.screeps.screepsStrings.OH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: typingsSlinky.screeps.screepsStrings.UH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: ZH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

