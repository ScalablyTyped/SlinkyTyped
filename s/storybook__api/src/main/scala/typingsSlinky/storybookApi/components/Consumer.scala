package typingsSlinky.storybookApi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookApi.mod.Combo
import typingsSlinky.storybookApi.mod.ConsumerProps
import typingsSlinky.storybookApi.mod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("@storybook/api", "Consumer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.storybookApi.mod.Consumer] {
    @scala.inline
    def filter(value: Combo => SubState): this.type = set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def pure(value: Boolean): this.type = set("pure", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConsumerProps[SubState, Combo]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: Combo | SubState => ReactElement | Null): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[ConsumerProps[SubState, Combo]]))
  }
}

