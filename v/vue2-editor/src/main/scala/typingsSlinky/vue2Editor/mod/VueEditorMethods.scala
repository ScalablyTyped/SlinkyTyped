package typingsSlinky.vue2Editor.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueEditorMethods extends js.Object {
  def checkForCustomImageHandler(): Unit = js.native
  def customImageHandler(image: js.Any, callback: js.Any): Unit = js.native
  def emitImageInfo($event: Event): Unit = js.native
  def handleInitialContent(): Unit = js.native
  def handleSelectionChange(range: js.Any, oldRange: js.Any): Unit = js.native
  def handleTextChange(): Unit = js.native
  def initializeEditor(): Unit = js.native
  def listenForEditorEvent(`type`: js.Any): Unit = js.native
  def prepareEditorConfig(editorConfig: js.Any): Unit = js.native
  def registerEditorEventListeners(): Unit = js.native
  def registerPrototypes(): Unit = js.native
  def setModules(): Unit = js.native
  def setupCustomImageHandler(): Unit = js.native
  def setupQuillEditor(): Unit = js.native
}

object VueEditorMethods {
  @scala.inline
  def apply(
    checkForCustomImageHandler: () => Unit,
    customImageHandler: (js.Any, js.Any) => Unit,
    emitImageInfo: Event => Unit,
    handleInitialContent: () => Unit,
    handleSelectionChange: (js.Any, js.Any) => Unit,
    handleTextChange: () => Unit,
    initializeEditor: () => Unit,
    listenForEditorEvent: js.Any => Unit,
    prepareEditorConfig: js.Any => Unit,
    registerEditorEventListeners: () => Unit,
    registerPrototypes: () => Unit,
    setModules: () => Unit,
    setupCustomImageHandler: () => Unit,
    setupQuillEditor: () => Unit
  ): VueEditorMethods = {
    val __obj = js.Dynamic.literal(checkForCustomImageHandler = js.Any.fromFunction0(checkForCustomImageHandler), customImageHandler = js.Any.fromFunction2(customImageHandler), emitImageInfo = js.Any.fromFunction1(emitImageInfo), handleInitialContent = js.Any.fromFunction0(handleInitialContent), handleSelectionChange = js.Any.fromFunction2(handleSelectionChange), handleTextChange = js.Any.fromFunction0(handleTextChange), initializeEditor = js.Any.fromFunction0(initializeEditor), listenForEditorEvent = js.Any.fromFunction1(listenForEditorEvent), prepareEditorConfig = js.Any.fromFunction1(prepareEditorConfig), registerEditorEventListeners = js.Any.fromFunction0(registerEditorEventListeners), registerPrototypes = js.Any.fromFunction0(registerPrototypes), setModules = js.Any.fromFunction0(setModules), setupCustomImageHandler = js.Any.fromFunction0(setupCustomImageHandler), setupQuillEditor = js.Any.fromFunction0(setupQuillEditor))
    __obj.asInstanceOf[VueEditorMethods]
  }
  @scala.inline
  implicit class VueEditorMethodsOps[Self <: VueEditorMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckForCustomImageHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForCustomImageHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustomImageHandler(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customImageHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmitImageInfo(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitImageInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleInitialContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInitialContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleSelectionChange(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleTextChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTextChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitializeEditor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeEditor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListenForEditorEvent(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenForEditorEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrepareEditorConfig(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareEditorConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterEditorEventListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEditorEventListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterPrototypes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerPrototypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetModules(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetupCustomImageHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupCustomImageHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetupQuillEditor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupQuillEditor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

