package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.optimizerMod.Optimizer
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", JSImport.Namespace)
@js.native
object adadeltaOptimizerMod extends js.Object {
  
  @js.native
  class AdadeltaOptimizer protected () extends Optimizer {
    def this(learningRate: Double, rho: Double) = this()
    def this(learningRate: Double, rho: Double, epsilon: Double) = this()
    
    var accumulatedGrads: js.Any = js.native
    
    var accumulatedUpdates: js.Any = js.native
    
    var epsilon: Double = js.native
    
    var learningRate: Double = js.native
    
    var rho: Double = js.native
  }
  /* static members */
  @js.native
  object AdadeltaOptimizer extends js.Object {
    
    /** @nocollapse */
    var className: String = js.native
    
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
