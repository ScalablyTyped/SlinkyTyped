package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostCancellationToken extends StObject {
  
  def isCancellationRequested(): Boolean = js.native
}
object HostCancellationToken {
  
  @scala.inline
  def apply(isCancellationRequested: () => Boolean): HostCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested))
    __obj.asInstanceOf[HostCancellationToken]
  }
  
  @scala.inline
  implicit class HostCancellationTokenMutableBuilder[Self <: HostCancellationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCancellationRequested(value: () => Boolean): Self = StObject.set(x, "isCancellationRequested", js.Any.fromFunction0(value))
  }
}
