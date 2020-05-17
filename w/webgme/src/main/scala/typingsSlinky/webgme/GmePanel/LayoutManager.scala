package typingsSlinky.webgme.GmePanel

import typingsSlinky.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutManager extends js.Object {
  var _currentLayout: Layout = js.native
  var _currentLayoutName: String = js.native
  var _logger: GmeLogger = js.native
  var _panels: js.Array[PanelBase] = js.native
  def addPanel(name: String, panel: PanelBase, container: Container): Unit = js.native
  def loadLayout(layout: Layout, callback: LayoutCallback): Unit = js.native
  def loadPanel(params: Params, callback: LayoutCallback): Unit = js.native
  def removePanel(name: String): Unit = js.native
  def setPanelReadOnly(readOnly: Boolean): Unit = js.native
}

object LayoutManager {
  @scala.inline
  def apply(
    _currentLayout: Layout,
    _currentLayoutName: String,
    _logger: GmeLogger,
    _panels: js.Array[PanelBase],
    addPanel: (String, PanelBase, Container) => Unit,
    loadLayout: (Layout, LayoutCallback) => Unit,
    loadPanel: (Params, LayoutCallback) => Unit,
    removePanel: String => Unit,
    setPanelReadOnly: Boolean => Unit
  ): LayoutManager = {
    val __obj = js.Dynamic.literal(_currentLayout = _currentLayout.asInstanceOf[js.Any], _currentLayoutName = _currentLayoutName.asInstanceOf[js.Any], _logger = _logger.asInstanceOf[js.Any], _panels = _panels.asInstanceOf[js.Any], addPanel = js.Any.fromFunction3(addPanel), loadLayout = js.Any.fromFunction2(loadLayout), loadPanel = js.Any.fromFunction2(loadPanel), removePanel = js.Any.fromFunction1(removePanel), setPanelReadOnly = js.Any.fromFunction1(setPanelReadOnly))
    __obj.asInstanceOf[LayoutManager]
  }
  @scala.inline
  implicit class LayoutManagerOps[Self <: LayoutManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentLayoutName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLayoutName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_logger(value: GmeLogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_panels(value: js.Array[PanelBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_panels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddPanel(value: (String, PanelBase, Container) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPanel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLoadLayout(value: (Layout, LayoutCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadPanel(value: (Params, LayoutCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPanel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemovePanel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPanelReadOnly(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanelReadOnly")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

