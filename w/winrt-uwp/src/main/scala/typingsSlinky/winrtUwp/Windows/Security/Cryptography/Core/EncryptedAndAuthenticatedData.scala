package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
@js.native
trait EncryptedAndAuthenticatedData extends StObject {
  
  /** Gets the authentication tag. */
  var authenticationTag: IBuffer = js.native
  
  /** Gets the encrypted data. */
  var encryptedData: IBuffer = js.native
}
object EncryptedAndAuthenticatedData {
  
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): EncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedAndAuthenticatedData]
  }
  
  @scala.inline
  implicit class EncryptedAndAuthenticatedDataMutableBuilder[Self <: EncryptedAndAuthenticatedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationTag(value: IBuffer): Self = StObject.set(x, "authenticationTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedData(value: IBuffer): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
  }
}
