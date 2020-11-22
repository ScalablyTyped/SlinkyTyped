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
import typingsSlinky.vanillaSwipe.calculatePositionMod.nextPosition
import typingsSlinky.vanillaSwipe.rotateByAngleMod.Value
import typingsSlinky.vanillaSwipe.typesMod.EventData
import typingsSlinky.vanillaSwipe.typesMod.State
import typingsSlinky.vanillaSwipe.vanillaSwipeStrings.x
import typingsSlinky.vanillaSwipe.vanillaSwipeStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  @JSName("calculateDirection")
  def calculateDirection_x(trace: js.Array[Double], axis: x): String = js.native
  @JSName("calculateDirection")
  def calculateDirection_y(trace: js.Array[Double], axis: y): String = js.native
  
  def calculateDuration(): Double = js.native
  def calculateDuration(prevTime: js.UndefOr[scala.Nothing], nextTime: Double): Double = js.native
  def calculateDuration(prevTime: Double): Double = js.native
  def calculateDuration(prevTime: Double, nextTime: Double): Double = js.native
  
  def calculateMovingPosition[T /* <: E */](e: T): X = js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = js.native
  
  def calculatePosition(state: State, nextPos: nextPosition): EventData = js.native
  
  def calculateVelocity(x: Double, y: Double, time: Double): Double = js.native
  
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  
  def checkIsPassiveSupported(): Boolean = js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  
  def createOptions(): js.Object = js.native
  def createOptions(proxy: js.Object): js.Object = js.native
  
  def getInitialProps(): Delta = js.native
  def getInitialProps(props: js.Object): Delta = js.native
  
  def getInitialState(): IsSwiping = js.native
  def getInitialState(options: js.Object): IsSwiping = js.native
  
  def getOptions(): Passive | PassiveUndefined = js.native
  def getOptions(isPassiveSupported: Boolean): Passive | PassiveUndefined = js.native
  
  def noop(): Unit = js.native
  
  def rotateByAngle(position: Y): Value = js.native
  def rotateByAngle(position: Y, angle: Double): Value = js.native
  
  def updateTrace(trace: js.Array[Double], value: Double): js.Array[Double] = js.native
}
