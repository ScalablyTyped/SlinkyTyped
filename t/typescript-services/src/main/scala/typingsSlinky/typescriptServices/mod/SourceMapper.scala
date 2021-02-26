package typingsSlinky.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object SourceMapper {
  
  @JSImport("typescript-services", "SourceMapper")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "SourceMapper.MapFileExtension")
  @js.native
  def MapFileExtension: String = js.native
  @scala.inline
  def MapFileExtension_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MapFileExtension")(x.asInstanceOf[js.Any])
}
