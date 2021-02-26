package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TableChart", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableChartProps] = js.native
  
  @js.native
  trait TableChartProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TableChartProps {
    
    @scala.inline
    def apply(): TableChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartProps]
    }
    
    @scala.inline
    implicit class TableChartPropsMutableBuilder[Self <: TableChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TableChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableChartMod.foo` */
  override def _to: ReactComponentClass[TableChartProps] = default
}
