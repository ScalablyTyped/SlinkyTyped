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

object labelDetailMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label/LabelDetail", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LabelDetailProps] = js.native
  
  @js.native
  trait LabelDetailProps
    extends StrictLabelDetailProps
       with /* key */ StringDictionary[js.Any]
  object LabelDetailProps {
    
    @scala.inline
    def apply(): LabelDetailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelDetailProps]
    }
  }
  
  @js.native
  trait StrictLabelDetailProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictLabelDetailProps {
    
    @scala.inline
    def apply(): StrictLabelDetailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictLabelDetailProps]
    }
    
    @scala.inline
    implicit class StrictLabelDetailPropsMutableBuilder[Self <: StrictLabelDetailProps] (val x: Self) extends AnyVal {
      
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
  
  type _To = ReactComponentClass[LabelDetailProps]
  
  /* This means you don't have to write `default`, but can instead just say `labelDetailMod.foo` */
  override def _to: ReactComponentClass[LabelDetailProps] = default
}
