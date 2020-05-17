package typingsSlinky.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.transformMod.DistributionNormal
  - typingsSlinky.vegaTypings.transformMod.DistributionLogNormal
  - typingsSlinky.vegaTypings.transformMod.DistributionUniform
  - typingsSlinky.vegaTypings.transformMod.DistributionKDE
  - typingsSlinky.vegaTypings.transformMod.DistributionMixture
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  implicit def apply(value: DistributionKDE): Distribution = value.asInstanceOf[Distribution]
  @scala.inline
  implicit def apply(value: DistributionLogNormal): Distribution = value.asInstanceOf[Distribution]
  @scala.inline
  implicit def apply(value: DistributionMixture): Distribution = value.asInstanceOf[Distribution]
  @scala.inline
  implicit def apply(value: DistributionNormal): Distribution = value.asInstanceOf[Distribution]
  @scala.inline
  implicit def apply(value: DistributionUniform): Distribution = value.asInstanceOf[Distribution]
}

