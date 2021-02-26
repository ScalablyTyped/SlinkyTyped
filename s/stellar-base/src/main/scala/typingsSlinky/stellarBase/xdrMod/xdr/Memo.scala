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
trait Memo extends StObject {
  
  def hash(): Buffer = js.native
  def hash(value: Buffer): Buffer = js.native
  
  def id(): Uint64 = js.native
  def id(value: Uint64): Uint64 = js.native
  
  def retHash(): Buffer = js.native
  def retHash(value: Buffer): Buffer = js.native
  
  def switch(): MemoType = js.native
  
  def text(): String | Buffer = js.native
  def text(value: String): String | Buffer = js.native
  def text(value: Buffer): String | Buffer = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): String | Buffer | Uint64 | Unit = js.native
}
