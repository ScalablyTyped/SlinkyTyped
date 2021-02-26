package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseStrings.memoHash
import typingsSlinky.stellarBase.stellarBaseStrings.memoId
import typingsSlinky.stellarBase.stellarBaseStrings.memoNone
import typingsSlinky.stellarBase.stellarBaseStrings.memoReturn
import typingsSlinky.stellarBase.stellarBaseStrings.memoText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoType extends StObject {
  
  val name: memoNone | memoText | memoId | memoHash | memoReturn = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object MemoType {
  
  @scala.inline
  def apply(name: memoNone | memoText | memoId | memoHash | memoReturn, value: `0` | `1` | `2` | `3` | `4`): MemoType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoType]
  }
  
  @scala.inline
  implicit class MemoTypeMutableBuilder[Self <: MemoType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: memoNone | memoText | memoId | memoHash | memoReturn): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
