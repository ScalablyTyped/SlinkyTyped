package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm. */
@js.native
trait CryptoKeyPair extends StObject {
  
  var privateKey: org.scalajs.dom.crypto.CryptoKey = js.native
  
  var publicKey: org.scalajs.dom.crypto.CryptoKey = js.native
}
object CryptoKeyPair {
  
  @scala.inline
  def apply(privateKey: org.scalajs.dom.crypto.CryptoKey, publicKey: org.scalajs.dom.crypto.CryptoKey): org.scalajs.dom.crypto.CryptoKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.CryptoKeyPair]
  }
  
  @scala.inline
  implicit class CryptoKeyPairMutableBuilder[Self <: org.scalajs.dom.crypto.CryptoKeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: org.scalajs.dom.crypto.CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: org.scalajs.dom.crypto.CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
