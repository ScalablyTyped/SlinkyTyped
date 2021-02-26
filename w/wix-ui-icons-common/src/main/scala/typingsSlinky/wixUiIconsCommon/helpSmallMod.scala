package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HelpSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HelpSmallProps] = js.native
  
  @js.native
  trait HelpSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HelpSmallProps {
    
    @scala.inline
    def apply(): HelpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpSmallProps]
    }
    
    @scala.inline
    implicit class HelpSmallPropsMutableBuilder[Self <: HelpSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HelpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpSmallMod.foo` */
  override def _to: ReactComponentClass[HelpSmallProps] = default
}
