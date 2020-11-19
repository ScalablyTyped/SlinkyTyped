package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerKey extends js.Object {
  
  def account(): LedgerKeyAccount = js.native
  def account(value: LedgerKeyAccount): LedgerKeyAccount = js.native
  
  def data(): LedgerKeyData = js.native
  def data(value: LedgerKeyData): LedgerKeyData = js.native
  
  def offer(): LedgerKeyOffer = js.native
  def offer(value: LedgerKeyOffer): LedgerKeyOffer = js.native
  
  def switch(): LedgerEntryType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def trustLine(): LedgerKeyTrustLine = js.native
  def trustLine(value: LedgerKeyTrustLine): LedgerKeyTrustLine = js.native
  
  def value(): LedgerKeyAccount | LedgerKeyTrustLine | LedgerKeyOffer | LedgerKeyData = js.native
}
