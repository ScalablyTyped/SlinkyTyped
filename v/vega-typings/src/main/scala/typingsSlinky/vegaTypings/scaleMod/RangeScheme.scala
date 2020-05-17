package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.anon.Extent
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.scaleMod.RangeEnum
  - typingsSlinky.vegaTypings.scaleMod.RangeRaw
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.anon.Extent
*/
trait RangeScheme extends js.Object

object RangeScheme {
  @scala.inline
  implicit def apply(value: Extent): RangeScheme = value.asInstanceOf[RangeScheme]
  @scala.inline
  implicit def apply(value: RangeEnum): RangeScheme = value.asInstanceOf[RangeScheme]
  @scala.inline
  implicit def apply(value: RangeRaw): RangeScheme = value.asInstanceOf[RangeScheme]
  @scala.inline
  implicit def apply(value: SignalRef): RangeScheme = value.asInstanceOf[RangeScheme]
}

