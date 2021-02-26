package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseStrings.assetTypeCreditAlphanum12
import typingsSlinky.stellarBase.stellarBaseStrings.assetTypeCreditAlphanum4
import typingsSlinky.stellarBase.stellarBaseStrings.assetTypeNative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetType extends StObject {
  
  val name: assetTypeNative | assetTypeCreditAlphanum4 | assetTypeCreditAlphanum12 = js.native
  
  val value: `0` | `1` | `2` = js.native
}
object AssetType {
  
  @scala.inline
  def apply(
    name: assetTypeNative | assetTypeCreditAlphanum4 | assetTypeCreditAlphanum12,
    value: `0` | `1` | `2`
  ): AssetType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetType]
  }
  
  @scala.inline
  implicit class AssetTypeMutableBuilder[Self <: AssetType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: assetTypeNative | assetTypeCreditAlphanum4 | assetTypeCreditAlphanum12): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
