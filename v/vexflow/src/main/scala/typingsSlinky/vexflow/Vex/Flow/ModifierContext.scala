package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.Extraleftpx
import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifierContext extends js.Object {
  def addModifier(modifier: Modifier): ModifierContext = js.native
  def getExtraLeftPx(): Double = js.native
  def getExtraRightPx(): Double = js.native
  def getMetrics(): Extraleftpx = js.native
  def getModifiers(`type`: String): js.Array[Modifier] = js.native
  def getState(): Leftshift = js.native
  def getWidth(): Double = js.native
  def postFormat(): Unit = js.native
  def preFormat(): Unit = js.native
}

object ModifierContext {
  @scala.inline
  def apply(
    addModifier: Modifier => ModifierContext,
    getExtraLeftPx: () => Double,
    getExtraRightPx: () => Double,
    getMetrics: () => Extraleftpx,
    getModifiers: String => js.Array[Modifier],
    getState: () => Leftshift,
    getWidth: () => Double,
    postFormat: () => Unit,
    preFormat: () => Unit
  ): ModifierContext = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), getExtraLeftPx = js.Any.fromFunction0(getExtraLeftPx), getExtraRightPx = js.Any.fromFunction0(getExtraRightPx), getMetrics = js.Any.fromFunction0(getMetrics), getModifiers = js.Any.fromFunction1(getModifiers), getState = js.Any.fromFunction0(getState), getWidth = js.Any.fromFunction0(getWidth), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat))
    __obj.asInstanceOf[ModifierContext]
  }
  @scala.inline
  implicit class ModifierContextOps[Self <: ModifierContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddModifier(value: Modifier => ModifierContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetExtraLeftPx(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraLeftPx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtraRightPx(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraRightPx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetrics(value: () => Extraleftpx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModifiers(value: String => js.Array[Modifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModifiers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => Leftshift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPostFormat(value: () => Unit): Self = {
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
  }
  
}

