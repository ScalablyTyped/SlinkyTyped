package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.breadcrumbDividerMod.BreadcrumbDividerProps
import typingsSlinky.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbBreadcrumbMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[BreadcrumbProps, js.Object, js.Any] {
    def this(props: BreadcrumbProps) = this()
    def this(props: BreadcrumbProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb", JSImport.Default)
    @js.native
    val ^ : BreadcrumbComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb", "default.Section")
    @js.native
    class Section protected ()
      extends Component[BreadcrumbSectionProps, js.Object, js.Any] {
      def this(props: BreadcrumbSectionProps) = this()
      def this(props: BreadcrumbSectionProps, context: js.Any) = this()
    }
    
    type _To = BreadcrumbComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: BreadcrumbComponent = ^
  }
  
  @js.native
  trait BreadcrumbComponent
    extends ComponentClass[BreadcrumbProps, js.Object] {
    
    var Divider: ReactComponentClass[BreadcrumbDividerProps] = js.native
    
    var Section: ReactComponentClass[BreadcrumbSectionProps] = js.native
  }
  
  @js.native
  trait BreadcrumbProps
    extends StrictBreadcrumbProps
       with /* key */ StringDictionary[js.Any]
  object BreadcrumbProps {
    
    @scala.inline
    def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
  }
  
  @js.native
  trait StrictBreadcrumbProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content of the Breadcrumb.Divider. */
    var divider: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** For use with the sections prop. Render as an `Icon` component with `divider` class instead of a `div` in
      *  Breadcrumb.Divider.
      */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
    
    /** Shorthand array of props for Breadcrumb.Section. */
    var sections: js.UndefOr[SemanticShorthandCollection[BreadcrumbSectionProps]] = js.native
    
    /** Size of Breadcrumb */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  }
  object StrictBreadcrumbProps {
    
    @scala.inline
    def apply(): StrictBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictBreadcrumbProps]
    }
    
    @scala.inline
    implicit class StrictBreadcrumbPropsMutableBuilder[Self <: StrictBreadcrumbProps] (val x: Self) extends AnyVal {
      
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
      def setDivider(value: SemanticShorthandContent): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerReactElement(value: ReactElement): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
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
      
      @scala.inline
      def setSections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      @scala.inline
      def setSectionsVarargs(value: SemanticShorthandItem[BreadcrumbSectionProps]*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
