package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipLedgerEntry
import typingsSlinky.stellarBase.stellarBaseStrings.revokeSponsorshipSigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSponsorshipType extends StObject {
  
  val name: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner = js.native
  
  val value: `0` | `1` = js.native
}
object RevokeSponsorshipType {
  
  @scala.inline
  def apply(name: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner, value: `0` | `1`): RevokeSponsorshipType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSponsorshipType]
  }
  
  @scala.inline
  implicit class RevokeSponsorshipTypeMutableBuilder[Self <: RevokeSponsorshipType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
