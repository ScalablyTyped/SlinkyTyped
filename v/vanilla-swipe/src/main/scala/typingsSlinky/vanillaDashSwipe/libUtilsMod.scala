package typingsSlinky.vanillaDashSwipe

import typingsSlinky.std.MouseEvent
import typingsSlinky.std.TouchEvent
import typingsSlinky.vanillaDashSwipe.libUtilsCalculateMovingPositionMod.E
import typingsSlinky.vanillaDashSwipe.libUtilsCalculatePositionMod.Value
import typingsSlinky.vanillaDashSwipe.libUtilsCalculatePositionMod.nextPosition
import typingsSlinky.vanillaDashSwipe.libUtilsCalculatePositionMod.prevPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  def calculateDuration(): Double = js.native
  def calculateDuration(prevTime: Double): Double = js.native
  def calculateDuration(prevTime: Double, nextTime: Double): Double = js.native
  def calculateMovingPosition[T /* <: E */](e: T): Anon_X = js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): Anon_X = js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): Anon_X = js.native
  def calculatePosition(prevPos: prevPosition, nextPos: nextPosition): Value = js.native
  def calculateVelocity(x: Double, y: Double, time: Double): Double = js.native
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  def checkIsPassiveSupported(): Boolean = js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  def createOptions(): js.Object = js.native
  def createOptions(proxy: js.Object): js.Object = js.native
  def getInitialProps(): Anon_Delta = js.native
  def getInitialProps(props: js.Object): Anon_Delta = js.native
  def getInitialState(): Anon_IsSwiping = js.native
  def getOptions(): Anon_Passive | Anon_PassiveUndefined = js.native
  def getOptions(isPassiveSupported: Boolean): Anon_Passive | Anon_PassiveUndefined = js.native
  def noop(): Unit = js.native
  def rotateByAngle(position: Anon_XY): typingsSlinky.vanillaDashSwipe.libUtilsRotateByAngleMod.Value = js.native
  def rotateByAngle(position: Anon_XY, angle: Double): typingsSlinky.vanillaDashSwipe.libUtilsRotateByAngleMod.Value = js.native
}

