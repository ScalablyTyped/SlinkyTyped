package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhoneFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PhoneFilledSmallProps] = js.native
  
  @js.native
  trait PhoneFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PhoneFilledSmallProps {
    
    @scala.inline
    def apply(): PhoneFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneFilledSmallProps]
    }
    
    @scala.inline
    implicit class PhoneFilledSmallPropsMutableBuilder[Self <: PhoneFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PhoneFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneFilledSmallMod.foo` */
  override def _to: ReactComponentClass[PhoneFilledSmallProps] = default
}
