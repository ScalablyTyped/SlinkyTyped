package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerOptions extends StObject {
  
  var credentials: js.UndefOr[org.scalajs.dom.experimental.RequestCredentials] = js.native
  
  var name: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[WorkerType] = js.native
}
object WorkerOptions {
  
  @scala.inline
  def apply(): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerOptions]
  }
  
  @scala.inline
  implicit class WorkerOptionsMutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: org.scalajs.dom.experimental.RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: WorkerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
