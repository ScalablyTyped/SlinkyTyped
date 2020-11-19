package typingsSlinky.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Created extends js.Object {
  
  var created: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1` = js.native
  
  var updated: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1` = js.native
}
object Created {
  
  @scala.inline
  def apply(
    created: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`,
    updated: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
  ): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit class CreatedOps[Self <: Created] (val x: Self) extends AnyVal {
    
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
    def setCreated(
      value: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
    ): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(
      value: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
    ): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
