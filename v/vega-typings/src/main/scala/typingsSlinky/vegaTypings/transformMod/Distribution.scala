package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.kde
import typingsSlinky.vegaTypings.vegaTypingsStrings.lognormal
import typingsSlinky.vegaTypings.vegaTypingsStrings.mixture
import typingsSlinky.vegaTypings.vegaTypingsStrings.normal
import typingsSlinky.vegaTypings.vegaTypingsStrings.uniform
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
  def DistributionKDE(
    field: String | TransformField,
    function: kde,
    bandwidth: Double | SignalRef = null,
    from: DataName = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionMixture(
    field: String | TransformField,
    function: mixture,
    distributions: (js.Array[Distribution | SignalRef]) | SignalRef = null,
    weights: (js.Array[Double | SignalRef]) | SignalRef = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionUniform(function: uniform, max: Double | SignalRef = null, min: Double | SignalRef = null): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionNormal(function: normal, mean: Double | SignalRef = null, stdev: Double | SignalRef = null): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (stdev != null) __obj.updateDynamic("stdev")(stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionLogNormal(function: lognormal, mean: Double | SignalRef = null, stdev: Double | SignalRef = null): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (stdev != null) __obj.updateDynamic("stdev")(stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}

