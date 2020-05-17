package typingsSlinky.vegaTypings.layoutMod

import typingsSlinky.vegaTypings.anon.ColumnFooter
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.anon.ColumnFooter
*/
trait LayoutOffset extends js.Object

object LayoutOffset {
  @scala.inline
  implicit def apply(value: ColumnFooter): LayoutOffset = value.asInstanceOf[LayoutOffset]
  @scala.inline
  implicit def apply(value: Double): LayoutOffset = value.asInstanceOf[LayoutOffset]
  @scala.inline
  implicit def apply(value: SignalRef): LayoutOffset = value.asInstanceOf[LayoutOffset]
}

