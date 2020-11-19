package typingsSlinky.urql.useMutationMod

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urql/dist/types/hooks/useMutation", "useMutation")
@js.native
object useMutation extends js.Object {
  
  def apply[T, V](query: String): UseMutationResponse[T, V] = js.native
  def apply[T, V](query: DocumentNode): UseMutationResponse[T, V] = js.native
}
