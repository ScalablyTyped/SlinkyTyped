package typingsSlinky.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantizeResult extends js.Object {
  var abuf: scala.scalajs.js.typedarray.ArrayBuffer
  var inds: scala.scalajs.js.typedarray.Uint8Array
  // Type is complicated and I am too lazy to work it out right now, sorry!
  var plte: js.Array[_]
}

object QuantizeResult {
  @scala.inline
  def apply(
    abuf: scala.scalajs.js.typedarray.ArrayBuffer,
    inds: scala.scalajs.js.typedarray.Uint8Array,
    plte: js.Array[_]
  ): QuantizeResult = {
    val __obj = js.Dynamic.literal(abuf = abuf.asInstanceOf[js.Any], inds = inds.asInstanceOf[js.Any], plte = plte.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QuantizeResult]
  }
}

