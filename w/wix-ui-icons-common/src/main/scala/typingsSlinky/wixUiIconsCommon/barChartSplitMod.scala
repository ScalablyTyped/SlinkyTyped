package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartSplitMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BarChartSplit", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BarChartSplitProps] = js.native
  
  @js.native
  trait BarChartSplitProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BarChartSplitProps {
    
    @scala.inline
    def apply(): BarChartSplitProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarChartSplitProps]
    }
    
    @scala.inline
    implicit class BarChartSplitPropsMutableBuilder[Self <: BarChartSplitProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BarChartSplitProps]
  
  /* This means you don't have to write `default`, but can instead just say `barChartSplitMod.foo` */
  override def _to: ReactComponentClass[BarChartSplitProps] = default
}
