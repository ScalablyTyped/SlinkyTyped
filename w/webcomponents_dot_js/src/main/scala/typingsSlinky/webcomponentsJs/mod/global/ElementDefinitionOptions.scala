package typingsSlinky.webcomponentsJs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This contains duplicates of some types in lib.dom.d.ts in order to support typescript 2.0
@js.native
trait ElementDefinitionOptions extends js.Object {
  
  var `extends`: js.UndefOr[String] = js.native
}
object ElementDefinitionOptions {
  
  @scala.inline
  def apply(): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
  
  @scala.inline
  implicit class ElementDefinitionOptionsOps[Self <: ElementDefinitionOptions] (val x: Self) extends AnyVal {
    
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
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
  }
}
