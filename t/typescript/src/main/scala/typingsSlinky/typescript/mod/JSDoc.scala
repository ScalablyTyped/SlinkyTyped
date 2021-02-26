package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.JSDocComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDoc extends Node {
  
  val comment: js.UndefOr[java.lang.String] = js.native
  
  @JSName("kind")
  val kind_JSDoc: JSDocComment = js.native
  
  @JSName("parent")
  val parent_JSDoc: HasJSDoc = js.native
  
  val tags: js.UndefOr[NodeArray[JSDocTag]] = js.native
}
