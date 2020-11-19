package typingsSlinky.tensorflowTfjsLayers.modelsMod

import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelInternal")
@js.native
object loadLayersModelInternal extends js.Object {
  
  def apply(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  def apply(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
}
