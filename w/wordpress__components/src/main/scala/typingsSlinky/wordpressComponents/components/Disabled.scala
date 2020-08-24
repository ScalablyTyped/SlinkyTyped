package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.wordpressComponents.disabledMod.Disabled.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Disabled {
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Disabled.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  object Consumer {
    @JSImport("@wordpress/components", "Disabled.Consumer")
    @js.native
    object component extends js.Object
    
    def withProps(p: ConsumerProps[Boolean]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(children: Boolean => ReactElement): Default[tag.type, js.Object] = {
        val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Boolean]]))
    }
  }
  
}

