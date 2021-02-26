package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Gift", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GiftProps] = js.native
  
  @js.native
  trait GiftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GiftProps {
    
    @scala.inline
    def apply(): GiftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GiftProps]
    }
    
    @scala.inline
    implicit class GiftPropsMutableBuilder[Self <: GiftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GiftProps]
  
  /* This means you don't have to write `default`, but can instead just say `giftMod.foo` */
  override def _to: ReactComponentClass[GiftProps] = default
}
