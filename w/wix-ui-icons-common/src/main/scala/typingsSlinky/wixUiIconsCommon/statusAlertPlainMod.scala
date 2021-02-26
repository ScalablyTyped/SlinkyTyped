package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusAlertPlainMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusAlertPlain", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusAlertPlainProps] = js.native
  
  @js.native
  trait StatusAlertPlainProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusAlertPlainProps {
    
    @scala.inline
    def apply(): StatusAlertPlainProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusAlertPlainProps]
    }
    
    @scala.inline
    implicit class StatusAlertPlainPropsMutableBuilder[Self <: StatusAlertPlainProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusAlertPlainProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusAlertPlainMod.foo` */
  override def _to: ReactComponentClass[StatusAlertPlainProps] = default
}
