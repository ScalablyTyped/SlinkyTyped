package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.PostType
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLInput {
  
  @JSImport("@wordpress/editor", "URLInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableSuggestions(value: Boolean): this.type = set("disableSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasBorder(value: Boolean): this.type = set("hasBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFullWidth(value: Boolean): this.type = set("isFullWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChange: (String, js.UndefOr[PostType]) => Unit, value: String): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
