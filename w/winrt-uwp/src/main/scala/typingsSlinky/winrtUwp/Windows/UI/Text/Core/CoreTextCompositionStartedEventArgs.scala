package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CompositionStarted event. */
@js.native
trait CoreTextCompositionStartedEventArgs extends js.Object {
  
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean = js.native
}
object CoreTextCompositionStartedEventArgs {
  
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean): CoreTextCompositionStartedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionStartedEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextCompositionStartedEventArgsOps[Self <: CoreTextCompositionStartedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = this.set("isCanceled", value.asInstanceOf[js.Any])
  }
}
