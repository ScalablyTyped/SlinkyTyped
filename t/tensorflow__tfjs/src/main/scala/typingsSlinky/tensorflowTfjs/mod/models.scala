package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "models")
@js.native
object models extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}

