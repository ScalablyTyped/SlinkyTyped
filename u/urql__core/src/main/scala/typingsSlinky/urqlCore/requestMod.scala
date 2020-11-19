package typingsSlinky.urqlCore

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Exclude
import typingsSlinky.urqlCore.anon.Context
import typingsSlinky.urqlCore.typesMod.GraphQLRequest
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationDebugMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/utils/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  
  def addMetadata(source: Operation, meta: Exclude[js.UndefOr[OperationDebugMeta], js.UndefOr[scala.Nothing]]): Context = js.native
  
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
}
