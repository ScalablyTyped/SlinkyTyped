package typingsSlinky.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiedLanguages. */
@js.native
trait IdentifiedLanguages extends js.Object {
  /** A ranking of identified languages with confidence scores. */
  var languages: js.Array[IdentifiedLanguage] = js.native
}

object IdentifiedLanguages {
  @scala.inline
  def apply(languages: js.Array[IdentifiedLanguage]): IdentifiedLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguages]
  }
  @scala.inline
  implicit class IdentifiedLanguagesOps[Self <: IdentifiedLanguages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: js.Array[IdentifiedLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

