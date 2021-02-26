package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ScpStatementPledges")
@js.native
class ScpStatementPledges ()
  extends typingsSlinky.stellarBase.mod.xdr.ScpStatementPledges
object ScpStatementPledges {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.scpStConfirm")
  @js.native
  def scpStConfirm(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.scpStExternalize")
  @js.native
  def scpStExternalize(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementExternalize): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.scpStNominate")
  @js.native
  def scpStNominate(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.scpStPrepare")
  @js.native
  def scpStPrepare(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpStatementPledges.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPledges, io: Buffer): Unit = js.native
}
