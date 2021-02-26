package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.AccountEntryExt")
@js.native
class AccountEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt
object AccountEntryExt {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.0")
  @js.native
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.1")
  @js.native
  def `1`(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExtensionV1): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
}
