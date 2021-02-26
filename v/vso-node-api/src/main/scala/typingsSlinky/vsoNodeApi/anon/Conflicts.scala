package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflicts extends StObject {
  
  var conflicts: scala.Double = js.native
  
  var failure: scala.Double = js.native
  
  var notSet: scala.Double = js.native
  
  var queued: scala.Double = js.native
  
  var rejectedByPolicy: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
}
object Conflicts {
  
  @scala.inline
  def apply(
    conflicts: scala.Double,
    failure: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    rejectedByPolicy: scala.Double,
    succeeded: scala.Double
  ): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  @scala.inline
  implicit class ConflictsMutableBuilder[Self <: Conflicts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflicts(value: scala.Double): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure(value: scala.Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedByPolicy(value: scala.Double): Self = StObject.set(x, "rejectedByPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
