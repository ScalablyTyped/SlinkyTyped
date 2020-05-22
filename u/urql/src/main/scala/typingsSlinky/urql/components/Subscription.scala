package typingsSlinky.urql.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.urql.anon.PartialOperationContext
import typingsSlinky.urql.subscriptionMod.SubscriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subscription {
  @JSImport("urql", "Subscription")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, R, V] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def context(value: PartialOperationContext): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def handler(value: (/* prev */ js.UndefOr[R], T) => R): this.type = set("handler", js.Any.fromFunction2(value))
    @scala.inline
    def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def variables(value: V): this.type = set("variables", value.asInstanceOf[js.Any])
  }
  
  def withProps[T, R, V](p: SubscriptionProps[T, R, V]): Builder[T, R, V] = new Builder[T, R, V](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T, R, V](query: DocumentNode | String): Builder[T, R, V] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Builder[T, R, V](js.Array(this.component, __props.asInstanceOf[SubscriptionProps[T, R, V]]))
  }
}

