package typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitDeletedRepository extends js.Object {
  var createdDate: js.Date
  var deletedBy: IdentityRef
  var deletedDate: js.Date
  var id: String
  var name: String
  var project: TeamProjectReference
}

object GitDeletedRepository {
  @scala.inline
  def apply(
    createdDate: js.Date,
    deletedBy: IdentityRef,
    deletedDate: js.Date,
    id: String,
    name: String,
    project: TeamProjectReference
  ): GitDeletedRepository = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitDeletedRepository]
  }
}

