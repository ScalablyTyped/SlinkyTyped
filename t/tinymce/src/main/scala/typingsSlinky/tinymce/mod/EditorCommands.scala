package typingsSlinky.tinymce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorCommands extends StObject {
  
  def addCommands(command_list: js.Object): Unit = js.native
  def addCommands(command_list: js.Object, `type`: String): Unit = js.native
  
  def execCommand(command: String): Boolean = js.native
  def execCommand(command: String, ui: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], args: js.Object): Boolean = js.native
  def execCommand(command: String, ui: js.UndefOr[scala.Nothing], value: js.Object): Boolean = js.native
  def execCommand(command: String, ui: js.UndefOr[scala.Nothing], value: js.Object, args: js.Object): Boolean = js.native
  def execCommand(command: String, ui: Boolean): Boolean = js.native
  def execCommand(command: String, ui: Boolean, value: js.UndefOr[scala.Nothing], args: js.Object): Boolean = js.native
  def execCommand(command: String, ui: Boolean, value: js.Object): Boolean = js.native
  def execCommand(command: String, ui: Boolean, value: js.Object, args: js.Object): Boolean = js.native
  
  def queryCommandState(command: String): Boolean | Double = js.native
  
  def queryCommandSupported(command: String): Boolean = js.native
  
  def queryCommandValue(command: String): js.Object = js.native
}
