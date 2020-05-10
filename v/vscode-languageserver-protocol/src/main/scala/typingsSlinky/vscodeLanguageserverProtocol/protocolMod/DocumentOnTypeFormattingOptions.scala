package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOnTypeFormattingOptions extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String = js.native
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.native
}

object DocumentOnTypeFormattingOptions {
  @scala.inline
  def apply(firstTriggerCharacter: String): DocumentOnTypeFormattingOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingOptions]
  }
  @scala.inline
  implicit class DocumentOnTypeFormattingOptionsOps[Self <: DocumentOnTypeFormattingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstTriggerCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTriggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreTriggerCharacter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreTriggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreTriggerCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreTriggerCharacter")(js.undefined)
        ret
    }
  }
  
}

