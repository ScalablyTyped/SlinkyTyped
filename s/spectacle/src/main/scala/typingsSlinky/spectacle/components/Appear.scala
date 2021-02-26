package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.spectacle.anon.Children
import typingsSlinky.spectacle.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appear {
  
  @scala.inline
  def apply(elementNum: Double, transitionEffect: From): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(elementNum = elementNum.asInstanceOf[js.Any], transitionEffect = transitionEffect.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("spectacle", "Appear")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
