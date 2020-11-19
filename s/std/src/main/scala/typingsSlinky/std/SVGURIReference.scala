package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGURIReference extends js.Object {
  
  val href: org.scalajs.dom.raw.SVGAnimatedString = js.native
}
object SVGURIReference {
  
  @scala.inline
  def apply(href: org.scalajs.dom.raw.SVGAnimatedString): SVGURIReference = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGURIReference]
  }
  
  @scala.inline
  implicit class SVGURIReferenceOps[Self <: org.scalajs.dom.raw.SVGURIReference] (val x: Self) extends AnyVal {
    
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
    def setHref(value: org.scalajs.dom.raw.SVGAnimatedString): Self = this.set("href", value.asInstanceOf[js.Any])
  }
}
