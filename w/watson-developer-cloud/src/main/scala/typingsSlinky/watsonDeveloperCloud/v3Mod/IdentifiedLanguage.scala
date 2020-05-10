package typingsSlinky.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiedLanguage. */
@js.native
trait IdentifiedLanguage extends js.Object {
  /** The confidence score for the identified language. */
  var confidence: Double = js.native
  /** The language code for an identified language. */
  var language: String = js.native
}

object IdentifiedLanguage {
  @scala.inline
  def apply(confidence: Double, language: String): IdentifiedLanguage = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguage]
  }
  @scala.inline
  implicit class IdentifiedLanguageOps[Self <: IdentifiedLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

