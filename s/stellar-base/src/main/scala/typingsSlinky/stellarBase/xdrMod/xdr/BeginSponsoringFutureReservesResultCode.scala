package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesAlreadySponsored
import typingsSlinky.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesRecursive
import typingsSlinky.stellarBase.stellarBaseStrings.beginSponsoringFutureReservesSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReservesResultCode extends js.Object {
  
  val name: beginSponsoringFutureReservesSuccess | beginSponsoringFutureReservesMalformed | beginSponsoringFutureReservesAlreadySponsored | beginSponsoringFutureReservesRecursive = js.native
  
  val value: `0` | `-1` | `-2` | `-3` = js.native
}
object BeginSponsoringFutureReservesResultCode {
  
  @scala.inline
  def apply(
    name: beginSponsoringFutureReservesSuccess | beginSponsoringFutureReservesMalformed | beginSponsoringFutureReservesAlreadySponsored | beginSponsoringFutureReservesRecursive,
    value: `0` | `-1` | `-2` | `-3`
  ): BeginSponsoringFutureReservesResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginSponsoringFutureReservesResultCode]
  }
  
  @scala.inline
  implicit class BeginSponsoringFutureReservesResultCodeOps[Self <: BeginSponsoringFutureReservesResultCode] (val x: Self) extends AnyVal {
    
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
      value: beginSponsoringFutureReservesSuccess | beginSponsoringFutureReservesMalformed | beginSponsoringFutureReservesAlreadySponsored | beginSponsoringFutureReservesRecursive
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
