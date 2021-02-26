package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseStrings.deadentry
import typingsSlinky.stellarBase.stellarBaseStrings.initentry
import typingsSlinky.stellarBase.stellarBaseStrings.liveentry
import typingsSlinky.stellarBase.stellarBaseStrings.metaentry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketEntryType extends StObject {
  
  val name: metaentry | liveentry | deadentry | initentry = js.native
  
  val value: `-1` | `0` | `1` | `2` = js.native
}
object BucketEntryType {
  
  @scala.inline
  def apply(name: metaentry | liveentry | deadentry | initentry, value: `-1` | `0` | `1` | `2`): BucketEntryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEntryType]
  }
  
  @scala.inline
  implicit class BucketEntryTypeMutableBuilder[Self <: BucketEntryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: metaentry | liveentry | deadentry | initentry): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `-1` | `0` | `1` | `2`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
