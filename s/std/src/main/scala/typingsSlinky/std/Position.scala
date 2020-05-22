package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The position of the concerned device at a given time. The position, represented by a Coordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its altitude and its speed. */
trait Position extends js.Object {
  val coords: org.scalajs.dom.raw.Coordinates
  val timestamp: Double
}

object Position {
  @scala.inline
  def apply(coords: org.scalajs.dom.raw.Coordinates, timestamp: Double): Position = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

