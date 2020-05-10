package typingsSlinky.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantizeResult extends js.Object {
  var abuf: js.typedarray.ArrayBuffer = js.native
  var inds: js.typedarray.Uint8Array = js.native
  // Type is complicated and I am too lazy to work it out right now, sorry!
  var plte: js.Array[_] = js.native
}

object QuantizeResult {
  @scala.inline
  def apply(abuf: js.typedarray.ArrayBuffer, inds: js.typedarray.Uint8Array, plte: js.Array[_]): QuantizeResult = {
    val __obj = js.Dynamic.literal(abuf = abuf.asInstanceOf[js.Any], inds = inds.asInstanceOf[js.Any], plte = plte.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantizeResult]
  }
  @scala.inline
  implicit class QuantizeResultOps[Self <: QuantizeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbuf(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInds(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlte(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plte")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

