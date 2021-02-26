package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.vueDocgenApi.documentationMod.default
import typingsSlinky.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseScriptMod {
  
  @JSImport("vue-docgen-api/dist/parse-script", JSImport.Default)
  @js.native
  def default(source: String, preHandlers: js.Array[Handler], handlers: js.Array[Handler], options: ParseOptions): js.Promise[js.UndefOr[js.Array[typingsSlinky.vueDocgenApi.documentationMod.default]]] = js.native
  @JSImport("vue-docgen-api/dist/parse-script", JSImport.Default)
  @js.native
  def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: js.UndefOr[scala.Nothing],
    forceSingleExport: Boolean
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.vueDocgenApi.documentationMod.default]]] = js.native
  @JSImport("vue-docgen-api/dist/parse-script", JSImport.Default)
  @js.native
  def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.vueDocgenApi.documentationMod.default]]] = js.native
  @JSImport("vue-docgen-api/dist/parse-script", JSImport.Default)
  @js.native
  def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    forceSingleExport: Boolean
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.vueDocgenApi.documentationMod.default]]] = js.native
  
  type Handler = js.Function4[
    /* doc */ default, 
    /* componentDefinition */ NodePath[js.Any, js.Any], 
    /* ast */ File_, 
    /* opt */ ParseOptions, 
    js.Promise[Unit]
  ]
}
