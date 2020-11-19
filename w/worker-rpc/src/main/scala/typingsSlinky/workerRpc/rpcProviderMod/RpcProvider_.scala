package typingsSlinky.workerRpc.rpcProviderMod

import org.scalajs.dom.raw.Event
import typingsSlinky.workerRpc.rpcProviderInterfaceMod.RpcProviderInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RpcProvider_ extends RpcProviderInterface {
  
  var _clearTransaction: js.Any = js.native
  
  var _dispatch: js.Any = js.native
  
  var _handeRpc: js.Any = js.native
  
  var _handleInternal: js.Any = js.native
  
  var _handleSignal: js.Any = js.native
  
  var _nextTransactionId: js.Any = js.native
  
  var _pendingTransactions: js.Any = js.native
  
  var _raiseError: js.Any = js.native
  
  var _rpcHandlers: js.Any = js.native
  
  var _rpcTimeout: js.Any = js.native
  
  var _signalHandlers: js.Any = js.native
  
  var _transactionTimeout: js.Any = js.native
  
  @JSName("error")
  var error_RpcProvider_ : Event = js.native
  
  def rpc[T, U](id: String, payload: T, transfer: js.Any): js.Promise[U] = js.native
  def rpc[T, U](id: String, payload: js.UndefOr[scala.Nothing], transfer: js.Any): js.Promise[U] = js.native
  
  def signal[T](id: String, payload: T, transfer: js.Any): this.type = js.native
  def signal[T](id: String, payload: js.UndefOr[scala.Nothing], transfer: js.Any): this.type = js.native
}
