package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderImage", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PlaceholderImageProps] = js.native
  
  type PlaceholderImageComponent = ReactComponentClass[PlaceholderImageProps]
  
  @js.native
  trait PlaceholderImageProps
    extends StrictPlaceholderImageProps
       with /* key */ StringDictionary[js.Any]
  object PlaceholderImageProps {
    
    @scala.inline
    def apply(): PlaceholderImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderImageProps]
    }
  }
  
  @js.native
  trait StrictPlaceholderImageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** An image can modify size correctly with responsive styles. */
    var rectangular: js.UndefOr[Boolean] = js.native
    
    /** An image can modify size correctly with responsive styles. */
    var square: js.UndefOr[Boolean] = js.native
  }
  object StrictPlaceholderImageProps {
    
    @scala.inline
    def apply(): StrictPlaceholderImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderImageProps]
    }
    
    @scala.inline
    implicit class StrictPlaceholderImagePropsMutableBuilder[Self <: StrictPlaceholderImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setRectangular(value: Boolean): Self = StObject.set(x, "rectangular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangularUndefined: Self = StObject.set(x, "rectangular", js.undefined)
      
      @scala.inline
      def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PlaceholderImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `placeholderImageMod.foo` */
  override def _to: ReactComponentClass[PlaceholderImageProps] = default
}
