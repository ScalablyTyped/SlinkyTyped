package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixChatFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixChatFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WixChatFilledSmallProps] = js.native
  
  @js.native
  trait WixChatFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixChatFilledSmallProps {
    
    @scala.inline
    def apply(): WixChatFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatFilledSmallProps]
    }
    
    @scala.inline
    implicit class WixChatFilledSmallPropsMutableBuilder[Self <: WixChatFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WixChatFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixChatFilledSmallMod.foo` */
  override def _to: ReactComponentClass[WixChatFilledSmallProps] = default
}
