package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEncryptedAndAuthenticatedData extends StObject {
  
  var authenticationTag: IBuffer = js.native
  
  var encryptedData: IBuffer = js.native
}
object IEncryptedAndAuthenticatedData {
  
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
  
  @scala.inline
  implicit class IEncryptedAndAuthenticatedDataMutableBuilder[Self <: IEncryptedAndAuthenticatedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationTag(value: IBuffer): Self = StObject.set(x, "authenticationTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedData(value: IBuffer): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
  }
}
