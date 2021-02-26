package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBindingPattern
  extends BindingPattern
     with Node
     with ArrayBindingOrAssignmentPattern {
  
  val elements: NodeArray[ArrayBindingElement] = js.native
  
  @JSName("kind")
  val kind_ArrayBindingPattern: typingsSlinky.typescript.mod.SyntaxKind.ArrayBindingPattern = js.native
  
  @JSName("parent")
  val parent_ArrayBindingPattern: VariableDeclaration | ParameterDeclaration | BindingElement = js.native
}
