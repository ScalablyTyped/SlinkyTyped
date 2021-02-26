package typingsSlinky.typescript.mod.server

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.SortedReadonlyArray
import typingsSlinky.typescript.mod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTypings extends ProjectResponse {
  
  val compilerOptions: CompilerOptions = js.native
  
  @JSName("kind")
  val kind_SetTypings: ActionSet = js.native
  
  val typeAcquisition: TypeAcquisition = js.native
  
  val typings: js.Array[String] = js.native
  
  val unresolvedImports: SortedReadonlyArray[String] = js.native
}
object SetTypings {
  
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions,
    kind: ActionSet,
    projectName: String,
    typeAcquisition: TypeAcquisition,
    typings: js.Array[String],
    unresolvedImports: SortedReadonlyArray[String]
  ): SetTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], typings = typings.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTypings]
  }
  
  @scala.inline
  implicit class SetTypingsMutableBuilder[Self <: SetTypings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActionSet): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypings(value: js.Array[String]): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypingsVarargs(value: String*): Self = StObject.set(x, "typings", js.Array(value :_*))
    
    @scala.inline
    def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = StObject.set(x, "unresolvedImports", value.asInstanceOf[js.Any])
  }
}
