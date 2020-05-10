package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeMap extends js.Object {
  var bool: js.typedarray.Uint8Array = js.native
  var complex64: js.typedarray.Float32Array = js.native
  var float32: js.typedarray.Float32Array = js.native
  var int32: js.typedarray.Int32Array = js.native
  var string: js.Array[String] = js.native
}

object DataTypeMap {
  @scala.inline
  def apply(
    bool: js.typedarray.Uint8Array,
    complex64: js.typedarray.Float32Array,
    float32: js.typedarray.Float32Array,
    int32: js.typedarray.Int32Array,
    string: js.Array[String]
  ): DataTypeMap = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeMap]
  }
  @scala.inline
  implicit class DataTypeMapOps[Self <: DataTypeMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBool(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplex64(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat32(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt32(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

