package typingsSlinky.webpackStream

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.webpack.mod.Stats
import typingsSlinky.webpack.mod.Stats.Preset
import typingsSlinky.webpack.mod.Stats.ToJsonOptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStats extends Instantiable0[Stats] {
  /**
    * Returns the default json options from the stats preset.
    * @param preset The preset to be transformed into json options.
    */
  def presetToOptions(): ToJsonOptionsObject = js.native
  def presetToOptions(preset: Preset): ToJsonOptionsObject = js.native
}

