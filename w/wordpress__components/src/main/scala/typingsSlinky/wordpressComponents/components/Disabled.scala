package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.wordpressComponents.disabledMod.Disabled.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disabled {
  
  object Consumer {
    
    @scala.inline
    def apply(children: Boolean => ReactElement): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Boolean]]))
    }
    
    @JSImport("@wordpress/components", "Disabled.Consumer")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ConsumerProps[Boolean]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Disabled.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
