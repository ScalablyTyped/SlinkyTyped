package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseStrings.authImmutableFlag
import typingsSlinky.stellarBase.stellarBaseStrings.authRequiredFlag
import typingsSlinky.stellarBase.stellarBaseStrings.authRevocableFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountFlags extends js.Object {
  
  val name: authRequiredFlag | authRevocableFlag | authImmutableFlag = js.native
  
  val value: `1` | `2` | `4` = js.native
}
object AccountFlags {
  
  @scala.inline
  def apply(name: authRequiredFlag | authRevocableFlag | authImmutableFlag, value: `1` | `2` | `4`): AccountFlags = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountFlags]
  }
  
  @scala.inline
  implicit class AccountFlagsOps[Self <: AccountFlags] (val x: Self) extends AnyVal {
    
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
    def setName(value: authRequiredFlag | authRevocableFlag | authImmutableFlag): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `1` | `2` | `4`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
