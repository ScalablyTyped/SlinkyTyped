package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Stats {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.webpack.webpackStrings.`errors-only`
    - typingsSlinky.webpack.webpackStrings.`errors-warnings`
    - typingsSlinky.webpack.webpackStrings.minimal
    - typingsSlinky.webpack.webpackStrings.none
    - typingsSlinky.webpack.webpackStrings.normal
    - typingsSlinky.webpack.webpackStrings.verbose
  */
  type Preset = typingsSlinky.webpack.mod.Stats._Preset | scala.Boolean
  type StatsExcludeFilter = java.lang.String | (js.Array[
    (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  ]) | js.RegExp | (js.Function1[/* assetName */ java.lang.String, scala.Boolean])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpack.mod.Stats.Preset
    - typingsSlinky.webpack.mod.Stats.ToJsonOptionsObject
  */
  type ToJsonOptions = typingsSlinky.webpack.mod.Stats._ToJsonOptions | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpack.mod.Stats.Preset
    - typingsSlinky.webpack.mod.Stats.ToStringOptionsObject
  */
  type ToStringOptions = typingsSlinky.webpack.mod.Stats._ToStringOptions | scala.Boolean
}
