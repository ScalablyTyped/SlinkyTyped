package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "findBackendFactory")
@js.native
object findBackendFactory extends js.Object {
  def apply(name: String): js.Function0[
    typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend]
  ] = js.native
}

