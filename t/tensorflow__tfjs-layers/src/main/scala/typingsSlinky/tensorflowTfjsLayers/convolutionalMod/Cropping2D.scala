package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
@js.native
class Cropping2D protected () extends Layer {
  def this(args: Cropping2DLayerArgs) = this()
  
  def computeOutputShape(inputShape: Shape): Shape = js.native
  
  val cropping: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  
  val dataFormat: DataFormat = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
@js.native
object Cropping2D extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
