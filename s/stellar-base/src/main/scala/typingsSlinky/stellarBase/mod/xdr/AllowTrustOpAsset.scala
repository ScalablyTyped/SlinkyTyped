package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.AllowTrustOpAsset")
@js.native
class AllowTrustOpAsset ()
  extends typingsSlinky.stellarBase.xdrMod.default.AllowTrustOpAsset
object AllowTrustOpAsset {
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.assetTypeCreditAlphanum12")
  @js.native
  def assetTypeCreditAlphanum12(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.assetTypeCreditAlphanum4")
  @js.native
  def assetTypeCreditAlphanum4(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AllowTrustOpAsset.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset, io: Buffer): Unit = js.native
}
