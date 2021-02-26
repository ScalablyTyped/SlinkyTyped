package typingsSlinky.tinymce.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Window
import typingsSlinky.tinymce.mod.dom.DOMUtils
import typingsSlinky.tinymce.mod.dom.DomQuery
import typingsSlinky.tinymce.mod.dom.Selection
import typingsSlinky.tinymce.mod.dom.Serializer
import typingsSlinky.tinymce.mod.html.DomParser
import typingsSlinky.tinymce.mod.html.Schema
import typingsSlinky.tinymce.mod.util.Observable
import typingsSlinky.tinymce.mod.util.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "Editor")
@js.native
class Editor protected () extends Observable {
  def this(id: String, settings: Settings_, editorManager: typingsSlinky.tinymce.mod.EditorManager) = this()
  
  @JSName("$")
  var $: DomQuery = js.native
  
  def addButton(name: String, settings: js.Object): Unit = js.native
  
  def addCommand(name: String, callback: js.Function2[/* ui */ Boolean, /* value */ js.Object, Boolean]): Unit = js.native
  def addCommand(
    name: String,
    callback: js.Function2[/* ui */ Boolean, /* value */ js.Object, Boolean],
    scope: js.Object
  ): Unit = js.native
  
  def addContextToolbar(predicate: String, items: String): Unit = js.native
  def addContextToolbar(predicate: js.Function1[/* el */ Node, Boolean], items: String): Unit = js.native
  
  def addMenuItem(name: String, settings: js.Object): Unit = js.native
  
  def addQueryStateHandler(name: String, callback: js.Function0[Boolean]): Unit = js.native
  def addQueryStateHandler(name: String, callback: js.Function0[Boolean], scope: js.Object): Unit = js.native
  
  def addQueryValueHandler(name: String, callback: js.Function0[js.Object]): Unit = js.native
  def addQueryValueHandler(name: String, callback: js.Function0[js.Object], scope: js.Object): Unit = js.native
  
  def addShortcut(pattern: String, desc: String, cmdFunc: String): Boolean = js.native
  def addShortcut(pattern: String, desc: String, cmdFunc: String, sc: js.Object): Boolean = js.native
  
  def addSidebar(name: String, settings: js.Object): Unit = js.native
  
  def addVisual(): Unit = js.native
  def addVisual(elm: Element): Unit = js.native
  
  var baseURI: URI = js.native
  
  var contentCSS: js.Array[String] = js.native
  
  var contentStyles: js.Array[String] = js.native
  
  def convertURL(url: String, name: String, elm: String): String = js.native
  
  def destroy(): Unit = js.native
  def destroy(automatic: Boolean): Unit = js.native
  
  var documentBaseURI: URI = js.native
  
  var dom: DOMUtils = js.native
  
  def execCallback(name: String): js.Object = js.native
  
  def execCommand(cmd: String): Unit = js.native
  def execCommand(cmd: String, ui: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], args: js.Object): Unit = js.native
  def execCommand(cmd: String, ui: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def execCommand(cmd: String, ui: js.UndefOr[scala.Nothing], value: js.Any, args: js.Object): Unit = js.native
  def execCommand(cmd: String, ui: Boolean): Unit = js.native
  def execCommand(cmd: String, ui: Boolean, value: js.UndefOr[scala.Nothing], args: js.Object): Unit = js.native
  def execCommand(cmd: String, ui: Boolean, value: js.Any): Unit = js.native
  def execCommand(cmd: String, ui: Boolean, value: js.Any, args: js.Object): Unit = js.native
  
  def focus(skipFocus: Boolean): Unit = js.native
  
  var formatter: Formatter = js.native
  
  def getBody(): HTMLBodyElement = js.native
  
  def getContainer(): Element = js.native
  
  def getContent(): String = js.native
  def getContent(args: js.Object): String = js.native
  
  def getContentAreaContainer(): Element = js.native
  
  def getDoc(): Document = js.native
  
  def getElement(): Element = js.native
  
  def getLang(name: String): Unit = js.native
  def getLang(name: String, defaultVal: String): Unit = js.native
  
  def getParam(name: String): String = js.native
  def getParam(name: String, defaultVal: js.UndefOr[scala.Nothing], `type`: String): String = js.native
  def getParam(name: String, defaultVal: String): String = js.native
  def getParam(name: String, defaultVal: String, `type`: String): String = js.native
  
  def getWin(): Window = js.native
  
  def hide(): Unit = js.native
  
  var id: String = js.native
  
  def init(): Unit = js.native
  
  var initialized: Boolean = js.native
  
  def insertContent(content: String): Unit = js.native
  def insertContent(content: String, args: js.Object): Unit = js.native
  
  def isDirty(): Boolean = js.native
  
  def isHidden(): Boolean = js.native
  
  def load(): String = js.native
  def load(args: js.Object): String = js.native
  
  def nodeChanged(): Unit = js.native
  def nodeChanged(args: js.Object): Unit = js.native
  
  var notificationManager: typingsSlinky.tinymce.mod.notificationManager = js.native
  
  var parser: DomParser = js.native
  
  def queryCommandState(cmd: String): Boolean = js.native
  
  def queryCommandSupported(cmd: String): Boolean = js.native
  
  def queryCommandValue(cmd: String): js.Object = js.native
  
  def remove(): Unit = js.native
  
  def render(): Unit = js.native
  
  def save(args: js.Object): String = js.native
  
  var schema: Schema = js.native
  
  var selection: Selection = js.native
  
  var serializer: Serializer = js.native
  
  def setContent(content: String): String = js.native
  def setContent(content: String, args: js.Object): String = js.native
  
  def setDirty(state: Boolean): Unit = js.native
  
  def setMode(mode: String): Unit = js.native
  
  def setProgressState(state: Boolean, time: Double): Boolean = js.native
  
  var settings: Settings_ = js.native
  
  def show(): Unit = js.native
  
  var theme: Theme = js.native
  
  def translate(text: String): String = js.native
  
  var undoManager: UndoManager = js.native
  
  def uploadImages(callback: js.Function0[Unit]): js.Promise[_] = js.native
  
  var windowManager: WindowManager = js.native
}
