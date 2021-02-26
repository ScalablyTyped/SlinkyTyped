package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AccountIdDataName
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerKeyData")
@js.native
class LedgerKeyData protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerKeyData {
  def this(attributes: AccountIdDataName) = this()
}
object LedgerKeyData {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  @JSImport("stellar-base", "xdr.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  @JSImport("stellar-base", "xdr.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerKeyData.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData, io: Buffer): Unit = js.native
}
