package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Asset")
@js.native
class Asset ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.Asset
object Asset {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.assetTypeCreditAlphanum12")
  @js.native
  def assetTypeCreditAlphanum12(value: typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum12): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.assetTypeCreditAlphanum4")
  @js.native
  def assetTypeCreditAlphanum4(value: typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.assetTypeNative")
  @js.native
  def assetTypeNative(): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  @JSImport("stellar-base/types/xdr", "default.Asset.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  @JSImport("stellar-base/types/xdr", "default.Asset.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Asset.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Asset.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Asset.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset, io: Buffer): Unit = js.native
}
