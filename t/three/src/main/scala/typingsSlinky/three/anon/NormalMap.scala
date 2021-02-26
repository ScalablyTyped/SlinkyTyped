package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalMap extends StObject {
  
  var normalMap: IUniform = js.native
  
  var normalScale: IUniform = js.native
}
object NormalMap {
  
  @scala.inline
  def apply(normalMap: IUniform, normalScale: IUniform): NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalMap]
  }
  
  @scala.inline
  implicit class NormalMapMutableBuilder[Self <: NormalMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalMap(value: IUniform): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalScale(value: IUniform): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
  }
}
