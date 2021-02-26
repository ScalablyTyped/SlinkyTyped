package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Crop", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CropProps] = js.native
  
  @js.native
  trait CropProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CropProps {
    
    @scala.inline
    def apply(): CropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropProps]
    }
    
    @scala.inline
    implicit class CropPropsMutableBuilder[Self <: CropProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CropProps]
  
  /* This means you don't have to write `default`, but can instead just say `cropMod.foo` */
  override def _to: ReactComponentClass[CropProps] = default
}
