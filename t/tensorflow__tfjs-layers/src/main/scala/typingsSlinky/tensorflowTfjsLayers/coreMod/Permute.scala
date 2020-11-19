package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Permute")
@js.native
class Permute protected () extends Layer {
  def this(args: PermuteLayerArgs) = this()
  
  val dims: js.Array[Double] = js.native
  
  val dimsIncludingBatch: js.Any = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Permute")
@js.native
object Permute extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
