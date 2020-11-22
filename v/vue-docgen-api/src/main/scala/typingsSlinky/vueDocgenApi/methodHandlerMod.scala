package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.Function
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.BlockTag
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.MethodDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/script-handlers/methodHandler", JSImport.Namespace)
@js.native
object methodHandlerMod extends js.Object {
  
  def default(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def setMethodDescriptor(methodDescriptor: MethodDescriptor, method: NodePath[Function, _], jsDocTags: js.Array[BlockTag]): MethodDescriptor = js.native
}
