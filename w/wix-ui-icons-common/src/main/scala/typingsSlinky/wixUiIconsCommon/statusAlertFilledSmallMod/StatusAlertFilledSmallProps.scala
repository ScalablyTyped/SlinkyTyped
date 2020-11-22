package typingsSlinky.wixUiIconsCommon.statusAlertFilledSmallMod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusAlertFilledSmallProps extends SVGAttributes[SVGElement] {
  
  var size: js.UndefOr[String] = js.native
}
object StatusAlertFilledSmallProps {
  
  @scala.inline
  def apply(): StatusAlertFilledSmallProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusAlertFilledSmallProps]
  }
  
  @scala.inline
  implicit class StatusAlertFilledSmallPropsOps[Self <: StatusAlertFilledSmallProps] (val x: Self) extends AnyVal {
    
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
