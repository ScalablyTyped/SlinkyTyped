package typingsSlinky.atTensorflowTfjsDashLayers

import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import typingsSlinky.atTensorflowTfjsDashLayers.distModelsMod.ModelAndWeightsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_models", JSImport.Namespace)
@js.native
object distExportsUnderscoreModelsMod extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

