package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indices extends StObject {
  
  var indices: BackendValues = js.native
  
  var outputShape: js.Array[Double] = js.native
  
  var outputValues: BackendValues = js.native
}
object Indices {
  
  @scala.inline
  def apply(indices: BackendValues, outputShape: js.Array[Double], outputValues: BackendValues): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], outputValues = outputValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit class IndicesMutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: BackendValues): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value :_*))
    
    @scala.inline
    def setOutputValues(value: BackendValues): Self = StObject.set(x, "outputValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValuesFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "outputValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValuesInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "outputValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValuesUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "outputValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValuesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "outputValues", js.Array(value :_*))
  }
}
