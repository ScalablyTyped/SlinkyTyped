package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributionBase extends StObject {
  
  /**
    * Description of the contribution/type
    */
  var description: String = js.native
  
  /**
    * Fully qualified identifier of the contribution/type
    */
  var id: String = js.native
  
  /**
    * VisibleTo can be used to restrict whom can reference a given contribution/type. This value should be a list of publishers or extensions access is restricted too.  Examples: "ms" - Means only the "ms" publisher can reference this. "ms.vss-web" - Means only the "vss-web" extension from the "ms" publisher can reference this.
    */
  var visibleTo: js.Array[String] = js.native
}
object ContributionBase {
  
  @scala.inline
  def apply(description: String, id: String, visibleTo: js.Array[String]): ContributionBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionBase]
  }
  
  @scala.inline
  implicit class ContributionBaseMutableBuilder[Self <: ContributionBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTo(value: js.Array[String]): Self = StObject.set(x, "visibleTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToVarargs(value: String*): Self = StObject.set(x, "visibleTo", js.Array(value :_*))
  }
}
