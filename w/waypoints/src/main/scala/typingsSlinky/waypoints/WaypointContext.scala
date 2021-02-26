package typingsSlinky.waypoints

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.waypoints.anon.Horizontal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointContext extends StObject {
  
  var adapter: WaypointAdapter = js.native
  
  // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint = js.native
  
  var element: HTMLElement | Window = js.native
  
  def refresh(): Waypoint = js.native
  
  var waypoints: Horizontal = js.native
}
object WaypointContext {
  
  @scala.inline
  def apply(
    adapter: WaypointAdapter,
    destroy: () => Waypoint,
    element: HTMLElement | Window,
    refresh: () => Waypoint,
    waypoints: Horizontal
  ): WaypointContext = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointContext]
  }
  
  @scala.inline
  implicit class WaypointContextMutableBuilder[Self <: WaypointContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapter(value: WaypointAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Waypoint): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement | Window): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementHTMLElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementWindow(value: Window): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Waypoint): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaypoints(value: Horizontal): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
  }
}
