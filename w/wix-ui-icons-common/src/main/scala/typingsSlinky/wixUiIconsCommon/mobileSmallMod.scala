package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MobileSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MobileSmallProps] = js.native
  
  @js.native
  trait MobileSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MobileSmallProps {
    
    @scala.inline
    def apply(): MobileSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MobileSmallProps]
    }
    
    @scala.inline
    implicit class MobileSmallPropsMutableBuilder[Self <: MobileSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MobileSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `mobileSmallMod.foo` */
  override def _to: ReactComponentClass[MobileSmallProps] = default
}
