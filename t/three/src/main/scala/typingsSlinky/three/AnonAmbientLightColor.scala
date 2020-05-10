package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmbientLightColor extends js.Object {
  var ambientLightColor: IUniform = js.native
  var directionalLights: AnonProperties = js.native
  var directionalShadowMap: IUniform = js.native
  var directionalShadowMatrix: IUniform = js.native
  var hemisphereLights: AnonPropertiesAnonDirection = js.native
  var pointLights: AnonPropertiesValue = js.native
  var pointShadowMap: IUniform = js.native
  var pointShadowMatrix: IUniform = js.native
  var rectAreaLights: AnonPropertiesAnonHeight = js.native
  var spotLights: AnonValue = js.native
  var spotShadowMap: IUniform = js.native
  var spotShadowMatrix: IUniform = js.native
}

object AnonAmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLights: AnonProperties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: AnonPropertiesAnonDirection,
    pointLights: AnonPropertiesValue,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: AnonPropertiesAnonHeight,
    spotLights: AnonValue,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): AnonAmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmbientLightColor]
  }
  @scala.inline
  implicit class AnonAmbientLightColorOps[Self <: AnonAmbientLightColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmbientLightColor(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientLightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionalLights(value: AnonProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionalShadowMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalShadowMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionalShadowMatrix(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalShadowMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHemisphereLights(value: AnonPropertiesAnonDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hemisphereLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointLights(value: AnonPropertiesValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointShadowMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointShadowMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointShadowMatrix(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointShadowMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectAreaLights(value: AnonPropertiesAnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectAreaLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpotLights(value: AnonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpotShadowMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotShadowMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpotShadowMatrix(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotShadowMatrix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

