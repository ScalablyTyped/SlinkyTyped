package typingsSlinky.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationStyle = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Data domain type
    */
  type DomainTuple = js.Tuple2[js.Date | scala.Double, js.Date | scala.Double]
  /**
    * @see https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
    */
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type VictoryNumberCallback = js.Function1[/* args */ typingsSlinky.victory.mod.CallbackArgs, scala.Double]
  type VictoryStringOrNumberCallback = js.Function1[/* args */ typingsSlinky.victory.mod.CallbackArgs, java.lang.String | scala.Double]
}
