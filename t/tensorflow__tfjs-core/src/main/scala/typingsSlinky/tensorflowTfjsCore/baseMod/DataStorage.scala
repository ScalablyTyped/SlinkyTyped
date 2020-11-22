package typingsSlinky.tensorflowTfjsCore.baseMod

import typingsSlinky.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsSlinky.tensorflowTfjsCore.backendMod.DataStorage[T] {
  def this(backend: typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}
