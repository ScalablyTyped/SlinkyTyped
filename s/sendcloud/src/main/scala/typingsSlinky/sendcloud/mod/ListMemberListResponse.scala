package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.anon.Modifyat
import typingsSlinky.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberListResponse extends StObject {
  
  var members: js.Array[Modifyat] = js.native
  
  var message: success = js.native
  
  var total_count: Double = js.native
}
object ListMemberListResponse {
  
  @scala.inline
  def apply(members: js.Array[Modifyat], message: success, total_count: Double): ListMemberListResponse = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListResponse]
  }
  
  @scala.inline
  implicit class ListMemberListResponseMutableBuilder[Self <: ListMemberListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[Modifyat]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: Modifyat*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
