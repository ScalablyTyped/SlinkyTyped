package typingsSlinky.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Stats {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.webpack.webpackStrings.`errors-only`
    - typings.webpack.webpackStrings.`errors-warnings`
    - typings.webpack.webpackStrings.minimal
    - typings.webpack.webpackStrings.none
    - typings.webpack.webpackStrings.normal
    - typings.webpack.webpackStrings.verbose
  */
  type Preset = _Preset | Boolean
  type StatsExcludeFilter = String | (js.Array[(js.Function1[/* assetName */ String, Boolean]) | js.RegExp | String]) | js.RegExp | (js.Function1[/* assetName */ String, Boolean])
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.webpackMod.Stats.Preset
    - typings.webpack.webpackMod.Stats.ToJsonOptionsObject
  */
  type ToJsonOptions = _ToJsonOptions | Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.webpackMod.Stats.Preset
    - typings.webpack.webpackMod.Stats.ToStringOptionsObject
  */
  type ToStringOptions = _ToStringOptions | Boolean
}
