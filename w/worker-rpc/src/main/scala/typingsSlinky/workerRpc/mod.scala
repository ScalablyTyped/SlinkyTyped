package typingsSlinky.workerRpc

import typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.Dispatcher
import typingsSlinky.workerRpc.rpcProviderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("worker-rpc", "RpcProvider")
  @js.native
  class RpcProvider protected () extends default {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  object RpcProvider {
    
    @JSImport("worker-rpc", "RpcProvider.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType with Double] = js.native
      
      /* 2 */ val internal: typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
      
      /* 1 */ val rpc: typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
      
      /* 0 */ val signal: typingsSlinky.workerRpc.rpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
    }
  }
}
