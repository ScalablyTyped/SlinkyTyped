package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionV0Ext")
@js.native
class TransactionV0Ext ()
  extends typingsSlinky.stellarBase.xdrMod.default.TransactionV0Ext
object TransactionV0Ext {
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.0")
  @js.native
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
}
