package typingsSlinky.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imag extends js.Object {
  var imag: js.typedarray.Float32Array
  var real: js.typedarray.Float32Array
}

object Imag {
  @scala.inline
  def apply(imag: js.typedarray.Float32Array, real: js.typedarray.Float32Array): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
}

