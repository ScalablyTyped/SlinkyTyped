package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFitToViewBox extends js.Object {
  
  val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio = js.native
  
  val viewBox: org.scalajs.dom.raw.SVGAnimatedRect = js.native
}
object SVGFitToViewBox {
  
  @scala.inline
  def apply(
    preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio,
    viewBox: org.scalajs.dom.raw.SVGAnimatedRect
  ): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
  
  @scala.inline
  implicit class SVGFitToViewBoxOps[Self <: org.scalajs.dom.raw.SVGFitToViewBox] (val x: Self) extends AnyVal {
    
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
    def setPreserveAspectRatio(value: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: org.scalajs.dom.raw.SVGAnimatedRect): Self = this.set("viewBox", value.asInstanceOf[js.Any])
  }
}
