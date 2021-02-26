package typingsSlinky.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a delayed set version operation. */
@js.native
trait SetVersionDeferral extends StObject {
  
  /** Notifies the system that the app has set the version of the application data in its app data store. */
  def complete(): Unit = js.native
}
object SetVersionDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SetVersionDeferral]
  }
  
  @scala.inline
  implicit class SetVersionDeferralMutableBuilder[Self <: SetVersionDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
