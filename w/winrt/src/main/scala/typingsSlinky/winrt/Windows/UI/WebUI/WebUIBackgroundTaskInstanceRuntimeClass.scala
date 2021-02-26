package typingsSlinky.winrt.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
import typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebUIBackgroundTaskInstanceRuntimeClass
  extends IWebUIBackgroundTaskInstance
     with IBackgroundTaskInstance
object WebUIBackgroundTaskInstanceRuntimeClass {
  
  @scala.inline
  def apply(
    getDeferral: () => BackgroundTaskDeferral,
    instanceId: String,
    oncanceled: js.Any,
    progress: Double,
    succeeded: Boolean,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): WebUIBackgroundTaskInstanceRuntimeClass = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), instanceId = instanceId.asInstanceOf[js.Any], oncanceled = oncanceled.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIBackgroundTaskInstanceRuntimeClass]
  }
}
