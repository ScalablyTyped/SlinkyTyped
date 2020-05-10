package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceTemplate extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  /**
    * The identity that last modified this template
    */
  var lastModifiedBy: String = js.native
  /**
    * The last time this template was modified
    */
  var lastModifiedDate: js.Date = js.native
  /**
    * List of workspace mappings
    */
  var mappings: js.Array[WorkspaceMapping] = js.native
  /**
    * Id of the workspace for this template
    */
  var workspaceId: Double = js.native
}

object WorkspaceTemplate {
  @scala.inline
  def apply(
    definitionUri: String,
    lastModifiedBy: String,
    lastModifiedDate: js.Date,
    mappings: js.Array[WorkspaceMapping],
    workspaceId: Double
  ): WorkspaceTemplate = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTemplate]
  }
  @scala.inline
  implicit class WorkspaceTemplateOps[Self <: WorkspaceTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappings(value: js.Array[WorkspaceMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

