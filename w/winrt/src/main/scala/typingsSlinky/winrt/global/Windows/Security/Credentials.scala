package typingsSlinky.winrt.global.Windows.Security

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Credentials {
  
  @JSGlobal("Windows.Security.Credentials.PasswordCredential")
  @js.native
  class PasswordCredential ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential {
    def this(resource: String, userName: String, password: String) = this()
  }
  
  @JSGlobal("Windows.Security.Credentials.PasswordCredentialPropertyStore")
  @js.native
  class PasswordCredentialPropertyStore ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore
  
  @JSGlobal("Windows.Security.Credentials.PasswordVault")
  @js.native
  class PasswordVault ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordVault
  
  object UI {
    
    @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
    @js.native
    object AuthenticationProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol with Double
          ] = js.native
      
      /* 0 */ val basic: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.basic with Double = js.native
      
      /* 5 */ val credSsp: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp with Double = js.native
      
      /* 6 */ val custom: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.custom with Double = js.native
      
      /* 1 */ val digest: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.digest with Double = js.native
      
      /* 3 */ val kerberos: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos with Double = js.native
      
      /* 4 */ val negotiate: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate with Double = js.native
      
      /* 2 */ val ntlm: typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm with Double = js.native
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
    @js.native
    class CredentialPicker ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPicker
    /* static members */
    object CredentialPicker {
      
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(options: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions): IAsyncOperation[typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(targetName: String, message: String): IAsyncOperation[typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
    @js.native
    class CredentialPickerOptions ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
    @js.native
    class CredentialPickerResults ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
    @js.native
    object CredentialSaveOption extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption with Double
          ] = js.native
      
      /* 2 */ val hidden: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
      
      /* 1 */ val selected: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
      
      /* 0 */ val unselected: typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
    }
  }
}
