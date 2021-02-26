package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedCredentialInfo extends StObject {
  
  val credential: ScopedCredential = js.native
  
  val publicKey: org.scalajs.dom.crypto.CryptoKey = js.native
}
object ScopedCredentialInfo {
  
  @scala.inline
  def apply(credential: ScopedCredential, publicKey: org.scalajs.dom.crypto.CryptoKey): ScopedCredentialInfo = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialInfo]
  }
  
  @scala.inline
  implicit class ScopedCredentialInfoMutableBuilder[Self <: ScopedCredentialInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: ScopedCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: org.scalajs.dom.crypto.CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
