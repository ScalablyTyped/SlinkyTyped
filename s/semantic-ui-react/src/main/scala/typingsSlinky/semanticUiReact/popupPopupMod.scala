package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.popperjsCore.typesMod.Rect
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupPopupMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup/Popup", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[PopupProps, js.Object, js.Any] {
    def this(props: PopupProps) = this()
    def this(props: PopupProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup/Popup", JSImport.Default)
  @js.native
  val default: PopupComponent = js.native
  
  type PopperOffsetsFunction = js.Function1[
    /* params */ PopperOffsetsFunctionParams, 
    js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]
  ]
  
  @js.native
  trait PopperOffsetsFunctionParams extends StObject {
    
    var placement: Placement = js.native
    
    var popper: Rect = js.native
    
    var reference: Rect = js.native
  }
  object PopperOffsetsFunctionParams {
    
    @scala.inline
    def apply(placement: Placement, popper: Rect, reference: Rect): PopperOffsetsFunctionParams = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperOffsetsFunctionParams]
    }
    
    @scala.inline
    implicit class PopperOffsetsFunctionParamsMutableBuilder[Self <: PopperOffsetsFunctionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupComponent
    extends ComponentClass[PopupProps, js.Object] {
    
    var Content: ReactComponentClass[PopupContentProps] = js.native
    
    var Header: ReactComponentClass[PopupHeaderProps] = js.native
  }
  
  @js.native
  trait PopupProps
    extends StrictPopupProps
       with /* key */ StringDictionary[js.Any]
  object PopupProps {
    
    @scala.inline
    def apply(): PopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupProps]
    }
  }
  
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
    implicit class StrictPopupPropsMutableBuilder[Self <: StrictPopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandItem[PopupContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction3(
        value: (/* component */ ReactElement, PopupContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContext(value: Document | Window | HTMLElement | ReactRef[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextDocument(value: Document): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextHTMLElement(value: HTMLElement): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextWindow(value: Window): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
      
      @scala.inline
      def setFlowing(value: Boolean): Self = StObject.set(x, "flowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowingUndefined: Self = StObject.set(x, "flowing", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[PopupHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ReactElement, PopupHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
      
      @scala.inline
      def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setOffset(value: (js.Tuple2[Double, js.UndefOr[Double]]) | PopperOffsetsFunction): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction1(
        value: /* params */ PopperOffsetsFunctionParams => js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]
      ): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOn(value: hover | click | focus | (js.Array[hover | click | focus])): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PopupProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: (hover | click | focus)*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      @scala.inline
      def setPopper(value: SemanticShorthandItem[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperDependencies(value: js.Array[_]): Self = StObject.set(x, "popperDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperDependenciesUndefined: Self = StObject.set(x, "popperDependencies", js.undefined)
      
      @scala.inline
      def setPopperDependenciesVarargs(value: js.Any*): Self = StObject.set(x, "popperDependencies", js.Array(value :_*))
      
      @scala.inline
      def setPopperFunction3(
        value: (/* component */ ReactElement, HTMLAttributes[HTMLDivElement], /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "popper", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPopperModifiers(value: js.Array[_]): Self = StObject.set(x, "popperModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperModifiersUndefined: Self = StObject.set(x, "popperModifiers", js.undefined)
      
      @scala.inline
      def setPopperModifiersVarargs(value: js.Any*): Self = StObject.set(x, "popperModifiers", js.Array(value :_*))
      
      @scala.inline
      def setPopperReactElement(value: ReactElement): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
      
      @scala.inline
      def setPosition(
        value: (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | huge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWide(value: Boolean | very): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    }
  }
  
  type _To = PopupComponent
  
  /* This means you don't have to write `default`, but can instead just say `popupPopupMod.foo` */
  override def _to: PopupComponent = default
}
