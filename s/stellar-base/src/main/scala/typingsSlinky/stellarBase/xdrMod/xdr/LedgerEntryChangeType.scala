package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseStrings.ledgerEntryCreated
import typingsSlinky.stellarBase.stellarBaseStrings.ledgerEntryRemoved
import typingsSlinky.stellarBase.stellarBaseStrings.ledgerEntryState
import typingsSlinky.stellarBase.stellarBaseStrings.ledgerEntryUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerEntryChangeType extends StObject {
  
  val name: ledgerEntryCreated | ledgerEntryUpdated | ledgerEntryRemoved | ledgerEntryState = js.native
  
  val value: `0` | `1` | `2` | `3` = js.native
}
object LedgerEntryChangeType {
  
  @scala.inline
  def apply(
    name: ledgerEntryCreated | ledgerEntryUpdated | ledgerEntryRemoved | ledgerEntryState,
    value: `0` | `1` | `2` | `3`
  ): LedgerEntryChangeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerEntryChangeType]
  }
  
  @scala.inline
  implicit class LedgerEntryChangeTypeMutableBuilder[Self <: LedgerEntryChangeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ledgerEntryCreated | ledgerEntryUpdated | ledgerEntryRemoved | ledgerEntryState): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
