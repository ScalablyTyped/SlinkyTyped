package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.optimizerMod.Optimizer
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adagradOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer")
  @js.native
  class AdagradOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, initialAccumulatorValue: Double) = this()
    
    var accumulatedGrads: js.Any = js.native
    
    var initialAccumulatorValue: js.Any = js.native
    
    var learningRate: Double = js.native
  }
  /* static members */
  object AdagradOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
