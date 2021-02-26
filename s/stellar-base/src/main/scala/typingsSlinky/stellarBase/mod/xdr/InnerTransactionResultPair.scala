package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Result
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.InnerTransactionResultPair")
@js.native
class InnerTransactionResultPair protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.InnerTransactionResultPair {
  def this(attributes: Result) = this()
}
object InnerTransactionResultPair {
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultPair.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair, io: Buffer): Unit = js.native
}
