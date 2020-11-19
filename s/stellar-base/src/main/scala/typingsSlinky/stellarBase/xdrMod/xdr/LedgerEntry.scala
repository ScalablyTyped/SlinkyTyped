package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerEntry extends js.Object {
  
  def data(): LedgerEntryData = js.native
  def data(value: LedgerEntryData): LedgerEntryData = js.native
  
  def ext(): LedgerEntryExt = js.native
  def ext(value: LedgerEntryExt): LedgerEntryExt = js.native
  
  def lastModifiedLedgerSeq(): Double = js.native
  def lastModifiedLedgerSeq(value: Double): Double = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
