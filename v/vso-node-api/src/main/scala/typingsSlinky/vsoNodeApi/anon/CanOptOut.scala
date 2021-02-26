package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanOptOut extends StObject {
  
  var canOptOut: scala.Double = js.native
  
  var contributedSubscription: scala.Double = js.native
  
  var groupSubscription: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var teamSubscription: scala.Double = js.native
}
object CanOptOut {
  
  @scala.inline
  def apply(
    canOptOut: scala.Double,
    contributedSubscription: scala.Double,
    groupSubscription: scala.Double,
    none: scala.Double,
    teamSubscription: scala.Double
  ): CanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut.asInstanceOf[js.Any], contributedSubscription = contributedSubscription.asInstanceOf[js.Any], groupSubscription = groupSubscription.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamSubscription = teamSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanOptOut]
  }
  
  @scala.inline
  implicit class CanOptOutMutableBuilder[Self <: CanOptOut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanOptOut(value: scala.Double): Self = StObject.set(x, "canOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributedSubscription(value: scala.Double): Self = StObject.set(x, "contributedSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSubscription(value: scala.Double): Self = StObject.set(x, "groupSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamSubscription(value: scala.Double): Self = StObject.set(x, "teamSubscription", value.asInstanceOf[js.Any])
  }
}
