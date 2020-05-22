package typingsSlinky.urqlCore

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urqlCore.anon.Context
import typingsSlinky.urqlCore.anon.NetworkError
import typingsSlinky.urqlCore.typesMod.GraphQLRequest
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationDebugMeta
import typingsSlinky.urqlCore.typesMod.OperationResult
import typingsSlinky.urqlCore.typesMod.PromisifiedSource
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  class CombinedError protected ()
    extends typingsSlinky.urqlCore.errorMod.CombinedError {
    def this(hasNetworkErrorGraphQLErrorsResponse: NetworkError) = this()
  }
  
  def addMetadata(source: Operation, meta: OperationDebugMeta): Context = js.native
  def collectTypesFromResponse(response: js.Object): js.Array[String] = js.native
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
  def noop(): Unit = js.native
  def stringifyVariables(x: js.Any): String = js.native
  def toSuspenseSource[T](source: sourceT[T]): sourceT[T] = js.native
  def withPromise[T](source$: sourceT[T]): PromisifiedSource[T] = js.native
}

