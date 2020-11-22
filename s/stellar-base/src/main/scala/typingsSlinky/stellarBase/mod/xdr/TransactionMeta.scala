package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionMeta")
@js.native
class TransactionMeta ()
  extends typingsSlinky.stellarBase.xdrMod.default.TransactionMeta
/* static members */
@JSImport("stellar-base", "xdr.TransactionMeta")
@js.native
object TransactionMeta extends js.Object {
  
  def `0`(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta]): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  def `1`(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV1): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  def `2`(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMeta, io: Buffer): Unit = js.native
}
