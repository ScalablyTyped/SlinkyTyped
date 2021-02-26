package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcShelvesetRequestData extends StObject {
  
  /**
    * Whether to include policyOverride and notes Only applies when requesting a single deep shelveset
    */
  var includeDetails: Boolean = js.native
  
  /**
    * Whether to include the _links field on the shallow references. Does not apply when requesting a single deep shelveset object. Links will always be included in the deep shelveset.
    */
  var includeLinks: Boolean = js.native
  
  /**
    * Whether to include workItems
    */
  var includeWorkItems: Boolean = js.native
  
  /**
    * Max number of changes to include
    */
  var maxChangeCount: Double = js.native
  
  /**
    * Max length of comment
    */
  var maxCommentLength: Double = js.native
  
  /**
    * Shelveset's name
    */
  var name: String = js.native
  
  /**
    * Owner's ID. Could be a name or a guid.
    */
  var owner: String = js.native
}
object TfvcShelvesetRequestData {
  
  @scala.inline
  def apply(
    includeDetails: Boolean,
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    maxChangeCount: Double,
    maxCommentLength: Double,
    name: String,
    owner: String
  ): TfvcShelvesetRequestData = {
    val __obj = js.Dynamic.literal(includeDetails = includeDetails.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], maxChangeCount = maxChangeCount.asInstanceOf[js.Any], maxCommentLength = maxCommentLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelvesetRequestData]
  }
  
  @scala.inline
  implicit class TfvcShelvesetRequestDataMutableBuilder[Self <: TfvcShelvesetRequestData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDetails(value: Boolean): Self = StObject.set(x, "includeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeWorkItems(value: Boolean): Self = StObject.set(x, "includeWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChangeCount(value: Double): Self = StObject.set(x, "maxChangeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCommentLength(value: Double): Self = StObject.set(x, "maxCommentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
