package typingsSlinky.waypoints

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.waypoints.anon.FindByElement
import typingsSlinky.waypoints.anon.Horizontal
import typingsSlinky.waypoints.anon.Left
import typingsSlinky.waypoints.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Waypoint protected ()
    extends typingsSlinky.waypoints.Waypoint {
    def this(options: WaypointOptions) = this()
    // properties
    /* CompleteClass */
    override var adapter: typingsSlinky.waypoints.WaypointAdapter = js.native
    /* CompleteClass */
    override var context: typingsSlinky.waypoints.WaypointContext = js.native
    /* CompleteClass */
    override var element: HTMLElement = js.native
    /* CompleteClass */
    override var group: typingsSlinky.waypoints.WaypointGroup = js.native
    /* CompleteClass */
    override var options: WaypointOptions = js.native
    /* CompleteClass */
    override var triggerPoint: Double = js.native
    // Instance Methods
    /* CompleteClass */
    override def destroy(): typingsSlinky.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def disable(): typingsSlinky.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def enable(): typingsSlinky.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def next(): typingsSlinky.waypoints.Waypoint | String = js.native
     // actually `null` not string
    /* CompleteClass */
    override def previous(): typingsSlinky.waypoints.Waypoint | String = js.native
  }
  
  @js.native
  class WaypointAdapter protected ()
    extends typingsSlinky.waypoints.WaypointAdapter {
    def this(element: HTMLElement) = this()
    /* CompleteClass */
    override def innerHeight(): Double = js.native
    /* CompleteClass */
    override def innerWidth(): Double = js.native
    /* CompleteClass */
    override def off(event: String): js.UndefOr[scala.Nothing] = js.native
    /* CompleteClass */
    override def offset(): Left = js.native
    /* CompleteClass */
    override def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
    /* CompleteClass */
    override def outerHeight(includeMargin: Boolean): Double = js.native
    /* CompleteClass */
    override def outerWidth(includeMargin: Boolean): Double = js.native
    /* CompleteClass */
    override def scrollLeft(): Double = js.native
    /* CompleteClass */
    override def scrollTop(): Double = js.native
  }
  
  @js.native
  class WaypointContext ()
    extends typingsSlinky.waypoints.WaypointContext {
    /* CompleteClass */
    override var adapter: typingsSlinky.waypoints.WaypointAdapter = js.native
    /* CompleteClass */
    override var element: HTMLElement | Window = js.native
    /* CompleteClass */
    override var waypoints: Horizontal = js.native
     // http://imakewebthings.com/waypoints/api/context/#waypoints-property
    /* CompleteClass */
    override def destroy(): typingsSlinky.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def refresh(): typingsSlinky.waypoints.Waypoint = js.native
  }
  
  @js.native
  class WaypointGroup ()
    extends typingsSlinky.waypoints.WaypointGroup {
    /* CompleteClass */
    override var axis: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var waypoints: js.Array[typingsSlinky.waypoints.Waypoint] = js.native
    /* CompleteClass */
    override def first(): typingsSlinky.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def last(): typingsSlinky.waypoints.Waypoint = js.native
  }
  
  /* static members */
  @js.native
  object Waypoint extends js.Object {
    var Adapter: typingsSlinky.waypoints.WaypointAdapter = js.native
    // Waypoint.Context
    var Context: FindByElement = js.native
    var adapters: Push = js.native
     // actually `null` not string
    // Class Methods
    def destroyAll(): Unit = js.native
    def disableAll(): Unit = js.native
    def enableAll(): Unit = js.native
    def refreshAll(): Unit = js.native
    def viewportHeight(): Double = js.native
    def viewportWidth(): Double = js.native
  }
  
  /* static members */
  @js.native
  object WaypointAdapter extends js.Object {
    def extend(objects: js.Any*): js.Any = js.native
    def inArray(value: js.Any, array: js.Array[_], startIndex: Double): Double = js.native
    def isEmptyObject(`object`: js.Any): Boolean = js.native
  }
  
}

