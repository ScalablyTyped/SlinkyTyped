package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendsHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/extendsHandler", JSImport.Default)
  @js.native
  def default(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[_, _],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = js.native
}
