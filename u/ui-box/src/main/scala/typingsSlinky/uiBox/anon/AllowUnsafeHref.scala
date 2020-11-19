package typingsSlinky.uiBox.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUnsafeHref[E /* <: ReactElement */] extends js.Object {
  
  var allowUnsafeHref: js.UndefOr[Boolean] = js.native
  
  var is: js.UndefOr[E] = js.native
}
object AllowUnsafeHref {
  
  @scala.inline
  def apply[E /* <: ReactElement */](): AllowUnsafeHref[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUnsafeHref[E]]
  }
  
  @scala.inline
  implicit class AllowUnsafeHrefOps[Self <: AllowUnsafeHref[_], E /* <: ReactElement */] (val x: Self with AllowUnsafeHref[E]) extends AnyVal {
    
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
    def setAllowUnsafeHref(value: Boolean): Self = this.set("allowUnsafeHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnsafeHref: Self = this.set("allowUnsafeHref", js.undefined)
    
    @scala.inline
    def setIs(value: E): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
  }
}
