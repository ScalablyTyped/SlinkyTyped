package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsLayers.callbacksMod.EarlyStoppingCallbackArgs
import typingsSlinky.tensorflowTfjsLayers.callbacksMod.EarlyStopping_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbacks {
  
  @JSImport("@tensorflow/tfjs-node", "callbacks")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node", "callbacks.earlyStopping")
  @js.native
  def earlyStopping(): EarlyStopping_ = js.native
  @JSImport("@tensorflow/tfjs-node", "callbacks.earlyStopping")
  @js.native
  def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = js.native
  @JSImport("@tensorflow/tfjs-node", "callbacks.earlyStopping")
  @js.native
  def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
  
  @scala.inline
  def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
}
