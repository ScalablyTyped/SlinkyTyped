package typingsSlinky.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVersionDeferral extends ISetVersionDeferral
object SetVersionDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SetVersionDeferral]
  }
}
