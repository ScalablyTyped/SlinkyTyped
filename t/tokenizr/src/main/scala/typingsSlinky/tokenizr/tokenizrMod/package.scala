package typingsSlinky.tokenizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokenizrMod {
  import typingsSlinky.std.RegExpExecArray
  import typingsSlinky.tokenizr.Anon_Action

  type Action = js.ThisFunction3[
    /* this */ ActionContext, 
    /* ctx */ ActionContext, 
    /* found */ RegExpExecArray, 
    /* rule */ Anon_Action, 
    Unit
  ]
  type IToken[T] = Token[T]
  type RuleAction = js.ThisFunction2[/* this */ ActionContext, /* ctx */ ActionContext, /* found */ RegExpExecArray, Unit]
}
