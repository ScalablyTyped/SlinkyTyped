package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPathAction extends StObject {
  
  var action: GitPathActions = js.native
  
  var base64Content: String = js.native
  
  var path: String = js.native
  
  var rawTextContent: String = js.native
  
  var targetPath: String = js.native
}
object GitPathAction {
  
  @scala.inline
  def apply(
    action: GitPathActions,
    base64Content: String,
    path: String,
    rawTextContent: String,
    targetPath: String
  ): GitPathAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], base64Content = base64Content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawTextContent = rawTextContent.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathAction]
  }
  
  @scala.inline
  implicit class GitPathActionMutableBuilder[Self <: GitPathAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: GitPathActions): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64Content(value: String): Self = StObject.set(x, "base64Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawTextContent(value: String): Self = StObject.set(x, "rawTextContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
  }
}
