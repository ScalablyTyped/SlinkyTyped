package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.optimizerMod.Optimizer
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sgdOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
  @js.native
  class SGDOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    
    var c: Scalar = js.native
    
    var learningRate: Double = js.native
    
    /**
      * Sets the learning rate of the optimizer.
      */
    def setLearningRate(learningRate: Double): Unit = js.native
  }
  /* static members */
  object SGDOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
