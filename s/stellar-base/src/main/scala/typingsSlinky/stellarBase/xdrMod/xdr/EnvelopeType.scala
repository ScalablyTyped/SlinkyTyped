package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`5`
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeAuth
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeScp
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeScpvalue
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeTx
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeTxFeeBump
import typingsSlinky.stellarBase.stellarBaseStrings.envelopeTypeTxV0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeType extends js.Object {
  
  val name: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` = js.native
}
object EnvelopeType {
  
  @scala.inline
  def apply(
    name: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump,
    value: `0` | `1` | `2` | `3` | `4` | `5`
  ): EnvelopeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopeType]
  }
  
  @scala.inline
  implicit class EnvelopeTypeOps[Self <: EnvelopeType] (val x: Self) extends AnyVal {
    
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
      value: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
