package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.popupContentMod.PopupContentProps
import typingsSlinky.semanticUiReact.popupHeaderMod.PopupHeaderProps
import typingsSlinky.semanticUiReact.popupMod.default
import typingsSlinky.semanticUiReact.popupPopupMod.PopupProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom center`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`left center`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`right center`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top center`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.click
import typingsSlinky.semanticUiReact.semanticUiReactStrings.focus
import typingsSlinky.semanticUiReact.semanticUiReactStrings.hover
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popup {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnDocumentClick(value: Boolean): this.type = set("closeOnDocumentClick", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnPortalMouseLeave(value: Boolean): this.type = set("closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnTriggerBlur(value: Boolean): this.type = set("closeOnTriggerBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnTriggerClick(value: Boolean): this.type = set("closeOnTriggerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnTriggerMouseLeave(value: Boolean): this.type = set("closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def contentFunction3(
      value: (/* component */ ReactType[PopupContentProps], PopupContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("content", js.Any.fromFunction3(value))
    @scala.inline
    def content(value: SemanticShorthandItem[PopupContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def contextRefObject(value: ReactRef[HTMLElement]): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def context(value: js.Object | ReactRef[HTMLElement]): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    @scala.inline
    def eventsEnabled(value: Boolean): this.type = set("eventsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def flowing(value: Boolean): this.type = set("flowing", value.asInstanceOf[js.Any])
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactType[PopupHeaderProps], PopupHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    @scala.inline
    def header(value: SemanticShorthandItem[PopupHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def hideOnScroll(value: Boolean): this.type = set("hideOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def mountNode(value: js.Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double | String): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onVarargs(value: (hover | click | focus)*): this.type = set("on", js.Array(value :_*))
    @scala.inline
    def on(value: hover | click | focus | (js.Array[hover | click | focus])): this.type = set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def onMount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): this.type = set("onMount", js.Any.fromFunction2(value))
    @scala.inline
    def onOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    @scala.inline
    def onUnmount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): this.type = set("onUnmount", js.Any.fromFunction2(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnTriggerClick(value: Boolean): this.type = set("openOnTriggerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnTriggerFocus(value: Boolean): this.type = set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnTriggerMouseEnter(value: Boolean): this.type = set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def pinned(value: Boolean): this.type = set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def popperDependenciesVarargs(value: js.Any*): this.type = set("popperDependencies", js.Array(value :_*))
    @scala.inline
    def popperDependencies(value: js.Array[_]): this.type = set("popperDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def popperModifiers(value: js.Object): this.type = set("popperModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def position(
      value: (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
    ): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def positionFixed(value: Boolean): this.type = set("positionFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | tiny | small | large | huge): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerReactElement(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def trigger(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerRefRefObject(value: ReactRef[_]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("triggerRef", js.Any.fromFunction1(value))
    @scala.inline
    def triggerRef(value: typingsSlinky.react.mod.Ref[_]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerRefNull: this.type = set("triggerRef", null)
    @scala.inline
    def wide(value: Boolean | very): this.type = set("wide", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Popup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Content {
    @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", "Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: PopupContentProps): SharedBuilder_PopupContentProps183580496 = new SharedBuilder_PopupContentProps183580496(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Content.type): SharedBuilder_PopupContentProps183580496 = new SharedBuilder_PopupContentProps183580496(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", "Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: PopupHeaderProps): SharedBuilder_PopupHeaderProps244003214 = new SharedBuilder_PopupHeaderProps244003214(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): SharedBuilder_PopupHeaderProps244003214 = new SharedBuilder_PopupHeaderProps244003214(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

