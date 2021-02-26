package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object temperatureMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Temperature", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TemperatureProps] = js.native
  
  @js.native
  trait TemperatureProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TemperatureProps {
    
    @scala.inline
    def apply(): TemperatureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemperatureProps]
    }
    
    @scala.inline
    implicit class TemperaturePropsMutableBuilder[Self <: TemperatureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TemperatureProps]
  
  /* This means you don't have to write `default`, but can instead just say `temperatureMod.foo` */
  override def _to: ReactComponentClass[TemperatureProps] = default
}
