package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetalnessMap extends StObject {
  
  var metalnessMap: IUniform = js.native
}
object MetalnessMap {
  
  @scala.inline
  def apply(metalnessMap: IUniform): MetalnessMap = {
    val __obj = js.Dynamic.literal(metalnessMap = metalnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetalnessMap]
  }
  
  @scala.inline
  implicit class MetalnessMapMutableBuilder[Self <: MetalnessMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetalnessMap(value: IUniform): Self = StObject.set(x, "metalnessMap", value.asInstanceOf[js.Any])
  }
}
