package typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionRangeRegistrationOptions
  extends WorkDoneProgressOptions
     with TextDocumentRegistrationOptions
     with StaticRegistrationOptions

object SelectionRangeRegistrationOptions {
  @scala.inline
  def apply(): SelectionRangeRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionRangeRegistrationOptions]
  }
}

