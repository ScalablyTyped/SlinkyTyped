package typingsSlinky.urql

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urql.useMutationMod.UseMutationResponse
import typingsSlinky.urql.useQueryMod.UseQueryArgs
import typingsSlinky.urql.useQueryMod.UseQueryResponse
import typingsSlinky.urql.useSubscriptionMod.SubscriptionHandler
import typingsSlinky.urql.useSubscriptionMod.UseSubscriptionArgs
import typingsSlinky.urql.useSubscriptionMod.UseSubscriptionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urql/dist/types/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  def useMutation[T, V](query: String): UseMutationResponse[T, V] = js.native
  def useMutation[T, V](query: DocumentNode): UseMutationResponse[T, V] = js.native
  
  def useQuery[T, V](args: UseQueryArgs[V]): UseQueryResponse[T] = js.native
  
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V]): UseSubscriptionResponse[R] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V], handler: SubscriptionHandler[T, R]): UseSubscriptionResponse[R] = js.native
}
