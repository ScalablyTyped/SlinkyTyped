package typingsSlinky.vegaDashTypings

import typingsSlinky.vegaDashTypings.typesSpecScaleMod.ScaleInterpolate
import typingsSlinky.vegaDashTypings.typesSpecSignalMod.SignalRef
import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.`cubehelix-long`
import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.cubehelix
import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cubehelix extends ScaleInterpolate {
  var gamma: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef
}

object Anon_Cubehelix {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef, gamma: Double | SignalRef = null): Anon_Cubehelix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cubehelix]
  }
}

