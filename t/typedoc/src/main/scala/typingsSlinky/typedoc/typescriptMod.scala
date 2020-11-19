package typingsSlinky.typedoc

import typingsSlinky.std.ReadonlySet
import typingsSlinky.typedoc.optionsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/utils/options/sources/typescript", JSImport.Namespace)
@js.native
object typescriptMod extends js.Object {
  
  val IGNORED: ReadonlySet[String] = js.native
  
  def addTSOptions(container: Options): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedoc.typedocStrings.out
    - typingsSlinky.typedoc.typedocStrings.version
    - typingsSlinky.typedoc.typedocStrings.help
    - typingsSlinky.typedoc.typedocStrings.emitDeclarationOnly
    - typingsSlinky.typedoc.typedocStrings.watch
    - typingsSlinky.typedoc.typedocStrings.declaration
    - typingsSlinky.typedoc.typedocStrings.declarationDir
    - typingsSlinky.typedoc.typedocStrings.declarationMap
    - typingsSlinky.typedoc.typedocStrings.mapRoot
    - typingsSlinky.typedoc.typedocStrings.sourceMap
    - typingsSlinky.typedoc.typedocStrings.inlineSources
    - typingsSlinky.typedoc.typedocStrings.removeComments
    - typingsSlinky.typedoc.typedocStrings.incremental
    - typingsSlinky.typedoc.typedocStrings.tsBuildInfoFile
  */
  trait IgnoredTsOptionKeys extends js.Object
}
