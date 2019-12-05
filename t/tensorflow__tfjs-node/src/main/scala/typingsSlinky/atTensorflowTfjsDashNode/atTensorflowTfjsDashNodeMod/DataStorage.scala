package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod.DataStorage[T] {
  def this(
    backend: typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend,
    dataMover: DataMover
  ) = this()
}

