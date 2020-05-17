package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.anon.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.scaleMod.RangeEnum
  - typingsSlinky.vegaTypings.scaleMod.RangeRaw
  - typingsSlinky.vegaTypings.anon.Step
*/
trait RangeBand extends js.Object

object RangeBand {
  @scala.inline
  implicit def apply(value: RangeEnum): RangeBand = value.asInstanceOf[RangeBand]
  @scala.inline
  implicit def apply(value: RangeRaw): RangeBand = value.asInstanceOf[RangeBand]
  @scala.inline
  implicit def apply(value: Step): RangeBand = value.asInstanceOf[RangeBand]
}

