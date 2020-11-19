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
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsBadFlag
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsBadSigner
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsCantChange
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsInvalidHomeDomain
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsInvalidInflation
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsThresholdOutOfRange
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsTooManySigner
import typingsSlinky.stellarBase.stellarBaseStrings.setOptionsUnknownFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptionsResultCode extends js.Object {
  
  val name: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigner | setOptionsBadFlag | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` = js.native
}
object SetOptionsResultCode {
  
  @scala.inline
  def apply(
    name: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigner | setOptionsBadFlag | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`
  ): SetOptionsResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptionsResultCode]
  }
  
  @scala.inline
  implicit class SetOptionsResultCodeOps[Self <: SetOptionsResultCode] (val x: Self) extends AnyVal {
    
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
      value: setOptionsSuccess | setOptionsLowReserve | setOptionsTooManySigner | setOptionsBadFlag | setOptionsInvalidInflation | setOptionsCantChange | setOptionsUnknownFlag | setOptionsThresholdOutOfRange | setOptionsBadSigner | setOptionsInvalidHomeDomain
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
