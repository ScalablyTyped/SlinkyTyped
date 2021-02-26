package typingsSlinky.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequest
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  
  /** Short name of the request's action */
  var a: RequestAction = js.native
}
object ClientRequest {
  
  @scala.inline
  def apply(a: RequestAction): ClientRequest = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  
  @scala.inline
  implicit class ClientRequestMutableBuilder[Self <: ClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: RequestAction): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
  }
}
