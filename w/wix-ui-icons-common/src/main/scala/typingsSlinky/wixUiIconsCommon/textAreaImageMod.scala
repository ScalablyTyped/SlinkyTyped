package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaImageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaImage", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaImageProps] = js.native
  
  @js.native
  trait TextAreaImageProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaImageProps {
    
    @scala.inline
    def apply(): TextAreaImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaImageProps]
    }
    
    @scala.inline
    implicit class TextAreaImagePropsMutableBuilder[Self <: TextAreaImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaImageMod.foo` */
  override def _to: ReactComponentClass[TextAreaImageProps] = default
}
