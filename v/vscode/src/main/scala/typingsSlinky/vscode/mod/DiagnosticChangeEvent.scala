package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticChangeEvent extends StObject {
  
  /**
    * An array of resources for which diagnostics have changed.
    */
  val uris: js.Array[Uri] = js.native
}
object DiagnosticChangeEvent {
  
  @scala.inline
  def apply(uris: js.Array[Uri]): DiagnosticChangeEvent = {
    val __obj = js.Dynamic.literal(uris = uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticChangeEvent]
  }
  
  @scala.inline
  implicit class DiagnosticChangeEventMutableBuilder[Self <: DiagnosticChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUris(value: js.Array[Uri]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisVarargs(value: Uri*): Self = StObject.set(x, "uris", js.Array(value :_*))
  }
}
