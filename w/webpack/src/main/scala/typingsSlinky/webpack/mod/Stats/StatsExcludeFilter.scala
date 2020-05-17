package typingsSlinky.webpack.mod.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[
(js.Function1[/ * assetName * / java.lang.String, scala.Boolean]) | typingsSlinky.std.RegExp | java.lang.String]
  - typingsSlinky.std.RegExp
  - js.Function1[/ * assetName * / java.lang.String, scala.Boolean]
*/
trait StatsExcludeFilter extends js.Object

object StatsExcludeFilter {
  @scala.inline
  implicit def apply(value: js.Array[(js.Function1[/* assetName */ String, Boolean]) | js.RegExp | String]): StatsExcludeFilter = value.asInstanceOf[StatsExcludeFilter]
  @scala.inline
  implicit def apply(value: js.Function1[/* assetName */ String, Boolean]): StatsExcludeFilter = value.asInstanceOf[StatsExcludeFilter]
  @scala.inline
  implicit def apply(value: js.RegExp): StatsExcludeFilter = value.asInstanceOf[StatsExcludeFilter]
  @scala.inline
  implicit def apply(value: String): StatsExcludeFilter = value.asInstanceOf[StatsExcludeFilter]
}

