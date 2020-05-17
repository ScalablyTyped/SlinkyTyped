package typingsSlinky.webgme.GmePanel

import typingsSlinky.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelBase extends js.Object {
  var OPTIONS: Options = js.native
  var control: js.Any = js.native
  var logger: GmeLogger = js.native
  def afterAppend(): Unit = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def isReadOnly(): Boolean = js.native
  def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
  def onResize(width: Double, height: Double): Unit = js.native
  def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

object PanelBase {
  @scala.inline
  def apply(
    OPTIONS: Options,
    afterAppend: () => Unit,
    clear: () => Unit,
    control: js.Any,
    destroy: () => Unit,
    isReadOnly: () => Boolean,
    logger: GmeLogger,
    onReadOnlyChanged: Boolean => Unit,
    onResize: (Double, Double) => Unit,
    setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit,
    setReadOnly: Boolean => Unit,
    setSize: (Double, Double) => Unit
  ): PanelBase = {
    val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = js.Any.fromFunction0(afterAppend), clear = js.Any.fromFunction0(clear), control = control.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isReadOnly = js.Any.fromFunction0(isReadOnly), logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1(onReadOnlyChanged), onResize = js.Any.fromFunction2(onResize), setContainerUpdateFn = js.Any.fromFunction2(setContainerUpdateFn), setReadOnly = js.Any.fromFunction1(setReadOnly), setSize = js.Any.fromFunction2(setSize))
    __obj.asInstanceOf[PanelBase]
  }
  @scala.inline
  implicit class PanelBaseOps[Self <: PanelBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOPTIONS(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterAppend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAppend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogger(value: GmeLogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReadOnlyChanged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadOnlyChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetContainerUpdateFn(value: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContainerUpdateFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetReadOnly(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

