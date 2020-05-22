package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaMap extends js.Object {
  var alphaMap: IUniform
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var uvTransform: IUniform
}

object AlphaMap {
  @scala.inline
  def apply(alphaMap: IUniform, diffuse: IUniform, map: IUniform, opacity: IUniform, uvTransform: IUniform): AlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaMap]
  }
}

