package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`6`
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeAuth
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeOpId
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeScp
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeScpvalue
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeTx
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeTxFeeBump
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeTxV0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeType extends StObject {
  
  val name: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump | envelopeTypeOpId = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` | `6` = js.native
}
object EnvelopeType {
  
  @scala.inline
  def apply(
    name: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump | envelopeTypeOpId,
    value: `0` | `1` | `2` | `3` | `4` | `5` | `6`
  ): EnvelopeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopeType]
  }
  
  @scala.inline
  implicit class EnvelopeTypeMutableBuilder[Self <: EnvelopeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump | envelopeTypeOpId
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
