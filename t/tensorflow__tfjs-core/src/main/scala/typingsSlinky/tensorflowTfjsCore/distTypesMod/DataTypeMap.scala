package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBool(value: js.typedarray.Uint8Array): Self = this.set("bool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplex64(value: js.typedarray.Float32Array): Self = this.set("complex64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat32(value: js.typedarray.Float32Array): Self = this.set("float32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt32(value: js.typedarray.Int32Array): Self = this.set("int32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringVarargs(value: String*): Self = this.set("string", js.Array(value :_*))
    
    @scala.inline
    def setString(value: js.Array[String]): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
