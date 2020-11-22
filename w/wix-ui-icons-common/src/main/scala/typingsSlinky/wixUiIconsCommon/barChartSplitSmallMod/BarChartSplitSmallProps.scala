package typingsSlinky.wixUiIconsCommon.barChartSplitSmallMod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarChartSplitSmallProps extends SVGAttributes[SVGElement] {
  
  var size: js.UndefOr[String] = js.native
}
object BarChartSplitSmallProps {
  
  @scala.inline
  def apply(): BarChartSplitSmallProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarChartSplitSmallProps]
  }
  
  @scala.inline
  implicit class BarChartSplitSmallPropsOps[Self <: BarChartSplitSmallProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
