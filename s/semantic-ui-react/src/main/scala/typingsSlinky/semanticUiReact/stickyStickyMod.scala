package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyStickyMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky/Sticky", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StickyProps, js.Object, js.Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky/Sticky", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StickyProps] = js.native
  
  @js.native
  trait StickyProps
    extends StrictStickyProps
       with /* key */ StringDictionary[js.Any]
  object StickyProps {
    
    @scala.inline
    def apply(): StickyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyProps]
    }
  }
  
  @js.native
  trait StrictStickyProps extends StObject {
    
    /** A Sticky can be active. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Offset in pixels from the bottom of the screen when fixing element to viewport. */
    var bottomOffset: js.UndefOr[Double] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Context which sticky element should stick to. */
    var context: js.UndefOr[Document | Window | HTMLElement | Ref[HTMLElement]] = js.native
    
    /** Offset in pixels from the top of the screen when fixing element to viewport. */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Callback when element is bound to bottom of parent container.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onBottom: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.native
    
    /**
      * Callback when element is fixed to page.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onStick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.native
    
    /**
      * Callback when element is bound to top of parent container.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onTop: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.native
    
    /**
      * Callback when element is unfixed from page.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onUnstick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.native
    
    /** Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up. */
    var pushing: js.UndefOr[Boolean] = js.native
    
    /** Context which sticky should attach onscroll events. */
    var scrollContext: js.UndefOr[Document | Window | HTMLElement | Ref[HTMLElement]] = js.native
    
    /** Custom style for sticky element. */
    var styleElement: js.UndefOr[CSSProperties] = js.native
  }
  object StrictStickyProps {
    
    @scala.inline
    def apply(): StrictStickyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStickyProps]
    }
    
    @scala.inline
    implicit class StrictStickyPropsMutableBuilder[Self <: StrictStickyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContext(value: Document | Window | HTMLElement | Ref[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextDocument(value: Document): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextHTMLElement(value: HTMLElement): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextNull: Self = StObject.set(x, "context", null)
      
      @scala.inline
      def setContextRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextWindow(value: Window): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnBottom(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): Self = StObject.set(x, "onBottom", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBottomUndefined: Self = StObject.set(x, "onBottom", js.undefined)
      
      @scala.inline
      def setOnStick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): Self = StObject.set(x, "onStick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStickUndefined: Self = StObject.set(x, "onStick", js.undefined)
      
      @scala.inline
      def setOnTop(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): Self = StObject.set(x, "onTop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
      
      @scala.inline
      def setOnUnstick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): Self = StObject.set(x, "onUnstick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnstickUndefined: Self = StObject.set(x, "onUnstick", js.undefined)
      
      @scala.inline
      def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushingUndefined: Self = StObject.set(x, "pushing", js.undefined)
      
      @scala.inline
      def setScrollContext(value: Document | Window | HTMLElement | Ref[HTMLElement]): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContextDocument(value: Document): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContextFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "scrollContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollContextHTMLElement(value: HTMLElement): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContextNull: Self = StObject.set(x, "scrollContext", null)
      
      @scala.inline
      def setScrollContextRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContextUndefined: Self = StObject.set(x, "scrollContext", js.undefined)
      
      @scala.inline
      def setScrollContextWindow(value: Window): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleElement(value: CSSProperties): Self = StObject.set(x, "styleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleElementUndefined: Self = StObject.set(x, "styleElement", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StickyProps]
  
  /* This means you don't have to write `default`, but can instead just say `stickyStickyMod.foo` */
  override def _to: ReactComponentClass[StickyProps] = default
}
