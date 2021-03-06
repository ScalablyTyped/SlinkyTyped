package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.PostType
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLInput {
  
  @scala.inline
  def apply(onChange: (String, js.UndefOr[PostType]) => Unit, value: String): SharedBuilder_Props2085463973 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    new SharedBuilder_Props2085463973(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "URLInput")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props2085463973 = new SharedBuilder_Props2085463973(js.Array(this.component, p.asInstanceOf[js.Any]))
}

object UrlInput {
  
  @scala.inline
  def apply(onChange: (String, js.UndefOr[PostType]) => Unit, value: String): SharedBuilder_Props2085463973 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    new SharedBuilder_Props2085463973(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor/components/url-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props2085463973 = new SharedBuilder_Props2085463973(js.Array(this.component, p.asInstanceOf[js.Any]))
}
