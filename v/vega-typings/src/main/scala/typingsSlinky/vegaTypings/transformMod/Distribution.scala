package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.kde
import typingsSlinky.vegaTypings.vegaTypingsStrings.lognormal
import typingsSlinky.vegaTypings.vegaTypingsStrings.mixture
import typingsSlinky.vegaTypings.vegaTypingsStrings.normal
import typingsSlinky.vegaTypings.vegaTypingsStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.transformMod.DistributionNormal
  - typingsSlinky.vegaTypings.transformMod.DistributionLogNormal
  - typingsSlinky.vegaTypings.transformMod.DistributionUniform
  - typingsSlinky.vegaTypings.transformMod.DistributionKDE
  - typingsSlinky.vegaTypings.transformMod.DistributionMixture
*/
trait Distribution extends StObject
object Distribution {
  
  @scala.inline
  def DistributionKDE(field: String | TransformField, function: kde): typingsSlinky.vegaTypings.transformMod.DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DistributionKDE]
  }
  
  @scala.inline
  def DistributionLogNormal(function: lognormal): typingsSlinky.vegaTypings.transformMod.DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DistributionLogNormal]
  }
  
  @scala.inline
  def DistributionMixture(field: String | TransformField, function: mixture): typingsSlinky.vegaTypings.transformMod.DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DistributionMixture]
  }
  
  @scala.inline
  def DistributionNormal(function: normal): typingsSlinky.vegaTypings.transformMod.DistributionNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DistributionNormal]
  }
  
  @scala.inline
  def DistributionUniform(function: uniform): typingsSlinky.vegaTypings.transformMod.DistributionUniform = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DistributionUniform]
  }
}
