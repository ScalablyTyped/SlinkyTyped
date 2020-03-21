package typingsSlinky.tensorflowTfjsLayers.mod

import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
@js.native
object loadLayersModel extends js.Object {
  def apply(pathOrIOHandler: String): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: String, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}

