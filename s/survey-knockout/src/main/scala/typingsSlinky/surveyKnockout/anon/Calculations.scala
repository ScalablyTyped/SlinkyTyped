package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calculations extends js.Object {
  
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.native
  
  var includeEmpty: js.UndefOr[Boolean] = js.native
}
object Calculations {
  
  @scala.inline
  def apply(): Calculations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calculations]
  }
  
  @scala.inline
  implicit class CalculationsOps[Self <: Calculations] (val x: Self) extends AnyVal {
    
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
    def setCalculationsVarargs(value: PropertyName*): Self = this.set("calculations", js.Array(value :_*))
    
    @scala.inline
    def setCalculations(value: js.Array[PropertyName]): Self = this.set("calculations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculations: Self = this.set("calculations", js.undefined)
    
    @scala.inline
    def setIncludeEmpty(value: Boolean): Self = this.set("includeEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmpty: Self = this.set("includeEmpty", js.undefined)
  }
}
