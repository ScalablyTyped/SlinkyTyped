package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var createdBy: IdentityRef
  var createdOn: js.Date
  var description: String
  var lastChangedBy: IdentityRef
  var lastChangedDate: js.Date
  var path: String
}

object Folder {
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: js.Date,
    description: String,
    lastChangedBy: IdentityRef,
    lastChangedDate: js.Date,
    path: String
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Folder]
  }
}

