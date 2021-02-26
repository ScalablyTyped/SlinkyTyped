package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartSplitSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LineChartSplitSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LineChartSplitSmallProps] = js.native
  
  @js.native
  trait LineChartSplitSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LineChartSplitSmallProps {
    
    @scala.inline
    def apply(): LineChartSplitSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartSplitSmallProps]
    }
    
    @scala.inline
    implicit class LineChartSplitSmallPropsMutableBuilder[Self <: LineChartSplitSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LineChartSplitSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineChartSplitSmallMod.foo` */
  override def _to: ReactComponentClass[LineChartSplitSmallProps] = default
}
