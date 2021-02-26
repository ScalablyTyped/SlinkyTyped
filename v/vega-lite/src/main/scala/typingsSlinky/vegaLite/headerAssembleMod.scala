package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.AlignString
import typingsSlinky.vegaLite.anon.AlignUndefined
import typingsSlinky.vegaLite.anon.Axes
import typingsSlinky.vegaLite.anon.BaselineUndefined
import typingsSlinky.vegaLite.anon.Dx
import typingsSlinky.vegaLite.anon.Dy
import typingsSlinky.vegaLite.anon.Encode
import typingsSlinky.vegaLite.anon.Font
import typingsSlinky.vegaLite.anon.FontSize
import typingsSlinky.vegaLite.anon.FontStyle
import typingsSlinky.vegaLite.anon.From
import typingsSlinky.vegaLite.anon.Name
import typingsSlinky.vegaLite.anon.PartialRecordkeyofCoreHea
import typingsSlinky.vegaLite.anon.PartialVgTitle
import typingsSlinky.vegaLite.anon.`1`
import typingsSlinky.vegaLite.anon.`2`
import typingsSlinky.vegaLite.channelMod.FacetChannel
import typingsSlinky.vegaLite.headerComponentMod.HeaderChannel
import typingsSlinky.vegaLite.headerComponentMod.HeaderComponent
import typingsSlinky.vegaLite.headerComponentMod.HeaderType
import typingsSlinky.vegaLite.headerComponentMod.LayoutHeaderComponent
import typingsSlinky.vegaLite.headerComponentMod.LayoutHeaderComponentIndex
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.specFacetMod.FacetFieldDef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.vegaLiteStrings.format
import typingsSlinky.vegaLite.vegaLiteStrings.formatType
import typingsSlinky.vegaLite.vegaLiteStrings.labelAlign
import typingsSlinky.vegaLite.vegaLiteStrings.labelAnchor
import typingsSlinky.vegaLite.vegaLiteStrings.labelAngle
import typingsSlinky.vegaLite.vegaLiteStrings.labelBaseline
import typingsSlinky.vegaLite.vegaLiteStrings.labelColor
import typingsSlinky.vegaLite.vegaLiteStrings.labelExpr
import typingsSlinky.vegaLite.vegaLiteStrings.labelFont
import typingsSlinky.vegaLite.vegaLiteStrings.labelFontSize
import typingsSlinky.vegaLite.vegaLiteStrings.labelFontStyle
import typingsSlinky.vegaLite.vegaLiteStrings.labelFontWeight
import typingsSlinky.vegaLite.vegaLiteStrings.labelLimit
import typingsSlinky.vegaLite.vegaLiteStrings.labelLineHeight
import typingsSlinky.vegaLite.vegaLiteStrings.labelOrient
import typingsSlinky.vegaLite.vegaLiteStrings.labelPadding
import typingsSlinky.vegaLite.vegaLiteStrings.labels
import typingsSlinky.vegaLite.vegaLiteStrings.orient
import typingsSlinky.vegaLite.vegaLiteStrings.titleAlign
import typingsSlinky.vegaLite.vegaLiteStrings.titleAnchor
import typingsSlinky.vegaLite.vegaLiteStrings.titleAngle
import typingsSlinky.vegaLite.vegaLiteStrings.titleBaseline
import typingsSlinky.vegaLite.vegaLiteStrings.titleColor
import typingsSlinky.vegaLite.vegaLiteStrings.titleFont
import typingsSlinky.vegaLite.vegaLiteStrings.titleFontSize
import typingsSlinky.vegaLite.vegaLiteStrings.titleFontStyle
import typingsSlinky.vegaLite.vegaLiteStrings.titleFontWeight
import typingsSlinky.vegaLite.vegaLiteStrings.titleLimit
import typingsSlinky.vegaLite.vegaLiteStrings.titleLineHeight
import typingsSlinky.vegaLite.vegaLiteStrings.titleOrient
import typingsSlinky.vegaLite.vegaLiteStrings.titlePadding
import typingsSlinky.vegaLite.vegaSchemaMod.RowCol
import typingsSlinky.vegaLite.vegaSchemaMod.VgMarkGroup
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleHeaderGroup")
  @js.native
  def assembleHeaderGroup(
    model: Model,
    channel: HeaderChannel,
    headerType: HeaderType,
    layoutHeader: LayoutHeaderComponent,
    headerComponent: HeaderComponent
  ): Axes | From = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleHeaderGroups")
  @js.native
  def assembleHeaderGroups(model: Model, channel: HeaderChannel): js.Array[VgMarkGroup] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleHeaderProperties")
  @js.native
  def assembleHeaderProperties(
    config: Config[SignalRef],
    facetFieldDef: FacetFieldDef[String, SignalRef],
    channel: FacetChannel,
    properties: js.Array[
      /* keyof vega-lite.vega-lite/build/src/header.CoreHeader<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType
    ],
    propertiesMap: PartialRecordkeyofCoreHea
  ): PartialVgTitle = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleLabelTitle")
  @js.native
  def assembleLabelTitle(facetFieldDef: FacetFieldDef[String, SignalRef], channel: FacetChannel, config: Config[SignalRef]): Dx | Dy | Encode | Font | FontSize | FontStyle = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleLayoutTitleBand")
  @js.native
  def assembleLayoutTitleBand(headerComponentIndex: LayoutHeaderComponentIndex, config: Config[SignalRef]): RowCol[Double] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleTitleGroup")
  @js.native
  def assembleTitleGroup(model: Model, channel: FacetChannel): Name = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "defaultHeaderGuideAlign")
  @js.native
  def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double): AlignString | `1` | AlignUndefined = js.native
  @JSImport("vega-lite/build/src/compile/header/assemble", "defaultHeaderGuideAlign")
  @js.native
  def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double, anchor: TitleAnchor): AlignString | `1` | AlignUndefined = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "defaultHeaderGuideBaseline")
  @js.native
  def defaultHeaderGuideBaseline(angle: Double, channel: FacetChannel): `2` | BaselineUndefined = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "getLayoutTitleBand")
  @js.native
  def getLayoutTitleBand(titleAnchor: TitleAnchor, headerChannel: HeaderChannel): js.Any = js.native
}
