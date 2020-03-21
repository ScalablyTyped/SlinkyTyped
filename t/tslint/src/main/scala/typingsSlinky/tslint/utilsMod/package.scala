package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type FilterCallback = js.Function1[/* node */ typingsSlinky.typescript.mod.Node, scala.Boolean]
  type ForEachCommentCallback = js.Function3[
    /* fullText */ java.lang.String, 
    /* kind */ typingsSlinky.typescript.mod.SyntaxKind, 
    /* pos */ typingsSlinky.tslint.utilsMod.TokenPosition, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typingsSlinky.typescript.mod.SyntaxKind, 
    /* pos */ typingsSlinky.tslint.utilsMod.TokenPosition, 
    /* parent */ typingsSlinky.typescript.mod.Node, 
    scala.Unit
  ]
}
