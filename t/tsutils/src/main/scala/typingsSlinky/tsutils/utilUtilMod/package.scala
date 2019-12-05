package typingsSlinky.tsutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  import typingsSlinky.tsutils.Anon_Arguments
  import typingsSlinky.tsutils.Anon_ModuleReference
  import typingsSlinky.tsutils.Anon_ModuleSpecifier
  import typingsSlinky.typescript.typescriptMod.CallExpression
  import typingsSlinky.typescript.typescriptMod.CommentRange
  import typingsSlinky.typescript.typescriptMod.ExportDeclaration
  import typingsSlinky.typescript.typescriptMod.ImportDeclaration
  import typingsSlinky.typescript.typescriptMod.ImportEqualsDeclaration
  import typingsSlinky.typescript.typescriptMod.ImportTypeNode
  import typingsSlinky.typescript.typescriptMod.Node
  import typingsSlinky.typescript.typescriptMod.SyntaxKind
  import typingsSlinky.typescript.typescriptMod.TextRange

  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[/* fullText */ String, /* comment */ CommentRange, Unit]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ String, 
    /* kind */ SyntaxKind, 
    /* range */ TextRange, 
    /* parent */ Node, 
    Unit
  ]
  type ImportLike = ImportDeclaration | (ImportEqualsDeclaration with Anon_ModuleReference) | (ExportDeclaration with Anon_ModuleSpecifier) | (CallExpression with Anon_Arguments) | ImportTypeNode
}
