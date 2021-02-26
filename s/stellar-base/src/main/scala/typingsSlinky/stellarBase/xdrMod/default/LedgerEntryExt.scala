package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerEntryExt")
@js.native
class LedgerEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt
object LedgerEntryExt {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.0")
  @js.native
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExt.1")
  @js.native
  def `1`(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
}
