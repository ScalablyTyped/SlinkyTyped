package typingsSlinky.tensorflowTfjsCore.randMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandNormalDataTypes extends js.Object {
  var float32: scala.scalajs.js.typedarray.Float32Array
  var int32: scala.scalajs.js.typedarray.Int32Array
}

object RandNormalDataTypes {
  @scala.inline
  def apply(float32: scala.scalajs.js.typedarray.Float32Array, int32: scala.scalajs.js.typedarray.Int32Array): RandNormalDataTypes = {
    val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RandNormalDataTypes]
  }
}

