package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Simple user interface events. */
@js.native
trait UIEvent extends Event {
  val detail: Double = js.native
  val view: org.scalajs.dom.raw.Window | Null = js.native
  /** @deprecated */
  val which: Double = js.native
}

