package typingsSlinky.stellarBase.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stellarBase.mod.SignerKeyOptions.Ed25519PublicKey
  - typingsSlinky.stellarBase.mod.SignerKeyOptions.Sha256Hash
  - typingsSlinky.stellarBase.mod.SignerKeyOptions.PreAuthTx
*/
trait SignerKeyOptions extends StObject
object SignerKeyOptions {
  
  @js.native
  trait Ed25519PublicKey extends SignerKeyOptions {
    
    var ed25519PublicKey: String = js.native
  }
  object Ed25519PublicKey {
    
    @scala.inline
    def apply(ed25519PublicKey: String): Ed25519PublicKey = {
      val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ed25519PublicKey]
    }
    
    @scala.inline
    implicit class Ed25519PublicKeyMutableBuilder[Self <: Ed25519PublicKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEd25519PublicKey(value: String): Self = StObject.set(x, "ed25519PublicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreAuthTx extends SignerKeyOptions {
    
    var preAuthTx: Buffer | String = js.native
  }
  object PreAuthTx {
    
    @scala.inline
    def apply(preAuthTx: Buffer | String): PreAuthTx = {
      val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreAuthTx]
    }
    
    @scala.inline
    implicit class PreAuthTxMutableBuilder[Self <: PreAuthTx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreAuthTx(value: Buffer | String): Self = StObject.set(x, "preAuthTx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sha256Hash extends SignerKeyOptions {
    
    var sha256Hash: Buffer | String = js.native
  }
  object Sha256Hash {
    
    @scala.inline
    def apply(sha256Hash: Buffer | String): Sha256Hash = {
      val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sha256Hash]
    }
    
    @scala.inline
    implicit class Sha256HashMutableBuilder[Self <: Sha256Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSha256Hash(value: Buffer | String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    }
  }
}
