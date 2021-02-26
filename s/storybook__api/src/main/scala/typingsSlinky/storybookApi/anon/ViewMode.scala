package typingsSlinky.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewMode extends StObject {
  
  var ref: js.UndefOr[String] = js.native
  
  var viewMode: js.UndefOr[typingsSlinky.storybookApi.modulesStoriesMod.ViewMode] = js.native
}
object ViewMode {
  
  @scala.inline
  def apply(): ViewMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewMode]
  }
  
  @scala.inline
  implicit class ViewModeMutableBuilder[Self <: ViewMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setViewMode(value: typingsSlinky.storybookApi.modulesStoriesMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
