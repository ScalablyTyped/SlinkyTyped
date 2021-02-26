package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusStopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusStop", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusStopProps] = js.native
  
  @js.native
  trait StatusStopProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusStopProps {
    
    @scala.inline
    def apply(): StatusStopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopProps]
    }
    
    @scala.inline
    implicit class StatusStopPropsMutableBuilder[Self <: StatusStopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusStopProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusStopMod.foo` */
  override def _to: ReactComponentClass[StatusStopProps] = default
}
