package typingsSlinky.tokenizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.ThisFunction3[
    /* this */ typingsSlinky.tokenizr.mod.ActionContext, 
    /* ctx */ typingsSlinky.tokenizr.mod.ActionContext, 
    /* found */ typingsSlinky.std.RegExpExecArray, 
    /* rule */ typingsSlinky.tokenizr.anon.Action, 
    scala.Unit
  ]
  type IToken[T] = typingsSlinky.tokenizr.mod.Token[T]
  type RuleAction = js.ThisFunction2[
    /* this */ typingsSlinky.tokenizr.mod.ActionContext, 
    /* ctx */ typingsSlinky.tokenizr.mod.ActionContext, 
    /* found */ typingsSlinky.std.RegExpExecArray, 
    scala.Unit
  ]
}
