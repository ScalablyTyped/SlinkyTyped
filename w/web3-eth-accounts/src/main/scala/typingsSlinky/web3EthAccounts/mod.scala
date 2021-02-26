package typingsSlinky.web3EthAccounts

import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3Core.mod.AccountsBase
import typingsSlinky.web3Core.mod.SignedTransaction
import typingsSlinky.web3Core.mod.WalletBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-accounts", "Accounts")
  @js.native
  class Accounts () extends AccountsBase {
    def this(provider: typingsSlinky.web3Core.mod.provider) = this()
    def this(provider: typingsSlinky.web3Core.mod.provider, net: Socket) = this()
  }
  
  @JSImport("web3-eth-accounts", "Wallet")
  @js.native
  class Wallet protected () extends WalletBase {
    def this(accounts: AccountsBase) = this()
  }
  
  @js.native
  trait Sign extends SignedTransaction {
    
    var message: String = js.native
    
    var signature: String = js.native
  }
  object Sign {
    
    @scala.inline
    def apply(message: String, r: String, s: String, signature: String, v: String): Sign = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sign]
    }
    
    @scala.inline
    implicit class SignMutableBuilder[Self <: Sign] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignatureObject extends StObject {
    
    var messageHash: String = js.native
    
    var r: String = js.native
    
    var s: String = js.native
    
    var v: String = js.native
  }
  object SignatureObject {
    
    @scala.inline
    def apply(messageHash: String, r: String, s: String, v: String): SignatureObject = {
      val __obj = js.Dynamic.literal(messageHash = messageHash.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureObject]
    }
    
    @scala.inline
    implicit class SignatureObjectMutableBuilder[Self <: SignatureObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageHash(value: String): Self = StObject.set(x, "messageHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
