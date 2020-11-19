package typingsSlinky.sipJs.registererUnregisterOptionsMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistererUnregisterOptions extends js.Object {
  
  /**
    * If true, unregister all contacts.
    * @defaultValue false
    */
  var all: js.UndefOr[Boolean] = js.native
  
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
}
object RegistererUnregisterOptions {
  
  @scala.inline
  def apply(): RegistererUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistererUnregisterOptions]
  }
  
  @scala.inline
  implicit class RegistererUnregisterOptionsOps[Self <: RegistererUnregisterOptions] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setRequestDelegate(value: OutgoingRequestDelegate): Self = this.set("requestDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDelegate: Self = this.set("requestDelegate", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
  }
}
