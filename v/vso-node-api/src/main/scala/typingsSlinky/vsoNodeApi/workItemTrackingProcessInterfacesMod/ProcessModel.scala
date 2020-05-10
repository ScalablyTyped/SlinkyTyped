package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessModel extends js.Object {
  /**
    * Description of the process
    */
  var description: String = js.native
  /**
    * Name of the process
    */
  var name: String = js.native
  /**
    * Projects in this process
    */
  var projects: js.Array[ProjectReference] = js.native
  /**
    * Properties of the process
    */
  var properties: ProcessProperties = js.native
  /**
    * Reference name of the process
    */
  var referenceName: String = js.native
  /**
    * The ID of the process
    */
  var typeId: String = js.native
}

object ProcessModel {
  @scala.inline
  def apply(
    description: String,
    name: String,
    projects: js.Array[ProjectReference],
    properties: ProcessProperties,
    referenceName: String,
    typeId: String
  ): ProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessModel]
  }
  @scala.inline
  implicit class ProcessModelOps[Self <: ProcessModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: js.Array[ProjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: ProcessProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

