package typingsSlinky.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Function1 = js.Function1[/* x */ js.Any, js.Any]
  type LazyMessage = js.Function0[java.lang.String]
  type Predicate[T] = js.Function1[/* x */ T, scala.Boolean]
  //
  // struct
  //
  type StructProps = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tcomb.mod.Constructor[js.Any]]
  type TypeGuardPredicate[T] = js.Function1[/* x */ js.Any, /* is T */ scala.Boolean]
  type Update_[T] = js.Function2[/* instance */ T, /* spec */ typingsSlinky.tcomb.mod.UpdatePatch, T]
}
