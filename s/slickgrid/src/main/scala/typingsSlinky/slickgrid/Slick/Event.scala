package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[T] extends js.Object {
  
  def notify(args: T): js.Any = js.native
  def notify(args: T, e: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def notify(args: T, e: org.scalajs.dom.raw.Event): js.Any = js.native
  def notify(args: T, e: org.scalajs.dom.raw.Event, scope: js.Any): js.Any = js.native
  def notify(args: T, e: EventData): js.Any = js.native
  def notify(args: T, e: EventData, scope: js.Any): js.Any = js.native
  def notify(args: js.UndefOr[scala.Nothing], e: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def notify(args: js.UndefOr[scala.Nothing], e: org.scalajs.dom.raw.Event): js.Any = js.native
  def notify(args: js.UndefOr[scala.Nothing], e: org.scalajs.dom.raw.Event, scope: js.Any): js.Any = js.native
  def notify(args: js.UndefOr[scala.Nothing], e: EventData): js.Any = js.native
  def notify(args: js.UndefOr[scala.Nothing], e: EventData, scope: js.Any): js.Any = js.native
  
  /***
    * Adds an event handler to be called when the event is fired.
    * <p>Event handler will receive two arguments - an <code>EventData</code> and the <code>data</code>
    * object the event was fired with.<p>
    * @method subscribe
    * @param fn {Function} Event handler.
    */
  def subscribe(fn: js.Function2[org.scalajs.dom.raw.Event | (/* e */ EventData), /* data */ T, Unit]): Unit = js.native
  
  /***
    * Removes an event handler added with <code>subscribe(fn)</code>.
    * @method unsubscribe
    * @param fn {Function} Event handler to be removed.
    */
  def unsubscribe(fn: js.Function2[org.scalajs.dom.raw.Event | (/* e */ EventData), /* data */ T, Unit]): Unit = js.native
}
