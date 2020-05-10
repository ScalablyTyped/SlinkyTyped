package typingsSlinky.storybookApi.components

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
  implicit def make(companion: Consumer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

