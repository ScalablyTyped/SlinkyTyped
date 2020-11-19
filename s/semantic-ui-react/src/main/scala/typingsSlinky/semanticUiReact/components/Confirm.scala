package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.buttonButtonMod.ButtonProps
import typingsSlinky.semanticUiReact.confirmConfirmMod.ConfirmProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.modalActionsMod.ModalActionsProps
import typingsSlinky.semanticUiReact.modalContentMod.ModalContentProps
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Confirm {
  
  @JSImport("semantic-ui-react", "Confirm")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Confirm] {
    
    @scala.inline
    def actionsReactElement(value: ReactElement): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionsFunction3(
      value: (/* component */ ReactType[ModalActionsProps], ModalActionsProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("actions", js.Any.fromFunction3(value))
    
    @scala.inline
    def actions(value: SemanticShorthandItem[ModalActionsProps]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonReactElement(value: ReactElement): this.type = set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonFunction3(
      value: (/* component */ ReactType[ButtonProps], ButtonProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("cancelButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def cancelButton(value: SemanticShorthandItem[ButtonProps]): this.type = set("cancelButton", value.asInstanceOf[js.Any])
    
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
    def confirmButtonReactElement(value: ReactElement): this.type = set("confirmButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmButtonFunction3(
      value: (/* component */ ReactType[ButtonProps], ButtonProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("confirmButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def confirmButton(value: SemanticShorthandItem[ButtonProps]): this.type = set("confirmButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction3(
      value: (/* component */ ReactType[ModalContentProps], ModalContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("content", js.Any.fromFunction3(value))
    
    @scala.inline
    def content(value: SemanticShorthandItem[ModalContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dimmer(value: `true` | blurring | inverted): this.type = set("dimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactType[ModalHeaderProps], ModalHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def header(value: SemanticShorthandItem[ModalHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountNode(value: js.Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActionClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): this.type = set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCancel(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit): this.type = set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def onConfirm(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit): this.type = set("onConfirm", js.Any.fromFunction2(value))
    
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
  }
  
  def withProps(p: ConfirmProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Confirm.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
