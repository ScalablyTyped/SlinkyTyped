package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.opBadAuth
import typingsSlinky.stellarBase.stellarBaseStrings.opExceededWorkLimit
import typingsSlinky.stellarBase.stellarBaseStrings.opInner
import typingsSlinky.stellarBase.stellarBaseStrings.opNoAccount
import typingsSlinky.stellarBase.stellarBaseStrings.opNotSupported
import typingsSlinky.stellarBase.stellarBaseStrings.opTooManySponsoring
import typingsSlinky.stellarBase.stellarBaseStrings.opTooManySubentries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationResultCode extends js.Object {
  
  val name: opInner | opBadAuth | opNoAccount | opNotSupported | opTooManySubentries | opExceededWorkLimit | opTooManySponsoring = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` = js.native
}
object OperationResultCode {
  
  @scala.inline
  def apply(
    name: opInner | opBadAuth | opNoAccount | opNotSupported | opTooManySubentries | opExceededWorkLimit | opTooManySponsoring,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6`
  ): OperationResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationResultCode]
  }
  
  @scala.inline
  implicit class OperationResultCodeOps[Self <: OperationResultCode] (val x: Self) extends AnyVal {
    
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
      value: opInner | opBadAuth | opNoAccount | opNotSupported | opTooManySubentries | opExceededWorkLimit | opTooManySponsoring
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
