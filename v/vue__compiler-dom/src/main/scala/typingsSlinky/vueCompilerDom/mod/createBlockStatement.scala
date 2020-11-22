package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.BlockStatement
import typingsSlinky.vueCompilerCore.mod.IfStatement
import typingsSlinky.vueCompilerCore.mod.JSChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createBlockStatement")
@js.native
object createBlockStatement extends js.Object {
  
  def apply(body: js.Array[JSChildNode | IfStatement]): BlockStatement = js.native
}
