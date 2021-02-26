package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedProjectReference extends StObject {
  
  var commandLine: ParsedCommandLine = js.native
  
  var references: js.UndefOr[js.Array[js.UndefOr[ResolvedProjectReference]]] = js.native
  
  var sourceFile: SourceFile = js.native
}
object ResolvedProjectReference {
  
  @scala.inline
  def apply(commandLine: ParsedCommandLine, sourceFile: SourceFile): ResolvedProjectReference = {
    val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedProjectReference]
  }
  
  @scala.inline
  implicit class ResolvedProjectReferenceMutableBuilder[Self <: ResolvedProjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandLine(value: ParsedCommandLine): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: js.Array[js.UndefOr[ResolvedProjectReference]]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setReferencesVarargs(value: js.UndefOr[ResolvedProjectReference]*): Self = StObject.set(x, "references", js.Array(value :_*))
    
    @scala.inline
    def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
  }
}
