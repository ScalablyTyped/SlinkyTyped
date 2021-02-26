package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when content protection is resumed. */
@js.native
trait ProtectedAccessResumedEventArgs extends StObject {
  
  /** Contains the enterprise identities for which content protection is being resumed. */
  var identities: IVectorView[String] = js.native
}
object ProtectedAccessResumedEventArgs {
  
  @scala.inline
  def apply(identities: IVectorView[String]): ProtectedAccessResumedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessResumedEventArgs]
  }
  
  @scala.inline
  implicit class ProtectedAccessResumedEventArgsMutableBuilder[Self <: ProtectedAccessResumedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: IVectorView[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
  }
}
