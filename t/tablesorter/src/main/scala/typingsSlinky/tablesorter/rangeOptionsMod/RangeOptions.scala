package typingsSlinky.tablesorter.rangeOptionsMod

import typingsSlinky.tablesorter.intervalOptionsMod.IntervalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeOptions extends IntervalOptions {
  
  /**
    * The text indicating the whole range.
    */
  var allText: js.UndefOr[String] = js.native
}
object RangeOptions {
  
  @scala.inline
  def apply(): RangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOptions]
  }
  
  @scala.inline
  implicit class RangeOptionsOps[Self <: RangeOptions] (val x: Self) extends AnyVal {
    
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
    def setAllText(value: String): Self = this.set("allText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllText: Self = this.set("allText", js.undefined)
  }
}
