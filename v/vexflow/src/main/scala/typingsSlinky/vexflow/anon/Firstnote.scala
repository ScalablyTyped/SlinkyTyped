package typingsSlinky.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstnote extends StObject {
  
  var first_note: typingsSlinky.vexflow.Vex.Flow.Note = js.native
  
  var last_note: typingsSlinky.vexflow.Vex.Flow.Note = js.native
}
object Firstnote {
  
  @scala.inline
  def apply(first_note: typingsSlinky.vexflow.Vex.Flow.Note, last_note: typingsSlinky.vexflow.Vex.Flow.Note): Firstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstnote]
  }
  
  @scala.inline
  implicit class FirstnoteMutableBuilder[Self <: Firstnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_note(value: typingsSlinky.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_note(value: typingsSlinky.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
