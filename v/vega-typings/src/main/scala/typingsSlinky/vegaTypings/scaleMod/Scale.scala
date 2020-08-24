package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import typingsSlinky.vegaTypings.vegaTypingsStrings.band
import typingsSlinky.vegaTypings.vegaTypingsStrings.identity
import typingsSlinky.vegaTypings.vegaTypingsStrings.log
import typingsSlinky.vegaTypings.vegaTypingsStrings.ordinal
import typingsSlinky.vegaTypings.vegaTypingsStrings.point
import typingsSlinky.vegaTypings.vegaTypingsStrings.pow
import typingsSlinky.vegaTypings.vegaTypingsStrings.sequential
import typingsSlinky.vegaTypings.vegaTypingsStrings.sqrt
import typingsSlinky.vegaTypings.vegaTypingsStrings.symlog
import typingsSlinky.vegaTypings.vegaTypingsStrings.time
import typingsSlinky.vegaTypings.vegaTypingsStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.scaleMod.OrdinalScale
  - typingsSlinky.vegaTypings.scaleMod.BandScale
  - typingsSlinky.vegaTypings.scaleMod.PointScale
  - typingsSlinky.vegaTypings.scaleMod.SequentialScale
  - typingsSlinky.vegaTypings.scaleMod.TimeScale
  - typingsSlinky.vegaTypings.scaleMod.IdentityScale
  - typingsSlinky.vegaTypings.scaleMod.LinearScale
  - typingsSlinky.vegaTypings.scaleMod.LogScale
  - typingsSlinky.vegaTypings.scaleMod.SymLogScale
  - typingsSlinky.vegaTypings.scaleMod.PowScale
  - typingsSlinky.vegaTypings.scaleMod.SqrtScale
  - typingsSlinky.vegaTypings.scaleMod.QuantileScale
  - typingsSlinky.vegaTypings.scaleMod.QuantizeScale
  - typingsSlinky.vegaTypings.scaleMod.ThresholdScale
  - typingsSlinky.vegaTypings.scaleMod.BinOrdinalScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  def PointScale(name: String, `type`: point): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def SqrtScale(name: String, `type`: sqrt): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def SequentialScale(name: String, `type`: sequential): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def PowScale(exponent: Double | SignalRef, name: String, `type`: pow): Scale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def SymLogScale(name: String, `type`: symlog): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def ThresholdScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def OrdinalScale(name: String, `type`: ordinal): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LinearScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def QuantizeScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def BandScale(name: String, `type`: band): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LogScale(name: String, `type`: log): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def IdentityScale(name: String, `type`: identity): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScale(name: String, `type`: time | utc): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def BinOrdinalScale(name: String, `type`: `bin-ordinal`): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def QuantileScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

