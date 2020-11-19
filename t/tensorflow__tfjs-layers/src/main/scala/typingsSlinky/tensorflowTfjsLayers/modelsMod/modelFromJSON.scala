package typingsSlinky.tensorflowTfjsLayers.modelsMod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
@js.native
object modelFromJSON extends js.Object {
  
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}
