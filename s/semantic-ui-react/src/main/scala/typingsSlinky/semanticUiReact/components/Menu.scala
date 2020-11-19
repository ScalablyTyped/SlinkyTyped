package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typingsSlinky.semanticUiReact.menuItemMod.MenuItemProps
import typingsSlinky.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import typingsSlinky.semanticUiReact.menuMenuMod.MenuProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.horizontally
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
import typingsSlinky.semanticUiReact.semanticUiReactStrings.vertically
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("semantic-ui-react", "Menu")
  @js.native
  object component extends js.Object
  
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
    def itemsVarargs(value: SemanticShorthandItem[MenuItemProps]*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def items(value: SemanticShorthandCollection[MenuItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
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
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Header {
    
    @JSImport("semantic-ui-react", "Menu.Header")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
      
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: MenuHeaderProps): typingsSlinky.semanticUiReact.components.Menu.Header.Builder = new typingsSlinky.semanticUiReact.components.Menu.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Header.type): typingsSlinky.semanticUiReact.components.Menu.Header.Builder = new typingsSlinky.semanticUiReact.components.Menu.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Menu.Item")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def fitted(value: Boolean | horizontally | vertically): this.type = set("fitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def header(value: Boolean): this.type = set("header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconFunction3(
        value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def icon(value: Boolean | SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ MenuItemProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def position(value: left | right): this.type = set("position", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: MenuItemProps): typingsSlinky.semanticUiReact.components.Menu.Item.Builder = new typingsSlinky.semanticUiReact.components.Menu.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): typingsSlinky.semanticUiReact.components.Menu.Item.Builder = new typingsSlinky.semanticUiReact.components.Menu.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Menu {
    
    @JSImport("semantic-ui-react", "Menu.Menu")
    @js.native
    object component extends js.Object
    
    def withProps(p: MenuMenuProps): SharedBuilder_MenuMenuProps409808761 = new SharedBuilder_MenuMenuProps409808761(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Menu.type): SharedBuilder_MenuMenuProps409808761 = new SharedBuilder_MenuMenuProps409808761(js.Array(this.component, js.Dictionary.empty))()
  }
}
