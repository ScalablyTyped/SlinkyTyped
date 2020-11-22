package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseStrings.account
import typingsSlinky.stellarBase.stellarBaseStrings.claimableBalance
import typingsSlinky.stellarBase.stellarBaseStrings.data
import typingsSlinky.stellarBase.stellarBaseStrings.offer
import typingsSlinky.stellarBase.stellarBaseStrings.trustline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerEntryType extends js.Object {
  
  val name: account | trustline | offer | data | claimableBalance = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object LedgerEntryType {
  
  @scala.inline
  def apply(name: account | trustline | offer | data | claimableBalance, value: `0` | `1` | `2` | `3` | `4`): LedgerEntryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerEntryType]
  }
  
  @scala.inline
  implicit class LedgerEntryTypeOps[Self <: LedgerEntryType] (val x: Self) extends AnyVal {
    
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
    def setName(value: account | trustline | offer | data | claimableBalance): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
