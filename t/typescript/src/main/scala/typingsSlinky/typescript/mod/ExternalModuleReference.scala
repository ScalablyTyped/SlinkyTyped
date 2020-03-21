package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalModuleReference
  extends Node
     with ModuleReference {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_ExternalModuleReference: typingsSlinky.typescript.mod.SyntaxKind.ExternalModuleReference = js.native
  @JSName("parent")
  var parent_ExternalModuleReference: ImportEqualsDeclaration = js.native
}

