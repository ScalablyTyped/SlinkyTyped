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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("vanilla-swipe/lib/utils", "calculateDirection")
  @js.native
  def calculateDirection_x(trace: js.Array[Double], axis: x): String = js.native
  @JSImport("vanilla-swipe/lib/utils", "calculateDirection")
  @js.native
  def calculateDirection_y(trace: js.Array[Double], axis: y): String = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "calculateDuration")
  @js.native
  def calculateDuration(): Double = js.native
  @JSImport("vanilla-swipe/lib/utils", "calculateDuration")
  @js.native
  def calculateDuration(prevTime: js.UndefOr[scala.Nothing], nextTime: Double): Double = js.native
  @JSImport("vanilla-swipe/lib/utils", "calculateDuration")
  @js.native
  def calculateDuration(prevTime: Double): Double = js.native
  @JSImport("vanilla-swipe/lib/utils", "calculateDuration")
  @js.native
  def calculateDuration(prevTime: Double, nextTime: Double): Double = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "calculateMovingPosition")
  @js.native
  def calculateMovingPosition[T /* <: E */](e: T): X = js.native
  @JSImport("vanilla-swipe/lib/utils", "calculateMovingPosition")
  @js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = js.native
  @JSImport("vanilla-swipe/lib/utils", "calculateMovingPosition")
  @js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "calculatePosition")
  @js.native
  def calculatePosition(state: State, nextPos: nextPosition): EventData = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "calculateVelocity")
  @js.native
  def calculateVelocity(x: Double, y: Double, time: Double): Double = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "checkIsMoreThanSingleTouches")
  @js.native
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "checkIsPassiveSupported")
  @js.native
  def checkIsPassiveSupported(): Boolean = js.native
  @JSImport("vanilla-swipe/lib/utils", "checkIsPassiveSupported")
  @js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "createOptions")
  @js.native
  def createOptions(): js.Object = js.native
  @JSImport("vanilla-swipe/lib/utils", "createOptions")
  @js.native
  def createOptions(proxy: js.Object): js.Object = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "getInitialProps")
  @js.native
  def getInitialProps(): Delta = js.native
  @JSImport("vanilla-swipe/lib/utils", "getInitialProps")
  @js.native
  def getInitialProps(props: js.Object): Delta = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "getInitialState")
  @js.native
  def getInitialState(): IsSwiping = js.native
  @JSImport("vanilla-swipe/lib/utils", "getInitialState")
  @js.native
  def getInitialState(options: js.Object): IsSwiping = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "getOptions")
  @js.native
  def getOptions(): Passive | PassiveUndefined = js.native
  @JSImport("vanilla-swipe/lib/utils", "getOptions")
  @js.native
  def getOptions(isPassiveSupported: Boolean): Passive | PassiveUndefined = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "rotateByAngle")
  @js.native
  def rotateByAngle(position: Y): Value = js.native
  @JSImport("vanilla-swipe/lib/utils", "rotateByAngle")
  @js.native
  def rotateByAngle(position: Y, angle: Double): Value = js.native
  
  @JSImport("vanilla-swipe/lib/utils", "updateTrace")
  @js.native
  def updateTrace(trace: js.Array[Double], value: Double): js.Array[Double] = js.native
}
