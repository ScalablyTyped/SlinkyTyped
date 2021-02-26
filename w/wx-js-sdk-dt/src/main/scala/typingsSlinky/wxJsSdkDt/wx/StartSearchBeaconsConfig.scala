package typingsSlinky.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSearchBeaconsConfig extends WxBaseRequestConfig {
  
  /**
    * 完成后的回调
    */
  @JSName("complete")
  def complete_MStartSearchBeaconsConfig(argv: js.Any): Unit = js.native
  
  /**
    * 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
    */
  var ticket: String = js.native
}
object StartSearchBeaconsConfig {
  
  @scala.inline
  def apply(complete: js.Any => Unit, ticket: String): StartSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSearchBeaconsConfig]
  }
  
  @scala.inline
  implicit class StartSearchBeaconsConfigMutableBuilder[Self <: StartSearchBeaconsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
