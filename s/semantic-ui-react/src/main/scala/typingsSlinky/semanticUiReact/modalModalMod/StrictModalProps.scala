package typingsSlinky.semanticUiReact.modalModalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.modalActionsMod.ModalActionsProps
import typingsSlinky.semanticUiReact.modalContentMod.ModalContentProps
import typingsSlinky.semanticUiReact.modalDimmerMod.ModalDimmerProps
import typingsSlinky.semanticUiReact.modalHeaderMod.ModalHeaderProps
import typingsSlinky.semanticUiReact.portalPortalMod.StrictPortalProps
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

@js.native
trait StrictModalProps extends StrictPortalProps {
  
  /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
  var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.native
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** A Modal can reduce its complexity */
  var basic: js.UndefOr[Boolean] = js.native
  
  /** A modal can be vertically centered in the viewport. */
  var centered: js.UndefOr[Boolean] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Icon. */
  var closeIcon: js.UndefOr[js.Any] = js.native
  
  /** Whether or not the Modal should close when the dimmer is clicked. */
  var closeOnDimmerClick: js.UndefOr[Boolean] = js.native
  
  /** A Modal can be passed content via shorthand. */
  var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.native
  
  /** A modal can appear in a dimmer. */
  var dimmer: js.UndefOr[`true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]] = js.native
  
  /** A Modal can be passed header via shorthand. */
  var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.native
  
  /**
    * Action onClick handler when using shorthand `actions`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onActionClick: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.native
  
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClose")
  var onClose_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.native
  
  /**
    * Called when the portal is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onMount")
  var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.native
  
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onOpen")
  var onOpen_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.native
  
  /**
    * Called when the portal is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onUnmount")
  var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.native
  
  /** A modal can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | fullscreen] = js.native
  
  /** Custom styles. */
  var style: js.UndefOr[CSSProperties] = js.native
}
object StrictModalProps {
  
  @scala.inline
  def apply(): StrictModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictModalProps]
  }
  
  @scala.inline
  implicit class StrictModalPropsOps[Self <: StrictModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsReactElement(value: ReactElement): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsFunction3(
      value: (/* component */ ReactElement, ModalActionsProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("actions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setActions(value: SemanticShorthandItem[ModalActionsProps]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseIcon(value: js.Any): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    
    @scala.inline
    def setCloseOnDimmerClick(value: Boolean): Self = this.set("closeOnDimmerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnDimmerClick: Self = this.set("closeOnDimmerClick", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction3(
      value: (/* component */ ReactElement, ModalContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("content", js.Any.fromFunction3(value))
    
    @scala.inline
    def setContent(value: SemanticShorthandItem[ModalContentProps]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDimmerReactElement(value: ReactElement): Self = this.set("dimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimmerFunction3(
      value: (/* component */ ReactElement, ModalDimmerProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("dimmer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDimmer(value: `true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]): Self = this.set("dimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimmer: Self = this.set("dimmer", js.undefined)
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactElement, ModalHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHeader(value: SemanticShorthandItem[ModalHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setOnActionClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): Self = this.set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActionClick: Self = this.set("onActionClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnMount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = this.set("onMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMount: Self = this.set("onMount", js.undefined)
    
    @scala.inline
    def setOnOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = this.set("onUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
    
    @scala.inline
    def setSize(value: mini | tiny | small | large | fullscreen): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
