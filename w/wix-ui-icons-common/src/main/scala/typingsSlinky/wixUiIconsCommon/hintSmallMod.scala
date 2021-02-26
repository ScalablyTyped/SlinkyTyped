package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hintSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HintSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HintSmallProps] = js.native
  
  @js.native
  trait HintSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HintSmallProps {
    
    @scala.inline
    def apply(): HintSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HintSmallProps]
    }
    
    @scala.inline
    implicit class HintSmallPropsMutableBuilder[Self <: HintSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HintSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `hintSmallMod.foo` */
  override def _to: ReactComponentClass[HintSmallProps] = default
}
