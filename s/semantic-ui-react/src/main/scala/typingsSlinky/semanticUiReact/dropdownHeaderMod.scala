package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownHeaderMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownHeader", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DropdownHeaderProps, js.Object, js.Any] {
    def this(props: DropdownHeaderProps) = this()
    def this(props: DropdownHeaderProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownHeader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DropdownHeaderProps] = js.native
  
  @js.native
  trait DropdownHeaderProps
    extends StrictDropdownHeaderProps
       with /* key */ StringDictionary[js.Any]
  object DropdownHeaderProps {
    
    @scala.inline
    def apply(): DropdownHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownHeaderProps]
    }
  }
  
  @js.native
  trait StrictDropdownHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  }
  object StrictDropdownHeaderProps {
    
    @scala.inline
    def apply(): StrictDropdownHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownHeaderProps]
    }
    
    @scala.inline
    implicit class StrictDropdownHeaderPropsMutableBuilder[Self <: StrictDropdownHeaderProps] (val x: Self) extends AnyVal {
      
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
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DropdownHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownHeaderMod.foo` */
  override def _to: ReactComponentClass[DropdownHeaderProps] = default
}
