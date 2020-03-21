package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.ScaleInterpolate
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typingsSlinky.vegaTypings.vegaTypingsStrings.cubehelix
import typingsSlinky.vegaTypings.vegaTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGamma extends ScaleInterpolate {
  var gamma: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef
}

object AnonGamma {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef, gamma: Double | SignalRef = null): AnonGamma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGamma]
  }
}

