package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends js.Object {
  
  var create: Boolean = js.native
  
  var overwrite: Boolean = js.native
}
object Create {
  
  @scala.inline
  def apply(create: Boolean, overwrite: Boolean): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
  }
}
