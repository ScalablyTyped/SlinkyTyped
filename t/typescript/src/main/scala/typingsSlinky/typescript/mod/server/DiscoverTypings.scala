package typingsSlinky.typescript.mod.server

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Path
import typingsSlinky.typescript.mod.SortedReadonlyArray
import typingsSlinky.typescript.mod.TypeAcquisition
import typingsSlinky.typescript.mod.WatchOptions
import typingsSlinky.typescript.typescriptStrings.discover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverTypings extends TypingInstallerRequestWithProjectName {
  val cachePath: js.UndefOr[String] = js.undefined
  val compilerOptions: CompilerOptions
  val fileNames: js.Array[String]
  val kind: discover
  val projectRootPath: Path
  val typeAcquisition: TypeAcquisition
  val unresolvedImports: SortedReadonlyArray[String]
  val watchOptions: js.UndefOr[WatchOptions] = js.undefined
}

object DiscoverTypings {
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions,
    fileNames: js.Array[String],
    kind: discover,
    projectName: String,
    projectRootPath: Path,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String],
    cachePath: String = null,
    watchOptions: WatchOptions = null
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverTypings]
  }
}

