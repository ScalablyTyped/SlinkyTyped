package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Upgrade
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "UpgradeEntryMeta")
@js.native
class UpgradeEntryMeta protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta {
  def this(attributes: Upgrade) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "UpgradeEntryMeta")
@js.native
object UpgradeEntryMeta extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.UpgradeEntryMeta, io: Buffer): Unit = js.native
}

