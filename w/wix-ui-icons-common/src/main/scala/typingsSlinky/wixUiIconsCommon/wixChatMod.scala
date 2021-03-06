package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixChatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixChat", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WixChatProps] = js.native
  
  @js.native
  trait WixChatProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixChatProps {
    
    @scala.inline
    def apply(): WixChatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatProps]
    }
    
    @scala.inline
    implicit class WixChatPropsMutableBuilder[Self <: WixChatProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WixChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixChatMod.foo` */
  override def _to: ReactComponentClass[WixChatProps] = default
}
