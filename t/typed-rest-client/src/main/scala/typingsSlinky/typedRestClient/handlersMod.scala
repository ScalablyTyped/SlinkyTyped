package typingsSlinky.typedRestClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersMod {
  
  @JSImport("typed-rest-client/Handlers", "BasicCredentialHandler")
  @js.native
  class BasicCredentialHandler protected ()
    extends typingsSlinky.typedRestClient.mod.BasicCredentialHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, allowCrossOriginAuthentication: Boolean) = this()
  }
  
  @JSImport("typed-rest-client/Handlers", "BearerCredentialHandler")
  @js.native
  class BearerCredentialHandler protected ()
    extends typingsSlinky.typedRestClient.bearertokenMod.BearerCredentialHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
  }
  
  @JSImport("typed-rest-client/Handlers", "NtlmCredentialHandler")
  @js.native
  class NtlmCredentialHandler protected ()
    extends typingsSlinky.typedRestClient.ntlmMod.NtlmCredentialHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
  }
  
  @JSImport("typed-rest-client/Handlers", "PersonalAccessTokenCredentialHandler")
  @js.native
  class PersonalAccessTokenCredentialHandler protected ()
    extends typingsSlinky.typedRestClient.personalaccesstokenMod.PersonalAccessTokenCredentialHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
  }
}
