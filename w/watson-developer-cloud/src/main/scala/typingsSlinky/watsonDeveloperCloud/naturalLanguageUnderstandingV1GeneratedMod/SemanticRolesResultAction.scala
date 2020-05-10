package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted action from the sentence. */
@js.native
trait SemanticRolesResultAction extends js.Object {
  /** normalized version of the action. */
  var normalized: js.UndefOr[String] = js.native
  /** Analyzed text that corresponds to the action. */
  var text: js.UndefOr[String] = js.native
  var verb: js.UndefOr[SemanticRolesVerb] = js.native
}

object SemanticRolesResultAction {
  @scala.inline
  def apply(): SemanticRolesResultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultAction]
  }
  @scala.inline
  implicit class SemanticRolesResultActionOps[Self <: SemanticRolesResultAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalized")(js.undefined)
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
    @scala.inline
    def withVerb(value: SemanticRolesVerb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
  }
  
}

