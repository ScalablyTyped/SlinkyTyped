package typingsSlinky.setCookieParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var decodeValues: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDecodeValues(value: Boolean): Self = this.set("decodeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeValues: Self = this.set("decodeValues", js.undefined)
    
    @scala.inline
    def setMap(value: Boolean): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
}
