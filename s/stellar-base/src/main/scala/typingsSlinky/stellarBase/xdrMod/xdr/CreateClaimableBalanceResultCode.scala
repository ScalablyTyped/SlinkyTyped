package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalanceLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalanceMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalanceNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalanceNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalanceSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalanceUnderfunded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClaimableBalanceResultCode extends js.Object {
  
  val name: createClaimableBalanceSuccess | createClaimableBalanceMalformed | createClaimableBalanceLowReserve | createClaimableBalanceNoTrust | createClaimableBalanceNotAuthorized | createClaimableBalanceUnderfunded = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}
object CreateClaimableBalanceResultCode {
  
  @scala.inline
  def apply(
    name: createClaimableBalanceSuccess | createClaimableBalanceMalformed | createClaimableBalanceLowReserve | createClaimableBalanceNoTrust | createClaimableBalanceNotAuthorized | createClaimableBalanceUnderfunded,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): CreateClaimableBalanceResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClaimableBalanceResultCode]
  }
  
  @scala.inline
  implicit class CreateClaimableBalanceResultCodeOps[Self <: CreateClaimableBalanceResultCode] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: createClaimableBalanceSuccess | createClaimableBalanceMalformed | createClaimableBalanceLowReserve | createClaimableBalanceNoTrust | createClaimableBalanceNotAuthorized | createClaimableBalanceUnderfunded
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
