package typingsSlinky.urql.mutationMod

import slinky.core.facade.ReactElement
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationProps[T, V] extends js.Object {
  var query: DocumentNode | String
  def children(arg: MutationState[T, V]): ReactElement
}

object MutationProps {
  @scala.inline
  def apply[T, V](children: MutationState[T, V] => ReactElement, query: DocumentNode | String): MutationProps[T, V] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationProps[T, V]]
  }
}

