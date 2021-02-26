package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typingsSlinky.semanticUiReact.menuItemMod.MenuItemProps
import typingsSlinky.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import typingsSlinky.semanticUiReact.menuMenuMod.MenuProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.labeled
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  object Header {
    
    @JSImport("semantic-ui-react", "Menu.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_MenuHeaderProps483786915[typingsSlinky.semanticUiReact.mod.Menu.Header] = new SharedBuilder_MenuHeaderProps483786915[typingsSlinky.semanticUiReact.mod.Menu.Header](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuHeaderProps): SharedBuilder_MenuHeaderProps483786915[typingsSlinky.semanticUiReact.mod.Menu.Header] = new SharedBuilder_MenuHeaderProps483786915[typingsSlinky.semanticUiReact.mod.Menu.Header](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Menu.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_MenuItemProps440826664[typingsSlinky.semanticUiReact.mod.Menu.Item] = new SharedBuilder_MenuItemProps440826664[typingsSlinky.semanticUiReact.mod.Menu.Item](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuItemProps): SharedBuilder_MenuItemProps440826664[typingsSlinky.semanticUiReact.mod.Menu.Item] = new SharedBuilder_MenuItemProps440826664[typingsSlinky.semanticUiReact.mod.Menu.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Menu {
    
    @JSImport("semantic-ui-react", "Menu.Menu")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Menu.type): SharedBuilder_MenuMenuProps409808761 = new SharedBuilder_MenuMenuProps409808761(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuMenuProps): SharedBuilder_MenuMenuProps409808761 = new SharedBuilder_MenuMenuProps409808761(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  @JSImport("semantic-ui-react", "Menu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Menu] {
    
    @scala.inline
    def activeIndex(value: Double | String): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attached(value: Boolean | bottom | top): this.type = set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveIndex(value: Double | String): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixed(value: left | right | bottom | top): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floated(value: Boolean | right): this.type = set("floated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: Boolean | labeled): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: SemanticShorthandCollection[MenuItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: SemanticShorthandItem[MenuItemProps]*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def onItemClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ MenuItemProps) => Unit): this.type = set("onItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def pagination(value: Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointing(value: Boolean): this.type = set("pointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: mini | tiny | small | large | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stackable(value: Boolean): this.type = set("stackable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabular(value: Boolean | right): this.type = set("tabular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: Boolean): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widths(value: SemanticWIDTHS): this.type = set("widths", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
