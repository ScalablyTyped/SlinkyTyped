package typingsSlinky.tensorflowTfjsLayers.modelsMod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
@js.native
object loadLayersModelFromIOHandler extends js.Object {
  
  def apply(handler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: js.UndefOr[scala.Nothing], options: LoadOptions): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
}
