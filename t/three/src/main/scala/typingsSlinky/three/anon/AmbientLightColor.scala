package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmbientLightColor extends js.Object {
  var ambientLightColor: IUniform
  var directionalLights: Properties
  var directionalShadowMap: IUniform
  var directionalShadowMatrix: IUniform
  var hemisphereLights: PropertiesDirection
  var pointLights: PropertiesValue
  var pointShadowMap: IUniform
  var pointShadowMatrix: IUniform
  var rectAreaLights: PropertiesHeight
  var spotLights: Value
  var spotShadowMap: IUniform
  var spotShadowMatrix: IUniform
}

object AmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLights: Properties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: PropertiesDirection,
    pointLights: PropertiesValue,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: PropertiesHeight,
    spotLights: Value,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientLightColor]
  }
  @scala.inline
  implicit class AmbientLightColorOps[Self <: AmbientLightColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmbientLightColor(value: IUniform): Self = this.set("ambientLightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalLights(value: Properties): Self = this.set("directionalLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowMap(value: IUniform): Self = this.set("directionalShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowMatrix(value: IUniform): Self = this.set("directionalShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHemisphereLights(value: PropertiesDirection): Self = this.set("hemisphereLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointLights(value: PropertiesValue): Self = this.set("pointLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowMap(value: IUniform): Self = this.set("pointShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowMatrix(value: IUniform): Self = this.set("pointShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectAreaLights(value: PropertiesHeight): Self = this.set("rectAreaLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotLights(value: Value): Self = this.set("spotLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowMap(value: IUniform): Self = this.set("spotShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowMatrix(value: IUniform): Self = this.set("spotShadowMatrix", value.asInstanceOf[js.Any])
  }
  
}

