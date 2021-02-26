package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentFilterSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ContentFilterSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ContentFilterSmallProps] = js.native
  
  @js.native
  trait ContentFilterSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ContentFilterSmallProps {
    
    @scala.inline
    def apply(): ContentFilterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentFilterSmallProps]
    }
    
    @scala.inline
    implicit class ContentFilterSmallPropsMutableBuilder[Self <: ContentFilterSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ContentFilterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `contentFilterSmallMod.foo` */
  override def _to: ReactComponentClass[ContentFilterSmallProps] = default
}
