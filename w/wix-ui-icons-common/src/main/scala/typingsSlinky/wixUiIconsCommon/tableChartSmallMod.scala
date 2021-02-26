package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableChartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TableChartSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableChartSmallProps] = js.native
  
  @js.native
  trait TableChartSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TableChartSmallProps {
    
    @scala.inline
    def apply(): TableChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartSmallProps]
    }
    
    @scala.inline
    implicit class TableChartSmallPropsMutableBuilder[Self <: TableChartSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TableChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableChartSmallMod.foo` */
  override def _to: ReactComponentClass[TableChartSmallProps] = default
}
