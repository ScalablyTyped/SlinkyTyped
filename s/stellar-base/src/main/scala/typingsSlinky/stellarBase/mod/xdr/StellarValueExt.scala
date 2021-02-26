package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.StellarValueExt")
@js.native
class StellarValueExt ()
  extends typingsSlinky.stellarBase.xdrMod.default.StellarValueExt
object StellarValueExt {
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.stellarValueBasic")
  @js.native
  def stellarValueBasic(): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.stellarValueSigned")
  @js.native
  def stellarValueSigned(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt, io: Buffer): Unit = js.native
}
