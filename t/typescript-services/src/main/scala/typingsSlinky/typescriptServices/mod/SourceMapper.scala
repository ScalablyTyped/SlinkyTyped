package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceMapper")
@js.native
class SourceMapper protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typingsSlinky.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typingsSlinky.typescriptServices.TypeScript.TextWriter,
    document: typingsSlinky.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typingsSlinky.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

