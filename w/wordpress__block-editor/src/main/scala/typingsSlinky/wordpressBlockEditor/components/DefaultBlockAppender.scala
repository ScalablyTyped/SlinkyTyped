package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultBlockAppender {
  
  @scala.inline
  def apply(lastBlockClientId: String, rootClientId: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(lastBlockClientId = lastBlockClientId.asInstanceOf[js.Any], rootClientId = rootClientId.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "DefaultBlockAppender")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
