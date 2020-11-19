package typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingRangeRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
     with StaticRegistrationOptions
object FoldingRangeRegistrationOptions {
  
  @scala.inline
  def apply(): FoldingRangeRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRangeRegistrationOptions]
  }
}
