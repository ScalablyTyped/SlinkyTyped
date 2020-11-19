package typingsSlinky.tslint.mod

import typingsSlinky.tslint.utilsMod.FilterCallback
import typingsSlinky.tslint.utilsMod.ForEachTokenCallback
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "forEachToken")
@js.native
object forEachToken extends js.Object {
  
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = js.native
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = js.native
}
