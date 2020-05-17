package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConflictMarkerTrivia
import typingsSlinky.typescript.mod.SyntaxKind.JsxTextAllWhiteSpaces
import typingsSlinky.typescript.mod.SyntaxKind.LessThanSlashToken
import typingsSlinky.typescript.mod.SyntaxKind.LessThanToken
import typingsSlinky.typescript.mod.SyntaxKind.OpenBraceToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.LessThanSlashToken
  - typingsSlinky.typescript.mod.SyntaxKind.EndOfFileToken
  - typingsSlinky.typescript.mod.SyntaxKind.ConflictMarkerTrivia
  - typingsSlinky.typescript.mod.SyntaxKind.JsxText
  - typingsSlinky.typescript.mod.SyntaxKind.JsxTextAllWhiteSpaces
  - typingsSlinky.typescript.mod.SyntaxKind.OpenBraceToken
  - typingsSlinky.typescript.mod.SyntaxKind.LessThanToken
*/
trait JsxTokenSyntaxKind extends js.Object

object JsxTokenSyntaxKind {
  @scala.inline
  implicit def apply(value: ConflictMarkerTrivia): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
  @scala.inline
  implicit def apply(value: typingsSlinky.typescript.mod.SyntaxKind.EndOfFileToken): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
  @scala.inline
  implicit def apply(value: typingsSlinky.typescript.mod.SyntaxKind.JsxText): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
  @scala.inline
  implicit def apply(value: JsxTextAllWhiteSpaces): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
  @scala.inline
  implicit def apply(value: LessThanSlashToken): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
  @scala.inline
  implicit def apply(value: LessThanToken): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
  @scala.inline
  implicit def apply(value: OpenBraceToken): JsxTokenSyntaxKind = value.asInstanceOf[JsxTokenSyntaxKind]
}

