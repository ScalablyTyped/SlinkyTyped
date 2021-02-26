package typingsSlinky.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to an instance of a background task. */
@js.native
trait IWebUIBackgroundTaskInstance extends StObject {
  
  /** Gets or sets the success value for the background task. The success value is what is returned to the foreground instance of your app in the completed event. */
  var succeeded: Boolean = js.native
}
object IWebUIBackgroundTaskInstance {
  
  @scala.inline
  def apply(succeeded: Boolean): IWebUIBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIBackgroundTaskInstance]
  }
  
  @scala.inline
  implicit class IWebUIBackgroundTaskInstanceMutableBuilder[Self <: IWebUIBackgroundTaskInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
