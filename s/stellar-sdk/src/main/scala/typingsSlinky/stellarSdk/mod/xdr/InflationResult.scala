package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.InflationResult")
@js.native
class InflationResult ()
  extends typingsSlinky.stellarBase.mod.xdr.InflationResult
object InflationResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.inflationSuccess")
  @js.native
  def inflationSuccess(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout]): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult, io: Buffer): Unit = js.native
}
