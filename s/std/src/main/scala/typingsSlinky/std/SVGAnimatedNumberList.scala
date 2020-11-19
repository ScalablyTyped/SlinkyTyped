package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
@js.native
trait SVGAnimatedNumberList extends js.Object {
  
  val animVal: org.scalajs.dom.raw.SVGNumberList = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGNumberList = js.native
}
object SVGAnimatedNumberList {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGNumberList, baseVal: org.scalajs.dom.raw.SVGNumberList): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberListOps[Self <: org.scalajs.dom.raw.SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    
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
    def setAnimVal(value: org.scalajs.dom.raw.SVGNumberList): Self = this.set("animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGNumberList): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
}
