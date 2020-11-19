package typingsSlinky.urqlCore.clientMod

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urqlCore.anon.FnCall
import typingsSlinky.urqlCore.anon.PartialOperationContext
import typingsSlinky.urqlCore.typesMod.DebugEvent
import typingsSlinky.urqlCore.typesMod.GraphQLRequest
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationResult
import typingsSlinky.urqlCore.typesMod.OperationType
import typingsSlinky.urqlCore.typesMod.PromisifiedSource
import typingsSlinky.urqlCore.typesMod.RequestPolicy
import typingsSlinky.wonka.wonkaTypesGenMod.sinkT
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import typingsSlinky.wonka.wonkaTypesGenMod.subscriptionT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(opts: ClientOptions) = this()
  
  var activeOperations: ActiveOperations = js.native
  
  var createOperationContext: js.Any = js.native
  
  def createRequestOperation(`type`: OperationType, request: GraphQLRequest): Operation = js.native
  def createRequestOperation(`type`: OperationType, request: GraphQLRequest, opts: PartialOperationContext): Operation = js.native
  
  def dispatchOperation(): Unit = js.native
  def dispatchOperation(operation: Unit): Unit = js.native
  def dispatchOperation(operation: Operation): Unit = js.native
  
  def executeMutation[Data](query: GraphQLRequest): sourceT[OperationResult[Data]] = js.native
  def executeMutation[Data](query: GraphQLRequest, opts: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  
  def executeQuery[Data](query: GraphQLRequest): sourceT[OperationResult[Data]] = js.native
  def executeQuery[Data](query: GraphQLRequest, opts: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  
  /** Executes an Operation by sending it through the exchange pipeline It returns an observable that emits all related exchange results and keeps track of this observable's subscribers. A teardown signal will be emitted when no subscribers are listening anymore. */
  def executeRequestOperation(operation: Operation): sourceT[OperationResult[_]] = js.native
  
  def executeSubscription(query: GraphQLRequest): sourceT[OperationResult[_]] = js.native
  def executeSubscription(query: GraphQLRequest, opts: PartialOperationContext): sourceT[OperationResult[_]] = js.native
  
  var fetch: js.UndefOr[FnCall] = js.native
  
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.native
  
  var maskTypename: Boolean = js.native
  
  def mutation[Data, Variables /* <: js.Object */](query: String): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: String, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: String, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  
  /** Deletes an active operation's result observable and sends a teardown signal through the exchange pipeline */
  var onOperationEnd: js.Any = js.native
  
  /** Counts up the active operation key and dispatches the operation */
  var onOperationStart: js.Any = js.native
  
  @JSName("operations$")
  def operations$(_1: sinkT[Operation]): Unit = js.native
  @JSName("operations$")
  var operations$_Original: sourceT[Operation] = js.native
  
  var preferGetMethod: Boolean = js.native
  
  def query[Data, Variables /* <: js.Object */](query: String): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: String, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: String, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  
  var queue: js.Array[Operation] = js.native
  
  def readQuery[Data, Variables /* <: js.Object */](query: String): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: String, variables: Variables): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: String, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): OperationResult[Data] | Null = js.native
  
  /** Start an operation from an exchange */
  def reexecuteOperation(operation: Operation): Unit = js.native
  
  var requestPolicy: RequestPolicy = js.native
  
  @JSName("results$")
  def results$(_1: sinkT[OperationResult[_]]): Unit = js.native
  @JSName("results$")
  var results$_Original: sourceT[OperationResult[_]] = js.native
  
  var subscribeToDebugTarget: js.UndefOr[
    js.Function1[/* onEvent */ js.Function1[/* e */ DebugEvent[String], Unit], subscriptionT]
  ] = js.native
  
  def subscription[Data, Variables /* <: js.Object */](query: String): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: String, variables: Variables): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: String, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: DocumentNode): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  def subscription[Data, Variables /* <: js.Object */](query: DocumentNode, variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  
  var suspense: Boolean = js.native
  
  var url: String = js.native
}
