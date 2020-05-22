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
}

