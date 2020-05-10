package typingsSlinky.typescript.mod.server

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.SortedReadonlyArray
import typingsSlinky.typescript.mod.TypeAcquisition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withCompilerOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAcquisition(value: TypeAcquisition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAcquisition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnresolvedImports(value: SortedReadonlyArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolvedImports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

