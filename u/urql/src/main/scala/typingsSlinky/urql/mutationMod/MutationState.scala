package typingsSlinky.urql.mutationMod

import typingsSlinky.urql.anon.PartialOperationContext
import typingsSlinky.urql.useMutationMod.UseMutationState
import typingsSlinky.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutationState[T, V] extends UseMutationState[T] {
  
  def executeMutation(): js.Promise[OperationResult[T]] = js.native
  def executeMutation(variables: V): js.Promise[OperationResult[T]] = js.native
  def executeMutation(variables: V, context: PartialOperationContext): js.Promise[OperationResult[T]] = js.native
  def executeMutation(variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): js.Promise[OperationResult[T]] = js.native
}
