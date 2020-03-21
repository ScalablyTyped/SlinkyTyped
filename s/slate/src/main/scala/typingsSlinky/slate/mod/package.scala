package typingsSlinky.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CommandFunc[T /* <: typingsSlinky.slate.mod.Controller */] = js.Function2[/* editor */ T, /* repeated */ js.Any, T]
  type Data = typingsSlinky.immutable.Immutable.Map[js.Any, js.Any]
  type Path = typingsSlinky.immutable.Immutable.List[scala.Double] | js.Array[scala.Double] | java.lang.String
  type QueryFunc[T /* <: typingsSlinky.slate.mod.Controller */] = js.Function2[/* editor */ T, /* repeated */ js.Any, js.Any]
  type RulesByNodeType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.slate.mod.Rules]
  type resetMemoization = js.Function0[scala.Unit]
  type useMemoization = js.Function1[/* enabled */ scala.Boolean, scala.Unit]
}
