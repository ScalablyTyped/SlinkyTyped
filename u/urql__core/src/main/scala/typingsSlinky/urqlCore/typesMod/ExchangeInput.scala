package typingsSlinky.urqlCore.typesMod

import typingsSlinky.urqlCore.clientMod.Client
import typingsSlinky.urqlCore.urqlCoreStrings.cacheHit
import typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation
import typingsSlinky.urqlCore.urqlCoreStrings.fetchError
import typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest
import typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess
import typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeInput extends js.Object {
  
  var client: Client = js.native
  
  def dispatchDebug(t: DebugEventArg[String]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_cacheHit(t: DebugEventArg[cacheHit]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_cacheInvalidation(t: DebugEventArg[cacheInvalidation]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_fetchError(t: DebugEventArg[fetchError]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_fetchRequest(t: DebugEventArg[fetchRequest]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_fetchSuccess(t: DebugEventArg[fetchSuccess]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_retryRetrying(t: DebugEventArg[retryRetrying]): Unit = js.native
  
  def forward(ops$: sourceT[Operation]): sourceT[OperationResult[_]] = js.native
  @JSName("forward")
  var forward_Original: ExchangeIO = js.native
}
