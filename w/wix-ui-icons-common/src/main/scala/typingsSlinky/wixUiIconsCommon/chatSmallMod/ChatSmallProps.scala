package typingsSlinky.wixUiIconsCommon.chatSmallMod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatSmallProps extends SVGAttributes[SVGElement] {
  
  var size: js.UndefOr[String] = js.native
}
object ChatSmallProps {
  
  @scala.inline
  def apply(): ChatSmallProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatSmallProps]
  }
  
  @scala.inline
  implicit class ChatSmallPropsOps[Self <: ChatSmallProps] (val x: Self) extends AnyVal {
    
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
