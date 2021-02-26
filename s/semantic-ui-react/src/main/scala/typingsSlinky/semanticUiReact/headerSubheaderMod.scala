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

object headerSubheaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Header/HeaderSubheader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HeaderSubheaderProps] = js.native
  
  @js.native
  trait HeaderSubheaderProps
    extends StrictHeaderSubheaderProps
       with /* key */ StringDictionary[js.Any]
  object HeaderSubheaderProps {
    
    @scala.inline
    def apply(): HeaderSubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSubheaderProps]
    }
  }
  
  @js.native
  trait StrictHeaderSubheaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictHeaderSubheaderProps {
    
    @scala.inline
    def apply(): StrictHeaderSubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHeaderSubheaderProps]
    }
    
    @scala.inline
    implicit class StrictHeaderSubheaderPropsMutableBuilder[Self <: StrictHeaderSubheaderProps] (val x: Self) extends AnyVal {
      
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
    }
  }
  
  type _To = ReactComponentClass[HeaderSubheaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerSubheaderMod.foo` */
  override def _to: ReactComponentClass[HeaderSubheaderProps] = default
}
