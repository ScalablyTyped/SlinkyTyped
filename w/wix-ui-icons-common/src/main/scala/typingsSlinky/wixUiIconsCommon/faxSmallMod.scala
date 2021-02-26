package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faxSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaxSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaxSmallProps] = js.native
  
  @js.native
  trait FaxSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaxSmallProps {
    
    @scala.inline
    def apply(): FaxSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaxSmallProps]
    }
    
    @scala.inline
    implicit class FaxSmallPropsMutableBuilder[Self <: FaxSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaxSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `faxSmallMod.foo` */
  override def _to: ReactComponentClass[FaxSmallProps] = default
}
