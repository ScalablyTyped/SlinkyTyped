package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Reason
import typingsSlinky.vegaLite.anon.ScaleDataRefsortVgSortFie
import typingsSlinky.vegaLite.anon.ScaleMultiDataRefsortVgSo
import typingsSlinky.vegaLite.anon.ScaleMultiFieldsRefsortVg
import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channelMod.ScaleChannel
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.scaleMod.ScaleType
import typingsSlinky.vegaLite.splitMod.Explicit
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteBooleans.`true`
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaLite.vegaSchemaMod.VgDomain
import typingsSlinky.vegaLite.vegaSchemaMod.VgNonUnionDomain
import typingsSlinky.vegaTypings.scaleMod.SortField
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "assembleDomain")
  @js.native
  def assembleDomain(model: Model, channel: ScaleChannel): SignalRef | ScaleDataRefsortVgSortFie | ScaleMultiDataRefsortVgSo | ScaleMultiFieldsRefsortVg | (js.Array[String | Double | Boolean | SignalRef]) = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "canUseUnaggregatedDomain")
  @js.native
  def canUseUnaggregatedDomain_binned(fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null], scaleType: ScaleType): Reason = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "domainSort")
  @js.native
  def domainSort(model: UnitModel, channel: ScaleChannel, scaleType: ScaleType): js.UndefOr[`true` | SortField] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "getFieldFromDomain")
  @js.native
  def getFieldFromDomain(domain: VgDomain): String = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "mergeDomains")
  @js.native
  def mergeDomains(domains: js.Array[VgNonUnionDomain]): VgDomain = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "parseDomainForChannel")
  @js.native
  def parseDomainForChannel(model: UnitModel, channel: ScaleChannel): Explicit[js.Array[VgNonUnionDomain]] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "parseScaleDomain")
  @js.native
  def parseScaleDomain(model: Model): Unit = js.native
}
