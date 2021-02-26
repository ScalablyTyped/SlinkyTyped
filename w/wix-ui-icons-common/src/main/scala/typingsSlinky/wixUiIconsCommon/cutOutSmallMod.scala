package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cutOutSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CutOutSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CutOutSmallProps] = js.native
  
  @js.native
  trait CutOutSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CutOutSmallProps {
    
    @scala.inline
    def apply(): CutOutSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutOutSmallProps]
    }
    
    @scala.inline
    implicit class CutOutSmallPropsMutableBuilder[Self <: CutOutSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CutOutSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cutOutSmallMod.foo` */
  override def _to: ReactComponentClass[CutOutSmallProps] = default
}
