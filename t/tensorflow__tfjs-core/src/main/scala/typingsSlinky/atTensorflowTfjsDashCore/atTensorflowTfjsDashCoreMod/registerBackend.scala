package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "registerBackend")
@js.native
object registerBackend extends js.Object {
  def apply(
    name: String,
    factory: js.Function0[
      typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
    ]
  ): Boolean = js.native
  def apply(
    name: String,
    factory: js.Function0[
      typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
    ],
    priority: Double
  ): Boolean = js.native
}

