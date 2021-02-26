package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Automatic extends StObject {
  
  var automatic: scala.Double = js.native
  
  var deploymentSubmitter: scala.Double = js.native
  
  var firstPreDeploymentApprover: scala.Double = js.native
}
object Automatic {
  
  @scala.inline
  def apply(
    automatic: scala.Double,
    deploymentSubmitter: scala.Double,
    firstPreDeploymentApprover: scala.Double
  ): Automatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automatic]
  }
  
  @scala.inline
  implicit class AutomaticMutableBuilder[Self <: Automatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatic(value: scala.Double): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentSubmitter(value: scala.Double): Self = StObject.set(x, "deploymentSubmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPreDeploymentApprover(value: scala.Double): Self = StObject.set(x, "firstPreDeploymentApprover", value.asInstanceOf[js.Any])
  }
}
