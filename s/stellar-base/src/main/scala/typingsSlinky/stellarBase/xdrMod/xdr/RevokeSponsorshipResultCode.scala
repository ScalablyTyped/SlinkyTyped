package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipDoesNotExist
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipNotSponsor
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipOnlyTransferable
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSponsorshipResultCode extends StObject {
  
  val name: revokeSponsorshipSuccess | revokeSponsorshipDoesNotExist | revokeSponsorshipNotSponsor | revokeSponsorshipLowReserve | revokeSponsorshipOnlyTransferable = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` = js.native
}
object RevokeSponsorshipResultCode {
  
  @scala.inline
  def apply(
    name: revokeSponsorshipSuccess | revokeSponsorshipDoesNotExist | revokeSponsorshipNotSponsor | revokeSponsorshipLowReserve | revokeSponsorshipOnlyTransferable,
    value: `0` | `-1` | `-2` | `-3` | `-4`
  ): RevokeSponsorshipResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSponsorshipResultCode]
  }
  
  @scala.inline
  implicit class RevokeSponsorshipResultCodeMutableBuilder[Self <: RevokeSponsorshipResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: revokeSponsorshipSuccess | revokeSponsorshipDoesNotExist | revokeSponsorshipNotSponsor | revokeSponsorshipLowReserve | revokeSponsorshipOnlyTransferable
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
