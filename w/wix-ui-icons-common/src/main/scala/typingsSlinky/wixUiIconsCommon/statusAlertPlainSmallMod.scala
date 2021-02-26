package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusAlertPlainSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusAlertPlainSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusAlertPlainSmallProps] = js.native
  
  @js.native
  trait StatusAlertPlainSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusAlertPlainSmallProps {
    
    @scala.inline
    def apply(): StatusAlertPlainSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusAlertPlainSmallProps]
    }
    
    @scala.inline
    implicit class StatusAlertPlainSmallPropsMutableBuilder[Self <: StatusAlertPlainSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusAlertPlainSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusAlertPlainSmallMod.foo` */
  override def _to: ReactComponentClass[StatusAlertPlainSmallProps] = default
}
