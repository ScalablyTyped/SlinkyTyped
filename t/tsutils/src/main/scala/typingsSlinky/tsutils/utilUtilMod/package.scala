package typingsSlinky.tsutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[
    /* fullText */ java.lang.String, 
    /* comment */ typingsSlinky.typescript.mod.CommentRange, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typingsSlinky.typescript.mod.SyntaxKind, 
    /* range */ typingsSlinky.typescript.mod.TextRange, 
    /* parent */ typingsSlinky.typescript.mod.Node, 
    scala.Unit
  ]
}
