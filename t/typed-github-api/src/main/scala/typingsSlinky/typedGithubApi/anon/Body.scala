package typingsSlinky.typedGithubApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  var body: From = js.native
  
  var title: From = js.native
}
object Body {
  
  @scala.inline
  def apply(body: From, title: From): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setBody(value: From): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: From): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
