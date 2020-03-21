package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urlInterfaceMod {
  type UrlRuleHandlerFn = js.Function3[
    /* matchValue */ js.UndefOr[js.Any], 
    /* url */ js.UndefOr[typingsSlinky.uirouterCore.urlInterfaceMod.UrlParts], 
    /* router */ js.UndefOr[typingsSlinky.uirouterCore.routerMod.UIRouter], 
    java.lang.String | typingsSlinky.uirouterCore.stateMod.TargetState | typingsSlinky.uirouterCore.stateInterfaceMod.TargetStateDef | scala.Unit
  ]
  type UrlRuleMatchFn = js.Function2[
    /* url */ js.UndefOr[typingsSlinky.uirouterCore.urlInterfaceMod.UrlParts], 
    /* router */ js.UndefOr[typingsSlinky.uirouterCore.routerMod.UIRouter], 
    js.Any
  ]
}
