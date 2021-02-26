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
trait LedgerEntryChange extends StObject {
  
  def created(): LedgerEntry = js.native
  def created(value: LedgerEntry): LedgerEntry = js.native
  
  def removed(): LedgerKey = js.native
  def removed(value: LedgerKey): LedgerKey = js.native
  
  def state(): LedgerEntry = js.native
  def state(value: LedgerEntry): LedgerEntry = js.native
  
  def switch(): LedgerEntryChangeType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def updated(): LedgerEntry = js.native
  def updated(value: LedgerEntry): LedgerEntry = js.native
  
  def value(): LedgerEntry | LedgerKey = js.native
}
