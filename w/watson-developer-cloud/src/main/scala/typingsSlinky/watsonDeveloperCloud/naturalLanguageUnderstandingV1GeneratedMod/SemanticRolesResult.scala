package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The object containing the actions and the objects the actions act upon. */
@js.native
trait SemanticRolesResult extends js.Object {
  /** The extracted action from the sentence. */
  var action: js.UndefOr[SemanticRolesResultAction] = js.native
  /** The extracted object from the sentence. */
  var `object`: js.UndefOr[SemanticRolesResultObject] = js.native
  /** Sentence from the source that contains the subject, action, and object. */
  var sentence: js.UndefOr[String] = js.native
  /** The extracted subject from the sentence. */
  var subject: js.UndefOr[SemanticRolesResultSubject] = js.native
}

object SemanticRolesResult {
  @scala.inline
  def apply(): SemanticRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResult]
  }
  @scala.inline
  implicit class SemanticRolesResultOps[Self <: SemanticRolesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: SemanticRolesResultAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: SemanticRolesResultObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withSentence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentence")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: SemanticRolesResultSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

