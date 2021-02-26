package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailOpenSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailOpenSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmailOpenSmallProps] = js.native
  
  @js.native
  trait EmailOpenSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailOpenSmallProps {
    
    @scala.inline
    def apply(): EmailOpenSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailOpenSmallProps]
    }
    
    @scala.inline
    implicit class EmailOpenSmallPropsMutableBuilder[Self <: EmailOpenSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EmailOpenSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailOpenSmallMod.foo` */
  override def _to: ReactComponentClass[EmailOpenSmallProps] = default
}
