package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeFixAction extends CodeAction {
  
  var fixAllDescription: js.UndefOr[java.lang.String] = js.native
  
  /**
    * If present, one may call 'getCombinedCodeFix' with this fixId.
    * This may be omitted to indicate that the code fix can't be applied in a group.
    */
  var fixId: js.UndefOr[js.Object] = js.native
  
  /** Short name to identify the fix, for use by telemetry. */
  var fixName: java.lang.String = js.native
}
object CodeFixAction {
  
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], description: java.lang.String, fixName: java.lang.String): CodeFixAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixName = fixName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFixAction]
  }
  
  @scala.inline
  implicit class CodeFixActionMutableBuilder[Self <: CodeFixAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixAllDescription(value: java.lang.String): Self = StObject.set(x, "fixAllDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixAllDescriptionUndefined: Self = StObject.set(x, "fixAllDescription", js.undefined)
    
    @scala.inline
    def setFixId(value: js.Object): Self = StObject.set(x, "fixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixIdUndefined: Self = StObject.set(x, "fixId", js.undefined)
    
    @scala.inline
    def setFixName(value: java.lang.String): Self = StObject.set(x, "fixName", value.asInstanceOf[js.Any])
  }
}
