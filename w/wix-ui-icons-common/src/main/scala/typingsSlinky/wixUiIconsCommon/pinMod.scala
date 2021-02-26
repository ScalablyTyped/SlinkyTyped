package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Pin", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PinProps] = js.native
  
  @js.native
  trait PinProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PinProps {
    
    @scala.inline
    def apply(): PinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinProps]
    }
    
    @scala.inline
    implicit class PinPropsMutableBuilder[Self <: PinProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PinProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinMod.foo` */
  override def _to: ReactComponentClass[PinProps] = default
}
