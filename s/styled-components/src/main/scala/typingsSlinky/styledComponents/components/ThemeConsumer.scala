package typingsSlinky.styledComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeConsumer {
  @JSImport("styled-components", "ThemeConsumer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def unstable_observedBits(value: Double): this.type = set("unstable_observedBits", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConsumerProps[AnyIfEmpty[DefaultTheme]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: AnyIfEmpty[DefaultTheme] => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[ConsumerProps[AnyIfEmpty[DefaultTheme]]]))
  }
}

