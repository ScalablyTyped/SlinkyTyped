package typingsSlinky.slickgrid.global.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EventHandler")
@js.native
class EventHandler[T] ()
  extends typingsSlinky.slickgrid.Slick.EventHandler[T] {
  /* CompleteClass */
  override def subscribe(
    event: typingsSlinky.slickgrid.Slick.Event[T],
    handler: js.Function2[/* e */ typingsSlinky.slickgrid.Slick.EventData, T, Unit]
  ): typingsSlinky.slickgrid.Slick.EventHandler[_] = js.native
  /* CompleteClass */
  override def unsubscribe(
    event: typingsSlinky.slickgrid.Slick.Event[T],
    handler: js.Function2[/* e */ typingsSlinky.slickgrid.Slick.EventData, T, Unit]
  ): typingsSlinky.slickgrid.Slick.EventHandler[_] = js.native
  /* CompleteClass */
  override def unsubscribeAll(): typingsSlinky.slickgrid.Slick.EventHandler[_] = js.native
}

