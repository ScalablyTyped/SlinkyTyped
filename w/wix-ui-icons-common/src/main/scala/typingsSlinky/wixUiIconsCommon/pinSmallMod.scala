package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PinSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PinSmallProps] = js.native
  
  @js.native
  trait PinSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PinSmallProps {
    
    @scala.inline
    def apply(): PinSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinSmallProps]
    }
    
    @scala.inline
    implicit class PinSmallPropsMutableBuilder[Self <: PinSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PinSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinSmallMod.foo` */
  override def _to: ReactComponentClass[PinSmallProps] = default
}
