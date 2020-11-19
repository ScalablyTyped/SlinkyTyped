package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "RepeatVector")
@js.native
class RepeatVector protected () extends Layer {
  def this(args: RepeatVectorLayerArgs) = this()
  
  def computeOutputShape(inputShape: Shape): Shape = js.native
  
  val n: Double = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "RepeatVector")
@js.native
object RepeatVector extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
