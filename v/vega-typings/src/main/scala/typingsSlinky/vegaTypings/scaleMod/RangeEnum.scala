package typingsSlinky.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.width
  - typingsSlinky.vegaTypings.vegaTypingsStrings.height
  - typingsSlinky.vegaTypings.vegaTypingsStrings.symbol
  - typingsSlinky.vegaTypings.vegaTypingsStrings.category
  - typingsSlinky.vegaTypings.vegaTypingsStrings.ordinal
  - typingsSlinky.vegaTypings.vegaTypingsStrings.ramp
  - typingsSlinky.vegaTypings.vegaTypingsStrings.diverging
  - typingsSlinky.vegaTypings.vegaTypingsStrings.heatmap
*/
trait RangeEnum
  extends _RangeBand
     with _RangeScheme

object RangeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsSlinky.vegaTypings.vegaTypingsStrings.category = this.cast("category")
  @scala.inline
  def diverging: typingsSlinky.vegaTypings.vegaTypingsStrings.diverging = this.cast("diverging")
  @scala.inline
  def heatmap: typingsSlinky.vegaTypings.vegaTypingsStrings.heatmap = this.cast("heatmap")
  @scala.inline
  def height: typingsSlinky.vegaTypings.vegaTypingsStrings.height = this.cast("height")
  @scala.inline
  def ordinal: typingsSlinky.vegaTypings.vegaTypingsStrings.ordinal = this.cast("ordinal")
  @scala.inline
  def ramp: typingsSlinky.vegaTypings.vegaTypingsStrings.ramp = this.cast("ramp")
  @scala.inline
  def symbol: typingsSlinky.vegaTypings.vegaTypingsStrings.symbol = this.cast("symbol")
  @scala.inline
  def width: typingsSlinky.vegaTypings.vegaTypingsStrings.width = this.cast("width")
}

