package typingsSlinky.typedDashRestDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/Handlers", JSImport.Namespace)
@js.native
object handlersMod extends js.Object {
  @js.native
  class BasicCredentialHandler protected ()
    extends typingsSlinky.typedDashRestDashClient.handlersBasiccredsMod.BasicCredentialHandler {
    def this(username: String, password: String) = this()
  }
  
  @js.native
  class BearerCredentialHandler protected ()
    extends typingsSlinky.typedDashRestDashClient.handlersBearertokenMod.BearerCredentialHandler {
    def this(token: String) = this()
  }
  
  @js.native
  class NtlmCredentialHandler protected ()
    extends typingsSlinky.typedDashRestDashClient.handlersNtlmMod.NtlmCredentialHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
  }
  
  @js.native
  class PersonalAccessTokenCredentialHandler protected ()
    extends typingsSlinky.typedDashRestDashClient.handlersPersonalaccesstokenMod.PersonalAccessTokenCredentialHandler {
    def this(token: String) = this()
  }
  
}

