package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionRevision extends js.Object {
  /**
    * Gets api-version for revision object.
    */
  var apiVersion: String = js.native
  /**
    * Gets type of change.
    */
  var changeType: AuditAction = js.native
  /**
    * Gets the identity who did change.
    */
  var changedBy: IdentityRef = js.native
  /**
    * Gets date on which it got changed.
    */
  var changedDate: js.Date = js.native
  /**
    * Gets comments for revision.
    */
  var comment: String = js.native
  /**
    * Get id of the definition.
    */
  var definitionId: Double = js.native
  /**
    * Gets definition url.
    */
  var definitionUrl: String = js.native
  /**
    * Get revision number of the definition.
    */
  var revision: Double = js.native
}

object ReleaseDefinitionRevision {
  @scala.inline
  def apply(
    apiVersion: String,
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    definitionId: Double,
    definitionUrl: String,
    revision: Double
  ): ReleaseDefinitionRevision = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionRevision]
  }
  @scala.inline
  implicit class ReleaseDefinitionRevisionOps[Self <: ReleaseDefinitionRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionUrl")(value.asInstanceOf[js.Any])
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

