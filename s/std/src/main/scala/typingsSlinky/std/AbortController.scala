package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A controller object that allows you to abort one or more DOM requests as and when desired. */
@js.native
trait AbortController extends js.Object {
  
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit = js.native
  
  /**
    * Returns the AbortSignal object associated with this object.
    */
  val signal: org.scalajs.dom.experimental.AbortSignal = js.native
}
object AbortController {
  
  @scala.inline
  def apply(abort: () => Unit, signal: org.scalajs.dom.experimental.AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  @scala.inline
  implicit class AbortControllerOps[Self <: org.scalajs.dom.experimental.AbortController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.experimental.AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
  }
}
