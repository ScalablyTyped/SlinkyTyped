package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling1D")
@js.native
abstract class GlobalPooling1D protected () extends Layer {
  def this(args: LayerArgs) = this()
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

