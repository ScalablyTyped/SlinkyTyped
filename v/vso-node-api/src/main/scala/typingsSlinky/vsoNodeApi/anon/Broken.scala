package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broken extends StObject {
  
  var approved: scala.Double = js.native
  
  var broken: scala.Double = js.native
  
  var notApplicable: scala.Double = js.native
  
  var queued: scala.Double = js.native
  
  var rejected: scala.Double = js.native
  
  var running: scala.Double = js.native
}
object Broken {
  
  @scala.inline
  def apply(
    approved: scala.Double,
    broken: scala.Double,
    notApplicable: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    running: scala.Double
  ): Broken = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], broken = broken.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broken]
  }
  
  @scala.inline
  implicit class BrokenMutableBuilder[Self <: Broken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproved(value: scala.Double): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroken(value: scala.Double): Self = StObject.set(x, "broken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicable(value: scala.Double): Self = StObject.set(x, "notApplicable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: scala.Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
  }
}
