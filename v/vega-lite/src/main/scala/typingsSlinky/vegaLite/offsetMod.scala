package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channelMod.PolarPositionChannel
import typingsSlinky.vegaLite.channelMod.PositionChannel
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcMarkMod.MarkDef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", "getOffset")
  @js.native
  def getOffset(channel: PolarPositionChannel, markDef: MarkDef[Mark, SignalRef]): Double | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", "getOffset")
  @js.native
  def getOffset(channel: PositionChannel, markDef: MarkDef[Mark, SignalRef]): Double | SignalRef = js.native
}
