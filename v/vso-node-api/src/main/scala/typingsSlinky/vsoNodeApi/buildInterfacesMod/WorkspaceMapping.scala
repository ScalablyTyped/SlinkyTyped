package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceMapping extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  /**
    * Depth of this mapping
    */
  var depth: Double = js.native
  /**
    * local location of the definition
    */
  var localItem: String = js.native
  /**
    * type of workspace mapping
    */
  var mappingType: WorkspaceMappingType = js.native
  /**
    * Server location of the definition
    */
  var serverItem: String = js.native
  /**
    * Id of the workspace
    */
  var workspaceId: Double = js.native
}

object WorkspaceMapping {
  @scala.inline
  def apply(
    definitionUri: String,
    depth: Double,
    localItem: String,
    mappingType: WorkspaceMappingType,
    serverItem: String,
    workspaceId: Double
  ): WorkspaceMapping = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], localItem = localItem.asInstanceOf[js.Any], mappingType = mappingType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceMapping]
  }
  @scala.inline
  implicit class WorkspaceMappingOps[Self <: WorkspaceMapping] (val x: Self) extends AnyVal {
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
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappingType(value: WorkspaceMappingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverItem")(value.asInstanceOf[js.Any])
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

