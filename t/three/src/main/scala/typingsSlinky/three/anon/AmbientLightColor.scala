package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmbientLightColor extends StObject {
  
  var ambientLightColor: IUniform = js.native
  
  var directionalLightShadows: Value = js.native
  
  var directionalLights: Properties = js.native
  
  var directionalShadowMap: IUniform = js.native
  
  var directionalShadowMatrix: IUniform = js.native
  
  var hemisphereLights: PropertiesDirection = js.native
  
  var pointLightShadows: Value = js.native
  
  var pointLights: PropertiesDecay = js.native
  
  var pointShadowMap: IUniform = js.native
  
  var pointShadowMatrix: IUniform = js.native
  
  var rectAreaLights: PropertiesHeight = js.native
  
  var spotLightShadows: Value = js.native
  
  var spotLights: PropertiesValue = js.native
  
  var spotShadowMap: IUniform = js.native
  
  var spotShadowMatrix: IUniform = js.native
}
object AmbientLightColor {
  
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLightShadows: Value,
    directionalLights: Properties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: PropertiesDirection,
    pointLightShadows: Value,
    pointLights: PropertiesDecay,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: PropertiesHeight,
    spotLightShadows: Value,
    spotLights: PropertiesValue,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLightShadows = directionalLightShadows.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLightShadows = pointLightShadows.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLightShadows = spotLightShadows.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientLightColor]
  }
  
  @scala.inline
  implicit class AmbientLightColorMutableBuilder[Self <: AmbientLightColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbientLightColor(value: IUniform): Self = StObject.set(x, "ambientLightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalLightShadows(value: Value): Self = StObject.set(x, "directionalLightShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalLights(value: Properties): Self = StObject.set(x, "directionalLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMap(value: IUniform): Self = StObject.set(x, "directionalShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMatrix(value: IUniform): Self = StObject.set(x, "directionalShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHemisphereLights(value: PropertiesDirection): Self = StObject.set(x, "hemisphereLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointLightShadows(value: Value): Self = StObject.set(x, "pointLightShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointLights(value: PropertiesDecay): Self = StObject.set(x, "pointLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMap(value: IUniform): Self = StObject.set(x, "pointShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMatrix(value: IUniform): Self = StObject.set(x, "pointShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectAreaLights(value: PropertiesHeight): Self = StObject.set(x, "rectAreaLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotLightShadows(value: Value): Self = StObject.set(x, "spotLightShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotLights(value: PropertiesValue): Self = StObject.set(x, "spotLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMap(value: IUniform): Self = StObject.set(x, "spotShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMatrix(value: IUniform): Self = StObject.set(x, "spotShadowMatrix", value.asInstanceOf[js.Any])
  }
}
