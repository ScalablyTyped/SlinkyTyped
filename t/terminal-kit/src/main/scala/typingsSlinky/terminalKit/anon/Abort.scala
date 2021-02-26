package typingsSlinky.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abort extends StObject {
  
  def abort(): Unit = js.native
  
  var promise: js.UndefOr[js.Promise[Boolean]] = js.native
}
object Abort {
  
  @scala.inline
  def apply(abort: () => Unit): Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPromise(value: js.Promise[Boolean]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
