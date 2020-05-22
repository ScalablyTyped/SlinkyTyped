package typingsSlinky.urql

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.urql.mutationMod.MutationProps
import typingsSlinky.urql.queryMod.QueryProps
import typingsSlinky.urql.subscriptionMod.SubscriptionProps
import typingsSlinky.urql.useMutationMod.UseMutationResponse
import typingsSlinky.urql.useQueryMod.UseQueryArgs
import typingsSlinky.urql.useQueryMod.UseQueryResponse
import typingsSlinky.urql.useSubscriptionMod.SubscriptionHandler
import typingsSlinky.urql.useSubscriptionMod.UseSubscriptionArgs
import typingsSlinky.urql.useSubscriptionMod.UseSubscriptionResponse
import typingsSlinky.urqlCore.anon.NetworkError
import typingsSlinky.urqlCore.clientMod.ClientOptions
import typingsSlinky.urqlCore.ssrMod.SSRExchangeParams
import typingsSlinky.urqlCore.ssrMod.SSRExchange_
import typingsSlinky.urqlCore.subscriptionMod.SubscriptionExchangeOpts
import typingsSlinky.urqlCore.typesMod.Exchange
import typingsSlinky.urqlCore.typesMod.ExchangeIO
import typingsSlinky.urqlCore.typesMod.ExchangeInput
import typingsSlinky.urqlCore.typesMod.GraphQLRequest
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Client protected ()
    extends typingsSlinky.urqlCore.mod.Client {
    def this(opts: ClientOptions) = this()
  }
  
  @js.native
  class CombinedError protected ()
    extends typingsSlinky.urqlCore.mod.CombinedError {
    def this(hasNetworkErrorGraphQLErrorsResponse: NetworkError) = this()
  }
  
  val Consumer: ReactComponentClass[ConsumerProps[typingsSlinky.urqlCore.mod.Client]] = js.native
  val Context: typingsSlinky.react.mod.Context[typingsSlinky.urqlCore.mod.Client] = js.native
  val Provider: ReactComponentClass[ProviderProps[typingsSlinky.urqlCore.mod.Client]] = js.native
  val cacheExchange: Exchange = js.native
  val debugExchange: Exchange = js.native
  val dedupExchange: Exchange = js.native
  val defaultExchanges: js.Array[Exchange] = js.native
  val fallbackExchangeIO: ExchangeIO = js.native
  val fetchExchange: Exchange = js.native
  def Mutation[T, V](props: MutationProps[T, V]): ReactElement = js.native
  def Query[T, V](props: QueryProps[T, V]): ReactElement = js.native
  def Subscription[T, R, V](props: SubscriptionProps[T, R, V]): ReactElement = js.native
  def composeExchanges(exchanges: js.Array[Exchange]): js.Function1[/* hasClientForwardDispatchDebug */ ExchangeInput, ExchangeIO] = js.native
  def createClient(opts: ClientOptions): typingsSlinky.urqlCore.clientMod.Client = js.native
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
  def formatDocument(node: DocumentNode): js.Any = js.native
  def makeErrorResult(operation: Operation, error: js.Error): OperationResult[_] = js.native
  def makeErrorResult(operation: Operation, error: js.Error, response: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any, response: js.Any): OperationResult[_] = js.native
  def maskTypename(data: js.Any): js.Any = js.native
  def ssrExchange(): SSRExchange_ = js.native
  def ssrExchange(params: SSRExchangeParams): SSRExchange_ = js.native
  def stringifyVariables(x: js.Any): String = js.native
  def subscriptionExchange(hasForwardSubscriptionEnableAllOperations: SubscriptionExchangeOpts): Exchange = js.native
  def useClient(): typingsSlinky.urqlCore.mod.Client = js.native
  def useMutation[T, V](query: String): UseMutationResponse[T, V] = js.native
  def useMutation[T, V](query: DocumentNode): UseMutationResponse[T, V] = js.native
  def useQuery[T, V](args: UseQueryArgs[V]): UseQueryResponse[T] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V]): UseSubscriptionResponse[R] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V], handler: SubscriptionHandler[T, R]): UseSubscriptionResponse[R] = js.native
}

