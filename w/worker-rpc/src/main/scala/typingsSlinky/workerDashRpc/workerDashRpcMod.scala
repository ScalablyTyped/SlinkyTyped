package typingsSlinky.workerDashRpc

import typingsSlinky.workerDashRpc.libRpcProviderMod.RpcProvider.Dispatcher
import typingsSlinky.workerDashRpc.libRpcProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-rpc", JSImport.Namespace)
@js.native
object workerDashRpcMod extends js.Object {
  @js.native
  class RpcProvider protected () extends default {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  
  @js.native
  object RpcProvider extends js.Object {
    @js.native
    object MessageType extends js.Object {
      /* 2 */ val internal: typingsSlinky.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
      /* 1 */ val rpc: typingsSlinky.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
      /* 0 */ val signal: typingsSlinky.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType with Double
          ] = js.native
    }
    
  }
  
}

