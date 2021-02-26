package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeCoverageStatistics extends StObject {
  
  /**
    * Covered units
    */
  var covered: Double = js.native
  
  /**
    * Delta of coverage
    */
  var delta: Double = js.native
  
  /**
    * Is delta valid
    */
  var isDeltaAvailable: Boolean = js.native
  
  /**
    * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
    */
  var label: String = js.native
  
  /**
    * Position of label
    */
  var position: Double = js.native
  
  /**
    * Total units
    */
  var total: Double = js.native
}
object CodeCoverageStatistics {
  
  @scala.inline
  def apply(
    covered: Double,
    delta: Double,
    isDeltaAvailable: Boolean,
    label: String,
    position: Double,
    total: Double
  ): CodeCoverageStatistics = {
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], isDeltaAvailable = isDeltaAvailable.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageStatistics]
  }
  
  @scala.inline
  implicit class CodeCoverageStatisticsMutableBuilder[Self <: CodeCoverageStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeltaAvailable(value: Boolean): Self = StObject.set(x, "isDeltaAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
