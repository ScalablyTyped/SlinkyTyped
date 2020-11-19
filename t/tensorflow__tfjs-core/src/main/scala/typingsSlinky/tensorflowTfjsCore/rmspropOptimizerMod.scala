package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.optimizerMod.Optimizer
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", JSImport.Namespace)
@js.native
object rmspropOptimizerMod extends js.Object {
  
  @js.native
  class RMSPropOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, decay: Double) = this()
    def this(learningRate: Double, decay: js.UndefOr[scala.Nothing], momentum: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: js.UndefOr[scala.Nothing],
      epsilon: Double
    ) = this()
    def this(learningRate: Double, decay: js.UndefOr[scala.Nothing], momentum: Double, epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: js.UndefOr[scala.Nothing], epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: js.UndefOr[scala.Nothing],
      epsilon: Double,
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: Double,
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: Double,
      epsilon: Double,
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: Double,
      momentum: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: Double,
      momentum: js.UndefOr[scala.Nothing],
      epsilon: Double,
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: Double,
      momentum: Double,
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double, centered: Boolean) = this()
    
    var accumulatedMeanGrads: js.Any = js.native
    
    var accumulatedMeanSquares: js.Any = js.native
    
    var accumulatedMoments: js.Any = js.native
    
    var centered: js.Any = js.native
    
    var decay: Double = js.native
    
    var epsilon: Double = js.native
    
    var learningRate: Double = js.native
    
    var momentum: Double = js.native
  }
  /* static members */
  @js.native
  object RMSPropOptimizer extends js.Object {
    
    /** @nocollapse */
    var className: String = js.native
    
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
