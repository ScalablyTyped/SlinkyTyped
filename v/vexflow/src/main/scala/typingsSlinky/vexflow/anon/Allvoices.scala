package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allvoices extends js.Object {
  
  var all_voices: js.UndefOr[Boolean] = js.native
}
object Allvoices {
  
  @scala.inline
  def apply(): Allvoices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allvoices]
  }
  
  @scala.inline
  implicit class AllvoicesOps[Self <: Allvoices] (val x: Self) extends AnyVal {
    
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
    def setAll_voices(value: Boolean): Self = this.set("all_voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll_voices: Self = this.set("all_voices", js.undefined)
  }
}
