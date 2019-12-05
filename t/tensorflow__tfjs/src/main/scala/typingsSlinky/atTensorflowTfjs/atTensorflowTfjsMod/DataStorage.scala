package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.DataStorage[T] {
  def this(
    backend: typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend,
    dataMover: DataMover
  ) = this()
}

