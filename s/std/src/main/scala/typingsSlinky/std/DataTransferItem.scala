package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** One drag data item. During a drag operation, each drag event has a dataTransfer property which contains a list of drag data items. Each item in the list is a DataTransferItem object. */
@js.native
trait DataTransferItem extends StObject {
  
  /**
    * Returns a File object, if the drag data item kind is File.
    */
  def getAsFile(): org.scalajs.dom.raw.File | Null = js.native
  
  /**
    * Invokes the callback with the string data as the argument, if the drag data item kind is text.
    */
  def getAsString(): Unit = js.native
  def getAsString(callback: FunctionStringCallback): Unit = js.native
  
  /**
    * Returns the drag data item kind, one of: "string", "file".
    */
  val kind: java.lang.String = js.native
  
  /**
    * Returns the drag data item type string.
    */
  val `type`: java.lang.String = js.native
  
  def webkitGetAsEntry(): js.Any = js.native
}
