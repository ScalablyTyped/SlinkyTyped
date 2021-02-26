package typingsSlinky.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFront extends StObject {
  
  var eventType: String = js.native
  
  var includeBody: Boolean = js.native
  
  var origin: Origin = js.native
  
  var pathPattern: String = js.native
}
object CloudFront {
  
  @scala.inline
  def apply(eventType: String, includeBody: Boolean, origin: Origin, pathPattern: String): CloudFront = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], includeBody = includeBody.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFront]
  }
  
  @scala.inline
  implicit class CloudFrontMutableBuilder[Self <: CloudFront] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBody(value: Boolean): Self = StObject.set(x, "includeBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Origin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
  }
}
