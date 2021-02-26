package typingsSlinky.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPGroup extends StObject {
  
  var mids: js.Array[String] = js.native
  
  var semantics: String = js.native
}
object SDPGroup {
  
  @scala.inline
  def apply(mids: js.Array[String], semantics: String): SDPGroup = {
    val __obj = js.Dynamic.literal(mids = mids.asInstanceOf[js.Any], semantics = semantics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPGroup]
  }
  
  @scala.inline
  implicit class SDPGroupMutableBuilder[Self <: SDPGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMids(value: js.Array[String]): Self = StObject.set(x, "mids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidsVarargs(value: String*): Self = StObject.set(x, "mids", js.Array(value :_*))
    
    @scala.inline
    def setSemantics(value: String): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
  }
}
