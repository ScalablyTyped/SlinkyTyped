package typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushSearchCriteria extends js.Object {
  var fromDate: js.Date
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  var includeRefUpdates: Boolean
  var pusherId: String
  var refName: String
  var toDate: js.Date
}

object GitPushSearchCriteria {
  @scala.inline
  def apply(
    fromDate: js.Date,
    includeLinks: Boolean,
    includeRefUpdates: Boolean,
    pusherId: String,
    refName: String,
    toDate: js.Date
  ): GitPushSearchCriteria = {
    val __obj = js.Dynamic.literal(fromDate = fromDate.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeRefUpdates = includeRefUpdates.asInstanceOf[js.Any], pusherId = pusherId.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitPushSearchCriteria]
  }
}

