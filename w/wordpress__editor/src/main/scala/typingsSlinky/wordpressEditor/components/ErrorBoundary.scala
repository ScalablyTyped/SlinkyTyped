package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.errorBoundaryMod.ErrorBoundary.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBoundary {
  
  @scala.inline
  def apply(onError: () => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(onError = js.Any.fromFunction0(onError))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "ErrorBoundary")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
