package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsLayers.callbacksMod.EarlyStoppingCallbackArgs
import typingsSlinky.tensorflowTfjsLayers.callbacksMod.EarlyStopping_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "callbacks")
@js.native
object callbacks extends js.Object {
  
  def earlyStopping(): EarlyStopping_ = js.native
  def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = js.native
  @JSName("earlyStopping")
  var earlyStopping_Original: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
}
