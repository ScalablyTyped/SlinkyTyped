package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reduce", "reduce")
  @js.native
  def reduce(x: TensorInfo, dtype: DataType, reductionType: ReduceTypes, backend: MathBackendWebGL): TensorInfo = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod
    - typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean
  */
  trait ReduceTypes extends StObject
  object ReduceTypes {
    
    @scala.inline
    def all: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all = "all".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all]
    
    @scala.inline
    def any: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any = "any".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any]
    
    @scala.inline
    def max: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max = "max".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max]
    
    @scala.inline
    def mean: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean = "mean".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean]
    
    @scala.inline
    def min: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min = "min".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min]
    
    @scala.inline
    def prod: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod = "prod".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod]
    
    @scala.inline
    def sum: typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum = "sum".asInstanceOf[typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum]
  }
}
