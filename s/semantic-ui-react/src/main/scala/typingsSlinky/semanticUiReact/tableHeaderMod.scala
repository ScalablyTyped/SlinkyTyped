package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableHeader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableHeaderProps] = js.native
  
  @js.native
  trait StrictTableHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A definition table can have a full width header or footer, filling in the gap left by the first column. */
    var fullWidth: js.UndefOr[Boolean] = js.native
  }
  object StrictTableHeaderProps {
    
    @scala.inline
    def apply(): StrictTableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableHeaderProps]
    }
    
    @scala.inline
    implicit class StrictTableHeaderPropsMutableBuilder[Self <: StrictTableHeaderProps] (val x: Self) extends AnyVal {
      
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
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    }
  }
  
  @js.native
  trait TableHeaderProps
    extends StrictTableHeaderProps
       with /* key */ StringDictionary[js.Any]
  object TableHeaderProps {
    
    @scala.inline
    def apply(): TableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderProps]
    }
  }
  
  type _To = ReactComponentClass[TableHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeaderMod.foo` */
  override def _to: ReactComponentClass[TableHeaderProps] = default
}
