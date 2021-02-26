package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ManageBuyOfferResult")
@js.native
class ManageBuyOfferResult ()
  extends typingsSlinky.stellarBase.xdrMod.default.ManageBuyOfferResult
object ManageBuyOfferResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.manageBuyOfferSuccess")
  @js.native
  def manageBuyOfferSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageBuyOfferResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult, io: Buffer): Unit = js.native
}
