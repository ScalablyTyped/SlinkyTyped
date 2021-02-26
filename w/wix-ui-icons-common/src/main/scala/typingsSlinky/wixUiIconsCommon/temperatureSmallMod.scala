package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object temperatureSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TemperatureSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TemperatureSmallProps] = js.native
  
  @js.native
  trait TemperatureSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TemperatureSmallProps {
    
    @scala.inline
    def apply(): TemperatureSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemperatureSmallProps]
    }
    
    @scala.inline
    implicit class TemperatureSmallPropsMutableBuilder[Self <: TemperatureSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TemperatureSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `temperatureSmallMod.foo` */
  override def _to: ReactComponentClass[TemperatureSmallProps] = default
}
