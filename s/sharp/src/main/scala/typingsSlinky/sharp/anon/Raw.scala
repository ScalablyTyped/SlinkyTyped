package typingsSlinky.sharp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Raw extends js.Object {
  
  var raw: typingsSlinky.sharp.mod.Raw = js.native
}
object Raw {
  
  @scala.inline
  def apply(raw: typingsSlinky.sharp.mod.Raw): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  @scala.inline
  implicit class RawOps[Self <: Raw] (val x: Self) extends AnyVal {
    
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
    def setRaw(value: typingsSlinky.sharp.mod.Raw): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
}
