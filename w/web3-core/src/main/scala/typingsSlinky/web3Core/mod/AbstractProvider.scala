package typingsSlinky.web3Core.mod

import typingsSlinky.web3CoreHelpers.mod.JsonRpcPayload
import typingsSlinky.web3CoreHelpers.mod.JsonRpcResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractProvider extends _provider {
  
  var connected: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[js.Function1[/* args */ RequestArguments, js.Promise[_]]] = js.native
  
  var send: js.UndefOr[
    js.Function2[
      /* payload */ JsonRpcPayload, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit], 
      Unit
    ]
  ] = js.native
  
  def sendAsync(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
}
object AbstractProvider {
  
  @scala.inline
  def apply(
    sendAsync: (JsonRpcPayload, js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
  ): AbstractProvider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    __obj.asInstanceOf[AbstractProvider]
  }
  
  @scala.inline
  implicit class AbstractProviderMutableBuilder[Self <: AbstractProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    @scala.inline
    def setRequest(value: /* args */ RequestArguments => js.Promise[_]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setSend(
      value: (/* payload */ JsonRpcPayload, /* callback */ js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendAsync(
      value: (JsonRpcPayload, js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = StObject.set(x, "sendAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
  }
}
