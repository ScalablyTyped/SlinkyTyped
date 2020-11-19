package typingsSlinky.urql.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urql.mutationMod.MutationProps
import typingsSlinky.urql.mutationMod.MutationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mutation {
  
  @JSImport("urql", "Mutation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, V] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[T, V](p: MutationProps[T, V]): Builder[T, V] = new Builder[T, V](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T, V](children: MutationState[T, V] => ReactElement, query: DocumentNode | String): Builder[T, V] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    new Builder[T, V](js.Array(this.component, __props.asInstanceOf[MutationProps[T, V]]))
  }
}
