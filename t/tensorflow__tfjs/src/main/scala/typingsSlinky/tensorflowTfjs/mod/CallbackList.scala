package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList ()
  extends typingsSlinky.tensorflowTfjsLayers.mod.CallbackList {
  def this(callbacks: js.Array[BaseCallback]) = this()
  def this(callbacks: js.UndefOr[scala.Nothing], queueLength: Double) = this()
  def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
}
