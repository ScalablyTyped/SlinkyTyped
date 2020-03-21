package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeMap extends js.Object {
  var bool: scala.scalajs.js.typedarray.Uint8Array
  var complex64: scala.scalajs.js.typedarray.Float32Array
  var float32: scala.scalajs.js.typedarray.Float32Array
  var int32: scala.scalajs.js.typedarray.Int32Array
  var string: js.Array[String]
}

object DataTypeMap {
  @scala.inline
  def apply(
    bool: scala.scalajs.js.typedarray.Uint8Array,
    complex64: scala.scalajs.js.typedarray.Float32Array,
    float32: scala.scalajs.js.typedarray.Float32Array,
    int32: scala.scalajs.js.typedarray.Int32Array,
    string: js.Array[String]
  ): DataTypeMap = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataTypeMap]
  }
}

