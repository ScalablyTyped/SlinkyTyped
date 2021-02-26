package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileChangeEvent extends StObject {
  
  /**
    * The type of change.
    */
  val `type`: FileChangeType = js.native
  
  /**
    * The uri of the file that has changed.
    */
  val uri: Uri = js.native
}
object FileChangeEvent {
  
  @scala.inline
  def apply(`type`: FileChangeType, uri: Uri): FileChangeEvent = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChangeEvent]
  }
  
  @scala.inline
  implicit class FileChangeEventMutableBuilder[Self <: FileChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FileChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
