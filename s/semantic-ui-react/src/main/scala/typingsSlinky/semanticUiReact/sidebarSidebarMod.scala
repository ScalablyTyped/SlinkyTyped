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
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`scale down`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide along`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide out`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very thin`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very wide`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.overlay
import typingsSlinky.semanticUiReact.semanticUiReactStrings.push
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.thin
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.uncover
import typingsSlinky.semanticUiReact.semanticUiReactStrings.wide
import typingsSlinky.semanticUiReact.sidebarPushableMod.SidebarPushableProps
import typingsSlinky.semanticUiReact.sidebarPusherMod.SidebarPusherProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarSidebarMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar/Sidebar", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SidebarProps, js.Object, js.Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar/Sidebar", JSImport.Default)
  @js.native
  val default: SidebarComponent = js.native
  
  @js.native
  trait SidebarComponent
    extends ComponentClass[SidebarProps, js.Object] {
    
    var Pushable: ReactComponentClass[SidebarPushableProps] = js.native
    
    var Pusher: ReactComponentClass[SidebarPusherProps] = js.native
  }
  
  @js.native
  trait SidebarProps
    extends StrictSidebarProps
       with /* key */ StringDictionary[js.Any]
  object SidebarProps {
    
    @scala.inline
    def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
  }
  
  @js.native
  trait StrictSidebarProps extends StObject {
    
    /** Animation style. */
    var animation: js.UndefOr[overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Direction the sidebar should appear on. */
    var direction: js.UndefOr[top | right | bottom | left] = js.native
    
    /**
      * Called after a sidebar has finished animating out.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onHidden: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.native
    
    /**
      * Called before a sidebar begins to animate out.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onHide: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.native
    
    /**
      * Called when a sidebar has finished animating in.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onShow: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.native
    
    /**
      * Called when a sidebar begins animating in.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onVisible: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.native
    
    /** A sidebar can handle clicks on the passed element. */
    var target: js.UndefOr[Document | Window | HTMLElement | ReactRef[HTMLElement]] = js.native
    
    /** Controls whether or not the sidebar is visible on the page. */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Sidebar width. */
    var width: js.UndefOr[(`very thin`) | thin | wide | (`very wide`)] = js.native
  }
  object StrictSidebarProps {
    
    @scala.inline
    def apply(): StrictSidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSidebarProps]
    }
    
    @scala.inline
    implicit class StrictSidebarPropsMutableBuilder[Self <: StrictSidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
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
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: top | right | bottom | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOnHidden(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
      
      @scala.inline
      def setOnHide(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnVisible(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): Self = StObject.set(x, "onVisible", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVisibleUndefined: Self = StObject.set(x, "onVisible", js.undefined)
      
      @scala.inline
      def setTarget(value: Document | Window | HTMLElement | ReactRef[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDocument(value: Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetWindow(value: Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: (`very thin`) | thin | wide | (`very wide`)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = SidebarComponent
  
  /* This means you don't have to write `default`, but can instead just say `sidebarSidebarMod.foo` */
  override def _to: SidebarComponent = default
}
