package typingsSlinky.winrt.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.ISuspendingDeferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendingDeferral extends ISuspendingDeferral
object SuspendingDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
}
