package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyWebRequestExecutorFactory extends IWebRequestExecutorFactory
object ProxyWebRequestExecutorFactory {
  
  @scala.inline
  def apply(createWebRequestExecutor: () => WebRequestExecutor): ProxyWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = js.Any.fromFunction0(createWebRequestExecutor))
    __obj.asInstanceOf[ProxyWebRequestExecutorFactory]
  }
}
