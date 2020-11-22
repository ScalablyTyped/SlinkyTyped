package typingsSlinky.storybookApi.addonsMod

import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteOptions extends js.Object {
  
  var location: WindowLocation[LocationState] = js.native
  
  var path: String = js.native
  
  var storyId: String = js.native
  
  var viewMode: ViewMode = js.native
}
object RouteOptions {
  
  @scala.inline
  def apply(location: WindowLocation[LocationState], path: String, storyId: String): RouteOptions = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
  
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
