package typingsSlinky.twilioCommon

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioCommon.twilioCommonStrings.error
import typingsSlinky.twilioCommon.twilioCommonStrings.tokenExpired
import typingsSlinky.twilioCommon.twilioCommonStrings.tokenUpdated
import typingsSlinky.twilioCommon.twilioCommonStrings.tokenWillExpire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class AccessManager protected () extends EventEmitter {
    def this(initialToken: String) = this()
    
    val expires: js.UndefOr[js.Date] = js.native
    
    val identity: js.UndefOr[String] = js.native
    
    val isExpired: Boolean = js.native
    
    @JSName("on")
    def on_error(`type`: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_tokenExpired(`type`: tokenExpired, listener: js.Function1[/* manager */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_tokenUpdated(`type`: tokenUpdated, listener: js.Function1[/* manager */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_tokenWillExpire(`type`: tokenWillExpire, listener: js.Function1[/* manager */ this.type, Unit]): this.type = js.native
    
    val token: String = js.native
    
    def updateToken(newToken: String): js.Promise[AccessManager] = js.native
  }
}
