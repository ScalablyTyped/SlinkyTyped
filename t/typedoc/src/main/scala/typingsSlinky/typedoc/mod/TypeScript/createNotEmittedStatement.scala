package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NotEmittedStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createNotEmittedStatement")
@js.native
object createNotEmittedStatement extends js.Object {
  
  /**
    * Creates a synthetic statement to act as a placeholder for a not-emitted statement in
    * order to preserve comments.
    *
    * @param original The original statement.
    */
  def apply(original: Node): NotEmittedStatement = js.native
}
