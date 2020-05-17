package typingsSlinky.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.scaleMod.OrdinalScale
  - typingsSlinky.vegaTypings.scaleMod.BandScale
  - typingsSlinky.vegaTypings.scaleMod.PointScale
  - typingsSlinky.vegaTypings.scaleMod.SequentialScale
  - typingsSlinky.vegaTypings.scaleMod.TimeScale
  - typingsSlinky.vegaTypings.scaleMod.IdentityScale
  - typingsSlinky.vegaTypings.scaleMod.LinearScale
  - typingsSlinky.vegaTypings.scaleMod.LogScale
  - typingsSlinky.vegaTypings.scaleMod.SymLogScale
  - typingsSlinky.vegaTypings.scaleMod.PowScale
  - typingsSlinky.vegaTypings.scaleMod.SqrtScale
  - typingsSlinky.vegaTypings.scaleMod.QuantileScale
  - typingsSlinky.vegaTypings.scaleMod.QuantizeScale
  - typingsSlinky.vegaTypings.scaleMod.ThresholdScale
  - typingsSlinky.vegaTypings.scaleMod.BinOrdinalScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  implicit def apply(value: BandScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: BinOrdinalScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: IdentityScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: LinearScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: LogScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: OrdinalScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: PointScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: PowScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: QuantileScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: QuantizeScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: SequentialScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: SqrtScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: SymLogScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: ThresholdScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: TimeScale): Scale = value.asInstanceOf[Scale]
}

