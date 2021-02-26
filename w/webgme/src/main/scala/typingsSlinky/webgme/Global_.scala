package typingsSlinky.webgme

import typingsSlinky.webgme.GmeCommon.MetadataHash
import typingsSlinky.webgme.GmeCommon.Path
import typingsSlinky.webgme.GmePanel.Layout
import typingsSlinky.webgme.GmePanel.LayoutManager
import typingsSlinky.webgme.GmePanel.PanelManager
import typingsSlinky.webgme.Visualize.Visualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global_ {
  
  @js.native
  trait GmeLogger extends StObject {
    
    def debug(fmt: String): Unit = js.native
    def debug(fmt: String, msg: String): Unit = js.native
    
    def error(fmt: String): Unit = js.native
    def error(fmt: String, msg: String): Unit = js.native
    
    /**
      Creates a new logger with the same settings
      and a name that is an augmentation of this logger and the
      provided string.
      If the second argument is true
      - the provided name will be used as is.
      */
    def fork(fmt: String): GmeLogger = js.native
    def fork(fmt: String, reuse: Boolean): GmeLogger = js.native
    
    def info(fmt: String): Unit = js.native
    def info(fmt: String, msg: String): Unit = js.native
    
    def warn(fmt: String): Unit = js.native
    def warn(fmt: String, msg: String): Unit = js.native
  }
  
  @js.native
  trait History extends StObject {
    
    var configurable: Boolean = js.native
    
    var enumerable: Boolean = js.native
    
    var value: Boolean = js.native
    
    var writable: Boolean = js.native
  }
  object History {
    
    @scala.inline
    def apply(configurable: Boolean, enumerable: Boolean, value: Boolean, writable: Boolean): History = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    @scala.inline
    implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyboardManager extends StObject {
    
    def setEnabled(action: Boolean): Unit = js.native
    
    def setListener(): Unit = js.native
    def setListener(listener: js.Any): Unit = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    def clear(): Unit = js.native
    def clear(options: StateOptions): Unit = js.native
    
    def getActiveObject(): js.Any = js.native
    
    def off(message: String, handler: StateHandler): Unit = js.native
    
    def on(message: String, handler: StateHandler, target: js.Any): Unit = js.native
    
    def registerActiveBranchName(branchName: String): Unit = js.native
    
    def registerActiveCommit(activeCommitHash: MetadataHash): Unit = js.native
    
    def registerActiveObject(nodePath: Path): Unit = js.native
    
    def registerActiveSelection(selection: js.Array[String]): Unit = js.native
    
    def registerActiveVisualizer(vizualizer: Visualizer): Unit = js.native
    
    def registerLayout(layout: Layout): Unit = js.native
    
    def registerSuppressVisualizerFromNode(register: Boolean): Unit = js.native
    
    def set(update: State): Unit = js.native
    
    def toJSON(): js.Any = js.native
  }
  
  type StateHandler = js.Function2[/* model */ js.Any, /* change */ String, Unit]
  
  @js.native
  trait StateOptions extends StObject {
    
    var silent: Boolean = js.native
  }
  object StateOptions {
    
    @scala.inline
    def apply(silent: Boolean): StateOptions = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateOptions]
    }
    
    @scala.inline
    implicit class StateOptionsMutableBuilder[Self <: StateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserInfo extends StObject {
    
    var _id: String = js.native
  }
  object UserInfo {
    
    @scala.inline
    def apply(_id: String): UserInfo = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGmeGlobal extends StObject {
    
    var GitHubVersion: js.UndefOr[String] = js.native
    
    var KeyboardManager: js.UndefOr[typingsSlinky.webgme.Global_.KeyboardManager] = js.native
    
    var LayoutManager: js.UndefOr[typingsSlinky.webgme.GmePanel.LayoutManager] = js.native
    
    var NpmVersion: js.UndefOr[String] = js.native
    
    var PanelManager: js.UndefOr[typingsSlinky.webgme.GmePanel.PanelManager] = js.native
    
    var State: js.UndefOr[typingsSlinky.webgme.Global_.State] = js.native
    
    var Toolbar: js.UndefOr[typingsSlinky.webgme.Toolbar.Toolbar] = js.native
    
    def getConfig(): typingsSlinky.webgme.GmeConfig.GmeConfig = js.native
    
    var gmeConfig: typingsSlinky.webgme.GmeConfig.GmeConfig = js.native
    
    var history: js.UndefOr[History] = js.native
    
    var userInfo: js.UndefOr[UserInfo] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object WebGmeGlobal {
    
    @scala.inline
    def apply(
      getConfig: () => typingsSlinky.webgme.GmeConfig.GmeConfig,
      gmeConfig: typingsSlinky.webgme.GmeConfig.GmeConfig
    ): WebGmeGlobal = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), gmeConfig = gmeConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGmeGlobal]
    }
    
    @scala.inline
    implicit class WebGmeGlobalMutableBuilder[Self <: WebGmeGlobal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetConfig(value: () => typingsSlinky.webgme.GmeConfig.GmeConfig): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGitHubVersion(value: String): Self = StObject.set(x, "GitHubVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitHubVersionUndefined: Self = StObject.set(x, "GitHubVersion", js.undefined)
      
      @scala.inline
      def setGmeConfig(value: typingsSlinky.webgme.GmeConfig.GmeConfig): Self = StObject.set(x, "gmeConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setKeyboardManager(value: KeyboardManager): Self = StObject.set(x, "KeyboardManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardManagerUndefined: Self = StObject.set(x, "KeyboardManager", js.undefined)
      
      @scala.inline
      def setLayoutManager(value: LayoutManager): Self = StObject.set(x, "LayoutManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutManagerUndefined: Self = StObject.set(x, "LayoutManager", js.undefined)
      
      @scala.inline
      def setNpmVersion(value: String): Self = StObject.set(x, "NpmVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpmVersionUndefined: Self = StObject.set(x, "NpmVersion", js.undefined)
      
      @scala.inline
      def setPanelManager(value: PanelManager): Self = StObject.set(x, "PanelManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelManagerUndefined: Self = StObject.set(x, "PanelManager", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      @scala.inline
      def setToolbar(value: typingsSlinky.webgme.Toolbar.Toolbar): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "Toolbar", js.undefined)
      
      @scala.inline
      def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
