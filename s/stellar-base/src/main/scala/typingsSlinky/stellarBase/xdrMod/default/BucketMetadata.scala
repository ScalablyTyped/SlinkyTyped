package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.LedgerVersion
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "BucketMetadata")
@js.native
class BucketMetadata protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata {
  def this(attributes: LedgerVersion) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "BucketMetadata")
@js.native
object BucketMetadata extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata, io: Buffer): Unit = js.native
}

