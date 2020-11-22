package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typingsSlinky.semanticUiReact.dropdownDropdownMod.DropdownOnSearchChangeData
import typingsSlinky.semanticUiReact.dropdownDropdownMod.DropdownProps
import typingsSlinky.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.selectSelectMod.SelectProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("semantic-ui-react", "Select")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def additionLabelReactElement(value: ReactElement): this.type = set("additionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def additionLabel(value: Double | String | ReactElement): this.type = set("additionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def additionPosition(value: top | bottom): this.type = set("additionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowAdditions(value: Boolean): this.type = set("allowAdditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def button(value: Boolean): this.type = set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnBlur(value: Boolean): this.type = set("closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnChange(value: Boolean): this.type = set("closeOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deburr(value: Boolean): this.type = set("deburr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSearchQuery(value: String): this.type = set("defaultSearchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedLabel(value: Double | String): this.type = set("defaultSelectedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultUpward(value: Boolean): this.type = set("defaultUpward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: (Double | String | Boolean)*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: String | Double | Boolean | (js.Array[Double | String | Boolean])): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: left | right): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: js.Any): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def item(value: Boolean): this.type = set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labeled(value: Boolean): this.type = set("labeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lazyLoad(value: Boolean): this.type = set("lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minCharacters(value: Double): this.type = set("minCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noResultsMessageReactElement(value: ReactElement): this.type = set("noResultsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noResultsMessage(value: ReactElement): this.type = set("noResultsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAddItem(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onAddItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBlur(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChange(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClose(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocus(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLabelClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps) => Unit): this.type = set("onLabelClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onMouseDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOpen(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSearchChange(
      value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownOnSearchChangeData) => Unit
    ): this.type = set("onSearchChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openOnFocus(value: Boolean): this.type = set("openOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointing(
      value: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
    ): this.type = set("pointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderLabel(value: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => _): this.type = set("renderLabel", js.Any.fromFunction3(value))
    
    @scala.inline
    def scrolling(value: Boolean): this.type = set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchFunction2(
      value: (/* options */ js.Array[DropdownItemProps], /* value */ String) => js.Array[DropdownItemProps]
    ): this.type = set("search", js.Any.fromFunction2(value))
    
    @scala.inline
    def search(
      value: Boolean | (js.Function2[
          /* options */ js.Array[DropdownItemProps], 
          /* value */ String, 
          js.Array[DropdownItemProps]
        ])
    ): this.type = set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchInput(value: js.Any): this.type = set("searchInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchQuery(value: String): this.type = set("searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectOnBlur(value: Boolean): this.type = set("selectOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectOnNavigation(value: Boolean): this.type = set("selectOnNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedLabel(value: Double | String): this.type = set("selectedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selection(value: js.Any): this.type = set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double | String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerReactElement(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trigger(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def upward(value: Boolean): this.type = set("upward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: (Boolean | Double | String)*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: Boolean | Double | String | (js.Array[Boolean | Double | String])): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapSelection(value: Boolean): this.type = set("wrapSelection", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectProps]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Select.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: DropdownHeaderProps): SharedBuilder_DropdownHeaderProps_361301233 = new SharedBuilder_DropdownHeaderProps_361301233(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Header.type): SharedBuilder_DropdownHeaderProps_361301233 = new SharedBuilder_DropdownHeaderProps_361301233(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Select.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: DropdownItemProps): SharedBuilder_DropdownItemProps_1338970085 = new SharedBuilder_DropdownItemProps_1338970085(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): SharedBuilder_DropdownItemProps_1338970085 = new SharedBuilder_DropdownItemProps_1338970085(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Divider {
    
    @JSImport("semantic-ui-react", "Select.Divider")
    @js.native
    object component extends js.Object
    
    def withProps(p: DropdownDividerProps): SharedBuilder_DropdownDividerProps1707744239 = new SharedBuilder_DropdownDividerProps1707744239(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Divider.type): SharedBuilder_DropdownDividerProps1707744239 = new SharedBuilder_DropdownDividerProps1707744239(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Menu {
    
    @JSImport("semantic-ui-react", "Select.Menu")
    @js.native
    object component extends js.Object
    
    def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps188553549 = new SharedBuilder_DropdownMenuProps188553549(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Menu.type): SharedBuilder_DropdownMenuProps188553549 = new SharedBuilder_DropdownMenuProps188553549(js.Array(this.component, js.Dictionary.empty))()
  }
}
