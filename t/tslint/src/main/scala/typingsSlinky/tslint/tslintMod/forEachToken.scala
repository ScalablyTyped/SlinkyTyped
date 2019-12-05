package typingsSlinky.tslint.tslintMod

import typingsSlinky.tslint.libLanguageUtilsMod.FilterCallback
import typingsSlinky.tslint.libLanguageUtilsMod.ForEachTokenCallback
import typingsSlinky.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "forEachToken")
@js.native
object forEachToken extends js.Object {
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = js.native
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = js.native
}

