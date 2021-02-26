package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StopFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StopFilledProps] = js.native
  
  @js.native
  trait StopFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StopFilledProps {
    
    @scala.inline
    def apply(): StopFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopFilledProps]
    }
    
    @scala.inline
    implicit class StopFilledPropsMutableBuilder[Self <: StopFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StopFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `stopFilledMod.foo` */
  override def _to: ReactComponentClass[StopFilledProps] = default
}
