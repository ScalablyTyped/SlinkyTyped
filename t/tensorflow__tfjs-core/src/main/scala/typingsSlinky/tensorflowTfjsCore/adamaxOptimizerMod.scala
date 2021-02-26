package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.optimizerMod.Optimizer
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adamaxOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer")
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
  object AdamaxOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
