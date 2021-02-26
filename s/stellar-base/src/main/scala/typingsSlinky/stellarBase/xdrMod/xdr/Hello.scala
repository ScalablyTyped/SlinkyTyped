package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hello extends StObject {
  
  def cert(): AuthCert = js.native
  def cert(value: AuthCert): AuthCert = js.native
  
  def ledgerVersion(): Double = js.native
  def ledgerVersion(value: Double): Double = js.native
  
  def listeningPort(): Double = js.native
  def listeningPort(value: Double): Double = js.native
  
  def networkId(): Buffer = js.native
  def networkId(value: Buffer): Buffer = js.native
  
  def nonce(): Buffer = js.native
  def nonce(value: Buffer): Buffer = js.native
  
  def overlayMinVersion(): Double = js.native
  def overlayMinVersion(value: Double): Double = js.native
  
  def overlayVersion(): Double = js.native
  def overlayVersion(value: Double): Double = js.native
  
  def peerId(): NodeId = js.native
  def peerId(value: NodeId): NodeId = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def versionStr(): String | Buffer = js.native
  def versionStr(value: String): String | Buffer = js.native
  def versionStr(value: Buffer): String | Buffer = js.native
}
