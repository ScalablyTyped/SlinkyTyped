package typingsSlinky.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  var application: typingsSlinky.typedoc.mod.Application = js.native
}
object Application {
  
  @scala.inline
  def apply(application: typingsSlinky.typedoc.mod.Application): Application = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: typingsSlinky.typedoc.mod.Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
