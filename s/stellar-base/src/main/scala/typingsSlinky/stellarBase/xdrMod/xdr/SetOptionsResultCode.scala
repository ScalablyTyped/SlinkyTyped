package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-7`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-8`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-9`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsBadFlags
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsBadSigner
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsCantChange
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsInvalidHomeDomain
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsInvalidInflation
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsThresholdOutOfRange
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsTooManySigners
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsUnknownFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptionsResultCode extends StObject {
  
  val name: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigners | setOptionsBadFlags | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` = js.native
}
object SetOptionsResultCode {
  
  @scala.inline
  def apply(
    name: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigners | setOptionsBadFlags | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`
  ): SetOptionsResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptionsResultCode]
  }
  
  @scala.inline
  implicit class SetOptionsResultCodeMutableBuilder[Self <: SetOptionsResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigners | setOptionsBadFlags | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
