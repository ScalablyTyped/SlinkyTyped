package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.tsutils.anon.CallExpressionexpressionT
import typingsSlinky.tsutils.anon.ExportDeclarationmoduleSp
import typingsSlinky.tsutils.anon.ImportEqualsDeclarationmo
import typingsSlinky.typescript.mod.ImportDeclaration
import typingsSlinky.typescript.mod.ImportTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ImportDeclaration
  - typingsSlinky.tsutils.anon.ImportEqualsDeclarationmo
  - typingsSlinky.tsutils.anon.ExportDeclarationmoduleSp
  - typingsSlinky.tsutils.anon.CallExpressionexpressionT
  - typingsSlinky.typescript.mod.ImportTypeNode
*/
trait ImportLike extends js.Object

object ImportLike {
  @scala.inline
  implicit def apply(value: CallExpressionexpressionT): ImportLike = value.asInstanceOf[ImportLike]
  @scala.inline
  implicit def apply(value: ExportDeclarationmoduleSp): ImportLike = value.asInstanceOf[ImportLike]
  @scala.inline
  implicit def apply(value: ImportDeclaration): ImportLike = value.asInstanceOf[ImportLike]
  @scala.inline
  implicit def apply(value: ImportEqualsDeclarationmo): ImportLike = value.asInstanceOf[ImportLike]
  @scala.inline
  implicit def apply(value: ImportTypeNode): ImportLike = value.asInstanceOf[ImportLike]
}

