package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Cert
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.Hello")
@js.native
class Hello protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.Hello {
  def this(attributes: Cert) = this()
}
object Hello {
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  @JSImport("stellar-base", "xdr.Hello.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  @JSImport("stellar-base", "xdr.Hello.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.Hello.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.Hello.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hello.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello, io: Buffer): Unit = js.native
}
