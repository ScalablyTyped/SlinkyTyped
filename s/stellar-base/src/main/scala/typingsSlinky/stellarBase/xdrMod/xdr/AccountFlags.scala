package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseStrings.authImmutableFlag
import typingsSlinky.stellarBase.stellarBaseStrings.authRequiredFlag
import typingsSlinky.stellarBase.stellarBaseStrings.authRevocableFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountFlags extends StObject {
  
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
  implicit class AccountFlagsMutableBuilder[Self <: AccountFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: authRequiredFlag | authRevocableFlag | authImmutableFlag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `1` | `2` | `4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
