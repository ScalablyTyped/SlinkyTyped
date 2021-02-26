package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbDividerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbDivider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BreadcrumbDividerProps] = js.native
  
  @js.native
  trait BreadcrumbDividerProps
    extends StrictBreadcrumbDividerProps
       with /* key */ StringDictionary[js.Any]
  object BreadcrumbDividerProps {
    
    @scala.inline
    def apply(): BreadcrumbDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbDividerProps]
    }
  }
  
  @js.native
  trait StrictBreadcrumbDividerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Render as an `Icon` component with `divider` class instead of a `div`. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  }
  object StrictBreadcrumbDividerProps {
    
    @scala.inline
    def apply(): StrictBreadcrumbDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictBreadcrumbDividerProps]
    }
    
    @scala.inline
    implicit class StrictBreadcrumbDividerPropsMutableBuilder[Self <: StrictBreadcrumbDividerProps] (val x: Self) extends AnyVal {
      
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
  
  type _To = ReactComponentClass[BreadcrumbDividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbDividerMod.foo` */
  override def _to: ReactComponentClass[BreadcrumbDividerProps] = default
}
