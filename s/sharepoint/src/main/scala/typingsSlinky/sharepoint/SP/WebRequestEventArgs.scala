package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestEventArgs extends EventArgs {
  
  def get_webRequest(): WebRequest = js.native
}
object WebRequestEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_webRequest: () => WebRequest): WebRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_webRequest = js.Any.fromFunction0(get_webRequest))
    __obj.asInstanceOf[WebRequestEventArgs]
  }
  
  @scala.inline
  implicit class WebRequestEventArgsMutableBuilder[Self <: WebRequestEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_webRequest(value: () => WebRequest): Self = StObject.set(x, "get_webRequest", js.Any.fromFunction0(value))
  }
}
