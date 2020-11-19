package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.optimizerMod.Optimizer
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", JSImport.Namespace)
@js.native
object adamaxOptimizerMod extends js.Object {
  
  @js.native
  class AdamaxOptimizer protected () extends Optimizer {
    def this(learningRate: Double, beta1: Double, beta2: Double) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
    def this(
      learningRate: Double,
      beta1: Double,
      beta2: Double,
      epsilon: js.UndefOr[scala.Nothing],
      decay: Double
    ) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double, decay: Double) = this()
    
    var accBeta1: js.Any = js.native
    
    var accumulatedFirstMoment: js.Any = js.native
    
    var accumulatedWeightedInfNorm: js.Any = js.native
    
    var beta1: Double = js.native
    
    var beta2: Double = js.native
    
    var decay: Double = js.native
    
    var epsilon: Double = js.native
    
    var iteration: js.Any = js.native
    
    var learningRate: Double = js.native
  }
  /* static members */
  @js.native
  object AdamaxOptimizer extends js.Object {
    
    /** @nocollapse */
    var className: String = js.native
    
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
