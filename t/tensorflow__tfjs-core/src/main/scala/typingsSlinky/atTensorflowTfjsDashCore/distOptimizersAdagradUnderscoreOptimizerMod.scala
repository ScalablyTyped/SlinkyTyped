package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distOptimizersOptimizerMod.Optimizer
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", JSImport.Namespace)
@js.native
object distOptimizersAdagradUnderscoreOptimizerMod extends js.Object {
  @js.native
  class AdagradOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, initialAccumulatorValue: Double) = this()
    var accumulatedGrads: js.Any = js.native
    var initialAccumulatorValue: js.Any = js.native
    var learningRate: Double = js.native
  }
  
  /* static members */
  @js.native
  object AdagradOptimizer extends js.Object {
    /** @nocollapse */
    var className: String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
}

