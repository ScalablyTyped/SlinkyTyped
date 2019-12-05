package typingsSlinky.atTensorflowTfjsDashLayers.distModelsMod

import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
@js.native
object modelFromJSON extends js.Object {
  def apply(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

