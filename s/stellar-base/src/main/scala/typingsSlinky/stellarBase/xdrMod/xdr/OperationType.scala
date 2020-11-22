package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`10`
import typingsSlinky.stellarBase.stellarBaseNumbers.`11`
import typingsSlinky.stellarBase.stellarBaseNumbers.`12`
import typingsSlinky.stellarBase.stellarBaseNumbers.`13`
import typingsSlinky.stellarBase.stellarBaseNumbers.`14`
import typingsSlinky.stellarBase.stellarBaseNumbers.`15`
import typingsSlinky.stellarBase.stellarBaseNumbers.`16`
import typingsSlinky.stellarBase.stellarBaseNumbers.`17`
import typingsSlinky.stellarBase.stellarBaseNumbers.`18`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`7`
import typingsSlinky.stellarBase.stellarBaseNumbers.`8`
import typingsSlinky.stellarBase.stellarBaseNumbers.`9`
import typingsSlinky.stellarBase.stellarBaseStrings.accountMerge
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrust
import typingsSlinky.stellarBase.stellarBaseStrings.beginSponsoringFutureReserves
import typingsSlinky.stellarBase.stellarBaseStrings.bumpSequence
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrust
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalance
import typingsSlinky.stellarBase.stellarBaseStrings.createAccount
import typingsSlinky.stellarBase.stellarBaseStrings.createClaimableBalance
import typingsSlinky.stellarBase.stellarBaseStrings.createPassiveSellOffer
import typingsSlinky.stellarBase.stellarBaseStrings.endSponsoringFutureReserves
import typingsSlinky.stellarBase.stellarBaseStrings.inflation
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOffer
import typingsSlinky.stellarBase.stellarBaseStrings.manageData
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOffer
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceive
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSend
import typingsSlinky.stellarBase.stellarBaseStrings.payment
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorship
import typingsSlinky.stellarBase.stellarBaseStrings.setOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationType extends js.Object {
  
  val name: createAccount | payment | pathPaymentStrictReceive | manageSellOffer | createPassiveSellOffer | setOptions | changeTrust | allowTrust | accountMerge | inflation | manageData | bumpSequence | manageBuyOffer | pathPaymentStrictSend | createClaimableBalance | claimClaimableBalance | beginSponsoringFutureReserves | endSponsoringFutureReserves | revokeSponsorship = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` = js.native
}
object OperationType {
  
  @scala.inline
  def apply(
    name: createAccount | payment | pathPaymentStrictReceive | manageSellOffer | createPassiveSellOffer | setOptions | changeTrust | allowTrust | accountMerge | inflation | manageData | bumpSequence | manageBuyOffer | pathPaymentStrictSend | createClaimableBalance | claimClaimableBalance | beginSponsoringFutureReserves | endSponsoringFutureReserves | revokeSponsorship,
    value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18`
  ): OperationType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationType]
  }
  
  @scala.inline
  implicit class OperationTypeOps[Self <: OperationType] (val x: Self) extends AnyVal {
    
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
      value: createAccount | payment | pathPaymentStrictReceive | manageSellOffer | createPassiveSellOffer | setOptions | changeTrust | allowTrust | accountMerge | inflation | manageData | bumpSequence | manageBuyOffer | pathPaymentStrictSend | createClaimableBalance | claimClaimableBalance | beginSponsoringFutureReserves | endSponsoringFutureReserves | revokeSponsorship
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18`
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
