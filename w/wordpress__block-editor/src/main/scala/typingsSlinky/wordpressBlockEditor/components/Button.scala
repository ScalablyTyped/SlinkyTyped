package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.buttonMod.URLInputButton.Props
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.PostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @scala.inline
  def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Unit, url: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), url = url.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor/components/url-input/button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
