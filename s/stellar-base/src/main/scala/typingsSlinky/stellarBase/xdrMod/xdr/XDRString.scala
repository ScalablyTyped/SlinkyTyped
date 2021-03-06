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
trait XDRString extends StObject {
  
  def fromXDR(input: Buffer): Buffer = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): Buffer = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): Buffer = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): Buffer = js.native
  
  def isValid(value: String): Boolean = js.native
  def isValid(value: js.Array[Double]): Boolean = js.native
  def isValid(value: Buffer): Boolean = js.native
  
  def read(io: Buffer): Buffer = js.native
  
  def readString(io: Buffer): String = js.native
  
  def toXDR(value: String): Buffer = js.native
  def toXDR(value: Buffer): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: String, io: Buffer): Unit = js.native
  def write(value: Buffer, io: Buffer): Unit = js.native
}
