package typingsSlinky.atTensorflowTfjsDashLayers

import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatNodeUnderscoreConfigMod.LayerName
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatNodeUnderscoreConfigMod.NodeArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatNodeUnderscoreConfigMod.NodeIndex
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatNodeUnderscoreConfigMod.TensorIndex
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatNodeUnderscoreConfigMod.TensorKeyWithArgsArray
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/node_config", JSImport.Namespace)
@js.native
object distKerasUnderscoreFormatNodeUnderscoreConfigMod extends js.Object {
  type LayerName = String
  type NodeArgs = PyJsonDict
  type NodeConfig = js.Array[TensorKeyWithArgsArray]
  type NodeIndex = Double
  type TensorIndex = Double
  type TensorKeyArray = js.Tuple3[LayerName, NodeIndex, TensorIndex]
  type TensorKeyWithArgsArray = js.Tuple4[LayerName, NodeIndex, TensorIndex, NodeArgs]
}

