package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPushSearchCriteria extends StObject {
  
  var fromDate: js.Date = js.native
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  
  var includeRefUpdates: Boolean = js.native
  
  var pusherId: String = js.native
  
  var refName: String = js.native
  
  var toDate: js.Date = js.native
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
  
  @scala.inline
  implicit class GitPushSearchCriteriaMutableBuilder[Self <: GitPushSearchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRefUpdates(value: Boolean): Self = StObject.set(x, "includeRefUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPusherId(value: String): Self = StObject.set(x, "pusherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefName(value: String): Self = StObject.set(x, "refName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
  }
}
