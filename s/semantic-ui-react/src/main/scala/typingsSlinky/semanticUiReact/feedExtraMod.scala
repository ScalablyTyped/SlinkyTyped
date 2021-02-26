package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.HtmlImageProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedExtraMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedExtra", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FeedExtraProps] = js.native
  
  @js.native
  trait FeedExtraProps
    extends StrictFeedExtraProps
       with /* key */ StringDictionary[js.Any]
  object FeedExtraProps {
    
    @scala.inline
    def apply(): FeedExtraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedExtraProps]
    }
  }
  
  @js.native
  trait StrictFeedExtraProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** An event can contain additional information like a set of images. */
    var images: js.UndefOr[Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]] = js.native
    
    /** An event can contain additional text information. */
    var text: js.UndefOr[Boolean] = js.native
  }
  object StrictFeedExtraProps {
    
    @scala.inline
    def apply(): StrictFeedExtraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedExtraProps]
    }
    
    @scala.inline
    implicit class StrictFeedExtraPropsMutableBuilder[Self <: StrictFeedExtraProps] (val x: Self) extends AnyVal {
      
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
      def setImages(value: Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setImagesVarargs(value: SemanticShorthandCollection[HtmlImageProps]*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FeedExtraProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedExtraMod.foo` */
  override def _to: ReactComponentClass[FeedExtraProps] = default
}
