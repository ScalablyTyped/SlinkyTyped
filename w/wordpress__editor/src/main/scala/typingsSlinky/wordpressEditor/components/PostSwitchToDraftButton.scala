package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.postSwitchToDraftButtonMod.PostSwitchToDraftButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostSwitchToDraftButton {
  
  @JSImport("@wordpress/editor", "PostSwitchToDraftButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PostSwitchToDraftButton.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
