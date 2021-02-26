package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailClickSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailClickSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmailClickSmallProps] = js.native
  
  @js.native
  trait EmailClickSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailClickSmallProps {
    
    @scala.inline
    def apply(): EmailClickSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailClickSmallProps]
    }
    
    @scala.inline
    implicit class EmailClickSmallPropsMutableBuilder[Self <: EmailClickSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EmailClickSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailClickSmallMod.foo` */
  override def _to: ReactComponentClass[EmailClickSmallProps] = default
}
