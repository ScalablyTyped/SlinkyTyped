package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HeatmapChart", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HeatmapChartProps] = js.native
  
  @js.native
  trait HeatmapChartProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HeatmapChartProps {
    
    @scala.inline
    def apply(): HeatmapChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatmapChartProps]
    }
    
    @scala.inline
    implicit class HeatmapChartPropsMutableBuilder[Self <: HeatmapChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HeatmapChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `heatmapChartMod.foo` */
  override def _to: ReactComponentClass[HeatmapChartProps] = default
}
