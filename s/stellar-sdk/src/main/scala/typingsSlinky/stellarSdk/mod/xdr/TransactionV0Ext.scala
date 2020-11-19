package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionV0Ext")
@js.native
class TransactionV0Ext ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionV0Ext
/* static members */
@JSImport("stellar-sdk", "xdr.TransactionV0Ext")
@js.native
object TransactionV0Ext extends js.Object {
  
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Ext, io: Buffer): Unit = js.native
}
