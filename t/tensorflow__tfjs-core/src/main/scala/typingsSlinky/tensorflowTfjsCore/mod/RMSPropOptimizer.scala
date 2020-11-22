package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
@js.native
class RMSPropOptimizer protected ()
  extends typingsSlinky.tensorflowTfjsCore.baseMod.RMSPropOptimizer {
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
}
/* static members */
@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
@js.native
object RMSPropOptimizer extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
