package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "SGDOptimizer")
@js.native
class SGDOptimizer protected ()
  extends typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.SGDOptimizer {
  def this(learningRate: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "SGDOptimizer")
@js.native
object SGDOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

