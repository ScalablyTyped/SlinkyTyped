package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Upgrade
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.UpgradeEntryMeta")
@js.native
class UpgradeEntryMeta protected ()
  extends typingsSlinky.stellarBase.mod.xdr.UpgradeEntryMeta {
  def this(attributes: Upgrade) = this()
}
object UpgradeEntryMeta {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UpgradeEntryMeta.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta, io: Buffer): Unit = js.native
}
