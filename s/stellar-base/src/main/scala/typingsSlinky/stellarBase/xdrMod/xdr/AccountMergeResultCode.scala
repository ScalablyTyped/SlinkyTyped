package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-7`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeDestFull
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeHasSubEntries
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeImmutableSet
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeIsSponsor
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeNoAccount
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeSeqnumTooFar
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMergeResultCode extends StObject {
  
  val name: accountMergeSuccess | accountMergeMalformed | accountMergeNoAccount | accountMergeImmutableSet | accountMergeHasSubEntries | accountMergeSeqnumTooFar | accountMergeDestFull | accountMergeIsSponsor = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` = js.native
}
object AccountMergeResultCode {
  
  @scala.inline
  def apply(
    name: accountMergeSuccess | accountMergeMalformed | accountMergeNoAccount | accountMergeImmutableSet | accountMergeHasSubEntries | accountMergeSeqnumTooFar | accountMergeDestFull | accountMergeIsSponsor,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7`
  ): AccountMergeResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMergeResultCode]
  }
  
  @scala.inline
  implicit class AccountMergeResultCodeMutableBuilder[Self <: AccountMergeResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: accountMergeSuccess | accountMergeMalformed | accountMergeNoAccount | accountMergeImmutableSet | accountMergeHasSubEntries | accountMergeSeqnumTooFar | accountMergeDestFull | accountMergeIsSponsor
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
