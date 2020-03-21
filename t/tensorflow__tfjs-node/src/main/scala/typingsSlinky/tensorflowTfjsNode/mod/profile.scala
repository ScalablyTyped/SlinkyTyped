package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.engineMod.ProfileInfo
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "profile")
@js.native
object profile extends js.Object {
  def apply(f: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
}

