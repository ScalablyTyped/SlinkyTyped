package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Result
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.InnerTransactionResultPair")
@js.native
class InnerTransactionResultPair protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.InnerTransactionResultPair {
  def this(attributes: Result) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.InnerTransactionResultPair")
@js.native
object InnerTransactionResultPair extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair, io: Buffer): Unit = js.native
}
