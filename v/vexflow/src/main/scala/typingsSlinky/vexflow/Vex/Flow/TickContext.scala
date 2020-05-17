package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.ExtraLeft
import typingsSlinky.vexflow.anon.ExtraRightPx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickContext extends js.Object {
  def addTickable(tickable: Tickable): TickContext = js.native
  def getCenterAlignedTickables(): js.Array[Tickable] = js.native
  def getContext(): IRenderContext = js.native
  def getCurrentTick(): Fraction = js.native
  def getExtraPx(): ExtraLeft = js.native
  def getMaxTicks(): Double = js.native
  def getMetrics(): ExtraRightPx = js.native
  def getMinTicks(): Double = js.native
  def getPixelsUsed(): Double = js.native
  def getTickables(): js.Array[Tickable] = js.native
  def getWidth(): Double = js.native
  def getX(): Double = js.native
  def getXBase(): Double = js.native
  def getXOffset(): Double = js.native
  def postFormat(): TickContext = js.native
  def preFormat(): TickContext = js.native
  def setContext(context: IRenderContext): Unit = js.native
  def setCurrentTick(tick: Fraction): Unit = js.native
  def setPadding(padding: Double): TickContext = js.native
  def setPixelsUsed(pixelsUsed: Double): TickContext = js.native
  def setX(x: Double): TickContext = js.native
  def setXBase(xBase: Double): Unit = js.native
  def setXOffset(xOffset: Double): Unit = js.native
  def shouldIgnoreTicks(): Boolean = js.native
}

object TickContext {
  @scala.inline
  def apply(
    addTickable: Tickable => TickContext,
    getCenterAlignedTickables: () => js.Array[Tickable],
    getContext: () => IRenderContext,
    getCurrentTick: () => Fraction,
    getExtraPx: () => ExtraLeft,
    getMaxTicks: () => Double,
    getMetrics: () => ExtraRightPx,
    getMinTicks: () => Double,
    getPixelsUsed: () => Double,
    getTickables: () => js.Array[Tickable],
    getWidth: () => Double,
    getX: () => Double,
    getXBase: () => Double,
    getXOffset: () => Double,
    postFormat: () => TickContext,
    preFormat: () => TickContext,
    setContext: IRenderContext => Unit,
    setCurrentTick: Fraction => Unit,
    setPadding: Double => TickContext,
    setPixelsUsed: Double => TickContext,
    setX: Double => TickContext,
    setXBase: Double => Unit,
    setXOffset: Double => Unit,
    shouldIgnoreTicks: () => Boolean
  ): TickContext = {
    val __obj = js.Dynamic.literal(addTickable = js.Any.fromFunction1(addTickable), getCenterAlignedTickables = js.Any.fromFunction0(getCenterAlignedTickables), getContext = js.Any.fromFunction0(getContext), getCurrentTick = js.Any.fromFunction0(getCurrentTick), getExtraPx = js.Any.fromFunction0(getExtraPx), getMaxTicks = js.Any.fromFunction0(getMaxTicks), getMetrics = js.Any.fromFunction0(getMetrics), getMinTicks = js.Any.fromFunction0(getMinTicks), getPixelsUsed = js.Any.fromFunction0(getPixelsUsed), getTickables = js.Any.fromFunction0(getTickables), getWidth = js.Any.fromFunction0(getWidth), getX = js.Any.fromFunction0(getX), getXBase = js.Any.fromFunction0(getXBase), getXOffset = js.Any.fromFunction0(getXOffset), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setContext = js.Any.fromFunction1(setContext), setCurrentTick = js.Any.fromFunction1(setCurrentTick), setPadding = js.Any.fromFunction1(setPadding), setPixelsUsed = js.Any.fromFunction1(setPixelsUsed), setX = js.Any.fromFunction1(setX), setXBase = js.Any.fromFunction1(setXBase), setXOffset = js.Any.fromFunction1(setXOffset), shouldIgnoreTicks = js.Any.fromFunction0(shouldIgnoreTicks))
    __obj.asInstanceOf[TickContext]
  }
  @scala.inline
  implicit class TickContextOps[Self <: TickContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTickable(value: Tickable => TickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTickable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCenterAlignedTickables(value: () => js.Array[Tickable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterAlignedTickables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContext(value: () => IRenderContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentTick(value: () => Fraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtraPx(value: () => ExtraLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraPx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxTicks(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxTicks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetrics(value: () => ExtraRightPx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinTicks(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinTicks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPixelsUsed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPixelsUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTickables(value: () => js.Array[Tickable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTickables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXBase(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXBase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPostFormat(value: () => TickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreFormat(value: () => TickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCurrentTick(value: Fraction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentTick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPadding(value: Double => TickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPixelsUsed(value: Double => TickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPixelsUsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetX(value: Double => TickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXBase(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXBase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXOffset(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldIgnoreTicks(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldIgnoreTicks")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

