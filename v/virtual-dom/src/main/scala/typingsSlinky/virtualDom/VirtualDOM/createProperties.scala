package typingsSlinky.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait createProperties extends VProperties {
  
  var key: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
}
object createProperties {
  
  @scala.inline
  def apply(): createProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[createProperties]
  }
  
  @scala.inline
  implicit class createPropertiesOps[Self <: createProperties] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
}
