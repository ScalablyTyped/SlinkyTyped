package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbSectionMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbSection", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[BreadcrumbSectionProps, js.Object, js.Any] {
    def this(props: BreadcrumbSectionProps) = this()
    def this(props: BreadcrumbSectionProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbSection", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BreadcrumbSectionProps] = js.native
  
  @js.native
  trait BreadcrumbSectionProps
    extends StrictBreadcrumbSectionProps
       with /* key */ StringDictionary[js.Any]
  object BreadcrumbSectionProps {
    
    @scala.inline
    def apply(): BreadcrumbSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbSectionProps]
    }
  }
  
  @js.native
  trait StrictBreadcrumbSectionProps extends StObject {
    
    /** Style as the currently active section. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Render as an `a` tag instead of a `div` and adds the href attribute. */
    var href: js.UndefOr[String] = js.native
    
    /** Render as an `a` tag instead of a `div`. */
    var link: js.UndefOr[Boolean] = js.native
    
    /**
      * Called on click. When passed, the component will render as an `a`
      * tag by default instead of a `div`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ SyntheticMouseEvent[HTMLAnchorElement], 
          /* data */ BreadcrumbSectionProps, 
          Unit
        ]
      ] = js.native
  }
  object StrictBreadcrumbSectionProps {
    
    @scala.inline
    def apply(): StrictBreadcrumbSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictBreadcrumbSectionProps]
    }
    
    @scala.inline
    implicit class StrictBreadcrumbSectionPropsMutableBuilder[Self <: StrictBreadcrumbSectionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ BreadcrumbSectionProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BreadcrumbSectionProps]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbSectionMod.foo` */
  override def _to: ReactComponentClass[BreadcrumbSectionProps] = default
}
