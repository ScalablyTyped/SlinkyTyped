package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JSDocTag
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocTags")
@js.native
object getJSDocTags extends js.Object {
  
  /** Get all JSDoc tags related to a node, including those on parent nodes. */
  def apply(node: Node): js.Array[JSDocTag] = js.native
}
