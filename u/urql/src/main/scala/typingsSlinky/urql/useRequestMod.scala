package typingsSlinky.urql

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urqlCore.typesMod.GraphQLRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urql/dist/types/hooks/useRequest", JSImport.Namespace)
@js.native
object useRequestMod extends js.Object {
  
  def useRequest(query: String): GraphQLRequest = js.native
  def useRequest(query: String, variables: js.Any): GraphQLRequest = js.native
  def useRequest(query: DocumentNode): GraphQLRequest = js.native
  def useRequest(query: DocumentNode, variables: js.Any): GraphQLRequest = js.native
}
