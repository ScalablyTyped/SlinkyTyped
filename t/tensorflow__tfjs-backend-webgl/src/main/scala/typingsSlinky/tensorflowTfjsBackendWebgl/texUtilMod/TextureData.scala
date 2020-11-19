package typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod

import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.tensorflowTfjsBackendWebgl.anon.FlatOffset
import typingsSlinky.tensorflowTfjsBackendWebgl.anon.Imag
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureData extends js.Object {
  
  var complexTensors: js.UndefOr[Imag] = js.native
  
  var dtype: DataType = js.native
  
  var isPacked: js.UndefOr[Boolean] = js.native
  
  var shape: js.Array[Double] = js.native
  
  var slice: js.UndefOr[FlatOffset] = js.native
  
  /** [rows, columns] shape of the texture. */
  var texShape: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var texture: js.UndefOr[WebGLTexture] = js.native
  
  var usage: js.UndefOr[TextureUsage] = js.native
  
  var values: js.UndefOr[BackendValues] = js.native
}
object TextureData {
  
  @scala.inline
  def apply(dtype: DataType, shape: js.Array[Double]): TextureData = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureData]
  }
  
  @scala.inline
  implicit class TextureDataOps[Self <: TextureData] (val x: Self) extends AnyVal {
    
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
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexTensors(value: Imag): Self = this.set("complexTensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplexTensors: Self = this.set("complexTensors", js.undefined)
    
    @scala.inline
    def setIsPacked(value: Boolean): Self = this.set("isPacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPacked: Self = this.set("isPacked", js.undefined)
    
    @scala.inline
    def setSlice(value: FlatOffset): Self = this.set("slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
    
    @scala.inline
    def setTexShape(value: js.Tuple2[Double, Double]): Self = this.set("texShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexShape: Self = this.set("texShape", js.undefined)
    
    @scala.inline
    def setTexture(value: WebGLTexture): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexture: Self = this.set("texture", js.undefined)
    
    @scala.inline
    def setUsage(value: TextureUsage): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    
    @scala.inline
    def setValues(value: BackendValues): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesInt32Array(value: js.typedarray.Int32Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesFloat32Array(value: js.typedarray.Float32Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUint8Array(value: js.typedarray.Uint8Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.typedarray.Uint8Array*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
