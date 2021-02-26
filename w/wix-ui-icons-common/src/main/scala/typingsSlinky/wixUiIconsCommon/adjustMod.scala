package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adjustMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Adjust", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AdjustProps] = js.native
  
  @js.native
  trait AdjustProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AdjustProps {
    
    @scala.inline
    def apply(): AdjustProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustProps]
    }
    
    @scala.inline
    implicit class AdjustPropsMutableBuilder[Self <: AdjustProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AdjustProps]
  
  /* This means you don't have to write `default`, but can instead just say `adjustMod.foo` */
  override def _to: ReactComponentClass[AdjustProps] = default
}
