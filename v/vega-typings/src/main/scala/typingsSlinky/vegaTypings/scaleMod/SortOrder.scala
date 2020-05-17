package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.ascending
  - typingsSlinky.vegaTypings.vegaTypingsStrings.descending
  - typingsSlinky.vegaTypings.signalMod.SignalRef
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def ascending: typingsSlinky.vegaTypings.vegaTypingsStrings.ascending = "ascending".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.ascending]
  @scala.inline
  def descending: typingsSlinky.vegaTypings.vegaTypingsStrings.descending = "descending".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.descending]
  @scala.inline
  implicit def apply(value: SignalRef): SortOrder = value.asInstanceOf[SortOrder]
}

