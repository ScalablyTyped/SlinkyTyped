package typingsSlinky.tensorflowTfjsConverter

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsConverter.hashTableMod.HashTable
import typingsSlinky.tensorflowTfjsConverter.tensorArrayMod.TensorArray
import typingsSlinky.tensorflowTfjsConverter.tensorListMod.TensorList
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type HashTableMap = NumberDictionary[HashTable]
  
  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  
  type NamedTensorsMap = StringDictionary[js.Array[Tensor[Rank]]]
  
  type TensorArrayMap = NumberDictionary[TensorArray]
  
  @js.native
  trait TensorInfo extends StObject {
    
    var dtype: DataType = js.native
    
    var name: String = js.native
    
    var shape: js.UndefOr[js.Array[Double]] = js.native
  }
  object TensorInfo {
    
    @scala.inline
    def apply(dtype: DataType, name: String): TensorInfo = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorInfo]
    }
    
    @scala.inline
    implicit class TensorInfoMutableBuilder[Self <: TensorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
    }
  }
  
  type TensorListMap = NumberDictionary[TensorList]
}
