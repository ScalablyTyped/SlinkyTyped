package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceMapper")
@js.native
class SourceMapper protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.SourceMapper {
  def this(
    jsFile: typingsSlinky.typescriptDashServices.TypeScript.TextWriter,
    sourceMapOut: typingsSlinky.typescriptDashServices.TypeScript.TextWriter,
    document: typingsSlinky.typescriptDashServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typingsSlinky.typescriptDashServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

