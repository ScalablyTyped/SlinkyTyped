package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distOptimizersOptimizerMod.Optimizer
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", JSImport.Namespace)
@js.native
object distOptimizersSgdUnderscoreOptimizerMod extends js.Object {
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
  @js.native
  object SGDOptimizer extends js.Object {
    /** @nocollapse */
    var className: String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
}

