package typingsSlinky.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for lookups.
  */
@js.native
trait LookupOptionBase extends js.Object {
  
  /**
    * A value indicating whether globally installed packages should be ignored.
    */
  var localOnly: js.UndefOr[Boolean] = js.native
}
object LookupOptionBase {
  
  @scala.inline
  def apply(): LookupOptionBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptionBase]
  }
  
  @scala.inline
  implicit class LookupOptionBaseOps[Self <: LookupOptionBase] (val x: Self) extends AnyVal {
    
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
    def setLocalOnly(value: Boolean): Self = this.set("localOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalOnly: Self = this.set("localOnly", js.undefined)
  }
}
