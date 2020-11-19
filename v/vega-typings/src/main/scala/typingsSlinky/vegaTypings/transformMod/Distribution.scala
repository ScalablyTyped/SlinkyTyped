package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.kde
import typingsSlinky.vegaTypings.vegaTypingsStrings.lognormal
import typingsSlinky.vegaTypings.vegaTypingsStrings.mixture
import typingsSlinky.vegaTypings.vegaTypingsStrings.normal
import typingsSlinky.vegaTypings.vegaTypingsStrings.uniform
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
trait Distribution extends js.Object
object Distribution {
  
  @scala.inline
  def DistributionKDE(field: String | TransformField, function: kde): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionMixture(field: String | TransformField, function: mixture): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionUniform(function: uniform): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionNormal(function: normal): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionLogNormal(function: lognormal): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}
