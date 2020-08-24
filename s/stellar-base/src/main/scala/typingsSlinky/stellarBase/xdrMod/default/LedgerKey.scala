package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "LedgerKey")
@js.native
class LedgerKey ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey

/* static members */
@JSImport("stellar-base/types/xdr", "LedgerKey")
@js.native
object LedgerKey extends js.Object {
  def account(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  def datum(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): Boolean = js.native
  def offer(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyOffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): Buffer = js.native
  def trustline(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey, io: Buffer): Unit = js.native
}

