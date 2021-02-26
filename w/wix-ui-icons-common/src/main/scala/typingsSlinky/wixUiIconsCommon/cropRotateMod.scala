package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropRotateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CropRotate", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CropRotateProps] = js.native
  
  @js.native
  trait CropRotateProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CropRotateProps {
    
    @scala.inline
    def apply(): CropRotateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropRotateProps]
    }
    
    @scala.inline
    implicit class CropRotatePropsMutableBuilder[Self <: CropRotateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CropRotateProps]
  
  /* This means you don't have to write `default`, but can instead just say `cropRotateMod.foo` */
  override def _to: ReactComponentClass[CropRotateProps] = default
}
