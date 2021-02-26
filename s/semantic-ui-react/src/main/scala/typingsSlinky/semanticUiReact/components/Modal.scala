package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.modalActionsMod.ModalActionsProps
import typingsSlinky.semanticUiReact.modalContentMod.ModalContentProps
import typingsSlinky.semanticUiReact.modalDescriptionMod.ModalDescriptionProps
import typingsSlinky.semanticUiReact.modalDimmerMod.ModalDimmerProps
import typingsSlinky.semanticUiReact.modalHeaderMod.ModalHeaderProps
import typingsSlinky.semanticUiReact.modalModalMod.ModalProps
import typingsSlinky.semanticUiReact.semanticUiReactBooleans.`true`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.blurring
import typingsSlinky.semanticUiReact.semanticUiReactStrings.fullscreen
import typingsSlinky.semanticUiReact.semanticUiReactStrings.inverted
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  object Actions {
    
    @JSImport("semantic-ui-react", "Modal.Actions")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Actions.type): SharedBuilder_ModalActionsProps_1288036117[typingsSlinky.semanticUiReact.mod.Modal.Actions] = new SharedBuilder_ModalActionsProps_1288036117[typingsSlinky.semanticUiReact.mod.Modal.Actions](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalActionsProps): SharedBuilder_ModalActionsProps_1288036117[typingsSlinky.semanticUiReact.mod.Modal.Actions] = new SharedBuilder_ModalActionsProps_1288036117[typingsSlinky.semanticUiReact.mod.Modal.Actions](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("semantic-ui-react", "Modal.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_ModalContentProps2067565862 = new SharedBuilder_ModalContentProps2067565862(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalContentProps): SharedBuilder_ModalContentProps2067565862 = new SharedBuilder_ModalContentProps2067565862(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "Modal.Description")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Description.type): SharedBuilder_ModalDescriptionProps155144246 = new SharedBuilder_ModalDescriptionProps155144246(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalDescriptionProps): SharedBuilder_ModalDescriptionProps155144246 = new SharedBuilder_ModalDescriptionProps155144246(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Dimmer {
    
    @JSImport("semantic-ui-react", "Modal.Dimmer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Dimmer.type): SharedBuilder_ModalDimmerProps329564763 = new SharedBuilder_ModalDimmerProps329564763(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalDimmerProps): SharedBuilder_ModalDimmerProps329564763 = new SharedBuilder_ModalDimmerProps329564763(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Modal.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_ModalHeaderProps557306730 = new SharedBuilder_ModalHeaderProps557306730(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalHeaderProps): SharedBuilder_ModalHeaderProps557306730 = new SharedBuilder_ModalHeaderProps557306730(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Modal] {
    
    @scala.inline
    def actions(value: SemanticShorthandItem[ModalActionsProps]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionsFunction3(
      value: (/* component */ ReactElement, ModalActionsProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("actions", js.Any.fromFunction3(value))
    
    @scala.inline
    def actionsReactElement(value: ReactElement): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: js.Any): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnDimmerClick(value: Boolean): this.type = set("closeOnDimmerClick", value.asInstanceOf[js.Any])
    
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
    def content(value: SemanticShorthandItem[ModalContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction3(
      value: (/* component */ ReactElement, ModalContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("content", js.Any.fromFunction3(value))
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dimmer(value: `true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]): this.type = set("dimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dimmerFunction3(
      value: (/* component */ ReactElement, ModalDimmerProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("dimmer", js.Any.fromFunction3(value))
    
    @scala.inline
    def dimmerReactElement(value: ReactElement): this.type = set("dimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: SemanticShorthandItem[ModalHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactElement, ModalHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountNode(value: js.Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActionClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): this.type = set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): this.type = set("onMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def onUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): this.type = set("onUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openOnTriggerClick(value: Boolean): this.type = set("openOnTriggerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openOnTriggerFocus(value: Boolean): this.type = set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openOnTriggerMouseEnter(value: Boolean): this.type = set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: mini | tiny | small | large | fullscreen): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trigger(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerReactElement(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerRef(value: typingsSlinky.react.mod.Ref[_]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("triggerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def triggerRefNull: this.type = set("triggerRef", null)
    
    @scala.inline
    def triggerRefRefObject(value: ReactRef[_]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
