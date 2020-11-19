package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <angle> which can be animated. */
@js.native
trait SVGAnimatedAngle extends js.Object {
  
  val animVal: org.scalajs.dom.raw.SVGAngle = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGAngle = js.native
}
object SVGAnimatedAngle {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGAngle, baseVal: org.scalajs.dom.raw.SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  
  @scala.inline
  implicit class SVGAnimatedAngleOps[Self <: org.scalajs.dom.raw.SVGAnimatedAngle] (val x: Self) extends AnyVal {
    
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
    def setAnimVal(value: org.scalajs.dom.raw.SVGAngle): Self = this.set("animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGAngle): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
}
