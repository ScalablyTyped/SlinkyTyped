package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.BaseY
import typingsSlinky.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stem extends js.Object {
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean = js.native
  def applyStyle(context: IRenderContext): Stem = js.native
  def draw(): Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getCategory(): String = js.native
  def getExtents(): BaseY = js.native
  def getHeight(): Double = js.native
  def getStyle(): FillStyle_ = js.native
  def setContext(context: IRenderContext): Stem = js.native
  def setDirection(direction: Double): Unit = js.native
  def setExtension(extension: Double): Unit = js.native
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem = js.native
  def setStyle(style: FillStyle_): Unit = js.native
  def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}

object Stem {
  @scala.inline
  def apply(
    applyStyle: IRenderContext => Stem,
    draw: () => Unit,
    getBoundingBox: () => BoundingBox,
    getCategory: () => String,
    getExtents: () => BaseY,
    getHeight: () => Double,
    getStyle: () => FillStyle_,
    hide: Boolean,
    setContext: IRenderContext => Stem,
    setDirection: Double => Unit,
    setExtension: Double => Unit,
    setNoteHeadXBounds: (Double, Double) => Stem,
    setStyle: FillStyle_ => Unit,
    setYBounds: (Double, Double) => Unit
  ): Stem = {
    val __obj = js.Dynamic.literal(applyStyle = js.Any.fromFunction1(applyStyle), draw = js.Any.fromFunction0(draw), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getCategory = js.Any.fromFunction0(getCategory), getExtents = js.Any.fromFunction0(getExtents), getHeight = js.Any.fromFunction0(getHeight), getStyle = js.Any.fromFunction0(getStyle), hide = hide.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setDirection = js.Any.fromFunction1(setDirection), setExtension = js.Any.fromFunction1(setExtension), setNoteHeadXBounds = js.Any.fromFunction2(setNoteHeadXBounds), setStyle = js.Any.fromFunction1(setStyle), setYBounds = js.Any.fromFunction2(setYBounds))
    __obj.asInstanceOf[Stem]
  }
  @scala.inline
  implicit class StemOps[Self <: Stem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyStyle(value: IRenderContext => Stem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBoundingBox(value: () => BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCategory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCategory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtents(value: () => BaseY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyle(value: () => FillStyle_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Stem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDirection(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetExtension(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNoteHeadXBounds(value: (Double, Double) => Stem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoteHeadXBounds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStyle(value: FillStyle_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYBounds(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYBounds")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

