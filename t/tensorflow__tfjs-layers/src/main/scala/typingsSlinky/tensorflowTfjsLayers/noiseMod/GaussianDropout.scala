package typingsSlinky.tensorflowTfjsLayers.noiseMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianDropout")
@js.native
class GaussianDropout protected () extends Layer {
  def this(args: GaussianDropoutArgs) = this()
  
  val rate: Double = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianDropout")
@js.native
object GaussianDropout extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
