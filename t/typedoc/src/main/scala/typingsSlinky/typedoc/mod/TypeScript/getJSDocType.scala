package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocType")
@js.native
object getJSDocType extends js.Object {
  
  /**
    * Gets the type node for the node if provided via JSDoc.
    *
    * @remarks The search includes any JSDoc param tag that relates
    * to the provided parameter, for example a type tag on the
    * parameter itself, or a param tag on a containing function
    * expression, or a param tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are examined first, so in the previous example, the type
    * tag directly on the node would be returned.
    */
  def apply(node: Node): js.UndefOr[TypeNode] = js.native
}
