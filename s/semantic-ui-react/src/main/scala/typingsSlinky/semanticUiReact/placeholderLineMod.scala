package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very long`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very short`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.full
import typingsSlinky.semanticUiReact.semanticUiReactStrings.long
import typingsSlinky.semanticUiReact.semanticUiReactStrings.medium
import typingsSlinky.semanticUiReact.semanticUiReactStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderLineMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderLine", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PlaceholderLineProps] = js.native
  
  type PlaceholderLineComponent = ReactComponentClass[PlaceholderLineProps]
  
  @js.native
  trait PlaceholderLineProps
    extends StrictPlaceholderLineProps
       with /* key */ StringDictionary[js.Any]
  object PlaceholderLineProps {
    
    @scala.inline
    def apply(): PlaceholderLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderLineProps]
    }
  }
  
  @js.native
  trait StrictPlaceholderLineProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A line can specify how long its contents should appear. */
    var length: js.UndefOr[full | (`very long`) | long | medium | short | (`very short`)] = js.native
  }
  object StrictPlaceholderLineProps {
    
    @scala.inline
    def apply(): StrictPlaceholderLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderLineProps]
    }
    
    @scala.inline
    implicit class StrictPlaceholderLinePropsMutableBuilder[Self <: StrictPlaceholderLineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLength(value: full | (`very long`) | long | medium | short | (`very short`)): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PlaceholderLineProps]
  
  /* This means you don't have to write `default`, but can instead just say `placeholderLineMod.foo` */
  override def _to: ReactComponentClass[PlaceholderLineProps] = default
}
