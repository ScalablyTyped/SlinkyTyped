package typingsSlinky.through2Map.mod

import typingsSlinky.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Through2MapOptions extends DuplexOptions {
  
  var wantStrings: js.UndefOr[Boolean] = js.native
}
object Through2MapOptions {
  
  @scala.inline
  def apply(): Through2MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Through2MapOptions]
  }
  
  @scala.inline
  implicit class Through2MapOptionsOps[Self <: Through2MapOptions] (val x: Self) extends AnyVal {
    
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
    def setWantStrings(value: Boolean): Self = this.set("wantStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWantStrings: Self = this.set("wantStrings", js.undefined)
  }
}
