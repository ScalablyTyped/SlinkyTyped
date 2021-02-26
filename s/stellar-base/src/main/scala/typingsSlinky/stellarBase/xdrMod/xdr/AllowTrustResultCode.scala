package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustCantRevoke
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustNoTrustLine
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustSelfNotAllowed
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustTrustNotRequired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowTrustResultCode extends StObject {
  
  val name: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}
object AllowTrustResultCode {
  
  @scala.inline
  def apply(
    name: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): AllowTrustResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrustResultCode]
  }
  
  @scala.inline
  implicit class AllowTrustResultCodeMutableBuilder[Self <: AllowTrustResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
