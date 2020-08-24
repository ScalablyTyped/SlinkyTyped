package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "registerBackend")
@js.native
object registerBackend extends js.Object {
  def apply(
    name: String,
    factory: js.Function0[
      typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend]
    ]
  ): Boolean = js.native
  def apply(
    name: String,
    factory: js.Function0[
      typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend]
    ],
    priority: Double
  ): Boolean = js.native
}

