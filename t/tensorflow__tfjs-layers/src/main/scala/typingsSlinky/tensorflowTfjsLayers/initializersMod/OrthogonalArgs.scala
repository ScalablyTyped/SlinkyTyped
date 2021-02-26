package typingsSlinky.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrthogonalArgs extends SeedOnlyInitializerArgs {
  
  /**
    * Multiplicative factor to apply to the orthogonal matrix. Defaults to 1.
    */
  var gain: js.UndefOr[Double] = js.native
}
object OrthogonalArgs {
  
  @scala.inline
  def apply(): OrthogonalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalArgs]
  }
  
  @scala.inline
  implicit class OrthogonalArgsMutableBuilder[Self <: OrthogonalArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
  }
}
