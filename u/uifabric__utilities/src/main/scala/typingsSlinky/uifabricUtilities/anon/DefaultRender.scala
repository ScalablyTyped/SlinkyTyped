package typingsSlinky.uifabricUtilities.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRender[T] extends js.Object {
  
  var defaultRender: js.UndefOr[ReactComponentClass[T]] = js.native
}
object DefaultRender {
  
  @scala.inline
  def apply[T](): DefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRender[T]]
  }
  
  @scala.inline
  implicit class DefaultRenderOps[Self <: DefaultRender[_], T] (val x: Self with DefaultRender[T]) extends AnyVal {
    
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
    def setDefaultRenderFunctionComponent(value: ReactComponentClass[T]): Self = this.set("defaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRenderComponentClass(value: ReactComponentClass[T]): Self = this.set("defaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRender(value: ReactComponentClass[T]): Self = this.set("defaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRender: Self = this.set("defaultRender", js.undefined)
  }
}
