package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tickable extends js.Object {
  def addModifier(mod: Modifier): Tickable = js.native
  def addToModifierContext(mc: ModifierContext): Unit = js.native
  def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getCenterXShift(): Double = js.native
  def getIntrinsicTicks(): Fraction = js.native
  def getTickMultiplier(): Fraction = js.native
  def getTicks(): Fraction = js.native
  def getTuplet(): Tuplet = js.native
  def getVoice(): Voice = js.native
  def getWidth(): Double = js.native
  def isCenterAligned(): Boolean = js.native
  def postFormat(): Tickable = js.native
  def preFormat(): Unit = js.native
  def setCenterAlignment(align_center: Boolean): Tickable = js.native
  def setContext(context: IRenderContext): Unit = js.native
  def setDuration(duration: Fraction): Unit = js.native
  def setIntrinsicTicks(intrinsicTicks: Fraction): Unit = js.native
  def setTickContext(tc: TickContext): Unit = js.native
  def setTuplet(tuplet: Tuplet): Tickable = js.native
  def setVoice(voice: Voice): Unit = js.native
  def setXShift(x: Double): Tickable = js.native
  def shouldIgnoreTicks(): Boolean = js.native
}

object Tickable {
  @scala.inline
  def apply(
    addModifier: Modifier => Tickable,
    addToModifierContext: ModifierContext => Unit,
    applyTickMultiplier: (Double, Double) => Unit,
    getBoundingBox: () => BoundingBox,
    getCenterXShift: () => Double,
    getIntrinsicTicks: () => Fraction,
    getTickMultiplier: () => Fraction,
    getTicks: () => Fraction,
    getTuplet: () => Tuplet,
    getVoice: () => Voice,
    getWidth: () => Double,
    isCenterAligned: () => Boolean,
    postFormat: () => Tickable,
    preFormat: () => Unit,
    setCenterAlignment: Boolean => Tickable,
    setContext: IRenderContext => Unit,
    setDuration: Fraction => Unit,
    setIntrinsicTicks: Fraction => Unit,
    setTickContext: TickContext => Unit,
    setTuplet: Tuplet => Tickable,
    setVoice: Voice => Unit,
    setXShift: Double => Tickable,
    shouldIgnoreTicks: () => Boolean
  ): Tickable = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), addToModifierContext = js.Any.fromFunction1(addToModifierContext), applyTickMultiplier = js.Any.fromFunction2(applyTickMultiplier), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getCenterXShift = js.Any.fromFunction0(getCenterXShift), getIntrinsicTicks = js.Any.fromFunction0(getIntrinsicTicks), getTickMultiplier = js.Any.fromFunction0(getTickMultiplier), getTicks = js.Any.fromFunction0(getTicks), getTuplet = js.Any.fromFunction0(getTuplet), getVoice = js.Any.fromFunction0(getVoice), getWidth = js.Any.fromFunction0(getWidth), isCenterAligned = js.Any.fromFunction0(isCenterAligned), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setCenterAlignment = js.Any.fromFunction1(setCenterAlignment), setContext = js.Any.fromFunction1(setContext), setDuration = js.Any.fromFunction1(setDuration), setIntrinsicTicks = js.Any.fromFunction1(setIntrinsicTicks), setTickContext = js.Any.fromFunction1(setTickContext), setTuplet = js.Any.fromFunction1(setTuplet), setVoice = js.Any.fromFunction1(setVoice), setXShift = js.Any.fromFunction1(setXShift), shouldIgnoreTicks = js.Any.fromFunction0(shouldIgnoreTicks))
    __obj.asInstanceOf[Tickable]
  }
  @scala.inline
  implicit class TickableOps[Self <: Tickable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddModifier(value: Modifier => Tickable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddToModifierContext(value: ModifierContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToModifierContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyTickMultiplier(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTickMultiplier")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBoundingBox(value: () => BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCenterXShift(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterXShift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIntrinsicTicks(value: () => Fraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntrinsicTicks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTickMultiplier(value: () => Fraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTickMultiplier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTicks(value: () => Fraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTicks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTuplet(value: () => Tuplet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTuplet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVoice(value: () => Voice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVoice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCenterAligned(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenterAligned")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPostFormat(value: () => Tickable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreFormat(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCenterAlignment(value: Boolean => Tickable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCenterAlignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDuration(value: Fraction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIntrinsicTicks(value: Fraction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntrinsicTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTickContext(value: TickContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTickContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTuplet(value: Tuplet => Tickable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTuplet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVoice(value: Voice => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVoice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXShift(value: Double => Tickable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXShift")(js.Any.fromFunction1(value))
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

