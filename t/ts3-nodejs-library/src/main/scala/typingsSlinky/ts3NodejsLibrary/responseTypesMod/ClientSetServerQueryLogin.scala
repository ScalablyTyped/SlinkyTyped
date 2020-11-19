package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSetServerQueryLogin extends ResponseEntry {
  
  var clientLoginPassword: String = js.native
}
object ClientSetServerQueryLogin {
  
  @scala.inline
  def apply(clientLoginPassword: String): ClientSetServerQueryLogin = {
    val __obj = js.Dynamic.literal(clientLoginPassword = clientLoginPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSetServerQueryLogin]
  }
  
  @scala.inline
  implicit class ClientSetServerQueryLoginOps[Self <: ClientSetServerQueryLogin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientLoginPassword(value: String): Self = this.set("clientLoginPassword", value.asInstanceOf[js.Any])
  }
}
