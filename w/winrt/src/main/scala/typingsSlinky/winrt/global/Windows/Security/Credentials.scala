package typingsSlinky.winrt.global.Windows.Security

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol
import typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialSaveOption
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
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
    /* CompleteClass */
    override var password: String = js.native
    /* CompleteClass */
    override var properties: IPropertySet = js.native
    /* CompleteClass */
    override var resource: String = js.native
    /* CompleteClass */
    override var userName: String = js.native
    /* CompleteClass */
    override def retrievePassword(): Unit = js.native
  }
  
  @js.native
  class PasswordCredentialPropertyStore ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore {
    /* CompleteClass */
    override var onmapchanged: js.Any = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, js.Any] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): js.Any = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
  }
  
  @js.native
  class PasswordVault ()
    extends typingsSlinky.winrt.Windows.Security.Credentials.PasswordVault {
    /* CompleteClass */
    override def add(credential: typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    /* CompleteClass */
    override def findAllByResource(resource: String): IVectorView[typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
    /* CompleteClass */
    override def findAllByUserName(userName: String): IVectorView[typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
    /* CompleteClass */
    override def remove(credential: typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    /* CompleteClass */
    override def retrieve(resource: String, userName: String): typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential = js.native
    /* CompleteClass */
    override def retrieveAll(): IVectorView[typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
  }
  
  @js.native
  object UI extends js.Object {
    @js.native
    class CredentialPicker ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPicker
    
    @js.native
    class CredentialPickerOptions ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions {
      /* CompleteClass */
      override var alwaysDisplayDialog: Boolean = js.native
      /* CompleteClass */
      override var authenticationProtocol: AuthenticationProtocol = js.native
      /* CompleteClass */
      override var callerSavesCredential: Boolean = js.native
      /* CompleteClass */
      override var caption: String = js.native
      /* CompleteClass */
      override var credentialSaveOption: CredentialSaveOption = js.native
      /* CompleteClass */
      override var customAuthenticationProtocol: String = js.native
      /* CompleteClass */
      override var errorCode: Double = js.native
      /* CompleteClass */
      override var message: String = js.native
      /* CompleteClass */
      override var previousCredential: IBuffer = js.native
      /* CompleteClass */
      override var targetName: String = js.native
    }
    
    @js.native
    class CredentialPickerResults ()
      extends typingsSlinky.winrt.Windows.Security.Credentials.UI.CredentialPickerResults {
      /* CompleteClass */
      override var credential: IBuffer = js.native
      /* CompleteClass */
      override var credentialDomainName: String = js.native
      /* CompleteClass */
      override var credentialPassword: String = js.native
      /* CompleteClass */
      override var credentialSaveOption: CredentialSaveOption = js.native
      /* CompleteClass */
      override var credentialSaved: Boolean = js.native
      /* CompleteClass */
      override var credentialUserName: String = js.native
      /* CompleteClass */
      override var errorCode: Double = js.native
    }
    
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

