package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedPropertyName
  extends Node
     with DeclarationName
     with PropertyName {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_ComputedPropertyName: typingsSlinky.typescript.mod.SyntaxKind.ComputedPropertyName = js.native
  
  @JSName("parent")
  val parent_ComputedPropertyName: Declaration = js.native
}
