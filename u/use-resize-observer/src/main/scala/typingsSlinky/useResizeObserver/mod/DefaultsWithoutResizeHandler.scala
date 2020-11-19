package typingsSlinky.useResizeObserver.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultsWithoutResizeHandler[TElement] extends ObserverDefaults[TElement] {
  
  var ref: js.UndefOr[ReactRef[TElement]] = js.native
}
object DefaultsWithoutResizeHandler {
  
  @scala.inline
  def apply[TElement](): DefaultsWithoutResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
  }
  
  @scala.inline
  implicit class DefaultsWithoutResizeHandlerOps[Self <: DefaultsWithoutResizeHandler[_], TElement] (val x: Self with DefaultsWithoutResizeHandler[TElement]) extends AnyVal {
    
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
    def setRef(value: ReactRef[TElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
}
