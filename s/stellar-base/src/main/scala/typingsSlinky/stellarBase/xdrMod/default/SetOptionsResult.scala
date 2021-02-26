package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.SetOptionsResult")
@js.native
class SetOptionsResult ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult
object SetOptionsResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.setOptionsSuccess")
  @js.native
  def setOptionsSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SetOptionsResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult, io: Buffer): Unit = js.native
}
