package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseStrings.thresholdHigh
import typingsSlinky.stellarBase.stellarBaseStrings.thresholdLow
import typingsSlinky.stellarBase.stellarBaseStrings.thresholdMasterWeight
import typingsSlinky.stellarBase.stellarBaseStrings.thresholdMed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThresholdIndices extends StObject {
  
  val name: thresholdMasterWeight | thresholdLow | thresholdMed | thresholdHigh = js.native
  
  val value: `0` | `1` | `2` | `3` = js.native
}
object ThresholdIndices {
  
  @scala.inline
  def apply(
    name: thresholdMasterWeight | thresholdLow | thresholdMed | thresholdHigh,
    value: `0` | `1` | `2` | `3`
  ): ThresholdIndices = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdIndices]
  }
  
  @scala.inline
  implicit class ThresholdIndicesMutableBuilder[Self <: ThresholdIndices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: thresholdMasterWeight | thresholdLow | thresholdMed | thresholdHigh): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
