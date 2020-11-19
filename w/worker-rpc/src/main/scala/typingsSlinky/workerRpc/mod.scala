package typingsSlinky.workerRpc

import typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.Dispatcher
import typingsSlinky.workerRpc.rpcProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("worker-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class RpcProvider protected () extends default {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  @js.native
  object RpcProvider extends js.Object {
    
    @js.native
    object MessageType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType with Double] = js.native
      
      /* 2 */ val internal: typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
      
      /* 1 */ val rpc: typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
      
      /* 0 */ val signal: typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
    }
  }
}
