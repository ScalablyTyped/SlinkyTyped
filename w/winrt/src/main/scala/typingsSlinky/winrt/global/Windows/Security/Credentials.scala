package typingsSlinky.winrt.global.Windows.Security

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials")
@js.native
object Credentials extends js.Object {
  @js.native
  class PasswordCredential ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential {
    def this(resource: String, userName: String, password: String) = this()
  }
  
  @js.native
  class PasswordCredentialPropertyStore ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore
  
  @js.native
  class PasswordVault ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordVault
  
  @js.native
  object UI extends js.Object {
    @js.native
    class CredentialPicker ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPicker
    
    @js.native
    class CredentialPickerOptions ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions
    
    @js.native
    class CredentialPickerResults ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults
    
    @js.native
    object AuthenticationProtocol extends js.Object {
      /* 0 */ val basic: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.basic with Double = js.native
      /* 5 */ val credSsp: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp with Double = js.native
      /* 6 */ val custom: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.custom with Double = js.native
      /* 1 */ val digest: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.digest with Double = js.native
      /* 3 */ val kerberos: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos with Double = js.native
      /* 4 */ val negotiate: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate with Double = js.native
      /* 2 */ val ntlm: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol with Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object CredentialPicker extends js.Object {
      def pickAsync(options: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions): IAsyncOperation[typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      def pickAsync(targetName: String, message: String): IAsyncOperation[typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    }
    
    @js.native
    object CredentialSaveOption extends js.Object {
      /* 2 */ val hidden: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
      /* 1 */ val selected: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
      /* 0 */ val unselected: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption with Double
          ] = js.native
    }
    
  }
  
}

