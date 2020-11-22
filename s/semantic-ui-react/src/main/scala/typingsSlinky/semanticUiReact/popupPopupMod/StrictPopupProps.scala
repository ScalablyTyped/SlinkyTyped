package typingsSlinky.semanticUiReact.popupPopupMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.popupContentMod.PopupContentProps
import typingsSlinky.semanticUiReact.popupHeaderMod.PopupHeaderProps
import typingsSlinky.semanticUiReact.portalPortalMod.StrictPortalProps
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictPopupProps extends StrictPortalProps {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Display the popup without the pointing arrow */
  var basic: js.UndefOr[Boolean] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Simple text content for the popover. */
  var content: js.UndefOr[SemanticShorthandItem[PopupContentProps]] = js.native
  
  /** Existing element the pop-up should be bound to. */
  var context: js.UndefOr[Document | Window | HTMLElement | ReactRef[HTMLElement]] = js.native
  
  /** A disabled popup only renders its trigger. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Enables the Popper.js event listeners. */
  var eventsEnabled: js.UndefOr[Boolean] = js.native
  
  /** A flowing Popup has no maximum width and continues to flow to fit its content. */
  var flowing: js.UndefOr[Boolean] = js.native
  
  /** Header displayed above the content in bold. */
  var header: js.UndefOr[SemanticShorthandItem[PopupHeaderProps]] = js.native
  
  /** Hide the Popup when scrolling the window. */
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  /** Whether the popup should not close on hover. */
  var hoverable: js.UndefOr[Boolean] = js.native
  
  /** Invert the colors of the popup */
  var inverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Offset values in px unit to apply to rendered popup. The basic offset accepts an
    * array with two numbers in the form [skidding, distance]:
    * - `skidding` displaces the Popup along the reference element
    * - `distance` displaces the Popup away from, or toward, the reference element in the direction of its placement. A positive number displaces it further away, while a negative number lets it overlap the reference.
    *
    * @see https://popper.js.org/docs/v2/modifiers/offset/
    */
  var offset: js.UndefOr[(js.Tuple2[Double, js.UndefOr[Double]]) | PopperOffsetsFunction] = js.native
  
  /** Events triggering the popup. */
  var on: js.UndefOr[hover | click | focus | (js.Array[hover | click | focus])] = js.native
  
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClose")
  var onClose_StrictPopupProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps, Unit]
  ] = js.native
  
  /**
    * Called when the portal is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onMount")
  var onMount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PopupProps, Unit]] = js.native
  
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onOpen")
  var onOpen_StrictPopupProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps, Unit]
  ] = js.native
  
  /**
    * Called when the portal is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onUnmount")
  var onUnmount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PopupProps, Unit]] = js.native
  
  /** Disables automatic repositioning of the component, it will always be placed according to the position value. */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /** A wrapping element for an actual content that will be used for positioning. */
  var popper: js.UndefOr[SemanticShorthandItem[HTMLAttributes[HTMLDivElement]]] = js.native
  
  /** A popup can have dependencies which update will schedule a position update. */
  var popperDependencies: js.UndefOr[js.Array[_]] = js.native
  
  /** An array containing custom settings for the Popper.js modifiers. */
  var popperModifiers: js.UndefOr[js.Array[_]] = js.native
  
  /** Position for the popover. */
  var position: js.UndefOr[
    (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
  ] = js.native
  
  /** Tells `Popper.js` to use the `position: fixed` strategy to position the popover. */
  var positionFixed: js.UndefOr[Boolean] = js.native
  
  /** Popup size. */
  var size: js.UndefOr[mini | tiny | small | large | huge] = js.native
  
  /** Custom Popup style. */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /** Popup width. */
  var wide: js.UndefOr[Boolean | very] = js.native
}
object StrictPopupProps {
  
  @scala.inline
  def apply(): StrictPopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPopupProps]
  }
  
  @scala.inline
  implicit class StrictPopupPropsOps[Self <: StrictPopupProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction3(
      value: (/* component */ ReactElement, PopupContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("content", js.Any.fromFunction3(value))
    
    @scala.inline
    def setContent(value: SemanticShorthandItem[PopupContentProps]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContextRefObject(value: ReactRef[HTMLElement]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextHTMLElement(value: HTMLElement): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Document | Window | HTMLElement | ReactRef[HTMLElement]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextDocument(value: Document): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextWindow(value: Window): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEventsEnabled(value: Boolean): Self = this.set("eventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsEnabled: Self = this.set("eventsEnabled", js.undefined)
    
    @scala.inline
    def setFlowing(value: Boolean): Self = this.set("flowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowing: Self = this.set("flowing", js.undefined)
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactElement, PopupHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHeader(value: SemanticShorthandItem[PopupHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnScroll: Self = this.set("hideOnScroll", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setOffsetFunction1(
      value: /* params */ PopperOffsetsFunctionParams => js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]
    ): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: (js.Tuple2[Double, js.UndefOr[Double]]) | PopperOffsetsFunction): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnVarargs(value: (hover | click | focus)*): Self = this.set("on", js.Array(value :_*))
    
    @scala.inline
    def setOn(value: hover | click | focus | (js.Array[hover | click | focus])): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnMount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): Self = this.set("onMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMount: Self = this.set("onMount", js.undefined)
    
    @scala.inline
    def setOnOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnUnmount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): Self = this.set("onUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setPopperReactElement(value: ReactElement): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperFunction3(
      value: (/* component */ ReactElement, HTMLAttributes[HTMLDivElement], /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("popper", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPopper(value: SemanticShorthandItem[HTMLAttributes[HTMLDivElement]]): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopper: Self = this.set("popper", js.undefined)
    
    @scala.inline
    def setPopperDependenciesVarargs(value: js.Any*): Self = this.set("popperDependencies", js.Array(value :_*))
    
    @scala.inline
    def setPopperDependencies(value: js.Array[_]): Self = this.set("popperDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperDependencies: Self = this.set("popperDependencies", js.undefined)
    
    @scala.inline
    def setPopperModifiersVarargs(value: js.Any*): Self = this.set("popperModifiers", js.Array(value :_*))
    
    @scala.inline
    def setPopperModifiers(value: js.Array[_]): Self = this.set("popperModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperModifiers: Self = this.set("popperModifiers", js.undefined)
    
    @scala.inline
    def setPosition(
      value: (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionFixed(value: Boolean): Self = this.set("positionFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionFixed: Self = this.set("positionFixed", js.undefined)
    
    @scala.inline
    def setSize(value: mini | tiny | small | large | huge): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWide(value: Boolean | very): Self = this.set("wide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWide: Self = this.set("wide", js.undefined)
  }
}
