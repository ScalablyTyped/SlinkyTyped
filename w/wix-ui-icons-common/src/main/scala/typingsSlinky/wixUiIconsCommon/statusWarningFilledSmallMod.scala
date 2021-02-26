package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusWarningFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusWarningFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusWarningFilledSmallProps] = js.native
  
  @js.native
  trait StatusWarningFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusWarningFilledSmallProps {
    
    @scala.inline
    def apply(): StatusWarningFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusWarningFilledSmallProps]
    }
    
    @scala.inline
    implicit class StatusWarningFilledSmallPropsMutableBuilder[Self <: StatusWarningFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusWarningFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusWarningFilledSmallMod.foo` */
  override def _to: ReactComponentClass[StatusWarningFilledSmallProps] = default
}
