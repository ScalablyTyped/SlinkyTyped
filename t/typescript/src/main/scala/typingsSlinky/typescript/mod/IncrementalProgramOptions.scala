package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementalProgramOptions[T /* <: BuilderProgram */] extends StObject {
  
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  
  var createProgram: js.UndefOr[CreateProgram_[T]] = js.native
  
  var host: js.UndefOr[CompilerHost] = js.native
  
  var options: CompilerOptions = js.native
  
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  
  var rootNames: js.Array[java.lang.String] = js.native
}
object IncrementalProgramOptions {
  
  @scala.inline
  def apply[T /* <: BuilderProgram */](options: CompilerOptions, rootNames: js.Array[java.lang.String]): IncrementalProgramOptions[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementalProgramOptions[T]]
  }
  
  @scala.inline
  implicit class IncrementalProgramOptionsMutableBuilder[Self <: IncrementalProgramOptions[_], T /* <: BuilderProgram */] (val x: Self with IncrementalProgramOptions[T]) extends AnyVal {
    
    @scala.inline
    def setConfigFileParsingDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "configFileParsingDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileParsingDiagnosticsUndefined: Self = StObject.set(x, "configFileParsingDiagnostics", js.undefined)
    
    @scala.inline
    def setConfigFileParsingDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "configFileParsingDiagnostics", js.Array(value :_*))
    
    @scala.inline
    def setCreateProgram(
      value: (/* rootNames */ js.UndefOr[js.Array[java.lang.String]], /* options */ js.UndefOr[CompilerOptions], /* host */ js.UndefOr[CompilerHost], /* oldProgram */ js.UndefOr[T], /* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], /* projectReferences */ js.UndefOr[js.Array[ProjectReference]]) => T
    ): Self = StObject.set(x, "createProgram", js.Any.fromFunction6(value))
    
    @scala.inline
    def setCreateProgramUndefined: Self = StObject.set(x, "createProgram", js.undefined)
    
    @scala.inline
    def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
    
    @scala.inline
    def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value :_*))
    
    @scala.inline
    def setRootNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "rootNames", js.Array(value :_*))
  }
}
