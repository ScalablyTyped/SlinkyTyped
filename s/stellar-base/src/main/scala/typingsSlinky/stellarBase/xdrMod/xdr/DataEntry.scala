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
trait DataEntry extends StObject {
  
  def accountId(): AccountId = js.native
  def accountId(value: AccountId): AccountId = js.native
  
  def dataName(): String | Buffer = js.native
  def dataName(value: String): String | Buffer = js.native
  def dataName(value: Buffer): String | Buffer = js.native
  
  def dataValue(): Buffer = js.native
  def dataValue(value: Buffer): Buffer = js.native
  
  def ext(): DataEntryExt = js.native
  def ext(value: DataEntryExt): DataEntryExt = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
