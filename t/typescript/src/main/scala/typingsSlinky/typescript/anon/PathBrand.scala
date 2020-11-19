package typingsSlinky.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathBrand extends js.Object {
  
  var __pathBrand: js.Any = js.native
}
object PathBrand {
  
  @scala.inline
  def apply(__pathBrand: js.Any): PathBrand = {
    val __obj = js.Dynamic.literal(__pathBrand = __pathBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBrand]
  }
  
  @scala.inline
  implicit class PathBrandOps[Self <: PathBrand] (val x: Self) extends AnyVal {
    
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
    def set__pathBrand(value: js.Any): Self = this.set("__pathBrand", value.asInstanceOf[js.Any])
  }
}
