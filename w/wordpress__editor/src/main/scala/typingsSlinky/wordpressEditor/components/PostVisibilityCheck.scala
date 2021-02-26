package typingsSlinky.wordpressEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.Props
import typingsSlinky.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.RenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostVisibilityCheck {
  
  @scala.inline
  def apply(render: RenderProps => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "PostVisibilityCheck")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
