package typingsSlinky.typescript.mod.server

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.SortedReadonlyArray
import typingsSlinky.typescript.mod.TypeAcquisition
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
  implicit class SetTypingsOps[Self <: SetTypings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActionSet): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = this.set("typeAcquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypingsVarargs(value: String*): Self = this.set("typings", js.Array(value :_*))
    
    @scala.inline
    def setTypings(value: js.Array[String]): Self = this.set("typings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = this.set("unresolvedImports", value.asInstanceOf[js.Any])
  }
}
