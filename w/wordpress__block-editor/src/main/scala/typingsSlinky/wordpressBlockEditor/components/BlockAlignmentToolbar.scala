package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Control
import typingsSlinky.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockAlignmentToolbar {
  
  @scala.inline
  def apply(onChange: js.UndefOr[Control] => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "BlockAlignmentToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def controls(value: js.Array[Control]): this.type = set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controlsVarargs(value: Control*): this.type = set("controls", js.Array(value :_*))
    
    @scala.inline
    def isCollapsed(value: Boolean): this.type = set("isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Control): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
