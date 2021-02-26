package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticICONS
import typingsSlinky.semanticUiReact.iconGroupMod.IconGroupProps
import typingsSlinky.semanticUiReact.iconIconMod.IconCorner
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.iconIconMod.IconSizeProp
import typingsSlinky.semanticUiReact.semanticUiReactStrings.clockwise
import typingsSlinky.semanticUiReact.semanticUiReactStrings.counterclockwise
import typingsSlinky.semanticUiReact.semanticUiReactStrings.horizontally
import typingsSlinky.semanticUiReact.semanticUiReactStrings.vertically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Icon.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_IconGroupProps_1560966205 = new SharedBuilder_IconGroupProps_1560966205(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: IconGroupProps): SharedBuilder_IconGroupProps_1560966205 = new SharedBuilder_IconGroupProps_1560966205(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Icon] {
    
    @scala.inline
    def `aria-hidden`(value: String): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def corner(value: Boolean | IconCorner): this.type = set("corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fitted(value: Boolean): this.type = set("fitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flipped(value: horizontally | vertically): this.type = set("flipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: SemanticICONS): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotated(value: clockwise | counterclockwise): this.type = set("rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: IconSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Icon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
