package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.complex64
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.string
import typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backend extends js.Object {
  var backend: KernelBackend
  var bytes: Double
  var dtype: string | float32 | int32 | bool | complex64
  var refCount: Double
  var shape: js.Array[Double]
}

object Anon_Backend {
  @scala.inline
  def apply(
    backend: KernelBackend,
    bytes: Double,
    dtype: string | float32 | int32 | bool | complex64,
    refCount: Double,
    shape: js.Array[Double]
  ): Anon_Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Backend]
  }
}

