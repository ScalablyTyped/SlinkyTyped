package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStoppingCallbackArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "callbacks")
@js.native
object callbacks extends js.Object {
  @JSName("earlyStopping")
  var earlyStopping_Original: js.Function1[
    /* args */ js.UndefOr[EarlyStoppingCallbackArgs], 
    typingsSlinky.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStopping
  ] = js.native
  def earlyStopping(): typingsSlinky.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStopping = js.native
  def earlyStopping(args: EarlyStoppingCallbackArgs): typingsSlinky.atTensorflowTfjsDashLayers.distCallbacksMod.EarlyStopping = js.native
}

