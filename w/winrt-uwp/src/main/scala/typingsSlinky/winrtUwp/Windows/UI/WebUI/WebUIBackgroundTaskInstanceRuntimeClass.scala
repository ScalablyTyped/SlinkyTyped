package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCanceledEventHandler
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskDeferral
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.canceled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to an instance of a background task. */
@js.native
trait WebUIBackgroundTaskInstanceRuntimeClass extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(`type`: canceled, listener: BackgroundTaskCanceledEventHandler): Unit = js.native
  
  /**
    * Informs the system that the background task might continue to perform work after the IBackgroundTask.Run method returns. This method is not applicable to JavaScript background tasks.
    * @return A background task deferral.
    */
  def getDeferral(): BackgroundTaskDeferral = js.native
  
  /** Gets the instance ID of the background task instance. */
  var instanceId: String = js.native
  
  /** Attaches a cancellation event handler to the background task instance. */
  def oncanceled(ev: BackgroundTaskCancellationReason with WinRTEvent[IBackgroundTaskInstance]): Unit = js.native
  /** Attaches a cancellation event handler to the background task instance. */
  @JSName("oncanceled")
  var oncanceled_Original: BackgroundTaskCanceledEventHandler = js.native
  
  /** Gets or sets progress status for a background task instance. */
  var progress: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(`type`: canceled, listener: BackgroundTaskCanceledEventHandler): Unit = js.native
  
  /** Gets or sets the success value for the background task. The success value is what is returned to the foreground instance of your app in the completed event. */
  var succeeded: Boolean = js.native
  
  /** Gets the number of times resource management policy caused the background task to be suspended. */
  var suspendedCount: Double = js.native
  
  /** Gets access to the registered background task for this background task instance. */
  var task: BackgroundTaskRegistration = js.native
  
  /** Gets additional information associated with a background task instance. */
  var triggerDetails: js.Any = js.native
}
