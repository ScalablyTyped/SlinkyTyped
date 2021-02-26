package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channelMod.FacetChannel
import typingsSlinky.vegaLite.headerComponentMod.HeaderChannel
import typingsSlinky.vegaLite.headerMod.Header
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.utilMod.Dict
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
import typingsSlinky.vegaLite.vegaLiteStrings.number
import typingsSlinky.vegaLite.vegaLiteStrings.orient
import typingsSlinky.vegaLite.vegaLiteStrings.time
import typingsSlinky.vegaLite.vegaLiteStrings.title
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
import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.encodeMod.Align
import typingsSlinky.vegaTypings.encodeMod.FontStyle
import typingsSlinky.vegaTypings.encodeMod.FontWeight
import typingsSlinky.vegaTypings.encodeMod.Orient
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.encodeMod.TextBaseline
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerCommonMod {
  
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderChannel")
  @js.native
  def getHeaderChannel(channel: FacetChannel, orient: Orient): HeaderChannel = js.native
  
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperties")
  @js.native
  def getHeaderProperties(
    properties: js.Array[
      /* keyof vega-lite.vega-lite/build/src/header.Header<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType | title
    ],
    header: Header[SignalRef],
    config: Config[SignalRef],
    channel: FacetChannel
  ): Header[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_format(prop: format, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | Dict[_]] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_formatType(prop: formatType, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[number | time | String] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelAlign(prop: labelAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelAnchor(prop: labelAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelAngle(prop: labelAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelBaseline(prop: labelBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelColor(prop: labelColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelExpr(prop: labelExpr, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFont(prop: labelFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFontSize(prop: labelFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFontStyle(prop: labelFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFontWeight(prop: labelFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelLimit(prop: labelLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelLineHeight(prop: labelLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelOrient(prop: labelOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelPadding(prop: labelPadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labels(prop: labels, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_orient(prop: orient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_title(prop: title, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Text | Null | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleAlign(prop: titleAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleAnchor(prop: titleAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleAngle(prop: titleAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleBaseline(prop: titleBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleColor(prop: titleColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFont(prop: titleFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFontSize(prop: titleFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFontStyle(prop: titleFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFontWeight(prop: titleFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleLimit(prop: titleLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleLineHeight(prop: titleLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleOrient(prop: titleOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titlePadding(prop: titlePadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
}
