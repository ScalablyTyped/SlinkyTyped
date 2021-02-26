package typingsSlinky.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebUIBackgroundTaskInstance extends StObject {
  
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
