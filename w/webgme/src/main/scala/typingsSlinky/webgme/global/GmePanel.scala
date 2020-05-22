package typingsSlinky.webgme.global

import typingsSlinky.webgme.Global_.GmeLogger
import typingsSlinky.webgme.Gme.Client
import typingsSlinky.webgme.GmeConfig.LogOptions
import typingsSlinky.webgme.GmePanel.Container
import typingsSlinky.webgme.GmePanel.LayoutCallback
import typingsSlinky.webgme.GmePanel.Options
import typingsSlinky.webgme.GmePanel.OptionsWithHeader
import typingsSlinky.webgme.GmePanel.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel")
@js.native
object GmePanel extends js.Object {
  @js.native
  class IActivePanel ()
    extends typingsSlinky.webgme.GmePanel.IActivePanel {
    /* CompleteClass */
    override def getNodeID(): String = js.native
    /* CompleteClass */
    override def onActivate(): Unit = js.native
    /* CompleteClass */
    override def onDeactivate(): Unit = js.native
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
  }
  
  @js.native
  class Layout ()
    extends typingsSlinky.webgme.GmePanel.Layout
  
  @js.native
  class LayoutManager ()
    extends typingsSlinky.webgme.GmePanel.LayoutManager {
    /* CompleteClass */
    override var _currentLayout: typingsSlinky.webgme.GmePanel.Layout = js.native
    /* CompleteClass */
    override var _currentLayoutName: String = js.native
    /* CompleteClass */
    override var _logger: GmeLogger = js.native
    /* CompleteClass */
    override var _panels: js.Array[typingsSlinky.webgme.GmePanel.PanelBase] = js.native
    /* CompleteClass */
    override def addPanel(name: String, panel: typingsSlinky.webgme.GmePanel.PanelBase, container: Container): Unit = js.native
    /* CompleteClass */
    override def loadLayout(layout: typingsSlinky.webgme.GmePanel.Layout, callback: LayoutCallback): Unit = js.native
    /* CompleteClass */
    override def loadPanel(params: Params, callback: LayoutCallback): Unit = js.native
    /* CompleteClass */
    override def removePanel(name: String): Unit = js.native
    /* CompleteClass */
    override def setPanelReadOnly(readOnly: Boolean): Unit = js.native
  }
  
  @js.native
  class Logger ()
    extends typingsSlinky.webgme.GmePanel.Logger {
    /* CompleteClass */
    override def createLogger(name: String, options: LogOptions): typingsSlinky.webgme.GmePanel.Logger = js.native
    /* CompleteClass */
    override def createWithGmeConfig(name: String, gmeConfig: typingsSlinky.webgme.GmeConfig.GmeConfig): typingsSlinky.webgme.GmePanel.Logger = js.native
  }
  
  @js.native
  class PanelBase protected ()
    extends typingsSlinky.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
    /* CompleteClass */
    override var OPTIONS: Options = js.native
    /* CompleteClass */
    override var control: js.Any = js.native
    /* CompleteClass */
    override var logger: GmeLogger = js.native
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    /* CompleteClass */
    override def setContainerUpdateFn(
      currentLayout: typingsSlinky.webgme.GmePanel.Layout,
      sizeUpdateFn: js.Function1[/* layout */ typingsSlinky.webgme.GmePanel.Layout, Double]
    ): Unit = js.native
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
  }
  
  @js.native
  class PanelBaseWithHeader protected ()
    extends typingsSlinky.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typingsSlinky.webgme.GmePanel.LayoutManager) = this()
    /* CompleteClass */
    override var OPTIONS: Options = js.native
    /* CompleteClass */
    @JSName("OPTIONS")
    override var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
    /* CompleteClass */
    override var control: js.Any = js.native
    /* CompleteClass */
    override var logger: GmeLogger = js.native
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def getNodeID(): String = js.native
    /* CompleteClass */
    override def initUI(options: OptionsWithHeader): Unit = js.native
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
    /* CompleteClass */
    override def setContainerUpdateFn(
      currentLayout: typingsSlinky.webgme.GmePanel.Layout,
      sizeUpdateFn: js.Function1[/* layout */ typingsSlinky.webgme.GmePanel.Layout, Double]
    ): Unit = js.native
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
    /* CompleteClass */
    override def setTitle(text: String): Unit = js.native
  }
  
  @js.native
  class PanelManager protected ()
    extends typingsSlinky.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
    /* CompleteClass */
    override def getActivePanel(): typingsSlinky.webgme.GmePanel.PanelBase = js.native
    /* CompleteClass */
    override def setActivePanel(panel: typingsSlinky.webgme.GmePanel.PanelBase): Unit = js.native
  }
  
}

