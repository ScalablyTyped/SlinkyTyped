package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.ClassDeclaration_
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.vueDocgenApi.parseMod.ParseOptions
import typingsSlinky.vueDocgenApi.parseScriptMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/script-handlers", JSImport.Namespace)
@js.native
object scriptHandlersMod extends js.Object {
  
  def classDisplayNameHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def classMethodHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def classPropHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    path: NodePath[ClassDeclaration_, _]
  ): js.Promise[Unit] = js.native
  
  def componentHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  val default: js.Array[Handler] = js.native
  
  def displayNameHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, compDef: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def eventHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    path: NodePath[_, _],
    astPath: File_
  ): js.Promise[Unit] = js.native
  
  def extendsHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[_, _],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = js.native
  
  def methodHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def mixinsHandler(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[_, _],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = js.native
  
  val preHandlers: js.Array[Handler] = js.native
  
  def propHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def slotHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def slotHandlerFunctional(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def slotHandlerLitteral(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
}
