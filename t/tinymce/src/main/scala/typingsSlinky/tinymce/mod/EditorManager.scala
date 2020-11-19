package typingsSlinky.tinymce.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tinymce.mod.dom.DomQuery
import typingsSlinky.tinymce.mod.util.Observable
import typingsSlinky.tinymce.mod.util.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorManager extends Observable {
  
  @JSName("$")
  var $: DomQuery = js.native
  
  var activeEditor: Editor = js.native
  
  def add(editor: Editor): Editor = js.native
  
  def addI18n(code: String, items: js.Object): Unit = js.native
  
  var baseURI: URI = js.native
  
  var baseURL: String = js.native
  
  def createEditor(id: String, settings: js.Object): Editor = js.native
  
  var documentBaseURL: String = js.native
  
  var editors: js.Array[Editor] = js.native
  
  def execCommand(cmd: String): Boolean = js.native
  def execCommand(cmd: String, ui: js.UndefOr[scala.Nothing], value: String): Boolean = js.native
  def execCommand(cmd: String, ui: Boolean): Boolean = js.native
  def execCommand(cmd: String, ui: Boolean, value: String): Boolean = js.native
  
  def get(id: String): Editor = js.native
  
  def init(settings: Settings_): js.Promise[Editor] = js.native
  
  var majorVersion: String = js.native
  
  var minorVersion: String = js.native
  
  def overrideDefaults(defaultSettings: js.Object): Unit = js.native
  
  var releaseDate: String = js.native
  
  def remove(selector: Editor): Editor = js.native
  
  def setActive(editor: Editor): Unit = js.native
  
  var suffix: String = js.native
  
  def translate(text: String): String = js.native
  
  def triggerSave(): Unit = js.native
}
@JSImport("tinymce", "EditorManager")
@js.native
object EditorManager extends TopLevel[EditorManager]
