package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Stop", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StopProps] = js.native
  
  @js.native
  trait StopProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StopProps {
    
    @scala.inline
    def apply(): StopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopProps]
    }
    
    @scala.inline
    implicit class StopPropsMutableBuilder[Self <: StopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StopProps]
  
  /* This means you don't have to write `default`, but can instead just say `stopMod.foo` */
  override def _to: ReactComponentClass[StopProps] = default
}
