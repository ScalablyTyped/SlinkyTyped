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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Scale extends StObject
object Scale {
  
  @scala.inline
  def BandScale(name: String, `type`: band): typingsSlinky.vegaTypings.scaleMod.BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.BandScale]
  }
  
  @scala.inline
  def BinOrdinalScale(name: String, `type`: `bin-ordinal`): typingsSlinky.vegaTypings.scaleMod.BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.BinOrdinalScale]
  }
  
  @scala.inline
  def IdentityScale(name: String, `type`: identity): typingsSlinky.vegaTypings.scaleMod.IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.IdentityScale]
  }
  
  @scala.inline
  def LinearScale(name: String): typingsSlinky.vegaTypings.scaleMod.LinearScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.LinearScale]
  }
  
  @scala.inline
  def LogScale(name: String, `type`: log): typingsSlinky.vegaTypings.scaleMod.LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.LogScale]
  }
  
  @scala.inline
  def OrdinalScale(name: String, `type`: ordinal): typingsSlinky.vegaTypings.scaleMod.OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.OrdinalScale]
  }
  
  @scala.inline
  def PointScale(name: String, `type`: point): typingsSlinky.vegaTypings.scaleMod.PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.PointScale]
  }
  
  @scala.inline
  def PowScale(exponent: Double | SignalRef, name: String, `type`: pow): typingsSlinky.vegaTypings.scaleMod.PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.PowScale]
  }
  
  @scala.inline
  def QuantileScale(name: String): typingsSlinky.vegaTypings.scaleMod.QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.QuantileScale]
  }
  
  @scala.inline
  def QuantizeScale(name: String): typingsSlinky.vegaTypings.scaleMod.QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.QuantizeScale]
  }
  
  @scala.inline
  def SequentialScale(name: String, `type`: sequential): typingsSlinky.vegaTypings.scaleMod.SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.SequentialScale]
  }
  
  @scala.inline
  def SqrtScale(name: String, `type`: sqrt): typingsSlinky.vegaTypings.scaleMod.SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.SqrtScale]
  }
  
  @scala.inline
  def SymLogScale(name: String, `type`: symlog): typingsSlinky.vegaTypings.scaleMod.SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.SymLogScale]
  }
  
  @scala.inline
  def ThresholdScale(name: String): typingsSlinky.vegaTypings.scaleMod.ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.ThresholdScale]
  }
  
  @scala.inline
  def TimeScale(name: String, `type`: time | utc): typingsSlinky.vegaTypings.scaleMod.TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.scaleMod.TimeScale]
  }
}
