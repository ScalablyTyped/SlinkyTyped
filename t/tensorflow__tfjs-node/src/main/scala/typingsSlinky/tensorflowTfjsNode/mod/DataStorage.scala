package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsSlinky.tensorflowTfjs.mod.DataStorage[T] {
  def this(backend: typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

