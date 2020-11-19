package typingsSlinky.urqlCore

import typingsSlinky.graphql.astMod.DocumentNode
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val cacheExchange: Exchange = js.native
  
  def composeExchanges(exchanges: js.Array[Exchange]): js.Function1[/* hasClientForwardDispatchDebug */ ExchangeInput, ExchangeIO] = js.native
  
  def createClient(opts: ClientOptions): typingsSlinky.urqlCore.clientMod.Client = js.native
  
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
  
  val debugExchange: Exchange = js.native
  
  val dedupExchange: Exchange = js.native
  
  val defaultExchanges: js.Array[Exchange] = js.native
  
  val fallbackExchangeIO: ExchangeIO = js.native
  
  val fetchExchange: Exchange = js.native
  
  def formatDocument(node: DocumentNode): DocumentNode = js.native
  
  def makeErrorResult(operation: Operation, error: js.Error): OperationResult[_] = js.native
  def makeErrorResult(operation: Operation, error: js.Error, response: js.Any): OperationResult[_] = js.native
  
  def makeResult(operation: Operation, result: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any, response: js.Any): OperationResult[_] = js.native
  
  def maskTypename(data: js.Any): js.Any = js.native
  
  def ssrExchange(): SSRExchange_ = js.native
  def ssrExchange(params: SSRExchangeParams): SSRExchange_ = js.native
  
  def stringifyVariables(x: js.Any): String = js.native
  
  def subscriptionExchange(hasForwardSubscriptionEnableAllOperations: SubscriptionExchangeOpts): Exchange = js.native
  
  @js.native
  class Client protected ()
    extends typingsSlinky.urqlCore.clientMod.Client {
    def this(opts: ClientOptions) = this()
  }
  
  @js.native
  class CombinedError protected ()
    extends typingsSlinky.urqlCore.utilsMod.CombinedError {
    def this(hasNetworkErrorGraphQLErrorsResponse: NetworkError) = this()
  }
}
