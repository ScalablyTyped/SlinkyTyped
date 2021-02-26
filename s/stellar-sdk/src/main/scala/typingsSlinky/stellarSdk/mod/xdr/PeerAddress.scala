package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Ip
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PeerAddress")
@js.native
class PeerAddress protected ()
  extends typingsSlinky.stellarBase.mod.xdr.PeerAddress {
  def this(attributes: Ip) = this()
}
object PeerAddress {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddress.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddress.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddress.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddress.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddress.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress, io: Buffer): Unit = js.native
}
