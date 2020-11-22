package typingsSlinky.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds_ extends js.Object {
  
  @JSName("ne")
  var ne_FBounds_ : Point = js.native
  
  var sw: Point = js.native
}
object Bounds_ {
  
  @scala.inline
  def apply(ne: Point, sw: Point): Bounds_ = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds_]
  }
  
  @scala.inline
  implicit class Bounds_Ops[Self <: Bounds_] (val x: Self) extends AnyVal {
    
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
    def setNe(value: Point): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: Point): Self = this.set("sw", value.asInstanceOf[js.Any])
  }
}
