package typingsSlinky.atTensorflowTfjsDashLayers.distModelsMod

import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
@js.native
object loadLayersModelFromIOHandler extends js.Object {
  def apply(handler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
}

