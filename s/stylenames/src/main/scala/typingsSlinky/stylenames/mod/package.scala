package typingsSlinky.stylenames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StyleValueConditionFunction = js.Function0[js.UndefOr[scala.Boolean | scala.Null]]
  type StyleValueObject = typingsSlinky.std.Record[
    java.lang.String | scala.Double, 
    scala.Boolean | typingsSlinky.stylenames.mod.StyleValueConditionFunction
  ]
}
