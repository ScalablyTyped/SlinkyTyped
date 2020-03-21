package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImag extends js.Object {
  var imag: scala.scalajs.js.typedarray.Float32Array
  var real: scala.scalajs.js.typedarray.Float32Array
}

object AnonImag {
  @scala.inline
  def apply(imag: scala.scalajs.js.typedarray.Float32Array, real: scala.scalajs.js.typedarray.Float32Array): AnonImag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImag]
  }
}

