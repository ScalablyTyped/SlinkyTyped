package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  trait HasShape extends StObject {
    
    var shape: Shape = js.native
  }
  object HasShape {
    
    @scala.inline
    def apply(shape: Shape): HasShape = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasShape]
    }
    
    @scala.inline
    implicit class HasShapeMutableBuilder[Self <: HasShape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "shape", js.Array(value :_*))
    }
  }
  
  type Kwargs = StringDictionary[js.Any]
  
  type LossOrMetricFn = js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]]
  
  @js.native
  trait NamedTensor extends StObject {
    
    var name: String = js.native
    
    var tensor: Tensor[Rank] = js.native
  }
  object NamedTensor {
    
    @scala.inline
    def apply(name: String, tensor: Tensor[Rank]): NamedTensor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tensor = tensor.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedTensor]
    }
    
    @scala.inline
    implicit class NamedTensorMutableBuilder[Self <: NamedTensor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensor(value: Tensor[Rank]): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
    }
  }
  
  type RegularizerFn = js.Function0[Scalar]
  
  type RnnStepFunction = js.Function2[
    /* inputs */ Tensor[Rank], 
    /* states */ js.Array[Tensor[Rank]], 
    js.Tuple2[Tensor[Rank], js.Array[Tensor[Rank]]]
  ]
  
  type TensorOrArrayOrMap = Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap
}
