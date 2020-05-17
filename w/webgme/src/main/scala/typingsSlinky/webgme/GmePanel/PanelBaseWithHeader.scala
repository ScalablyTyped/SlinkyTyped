package typingsSlinky.webgme.GmePanel

import typingsSlinky.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelBaseWithHeader extends PanelBase {
  @JSName("OPTIONS")
  var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
  def getNodeID(): String = js.native
  def initUI(options: OptionsWithHeader): Unit = js.native
  def setActive(isActive: Boolean): Unit = js.native
  def setTitle(text: String): Unit = js.native
}

object PanelBaseWithHeader {
  @scala.inline
  def apply(
    OPTIONS: OptionsWithHeader,
    afterAppend: () => Unit,
    clear: () => Unit,
    control: js.Any,
    destroy: () => Unit,
    getNodeID: () => String,
    initUI: OptionsWithHeader => Unit,
    isReadOnly: () => Boolean,
    logger: GmeLogger,
    onReadOnlyChanged: Boolean => Unit,
    onResize: (Double, Double) => Unit,
    setActive: Boolean => Unit,
    setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit,
    setReadOnly: Boolean => Unit,
    setSize: (Double, Double) => Unit,
    setTitle: String => Unit
  ): PanelBaseWithHeader = {
    val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = js.Any.fromFunction0(afterAppend), clear = js.Any.fromFunction0(clear), control = control.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getNodeID = js.Any.fromFunction0(getNodeID), initUI = js.Any.fromFunction1(initUI), isReadOnly = js.Any.fromFunction0(isReadOnly), logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1(onReadOnlyChanged), onResize = js.Any.fromFunction2(onResize), setActive = js.Any.fromFunction1(setActive), setContainerUpdateFn = js.Any.fromFunction2(setContainerUpdateFn), setReadOnly = js.Any.fromFunction1(setReadOnly), setSize = js.Any.fromFunction2(setSize), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[PanelBaseWithHeader]
  }
  @scala.inline
  implicit class PanelBaseWithHeaderOps[Self <: PanelBaseWithHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOPTIONS(value: OptionsWithHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNodeID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitUI(value: OptionsWithHeader => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initUI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActive(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

