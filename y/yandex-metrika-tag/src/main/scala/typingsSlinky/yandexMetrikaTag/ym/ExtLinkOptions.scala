package typingsSlinky.yandexMetrikaTag.ym

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtLinkOptions[CTX] extends js.Object {
  
  var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.native
  
  var ctx: js.UndefOr[CTX] = js.native
  
  var params: js.UndefOr[VisitParameters] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ExtLinkOptions {
  
  @scala.inline
  def apply[CTX](): ExtLinkOptions[CTX] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtLinkOptions[CTX]]
  }
  
  @scala.inline
  implicit class ExtLinkOptionsOps[Self <: ExtLinkOptions[_], CTX] (val x: Self with ExtLinkOptions[CTX]) extends AnyVal {
    
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
    def setCallback(value: js.ThisFunction0[/* this */ CTX, Unit]): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCtx(value: CTX): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
    
    @scala.inline
    def setParams(value: VisitParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
