package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.buttonButtonMod.ButtonProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalActionsMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalActions", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ModalActionsProps, js.Object, js.Any] {
    def this(props: ModalActionsProps) = this()
    def this(props: ModalActionsProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalActions", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ModalActionsProps] = js.native
  
  @js.native
  trait ModalActionsProps
    extends StrictModalActionsProps
       with /* key */ StringDictionary[js.Any]
  object ModalActionsProps {
    
    @scala.inline
    def apply(): ModalActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalActionsProps]
    }
  }
  
  @js.native
  trait StrictModalActionsProps extends StObject {
    
    /** Array of shorthand buttons. */
    var actions: js.UndefOr[SemanticShorthandCollection[ButtonProps]] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /**
      * onClick handler for an action. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onActionClick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ButtonProps, Unit]
      ] = js.native
  }
  object StrictModalActionsProps {
    
    @scala.inline
    def apply(): StrictModalActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalActionsProps]
    }
    
    @scala.inline
    implicit class StrictModalActionsPropsMutableBuilder[Self <: StrictModalActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: SemanticShorthandCollection[ButtonProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: SemanticShorthandItem[ButtonProps]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
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
      def setOnActionClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ButtonProps) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ModalActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalActionsMod.foo` */
  override def _to: ReactComponentClass[ModalActionsProps] = default
}
