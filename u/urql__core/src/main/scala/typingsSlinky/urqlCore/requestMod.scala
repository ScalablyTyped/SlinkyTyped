package typingsSlinky.urqlCore

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urqlCore.anon.Context
import typingsSlinky.urqlCore.typesMod.GraphQLRequest
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationDebugMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  def addMetadata(source: Operation, meta: OperationDebugMeta): Context = js.native
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
}

