package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adjustSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AdjustSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AdjustSmallProps] = js.native
  
  @js.native
  trait AdjustSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AdjustSmallProps {
    
    @scala.inline
    def apply(): AdjustSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustSmallProps]
    }
    
    @scala.inline
    implicit class AdjustSmallPropsMutableBuilder[Self <: AdjustSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AdjustSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `adjustSmallMod.foo` */
  override def _to: ReactComponentClass[AdjustSmallProps] = default
}
