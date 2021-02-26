package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PieChart", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PieChartProps] = js.native
  
  @js.native
  trait PieChartProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PieChartProps {
    
    @scala.inline
    def apply(): PieChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieChartProps]
    }
    
    @scala.inline
    implicit class PieChartPropsMutableBuilder[Self <: PieChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PieChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `pieChartMod.foo` */
  override def _to: ReactComponentClass[PieChartProps] = default
}
