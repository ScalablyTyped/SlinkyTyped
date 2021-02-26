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
trait BucketEntry extends StObject {
  
  def deadEntry(): LedgerKey = js.native
  def deadEntry(value: LedgerKey): LedgerKey = js.native
  
  def liveEntry(): LedgerEntry = js.native
  def liveEntry(value: LedgerEntry): LedgerEntry = js.native
  
  def metaEntry(): BucketMetadata = js.native
  def metaEntry(value: BucketMetadata): BucketMetadata = js.native
  
  def switch(): BucketEntryType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): LedgerEntry | LedgerKey | BucketMetadata = js.native
}
