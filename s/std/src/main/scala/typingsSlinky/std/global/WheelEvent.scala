package typingsSlinky.std.global

import typingsSlinky.std.WheelEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WheelEvent")
@js.native
class WheelEvent protected ()
  extends typingsSlinky.std.WheelEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: WheelEventInit) = this()
}
object WheelEvent {
  
  @JSGlobal("WheelEvent.DOM_DELTA_LINE")
  @js.native
  val DOM_DELTA_LINE: Double = js.native
  
  @JSGlobal("WheelEvent.DOM_DELTA_PAGE")
  @js.native
  val DOM_DELTA_PAGE: Double = js.native
  
  @JSGlobal("WheelEvent.DOM_DELTA_PIXEL")
  @js.native
  val DOM_DELTA_PIXEL: Double = js.native
}
