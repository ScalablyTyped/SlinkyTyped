package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoughnessMap extends StObject {
  
  var roughnessMap: IUniform = js.native
}
object RoughnessMap {
  
  @scala.inline
  def apply(roughnessMap: IUniform): RoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughnessMap]
  }
  
  @scala.inline
  implicit class RoughnessMapMutableBuilder[Self <: RoughnessMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoughnessMap(value: IUniform): Self = StObject.set(x, "roughnessMap", value.asInstanceOf[js.Any])
  }
}
