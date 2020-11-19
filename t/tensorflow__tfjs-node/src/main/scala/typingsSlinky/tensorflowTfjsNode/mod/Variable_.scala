package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "Variable")
@js.native
class Variable_[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */] protected ()
  extends typingsSlinky.tensorflowTfjs.mod.Variable_[R] {
  def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
}
