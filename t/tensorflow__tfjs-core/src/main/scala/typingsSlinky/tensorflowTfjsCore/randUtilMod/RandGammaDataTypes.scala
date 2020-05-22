package typingsSlinky.tensorflowTfjsCore.randUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandGammaDataTypes extends js.Object {
  var float32: js.typedarray.Float32Array
  var int32: js.typedarray.Int32Array
}

object RandGammaDataTypes {
  @scala.inline
  def apply(float32: js.typedarray.Float32Array, int32: js.typedarray.Int32Array): RandGammaDataTypes = {
    val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandGammaDataTypes]
  }
}

