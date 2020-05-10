package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SemanticRolesVerb. */
@js.native
trait SemanticRolesVerb extends js.Object {
  /** Verb tense. */
  var tense: js.UndefOr[String] = js.native
  /** The keyword text. */
  var text: js.UndefOr[String] = js.native
}

object SemanticRolesVerb {
  @scala.inline
  def apply(): SemanticRolesVerb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesVerb]
  }
  @scala.inline
  implicit class SemanticRolesVerbOps[Self <: SemanticRolesVerb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tense")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

