package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.variablesMod.LayerVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/variable_utils", JSImport.Namespace)
@js.native
object variableUtilsMod extends js.Object {
  def countParamsInWeights(weights: js.Array[LayerVariable]): Double = js.native
}

