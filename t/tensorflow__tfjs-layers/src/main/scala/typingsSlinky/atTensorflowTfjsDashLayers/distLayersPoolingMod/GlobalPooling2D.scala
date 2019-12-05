package typingsSlinky.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling2D")
@js.native
abstract class GlobalPooling2D protected () extends Layer {
  def this(args: GlobalPooling2DLayerArgs) = this()
  var dataFormat: DataFormat = js.native
}

