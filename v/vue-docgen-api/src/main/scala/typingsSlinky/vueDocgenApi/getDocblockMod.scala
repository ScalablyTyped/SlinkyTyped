package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.vueDocgenApi.anon.CommentIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/utils/getDocblock", JSImport.Namespace)
@js.native
object getDocblockMod extends js.Object {
  
  def default(path: NodePath[_, _]): String | Null = js.native
  def default(path: NodePath[_, _], hasCommentIndex: CommentIndex): String | Null = js.native
  
  def parseDocblock(str: String): String = js.native
}
