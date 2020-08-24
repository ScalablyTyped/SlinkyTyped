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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setG(value: typingsSlinky.screeps.screepsStrings.GH): Self = this.set("G", value.asInstanceOf[js.Any])
    @scala.inline
    def setK(value: typingsSlinky.screeps.screepsStrings.KH): Self = this.set("K", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: LH): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def setO(value: typingsSlinky.screeps.screepsStrings.OH): Self = this.set("O", value.asInstanceOf[js.Any])
    @scala.inline
    def setU(value: typingsSlinky.screeps.screepsStrings.UH): Self = this.set("U", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: ZH): Self = this.set("Z", value.asInstanceOf[js.Any])
  }
  
}

