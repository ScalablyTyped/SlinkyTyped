package typingsSlinky.urql.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urql.anon.PartialOperationContext
import typingsSlinky.urql.queryMod.QueryProps
import typingsSlinky.urql.queryMod.QueryState
import typingsSlinky.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Query {
  @JSImport("urql", "Query")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, V] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def context(value: PartialOperationContext): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def pollInterval(value: Double): this.type = set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def requestPolicy(value: RequestPolicy): this.type = set("requestPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def variables(value: V): this.type = set("variables", value.asInstanceOf[js.Any])
  }
  
  def withProps[T, V](p: QueryProps[T, V]): Builder[T, V] = new Builder[T, V](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T, V](children: QueryState[T] => ReactElement, query: String | DocumentNode): Builder[T, V] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    new Builder[T, V](js.Array(this.component, __props.asInstanceOf[QueryProps[T, V]]))
  }
}

