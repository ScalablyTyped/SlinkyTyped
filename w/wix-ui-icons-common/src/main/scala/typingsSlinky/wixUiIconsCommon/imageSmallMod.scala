package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ImageSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ImageSmallProps] = js.native
  
  @js.native
  trait ImageSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ImageSmallProps {
    
    @scala.inline
    def apply(): ImageSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageSmallProps]
    }
    
    @scala.inline
    implicit class ImageSmallPropsMutableBuilder[Self <: ImageSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ImageSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageSmallMod.foo` */
  override def _to: ReactComponentClass[ImageSmallProps] = default
}
