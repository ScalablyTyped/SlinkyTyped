package typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
class Dropout protected () extends Layer {
  def this(args: DropoutLayerArgs) = this()
  val noiseShape: js.Any = js.native
  val rate: js.Any = js.native
  val seed: js.Any = js.native
  /* protected */ def getNoiseShape(input: Tensor[Rank]): Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
object Dropout extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

