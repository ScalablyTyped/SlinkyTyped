package typingsSlinky.tensorflowTfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "findBackendFactory")
@js.native
object findBackendFactory extends js.Object {
  def apply(name: String): js.Function0[
    typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend]
  ] = js.native
}

