package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Tickable
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.ExtraLeft
import typingsSlinky.vexflow.anon.ExtraRightPx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TickContext")
@js.native
class TickContext ()
  extends typingsSlinky.vexflow.Vex.Flow.TickContext {
  /* CompleteClass */
  override def addTickable(tickable: Tickable): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  /* CompleteClass */
  override def getCenterAlignedTickables(): js.Array[Tickable] = js.native
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  /* CompleteClass */
  override def getCurrentTick(): typingsSlinky.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getExtraPx(): ExtraLeft = js.native
  /* CompleteClass */
  override def getMaxTicks(): Double = js.native
  /* CompleteClass */
  override def getMetrics(): ExtraRightPx = js.native
  /* CompleteClass */
  override def getMinTicks(): Double = js.native
  /* CompleteClass */
  override def getPixelsUsed(): Double = js.native
  /* CompleteClass */
  override def getTickables(): js.Array[Tickable] = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def getX(): Double = js.native
  /* CompleteClass */
  override def getXBase(): Double = js.native
  /* CompleteClass */
  override def getXOffset(): Double = js.native
  /* CompleteClass */
  override def postFormat(): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  /* CompleteClass */
  override def preFormat(): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  /* CompleteClass */
  override def setCurrentTick(tick: typingsSlinky.vexflow.Vex.Flow.Fraction): Unit = js.native
  /* CompleteClass */
  override def setPadding(padding: Double): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  /* CompleteClass */
  override def setPixelsUsed(pixelsUsed: Double): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  /* CompleteClass */
  override def setX(x: Double): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  /* CompleteClass */
  override def setXBase(xBase: Double): Unit = js.native
  /* CompleteClass */
  override def setXOffset(xOffset: Double): Unit = js.native
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}

/* static members */
@JSGlobal("Vex.Flow.TickContext")
@js.native
object TickContext extends js.Object {
  def getNextContext(tContext: typingsSlinky.vexflow.Vex.Flow.TickContext): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
}

