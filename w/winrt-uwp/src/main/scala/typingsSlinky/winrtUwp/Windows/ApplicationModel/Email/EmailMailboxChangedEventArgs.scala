package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the deferral process. */
@js.native
trait EmailMailboxChangedEventArgs extends StObject {
  
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  def getDeferral(): EmailMailboxChangedDeferral = js.native
}
object EmailMailboxChangedEventArgs {
  
  @scala.inline
  def apply(getDeferral: () => EmailMailboxChangedDeferral): EmailMailboxChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[EmailMailboxChangedEventArgs]
  }
  
  @scala.inline
  implicit class EmailMailboxChangedEventArgsMutableBuilder[Self <: EmailMailboxChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => EmailMailboxChangedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
