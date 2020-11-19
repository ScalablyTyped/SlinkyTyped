package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkStyle extends js.Object {
  
  val sheet: org.scalajs.dom.raw.CSSStyleSheet | Null = js.native
}
object LinkStyle {
  
  @scala.inline
  def apply(): LinkStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkStyle]
  }
  
  @scala.inline
  implicit class LinkStyleOps[Self <: org.scalajs.dom.raw.LinkStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSheet(value: org.scalajs.dom.raw.CSSStyleSheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNull: Self = this.set("sheet", null)
  }
}
