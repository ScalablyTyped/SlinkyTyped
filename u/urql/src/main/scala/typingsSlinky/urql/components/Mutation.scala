package typingsSlinky.urql.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urql.mutationMod.MutationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply[T, V](query: DocumentNode | String): Builder[T, V] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Builder[T, V](js.Array(this.component, __props.asInstanceOf[MutationProps[T, V]]))
  }
}

