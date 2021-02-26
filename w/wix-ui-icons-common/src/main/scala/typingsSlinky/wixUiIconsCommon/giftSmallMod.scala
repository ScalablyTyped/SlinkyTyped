package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/GiftSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GiftSmallProps] = js.native
  
  @js.native
  trait GiftSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GiftSmallProps {
    
    @scala.inline
    def apply(): GiftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GiftSmallProps]
    }
    
    @scala.inline
    implicit class GiftSmallPropsMutableBuilder[Self <: GiftSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GiftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `giftSmallMod.foo` */
  override def _to: ReactComponentClass[GiftSmallProps] = default
}
