package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HelpCircleSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HelpCircleSmallProps] = js.native
  
  @js.native
  trait HelpCircleSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HelpCircleSmallProps {
    
    @scala.inline
    def apply(): HelpCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpCircleSmallProps]
    }
    
    @scala.inline
    implicit class HelpCircleSmallPropsMutableBuilder[Self <: HelpCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HelpCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpCircleSmallMod.foo` */
  override def _to: ReactComponentClass[HelpCircleSmallProps] = default
}
