package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixChatSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixChatSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WixChatSmallProps] = js.native
  
  @js.native
  trait WixChatSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixChatSmallProps {
    
    @scala.inline
    def apply(): WixChatSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatSmallProps]
    }
    
    @scala.inline
    implicit class WixChatSmallPropsMutableBuilder[Self <: WixChatSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WixChatSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixChatSmallMod.foo` */
  override def _to: ReactComponentClass[WixChatSmallProps] = default
}
