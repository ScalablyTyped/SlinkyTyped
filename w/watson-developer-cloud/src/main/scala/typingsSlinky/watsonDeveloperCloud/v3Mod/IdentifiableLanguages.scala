package typingsSlinky.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiableLanguages. */
@js.native
trait IdentifiableLanguages extends js.Object {
  /** A list of all languages that the service can identify. */
  var languages: js.Array[IdentifiableLanguage] = js.native
}

object IdentifiableLanguages {
  @scala.inline
  def apply(languages: js.Array[IdentifiableLanguage]): IdentifiableLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiableLanguages]
  }
  @scala.inline
  implicit class IdentifiableLanguagesOps[Self <: IdentifiableLanguages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: js.Array[IdentifiableLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

