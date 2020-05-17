package typingsSlinky.vanillaSwipe

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.vanillaSwipe.anon.Delta
import typingsSlinky.vanillaSwipe.anon.IsSwiping
import typingsSlinky.vanillaSwipe.anon.Passive
import typingsSlinky.vanillaSwipe.anon.PassiveUndefined
import typingsSlinky.vanillaSwipe.anon.X
import typingsSlinky.vanillaSwipe.anon.Y
import typingsSlinky.vanillaSwipe.calculateMovingPositionMod.E
import typingsSlinky.vanillaSwipe.calculatePositionMod.Value
import typingsSlinky.vanillaSwipe.calculatePositionMod.nextPosition
import typingsSlinky.vanillaSwipe.calculatePositionMod.prevPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def calculateDuration(): Double = js.native
  def calculateDuration(prevTime: Double): Double = js.native
  def calculateDuration(prevTime: Double, nextTime: Double): Double = js.native
  def calculateMovingPosition[T /* <: E */](e: T): X = js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = js.native
  def calculatePosition(prevPos: prevPosition, nextPos: nextPosition): Value = js.native
  def calculateVelocity(x: Double, y: Double, time: Double): Double = js.native
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  def checkIsPassiveSupported(): Boolean = js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  def createOptions(): js.Object = js.native
  def createOptions(proxy: js.Object): js.Object = js.native
  def getInitialProps(): Delta = js.native
  def getInitialProps(props: js.Object): Delta = js.native
  def getInitialState(): IsSwiping = js.native
  def getOptions(): Passive | PassiveUndefined = js.native
  def getOptions(isPassiveSupported: Boolean): Passive | PassiveUndefined = js.native
  def noop(): Unit = js.native
  def rotateByAngle(position: Y): typingsSlinky.vanillaSwipe.rotateByAngleMod.Value = js.native
  def rotateByAngle(position: Y, angle: Double): typingsSlinky.vanillaSwipe.rotateByAngleMod.Value = js.native
}

