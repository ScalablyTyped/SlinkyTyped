package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.std.DOMRect
import typingsSlinky.wordpressComponents.anon.Slot
import typingsSlinky.wordpressComponents.popoverMod.Popover.Props
import typingsSlinky.wordpressComponents.wordpressComponentsBooleans.`false`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.container
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.firstElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/popover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] with Slot = js.native
    
    type _To = ComponentType[Props] with Slot
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] with Slot = ^
  }
  
  object Popover {
    
    /**
      * The direction in which the popover should open relative to its parent
      * node. Specify y- and x-axis as a space-separated string.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top left`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top right`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top center`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle left`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle right`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle center`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom left`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom right`
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom center`
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def `bottom center`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom center` = ("bottom center").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom center`]
      
      @scala.inline
      def `bottom left`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom left` = ("bottom left").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom left`]
      
      @scala.inline
      def `bottom right`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom right` = ("bottom right").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom right`]
      
      @scala.inline
      def `middle center`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle center` = ("middle center").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle center`]
      
      @scala.inline
      def `middle left`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle left` = ("middle left").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle left`]
      
      @scala.inline
      def `middle right`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle right` = ("middle right").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`middle right`]
      
      @scala.inline
      def `top center`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top center` = ("top center").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top center`]
      
      @scala.inline
      def `top left`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top left` = ("top left").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top left`]
      
      @scala.inline
      def `top right`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top right` = ("top right").asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top right`]
    }
    
    @js.native
    trait Props extends HTMLProps[HTMLDivElement] {
      
      /**
        * A custom `DOMRect` object at which to position the popover.
        */
      var anchorRect: js.UndefOr[DOMRect | ClientRect] = js.native
      
      /**
        * Should the popover have an animation?
        * @defaultValue true
        */
      var animate: js.UndefOr[Boolean] = js.native
      
      /**
        * The content to be displayed within the popover.
        */
      @JSName("children")
      var children_Props: ReactElement = js.native
      
      /**
        * Opt-in prop to show popovers fullscreen on mobile.
        */
      var expandOnMobile: js.UndefOr[Boolean] = js.native
      
      /**
        * By default, the first tabblable element in the popover will receive
        * focus when it mounts. This is the same as setting focusOnMount to
        * `"firstElement"`. If you want to focus the container instead, you can
        * set focusOnMount to `"container"`.
        *
        * Set this prop to `false` to disable focus changing entirely. This
        * should only be set when an appropriately accessible substitute
        * behavior exists.
        *
        * @defaultValue "firstElement"
        */
      var focusOnMount: js.UndefOr[firstElement | container | `false`] = js.native
      
      /**
        * Function that should return a `DOMRect` of where to position the
        * popover.
        */
      var getAnchorRect: js.UndefOr[
            js.Function1[
              /* currentAnchorElement */ HTMLSpanElement | Null, 
              js.UndefOr[DOMRect | ClientRect]
            ]
          ] = js.native
      
      /**
        * Set this to customize the text that is shown in popover's header
        * when it is fullscreen on mobile.
        */
      var headerTitle: js.UndefOr[String] = js.native
      
      /**
        * Set this to hide the arrow which visually indicates what the popover
        * is anchored to. Note that the arrow will not display if `position` is
        * set to `"middle center"`.
        */
      var noArrow: js.UndefOr[Boolean] = js.native
      
      /**
        * A callback invoked when the user clicks outside the opened popover,
        * passing the click event. The popover should be closed in response to
        * this interaction.
        *
        * @deprecated  use `onFocusOutside`
        */
      var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.native
      
      /**
        * A callback invoked when the popover should be closed.
        */
      var onClose: js.UndefOr[js.Function0[Unit]] = js.native
      
      /**
        * A callback invoked when the focus leaves the opened popover. This
        * should only be provided in advanced use-cases when a Popover should
        * close under specific circumstances; for example, if the new
        * `document.activeElement` is content of or otherwise controlling
        * Popover visibility.
        *
        * Defaults to `onClose` when not provided.
        */
      var onFocusOutside: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[Element], Unit]] = js.native
      
      /**
        * The direction in which the popover should open relative to its
        * parent node. Specify y- and x-axis as a space-separated string.
        * @defaultValue "top center"
        */
      var position: js.UndefOr[Position] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnchorRect(value: DOMRect | ClientRect): Self = StObject.set(x, "anchorRect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnchorRectClientRect(value: ClientRect): Self = StObject.set(x, "anchorRect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnchorRectUndefined: Self = StObject.set(x, "anchorRect", js.undefined)
        
        @scala.inline
        def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
        
        @scala.inline
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setExpandOnMobile(value: Boolean): Self = StObject.set(x, "expandOnMobile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpandOnMobileUndefined: Self = StObject.set(x, "expandOnMobile", js.undefined)
        
        @scala.inline
        def setFocusOnMount(value: firstElement | container | `false`): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        @scala.inline
        def setGetAnchorRect(value: /* currentAnchorElement */ HTMLSpanElement | Null => js.UndefOr[DOMRect | ClientRect]): Self = StObject.set(x, "getAnchorRect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetAnchorRectUndefined: Self = StObject.set(x, "getAnchorRect", js.undefined)
        
        @scala.inline
        def setHeaderTitle(value: String): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
        
        @scala.inline
        def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
        
        @scala.inline
        def setOnClickOutside(value: () => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
        
        @scala.inline
        def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        @scala.inline
        def setOnFocusOutside(value: /* event */ SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocusOutside", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFocusOutsideUndefined: Self = StObject.set(x, "onFocusOutside", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
  }
}
