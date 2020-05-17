package typingsSlinky.vscode.anon

import typingsSlinky.vscode.mod.ConfigurationScope
import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageId extends ConfigurationScope {
  var languageId: String = js.native
  var uri: js.UndefOr[Uri] = js.native
}

object LanguageId {
  @scala.inline
  def apply(languageId: String): LanguageId = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageId]
  }
  @scala.inline
  implicit class LanguageIdOps[Self <: LanguageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

