package typingsSlinky.trufflePrivatekeyProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("truffle-privatekey-provider", JSImport.Namespace)
  @js.native
  class ^ protected () extends PrivateKeyProvider {
    def this(privateKey: js.Any, providerUrl: js.Any) = this()
  }
  
  @js.native
  trait PrivateKeyProvider extends StObject {
    
    def send(args: js.Any*): js.Any = js.native
    
    def sendAsync(args: js.Any*): Unit = js.native
  }
  object PrivateKeyProvider {
    
    @scala.inline
    def apply(send: /* repeated */ js.Any => js.Any, sendAsync: /* repeated */ js.Any => Unit): PrivateKeyProvider = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
      __obj.asInstanceOf[PrivateKeyProvider]
    }
    
    @scala.inline
    implicit class PrivateKeyProviderMutableBuilder[Self <: PrivateKeyProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSend(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSendAsync(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "sendAsync", js.Any.fromFunction1(value))
    }
  }
}
