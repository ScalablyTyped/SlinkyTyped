package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageRequestFailedEventArgs extends EventArgs {
  
  def get_errorMessage(): String = js.native
  
  def get_executor(): WebRequestExecutor = js.native
  
  def get_isErrorPage(): Boolean = js.native
}
object PageRequestFailedEventArgs {
  
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_errorMessage: () => String,
    get_executor: () => WebRequestExecutor,
    get_isErrorPage: () => Boolean
  ): PageRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_executor = js.Any.fromFunction0(get_executor), get_isErrorPage = js.Any.fromFunction0(get_isErrorPage))
    __obj.asInstanceOf[PageRequestFailedEventArgs]
  }
  
  @scala.inline
  implicit class PageRequestFailedEventArgsMutableBuilder[Self <: PageRequestFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_errorMessage(value: () => String): Self = StObject.set(x, "get_errorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_executor(value: () => WebRequestExecutor): Self = StObject.set(x, "get_executor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_isErrorPage(value: () => Boolean): Self = StObject.set(x, "get_isErrorPage", js.Any.fromFunction0(value))
  }
}
