package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseStrings.errAuth
import typingsSlinky.stellarBase.stellarBaseStrings.errConf
import typingsSlinky.stellarBase.stellarBaseStrings.errDatum
import typingsSlinky.stellarBase.stellarBaseStrings.errLoad
import typingsSlinky.stellarBase.stellarBaseStrings.errMisc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCode extends js.Object {
  
  val name: errMisc | errDatum | errConf | errAuth | errLoad = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object ErrorCode {
  
  @scala.inline
  def apply(name: errMisc | errDatum | errConf | errAuth | errLoad, value: `0` | `1` | `2` | `3` | `4`): ErrorCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
  
  @scala.inline
  implicit class ErrorCodeOps[Self <: ErrorCode] (val x: Self) extends AnyVal {
    
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
    def setName(value: errMisc | errDatum | errConf | errAuth | errLoad): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
