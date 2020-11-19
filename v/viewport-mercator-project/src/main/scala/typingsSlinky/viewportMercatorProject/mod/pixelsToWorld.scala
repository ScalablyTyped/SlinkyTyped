package typingsSlinky.viewportMercatorProject.mod

import typingsSlinky.glMatrix.mod.mat4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("viewport-mercator-project", "pixelsToWorld")
@js.native
object pixelsToWorld extends js.Object {
  
  def apply(pixels: CoordinatesZ, pixelUnprojectionMatrix: mat4): CoordinatesZ = js.native
  def apply(pixels: CoordinatesZ, pixelUnprojectionMatrix: mat4, targetZ: Double): CoordinatesZ = js.native
  def apply(pixels: Coordinates, pixelUnprojectionMatrix: mat4): CoordinatesZ = js.native
  def apply(pixels: Coordinates, pixelUnprojectionMatrix: mat4, targetZ: Double): CoordinatesZ = js.native
}
