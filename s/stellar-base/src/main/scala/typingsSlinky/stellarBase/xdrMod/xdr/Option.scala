package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  def fromXDR(input: Buffer): js.Any = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): js.Any = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): js.Any = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): js.Any = js.native
  
  def isValid(value: js.Any): Boolean = js.native
  
  def read(io: Buffer): js.Any = js.native
  
  def toXDR(value: js.Any): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: js.Any, io: Buffer): Unit = js.native
}
