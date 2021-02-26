package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`5`
import typingsSlinky.stellarBase.stellarBaseStrings.claimPredicateAnd
import typingsSlinky.stellarBase.stellarBaseStrings.claimPredicateBeforeAbsoluteTime
import typingsSlinky.stellarBase.stellarBaseStrings.claimPredicateBeforeRelativeTime
import typingsSlinky.stellarBase.stellarBaseStrings.claimPredicateNot
import typingsSlinky.stellarBase.stellarBaseStrings.claimPredicateOr
import typingsSlinky.stellarBase.stellarBaseStrings.claimPredicateUnconditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimPredicateType extends StObject {
  
  val name: claimPredicateUnconditional | claimPredicateAnd | claimPredicateOr | claimPredicateNot | claimPredicateBeforeAbsoluteTime | claimPredicateBeforeRelativeTime = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` = js.native
}
object ClaimPredicateType {
  
  @scala.inline
  def apply(
    name: claimPredicateUnconditional | claimPredicateAnd | claimPredicateOr | claimPredicateNot | claimPredicateBeforeAbsoluteTime | claimPredicateBeforeRelativeTime,
    value: `0` | `1` | `2` | `3` | `4` | `5`
  ): ClaimPredicateType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimPredicateType]
  }
  
  @scala.inline
  implicit class ClaimPredicateTypeMutableBuilder[Self <: ClaimPredicateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: claimPredicateUnconditional | claimPredicateAnd | claimPredicateOr | claimPredicateNot | claimPredicateBeforeAbsoluteTime | claimPredicateBeforeRelativeTime
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
