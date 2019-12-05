package typingsSlinky.theo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object theoMod {
  import typingsSlinky.immutable.Immutable.List
  import typingsSlinky.immutable.Immutable.Map
  import typingsSlinky.immutable.Immutable.OrderedMap

  type Aliases = OrderedMap[String, Map[String, String | Double]]
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  type Meta = Map[String, String]
  type Prop = Map[StyleProperty, String | Double]
  type Props = List[Prop]
}
