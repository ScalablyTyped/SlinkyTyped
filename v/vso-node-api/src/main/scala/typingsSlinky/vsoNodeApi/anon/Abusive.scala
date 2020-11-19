package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abusive extends js.Object {
  
  var abusive: scala.Double = js.native
  
  var general: scala.Double = js.native
  
  var spam: scala.Double = js.native
}
object Abusive {
  
  @scala.inline
  def apply(abusive: scala.Double, general: scala.Double, spam: scala.Double): Abusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abusive]
  }
  
  @scala.inline
  implicit class AbusiveOps[Self <: Abusive] (val x: Self) extends AnyVal {
    
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
    def setAbusive(value: scala.Double): Self = this.set("abusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneral(value: scala.Double): Self = this.set("general", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpam(value: scala.Double): Self = this.set("spam", value.asInstanceOf[js.Any])
  }
}
