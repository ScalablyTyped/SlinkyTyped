package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeDestFull
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeHasSubEntry
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeImmutableSet
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeNoAccount
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeSeqnumTooFar
import typingsSlinky.stellarBase.stellarBaseStrings.accountMergeSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMergeResultCode extends js.Object {
  
  val name: accountMergeSuccess | accountMergeMalformed | accountMergeNoAccount | accountMergeImmutableSet | accountMergeHasSubEntry | accountMergeSeqnumTooFar | accountMergeDestFull = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` = js.native
}
object AccountMergeResultCode {
  
  @scala.inline
  def apply(
    name: accountMergeSuccess | accountMergeMalformed | accountMergeNoAccount | accountMergeImmutableSet | accountMergeHasSubEntry | accountMergeSeqnumTooFar | accountMergeDestFull,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6`
  ): AccountMergeResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMergeResultCode]
  }
  
  @scala.inline
  implicit class AccountMergeResultCodeOps[Self <: AccountMergeResultCode] (val x: Self) extends AnyVal {
    
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
      value: accountMergeSuccess | accountMergeMalformed | accountMergeNoAccount | accountMergeImmutableSet | accountMergeHasSubEntry | accountMergeSeqnumTooFar | accountMergeDestFull
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
