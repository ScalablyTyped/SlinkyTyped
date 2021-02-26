package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSImport("@tensorflow/tfjs", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs", "models.modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}
