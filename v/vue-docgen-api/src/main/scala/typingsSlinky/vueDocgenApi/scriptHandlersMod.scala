package typingsSlinky.vueDocgenApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.ClassDeclaration_
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.vueDocgenApi.parseMod.ParseOptions
import typingsSlinky.vueDocgenApi.parseScriptMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptHandlersMod extends Shortcut {
  
  @JSImport("vue-docgen-api/dist/script-handlers", JSImport.Default)
  @js.native
  val default: js.Array[Handler] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "classDisplayNameHandler")
  @js.native
  def classDisplayNameHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "classMethodHandler")
  @js.native
  def classMethodHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "classPropHandler")
  @js.native
  def classPropHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    path: NodePath[ClassDeclaration_, _]
  ): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "componentHandler")
  @js.native
  def componentHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "displayNameHandler")
  @js.native
  def displayNameHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, compDef: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "eventHandler")
  @js.native
  def eventHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    path: NodePath[_, _],
    astPath: File_
  ): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "extendsHandler")
  @js.native
  def extendsHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[_, _],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "methodHandler")
  @js.native
  def methodHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "mixinsHandler")
  @js.native
  def mixinsHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[_, _],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "preHandlers")
  @js.native
  val preHandlers: js.Array[Handler] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "propHandler")
  @js.native
  def propHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "slotHandler")
  @js.native
  def slotHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "slotHandlerFunctional")
  @js.native
  def slotHandlerFunctional(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", "slotHandlerLitteral")
  @js.native
  def slotHandlerLitteral(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  type _To = js.Array[Handler]
  
  /* This means you don't have to write `default`, but can instead just say `scriptHandlersMod.foo` */
  override def _to: js.Array[Handler] = default
}
