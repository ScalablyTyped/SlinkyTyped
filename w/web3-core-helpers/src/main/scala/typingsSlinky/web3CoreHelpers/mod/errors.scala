package typingsSlinky.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "errors")
@js.native
class errors () extends StObject
/* static members */
object errors {
  
  @JSImport("web3-core-helpers", "errors.ConnectionCloseError")
  @js.native
  def ConnectionCloseError(event: Boolean): js.Error | ConnectionError = js.native
  @JSImport("web3-core-helpers", "errors.ConnectionCloseError")
  @js.native
  def ConnectionCloseError(event: WebSocketEvent): js.Error | ConnectionError = js.native
  
  @JSImport("web3-core-helpers", "errors.ConnectionError")
  @js.native
  def ConnectionError(msg: String): typingsSlinky.web3CoreHelpers.mod.ConnectionError = js.native
  @JSImport("web3-core-helpers", "errors.ConnectionError")
  @js.native
  def ConnectionError(msg: String, event: WebSocketEvent): typingsSlinky.web3CoreHelpers.mod.ConnectionError = js.native
  
  @JSImport("web3-core-helpers", "errors.ConnectionNotOpenError")
  @js.native
  def ConnectionNotOpenError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ConnectionTimeout")
  @js.native
  def ConnectionTimeout(ms: String): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractCodeNotStoredError")
  @js.native
  def ContractCodeNotStoredError(receipt: js.Object): TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractEventDoesNotExistError")
  @js.native
  def ContractEventDoesNotExistError(eventName: String): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractMissingABIError")
  @js.native
  def ContractMissingABIError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractMissingDeployDataError")
  @js.native
  def ContractMissingDeployDataError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractNoAddressDefinedError")
  @js.native
  def ContractNoAddressDefinedError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractNoFromAddressDefinedError")
  @js.native
  def ContractNoFromAddressDefinedError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractOnceRequiresCallbackError")
  @js.native
  def ContractOnceRequiresCallbackError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractReservedEventError")
  @js.native
  def ContractReservedEventError(`type`: String): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ErrorResponse")
  @js.native
  def ErrorResponse(result: js.Error): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidConnection")
  @js.native
  def InvalidConnection(host: String): ConnectionError = js.native
  @JSImport("web3-core-helpers", "errors.InvalidConnection")
  @js.native
  def InvalidConnection(host: String, event: WebSocketEvent): ConnectionError = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidNumberOfParams")
  @js.native
  def InvalidNumberOfParams(got: Double, expected: Double, method: String): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidProvider")
  @js.native
  def InvalidProvider(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidResponse")
  @js.native
  def InvalidResponse(result: js.Error): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.MaxAttemptsReachedOnReconnectingError")
  @js.native
  def MaxAttemptsReachedOnReconnectingError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.NoContractAddressFoundError")
  @js.native
  def NoContractAddressFoundError(receipt: js.Object): TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.PendingRequestsOnReconnectingError")
  @js.native
  def PendingRequestsOnReconnectingError(): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ResolverMethodMissingError")
  @js.native
  def ResolverMethodMissingError(address: String, name: String): js.Error = js.native
  
  @JSImport("web3-core-helpers", "errors.RevertInstructionError")
  @js.native
  def RevertInstructionError(reason: String, signature: String): typingsSlinky.web3CoreHelpers.mod.RevertInstructionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionError")
  @js.native
  def TransactionError(message: String, receipt: js.Object): typingsSlinky.web3CoreHelpers.mod.TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionOutOfGasError")
  @js.native
  def TransactionOutOfGasError(receipt: js.Object): TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionRevertInstructionError")
  @js.native
  def TransactionRevertInstructionError(reason: String, signature: String, receipt: js.Object): typingsSlinky.web3CoreHelpers.mod.TransactionRevertInstructionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionRevertedWithoutReasonError")
  @js.native
  def TransactionRevertedWithoutReasonError(receipt: js.Object): TransactionError = js.native
}
