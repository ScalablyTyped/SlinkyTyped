package typingsSlinky.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Projections")
@js.native
object Projections extends js.Object {
  
  def ortho(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    top: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ): Matrix = js.native
  
  def perspective(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    top: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ): Matrix = js.native
  
  def perspectiveFov(): Matrix = js.native
  def perspectiveFov(fovyInDegrees: js.UndefOr[scala.Nothing], front: Double): Matrix = js.native
  def perspectiveFov(fovyInDegrees: Double): Matrix = js.native
  def perspectiveFov(fovyInDegrees: Double, front: Double): Matrix = js.native
}
