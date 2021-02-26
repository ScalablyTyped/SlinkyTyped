package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseStrings.errAuth
import typingsSlinky.stellarBase.stellarBaseStrings.errConf
import typingsSlinky.stellarBase.stellarBaseStrings.errData
import typingsSlinky.stellarBase.stellarBaseStrings.errLoad
import typingsSlinky.stellarBase.stellarBaseStrings.errMisc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCode extends StObject {
  
  val name: errMisc | errData | errConf | errAuth | errLoad = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object ErrorCode {
  
  @scala.inline
  def apply(name: errMisc | errData | errConf | errAuth | errLoad, value: `0` | `1` | `2` | `3` | `4`): ErrorCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
  
  @scala.inline
  implicit class ErrorCodeMutableBuilder[Self <: ErrorCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: errMisc | errData | errConf | errAuth | errLoad): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
