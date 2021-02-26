package typingsSlinky.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITargetFileRequestDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object ITargetFileRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): ITargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ITargetFileRequestDeferral]
  }
  
  @scala.inline
  implicit class ITargetFileRequestDeferralMutableBuilder[Self <: ITargetFileRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
