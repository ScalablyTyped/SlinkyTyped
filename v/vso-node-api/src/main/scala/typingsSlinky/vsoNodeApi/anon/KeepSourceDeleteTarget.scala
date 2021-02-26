package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepSourceDeleteTarget extends StObject {
  
  var keepSourceDeleteTarget: scala.Double = js.native
  
  var keepSourceRenameTarget: scala.Double = js.native
  
  var keepTargetDeleteSource: scala.Double = js.native
  
  var keepTargetRenameSource: scala.Double = js.native
  
  var undecided: scala.Double = js.native
}
object KeepSourceDeleteTarget {
  
  @scala.inline
  def apply(
    keepSourceDeleteTarget: scala.Double,
    keepSourceRenameTarget: scala.Double,
    keepTargetDeleteSource: scala.Double,
    keepTargetRenameSource: scala.Double,
    undecided: scala.Double
  ): KeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(keepSourceDeleteTarget = keepSourceDeleteTarget.asInstanceOf[js.Any], keepSourceRenameTarget = keepSourceRenameTarget.asInstanceOf[js.Any], keepTargetDeleteSource = keepTargetDeleteSource.asInstanceOf[js.Any], keepTargetRenameSource = keepTargetRenameSource.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepSourceDeleteTarget]
  }
  
  @scala.inline
  implicit class KeepSourceDeleteTargetMutableBuilder[Self <: KeepSourceDeleteTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepSourceDeleteTarget(value: scala.Double): Self = StObject.set(x, "keepSourceDeleteTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepSourceRenameTarget(value: scala.Double): Self = StObject.set(x, "keepSourceRenameTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepTargetDeleteSource(value: scala.Double): Self = StObject.set(x, "keepTargetDeleteSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepTargetRenameSource(value: scala.Double): Self = StObject.set(x, "keepTargetRenameSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndecided(value: scala.Double): Self = StObject.set(x, "undecided", value.asInstanceOf[js.Any])
  }
}
