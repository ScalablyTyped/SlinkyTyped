package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.FeeCharged
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.InnerTransactionResult")
@js.native
class InnerTransactionResult protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.InnerTransactionResult {
  def this(attributes: FeeCharged) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.InnerTransactionResult")
@js.native
object InnerTransactionResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResult, io: Buffer): Unit = js.native
}
