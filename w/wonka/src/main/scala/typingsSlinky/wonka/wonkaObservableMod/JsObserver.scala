package typingsSlinky.wonka.wonkaObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsObserver[T] extends js.Object {
  
  def complete(): Unit = js.native
  
  def error(errorValue: js.Any): Unit = js.native
  
  def next(value: T): Unit = js.native
}
object JsObserver {
  
  @scala.inline
  def apply[T](complete: () => Unit, error: js.Any => Unit, next: T => Unit): JsObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[JsObserver[T]]
  }
  
  @scala.inline
  implicit class JsObserverOps[Self <: JsObserver[_], T] (val x: Self with JsObserver[T]) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
  }
}
