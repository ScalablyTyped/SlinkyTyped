package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WixFormsFilledProps] = js.native
  
  @js.native
  trait WixFormsFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixFormsFilledProps {
    
    @scala.inline
    def apply(): WixFormsFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsFilledProps]
    }
    
    @scala.inline
    implicit class WixFormsFilledPropsMutableBuilder[Self <: WixFormsFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WixFormsFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsFilledMod.foo` */
  override def _to: ReactComponentClass[WixFormsFilledProps] = default
}
