package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WixFormsSmallProps] = js.native
  
  @js.native
  trait WixFormsSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixFormsSmallProps {
    
    @scala.inline
    def apply(): WixFormsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsSmallProps]
    }
    
    @scala.inline
    implicit class WixFormsSmallPropsMutableBuilder[Self <: WixFormsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WixFormsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsSmallMod.foo` */
  override def _to: ReactComponentClass[WixFormsSmallProps] = default
}
