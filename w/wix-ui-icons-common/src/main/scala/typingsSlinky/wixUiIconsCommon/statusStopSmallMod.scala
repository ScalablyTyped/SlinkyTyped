package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusStopSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusStopSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusStopSmallProps] = js.native
  
  @js.native
  trait StatusStopSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusStopSmallProps {
    
    @scala.inline
    def apply(): StatusStopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopSmallProps]
    }
    
    @scala.inline
    implicit class StatusStopSmallPropsMutableBuilder[Self <: StatusStopSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusStopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusStopSmallMod.foo` */
  override def _to: ReactComponentClass[StatusStopSmallProps] = default
}
