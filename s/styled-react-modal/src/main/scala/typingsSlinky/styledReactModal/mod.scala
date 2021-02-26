package typingsSlinky.styledReactModal

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.std.TemplateStringsArray
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsSlinky.styledComponents.styledComponentsMod.CSSObject
import typingsSlinky.styledComponents.styledComponentsMod.InterpolationFunction
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponent
import typingsSlinky.styledReactModal.styledReactModalStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalProps, js.Object, js.Any]
  object default {
    
    /* static member */
    @JSImport("styled-react-modal", "default.styled")
    @js.native
    def styled(`object`: CSSObject): StyledComponent[ReactComponentClass[ModalProps], _, js.Object, scala.Nothing] = js.native
    @JSImport("styled-react-modal", "default.styled")
    @js.native
    def styled(`object`: InterpolationFunction[_]): StyledComponent[ReactComponentClass[ModalProps], _, js.Object, scala.Nothing] = js.native
    /* static member */
    @JSImport("styled-react-modal", "default.styled")
    @js.native
    def styled(strings: TemplateStringsArray, interpolations: js.Any*): StyledComponent[ReactComponentClass[ModalProps], _, js.Object, scala.Nothing] = js.native
  }
  
  @JSImport("styled-react-modal", "BaseModalBackground")
  @js.native
  val BaseModalBackground: StyledComponent[div, js.Any, js.Object, scala.Nothing] = js.native
  
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  class ModalProvider protected ()
    extends Component[ModalProviderProps, js.Object, js.Any] {
    def this(props: ModalProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProviderProps, context: js.Any) = this()
  }
  
  type Modal = ReactComponentClass[ModalProps]
  
  @js.native
  trait ModalProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var allowScroll: js.UndefOr[Boolean] = js.native
    
    var backgroundProps: js.UndefOr[js.Object] = js.native
    
    var beforeClose: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.native
    
    var beforeOpen: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var isOpen: Boolean = js.native
    
    var onBackgroundClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(isOpen: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterOpen(value: () => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      @scala.inline
      def setAllowScroll(value: Boolean): Self = StObject.set(x, "allowScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowScrollUndefined: Self = StObject.set(x, "allowScroll", js.undefined)
      
      @scala.inline
      def setBackgroundProps(value: js.Object): Self = StObject.set(x, "backgroundProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPropsUndefined: Self = StObject.set(x, "backgroundProps", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCloseFunction0(value: () => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeOpenFunction0(value: () => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBackgroundClick(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBackgroundClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackgroundClickUndefined: Self = StObject.set(x, "onBackgroundClick", js.undefined)
      
      @scala.inline
      def setOnEscapeKeydown(value: /* event */ Event => Unit): Self = StObject.set(x, "onEscapeKeydown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeKeydownUndefined: Self = StObject.set(x, "onEscapeKeydown", js.undefined)
    }
  }
  
  @js.native
  trait ModalProviderProps extends StObject {
    
    var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.native
    
    var children: ReactElement = js.native
  }
  object ModalProviderProps {
    
    @scala.inline
    def apply(): ModalProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProviderProps]
    }
    
    @scala.inline
    implicit class ModalProviderPropsMutableBuilder[Self <: ModalProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundComponent(value: AnyStyledComponent): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
