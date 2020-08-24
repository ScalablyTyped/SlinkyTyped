package typingsSlinky.solidReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.solidReact.mod.LDflexValue
import typingsSlinky.solidReact.mod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("@solid/react", "List")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.solidReact.mod.List] {
    @scala.inline
    def children(value: (/* listItem */ LDflexValue, /* index */ Double) => ReactElement): this.type = set("children", js.Any.fromFunction2(value))
    @scala.inline
    def container(value: ReactElement => ReactElement): this.type = set("container", js.Any.fromFunction1(value))
    @scala.inline
    def filter(
      value: (/* item */ LDflexValue, /* index */ Double, /* array */ js.Array[LDflexValue]) => /* is @solid/react.@solid/react.LDflexValue */ Boolean
    ): this.type = set("filter", js.Any.fromFunction3(value))
    @scala.inline
    def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
}

