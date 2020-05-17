package typingsSlinky.vegaTypings.layoutMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.layoutMod.LayoutParams
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  implicit def apply(value: LayoutParams): Layout = value.asInstanceOf[Layout]
  @scala.inline
  implicit def apply(value: SignalRef): Layout = value.asInstanceOf[Layout]
}

