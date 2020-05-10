package typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRangeServerCapabilities extends js.Object {
  /**
    * The server provides folding provider support.
    */
  var foldingRangeProvider: js.UndefOr[
    Boolean | FoldingRangeProviderOptions | (FoldingRangeProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions)
  ] = js.native
}

object FoldingRangeServerCapabilities {
  @scala.inline
  def apply(): FoldingRangeServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRangeServerCapabilities]
  }
  @scala.inline
  implicit class FoldingRangeServerCapabilitiesOps[Self <: FoldingRangeServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoldingRangeProvider(
      value: Boolean | FoldingRangeProviderOptions | (FoldingRangeProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingRangeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldingRangeProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingRangeProvider")(js.undefined)
        ret
    }
  }
  
}

