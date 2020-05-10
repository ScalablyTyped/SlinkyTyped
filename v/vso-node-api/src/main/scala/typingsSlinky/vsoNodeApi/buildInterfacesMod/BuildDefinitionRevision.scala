package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinitionRevision extends js.Object {
  /**
    * The change type (add, edit, delete).
    */
  var changeType: AuditAction = js.native
  /**
    * The identity of the person or process that changed the definition.
    */
  var changedBy: IdentityRef = js.native
  /**
    * The date and time that the definition was changed.
    */
  var changedDate: js.Date = js.native
  /**
    * The comment associated with the change.
    */
  var comment: String = js.native
  /**
    * A link to the definition at this revision.
    */
  var definitionUrl: String = js.native
  /**
    * The name of the definition.
    */
  var name: String = js.native
  /**
    * The revision number.
    */
  var revision: Double = js.native
}

object BuildDefinitionRevision {
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    definitionUrl: String,
    name: String,
    revision: Double
  ): BuildDefinitionRevision = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionRevision]
  }
  @scala.inline
  implicit class BuildDefinitionRevisionOps[Self <: BuildDefinitionRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: AuditAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

