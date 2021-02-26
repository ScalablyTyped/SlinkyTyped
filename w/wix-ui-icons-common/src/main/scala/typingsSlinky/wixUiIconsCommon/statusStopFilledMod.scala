package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusStopFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusStopFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusStopFilledProps] = js.native
  
  @js.native
  trait StatusStopFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusStopFilledProps {
    
    @scala.inline
    def apply(): StatusStopFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopFilledProps]
    }
    
    @scala.inline
    implicit class StatusStopFilledPropsMutableBuilder[Self <: StatusStopFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusStopFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusStopFilledMod.foo` */
  override def _to: ReactComponentClass[StatusStopFilledProps] = default
}
