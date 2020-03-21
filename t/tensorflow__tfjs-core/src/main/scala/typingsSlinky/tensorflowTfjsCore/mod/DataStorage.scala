package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsSlinky.tensorflowTfjsCore.backendMod.DataStorage[T] {
  def this(backend: typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

