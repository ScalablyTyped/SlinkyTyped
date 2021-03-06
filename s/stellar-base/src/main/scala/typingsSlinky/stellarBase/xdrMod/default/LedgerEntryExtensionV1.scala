package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.SponsoringId
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1")
@js.native
class LedgerEntryExtensionV1 protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1 {
  def this(attributes: SponsoringId) = this()
}
object LedgerEntryExtensionV1 {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1 = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1 = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1 = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1 = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1 = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerEntryExtensionV1.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1, io: Buffer): Unit = js.native
}
