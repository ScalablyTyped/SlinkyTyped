package typingsSlinky.vegaLite

import typingsSlinky.std.Exclude
import typingsSlinky.vegaLite.anon.Condition
import typingsSlinky.vegaLite.anon.Part
import typingsSlinky.vegaLite.channeldefMod.Value
import typingsSlinky.vegaLite.channeldefMod.ValueDef
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcGuideMod.Guide
import typingsSlinky.vegaLite.srcGuideMod.GuideEncodingEntry
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.utilMod.Flag
import typingsSlinky.vegaLite.vegaLiteStrings.axis
import typingsSlinky.vegaLite.vegaLiteStrings.axisBand
import typingsSlinky.vegaLite.vegaLiteStrings.axisBottom
import typingsSlinky.vegaLite.vegaLiteStrings.axisDiscrete
import typingsSlinky.vegaLite.vegaLiteStrings.axisLeft
import typingsSlinky.vegaLite.vegaLiteStrings.axisPoint
import typingsSlinky.vegaLite.vegaLiteStrings.axisQuantitative
import typingsSlinky.vegaLite.vegaLiteStrings.axisRight
import typingsSlinky.vegaLite.vegaLiteStrings.axisTemporal
import typingsSlinky.vegaLite.vegaLiteStrings.axisTop
import typingsSlinky.vegaLite.vegaLiteStrings.axisX
import typingsSlinky.vegaLite.vegaLiteStrings.axisXBand
import typingsSlinky.vegaLite.vegaLiteStrings.axisXDiscrete
import typingsSlinky.vegaLite.vegaLiteStrings.axisXPoint
import typingsSlinky.vegaLite.vegaLiteStrings.axisXQuantitative
import typingsSlinky.vegaLite.vegaLiteStrings.axisXTemporal
import typingsSlinky.vegaLite.vegaLiteStrings.axisY
import typingsSlinky.vegaLite.vegaLiteStrings.axisYBand
import typingsSlinky.vegaLite.vegaLiteStrings.axisYDiscrete
import typingsSlinky.vegaLite.vegaLiteStrings.axisYPoint
import typingsSlinky.vegaLite.vegaLiteStrings.axisYQuantitative
import typingsSlinky.vegaLite.vegaLiteStrings.axisYTemporal
import typingsSlinky.vegaLite.vegaLiteStrings.both
import typingsSlinky.vegaLite.vegaLiteStrings.center
import typingsSlinky.vegaLite.vegaLiteStrings.extent
import typingsSlinky.vegaLite.vegaLiteStrings.grid
import typingsSlinky.vegaLite.vegaLiteStrings.main
import typingsSlinky.vegaLite.vegaLiteStrings.number
import typingsSlinky.vegaLite.vegaLiteStrings.time
import typingsSlinky.vegaTypings.axisMod.AxisOrient
import typingsSlinky.vegaTypings.axisMod.LabelOverlap
import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.encodeMod.Align
import typingsSlinky.vegaTypings.encodeMod.ColorValueRef
import typingsSlinky.vegaTypings.encodeMod.FontStyle
import typingsSlinky.vegaTypings.encodeMod.FontWeight
import typingsSlinky.vegaTypings.encodeMod.NumericValueRef
import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.encodeMod.TextBaseline
import typingsSlinky.vegaTypings.scaleMod.TimeInterval
import typingsSlinky.vegaTypings.scaleMod.TimeIntervalStep
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.valuesMod.AlignValue
import typingsSlinky.vegaTypings.valuesMod.AnchorValue
import typingsSlinky.vegaTypings.valuesMod.BooleanValue
import typingsSlinky.vegaTypings.valuesMod.ColorValue
import typingsSlinky.vegaTypings.valuesMod.DashArrayValue
import typingsSlinky.vegaTypings.valuesMod.FontStyleValue
import typingsSlinky.vegaTypings.valuesMod.FontWeightValue
import typingsSlinky.vegaTypings.valuesMod.NumberValue
import typingsSlinky.vegaTypings.valuesMod.StringValue
import typingsSlinky.vegaTypings.valuesMod.StrokeCapValue
import typingsSlinky.vegaTypings.valuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisMod {
  
  @JSImport("vega-lite/build/src/axis", "AXIS_CONFIGS")
  @js.native
  val AXIS_CONFIGS: js.Array[
    axis | axisX | axisY | axisTop | axisRight | axisBottom | axisLeft | axisBand | axisDiscrete | axisPoint | axisQuantitative | axisTemporal | axisXBand | axisXPoint | axisXDiscrete | axisXQuantitative | axisXTemporal | axisYBand | axisYPoint | axisYDiscrete | axisYQuantitative | axisYTemporal
  ] = js.native
  
  @JSImport("vega-lite/build/src/axis", "AXIS_PARTS")
  @js.native
  val AXIS_PARTS: js.Array[AxisPart] = js.native
  
  @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTIES")
  @js.native
  val AXIS_PROPERTIES: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any
  ] = js.native
  
  /* Inlined std.Record<keyof vega.vega.Axis, 'main' | 'grid' | 'both'> */
  object AXIS_PROPERTY_TYPE {
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.aria")
    @js.native
    def aria: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def aria_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.bandPosition")
    @js.native
    def bandPosition: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def bandPosition_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.description")
    @js.native
    def description: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def description_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domain")
    @js.native
    def domain: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainCap")
    @js.native
    def domainCap: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def domainCap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainColor")
    @js.native
    def domainColor: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def domainColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainDash")
    @js.native
    def domainDash: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainDashOffset")
    @js.native
    def domainDashOffset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def domainDashOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def domainDash_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainOpacity")
    @js.native
    def domainOpacity: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def domainOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainWidth")
    @js.native
    def domainWidth: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def domainWidth_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def domain_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.encode")
    @js.native
    def encode: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def encode_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.format")
    @js.native
    def format: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.formatType")
    @js.native
    def formatType: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def formatType_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def format_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.grid")
    @js.native
    def grid: js.UndefOr[main | typingsSlinky.vegaLite.vegaLiteStrings.grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridCap")
    @js.native
    def gridCap: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def gridCap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridColor")
    @js.native
    def gridColor: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def gridColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridDash")
    @js.native
    def gridDash: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridDashOffset")
    @js.native
    def gridDashOffset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def gridDashOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def gridDash_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridOpacity")
    @js.native
    def gridOpacity: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def gridOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridScale")
    @js.native
    def gridScale: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def gridScale_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridScale")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridWidth")
    @js.native
    def gridWidth: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def gridWidth_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def grid_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grid")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelAlign")
    @js.native
    def labelAlign: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelAlign_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelAngle")
    @js.native
    def labelAngle: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelAngle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelBaseline")
    @js.native
    def labelBaseline: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelBaseline_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelBound")
    @js.native
    def labelBound: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelBound_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelColor")
    @js.native
    def labelColor: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFlush")
    @js.native
    def labelFlush: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFlushOffset")
    @js.native
    def labelFlushOffset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelFlushOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFlush_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFont")
    @js.native
    def labelFont: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFontSize")
    @js.native
    def labelFontSize: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelFontSize_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFontStyle")
    @js.native
    def labelFontStyle: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelFontStyle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFontWeight")
    @js.native
    def labelFontWeight: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelFontWeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFont_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelLimit")
    @js.native
    def labelLimit: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelLimit_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelLineHeight")
    @js.native
    def labelLineHeight: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelLineHeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelOffset")
    @js.native
    def labelOffset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelOpacity")
    @js.native
    def labelOpacity: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelOverlap")
    @js.native
    def labelOverlap: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelOverlap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelPadding")
    @js.native
    def labelPadding: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelPadding_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelSeparation")
    @js.native
    def labelSeparation: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labelSeparation_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labels")
    @js.native
    def labels: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def labels_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.maxExtent")
    @js.native
    def maxExtent: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def maxExtent_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.minExtent")
    @js.native
    def minExtent: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def minExtent_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.offset")
    @js.native
    def offset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def offset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.orient")
    @js.native
    def orient: main | grid | both = js.native
    @scala.inline
    def orient_=(x: main | grid | both): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.position")
    @js.native
    def position: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def position_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.scale")
    @js.native
    def scale: main | grid | both = js.native
    @scala.inline
    def scale_=(x: main | grid | both): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickBand")
    @js.native
    def tickBand: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickBand_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickCap")
    @js.native
    def tickCap: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickCap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickColor")
    @js.native
    def tickColor: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickCount")
    @js.native
    def tickCount: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickCount_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickDash")
    @js.native
    def tickDash: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickDashOffset")
    @js.native
    def tickDashOffset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickDashOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tickDash_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickExtra")
    @js.native
    def tickExtra: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickExtra_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickMinStep")
    @js.native
    def tickMinStep: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickMinStep_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickMinStep")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickOffset")
    @js.native
    def tickOffset: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickOpacity")
    @js.native
    def tickOpacity: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickRound")
    @js.native
    def tickRound: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickRound_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickSize")
    @js.native
    def tickSize: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickSize_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickWidth")
    @js.native
    def tickWidth: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def tickWidth_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.ticks")
    @js.native
    def ticks: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def ticks_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticks")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.title")
    @js.native
    def title: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleAlign")
    @js.native
    def titleAlign: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleAlign_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleAnchor")
    @js.native
    def titleAnchor: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleAnchor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleAngle")
    @js.native
    def titleAngle: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleAngle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleBaseline")
    @js.native
    def titleBaseline: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleBaseline_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleColor")
    @js.native
    def titleColor: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFont")
    @js.native
    def titleFont: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFontSize")
    @js.native
    def titleFontSize: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleFontSize_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFontStyle")
    @js.native
    def titleFontStyle: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleFontStyle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFontWeight")
    @js.native
    def titleFontWeight: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleFontWeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFont_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleLimit")
    @js.native
    def titleLimit: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleLimit_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleLineHeight")
    @js.native
    def titleLineHeight: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleLineHeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleOpacity")
    @js.native
    def titleOpacity: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titlePadding")
    @js.native
    def titlePadding: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titlePadding_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleX")
    @js.native
    def titleX: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleX_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleX")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleY")
    @js.native
    def titleY: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def titleY_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def title_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.translate")
    @js.native
    def translate: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def translate_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.values")
    @js.native
    def values: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def values_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.zindex")
    @js.native
    def zindex: js.UndefOr[main | grid | both] = js.native
    @scala.inline
    def zindex_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zindex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/axis", "COMMON_AXIS_PROPERTIES_INDEX")
  @js.native
  val COMMON_AXIS_PROPERTIES_INDEX: Flag[
    /* keyof vega-typings.vega-typings/types/spec/axis.Axis | vega-lite.vega-lite/build/src/axis.Axis<any> */ String
  ] = js.native
  
  /* Inlined std.Record<vega-lite.vega-lite/build/src/axis.ConditionalAxisProp, {  part :keyof vega.vega.AxisEncode,   vgProp :vega-lite.vega-lite/build/src/vega.schema.VgEncodeChannel} | null> */
  object CONDITIONAL_AXIS_PROP_INDEX {
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridColor")
    @js.native
    def gridColor: Part | Null = js.native
    @scala.inline
    def gridColor_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridDash")
    @js.native
    def gridDash: Part | Null = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridDashOffset")
    @js.native
    def gridDashOffset: Part | Null = js.native
    @scala.inline
    def gridDashOffset_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def gridDash_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridOpacity")
    @js.native
    def gridOpacity: Part | Null = js.native
    @scala.inline
    def gridOpacity_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridWidth")
    @js.native
    def gridWidth: Part | Null = js.native
    @scala.inline
    def gridWidth_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelAlign")
    @js.native
    def labelAlign: Part | Null = js.native
    @scala.inline
    def labelAlign_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelBaseline")
    @js.native
    def labelBaseline: Part | Null = js.native
    @scala.inline
    def labelBaseline_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelColor")
    @js.native
    def labelColor: Part | Null = js.native
    @scala.inline
    def labelColor_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFont")
    @js.native
    def labelFont: Part | Null = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFontSize")
    @js.native
    def labelFontSize: Part | Null = js.native
    @scala.inline
    def labelFontSize_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFontStyle")
    @js.native
    def labelFontStyle: Part | Null = js.native
    @scala.inline
    def labelFontStyle_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFontWeight")
    @js.native
    def labelFontWeight: Part | Null = js.native
    @scala.inline
    def labelFontWeight_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFont_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelOffset")
    @js.native
    def labelOffset: Part | Null = js.native
    @scala.inline
    def labelOffset_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelOpacity")
    @js.native
    def labelOpacity: Part | Null = js.native
    @scala.inline
    def labelOpacity_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelPadding")
    @js.native
    def labelPadding: Part | Null = js.native
    @scala.inline
    def labelPadding_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickColor")
    @js.native
    def tickColor: Part | Null = js.native
    @scala.inline
    def tickColor_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickDash")
    @js.native
    def tickDash: Part | Null = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickDashOffset")
    @js.native
    def tickDashOffset: Part | Null = js.native
    @scala.inline
    def tickDashOffset_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tickDash_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickOpacity")
    @js.native
    def tickOpacity: Part | Null = js.native
    @scala.inline
    def tickOpacity_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickSize")
    @js.native
    def tickSize: Part | Null = js.native
    @scala.inline
    def tickSize_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickWidth")
    @js.native
    def tickWidth: Part | Null = js.native
    @scala.inline
    def tickWidth_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/axis", "isAxisProperty")
  @js.native
  def isAxisProperty(prop: String): Boolean = js.native
  
  @JSImport("vega-lite/build/src/axis", "isConditionalAxisValue")
  @js.native
  def isConditionalAxisValue[V /* <: (Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */](v: js.Any): /* is vega-lite.vega-lite/build/src/axis.ConditionalAxisProperty<V, ES> */ Boolean = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.vegaLite.axisMod.AxisConfigBaseWithConditionalAndSignal because var conflicts: labelExpr, title. Inlined translate, description, titleY, titleAnchor, labelSeparation, tickCap, tickRound, titleFont, titleX, labelLimit, titlePadding, labelLineHeight, tickExtra, titleLineHeight, style, titleOpacity, aria, domainDashOffset, position, gridCap, offset, titleColor, labelFlush, maxExtent, labelAngle, minExtent, domain, orient, tickOffset, titleAlign, labels, titleFontStyle, titleBaseline, domainColor, titleLimit, tickBand, ticks, titleFontSize, domainOpacity, tickCount, domainDash, domainCap, zindex, labelBound, labelFlushOffset, tickMinStep, values, grid, titleAngle, labelOverlap, domainWidth, titleFontWeight, bandPosition, labelAlign, labelBaseline, labelColor, labelFont, labelFontSize, labelFontStyle, labelFontWeight, labelOpacity, labelOffset, labelPadding, gridColor, gridDash, gridDashOffset, gridOpacity, gridWidth, tickColor, tickDash, tickDashOffset, tickOpacity, tickSize, tickWidth */ @js.native
  trait Axis[ES /* <: ExprRef | SignalRef */] extends Guide {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var bandPosition: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domain: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * Mark definitions for custom axis encoding.
      *
      * @hidden
      */
    var encoding: js.UndefOr[AxisEncoding] = js.native
    
    var grid: js.UndefOr[Boolean] = js.native
    
    var gridCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ] = js.native
    
    var labelAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ] = js.native
    
    var labelBound: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var labelFlush: js.UndefOr[Boolean | Double] = js.native
    
    var labelFlushOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ] = js.native
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelLineHeight: (js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ]) with (js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ]) = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labels: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var maxExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var minExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var orient: js.UndefOr[AxisOrient | ES] = js.native
    
    var position: js.UndefOr[Double | ES] = js.native
    
    var style: js.UndefOr[String | js.Array[String]] = js.native
    
    var tickBand: js.UndefOr[
        (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var tickCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.native
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickExtra: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickMinStep: js.UndefOr[Double | ES] = js.native
    
    var tickOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickRound: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var ticks: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var translate: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.native
    
    var zindex: js.UndefOr[Double] = js.native
  }
  object Axis {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](
      labelLineHeight: (js.UndefOr[
          (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
        ]) with (js.UndefOr[
          (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
        ])
    ): Axis[ES] = {
      val __obj = js.Dynamic.literal(labelLineHeight = labelLineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Axis[ES]]
    }
    
    @scala.inline
    implicit class AxisMutableBuilder[Self <: Axis[_], ES /* <: ExprRef | SignalRef */] (val x: Self with Axis[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBandPosition(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      @scala.inline
      def setDescription(value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDomain(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      @scala.inline
      def setDomainColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      @scala.inline
      def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      @scala.inline
      def setDomainDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      @scala.inline
      def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      @scala.inline
      def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value :_*))
      
      @scala.inline
      def setDomainOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      @scala.inline
      def setEncoding(value: AxisEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      @scala.inline
      def setGridColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      @scala.inline
      def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      @scala.inline
      def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
      
      @scala.inline
      def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelBound(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      @scala.inline
      def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(
        value: (js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
            ]) with (js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
            ])
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLabels(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMaxExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      @scala.inline
      def setMinExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTickBand(
        value: (Exclude[
              js.UndefOr[center | extent | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      @scala.inline
      def setTickCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      @scala.inline
      def setTickColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      @scala.inline
      def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      @scala.inline
      def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      @scala.inline
      def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      @scala.inline
      def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
      
      @scala.inline
      def setTickExtra(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      @scala.inline
      def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      @scala.inline
      def setTickOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      @scala.inline
      def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      @scala.inline
      def setTickRound(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      @scala.inline
      def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      @scala.inline
      def setTicks(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTitleAlign(value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      @scala.inline
      def setTitleY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/guide.Guide & vega-lite.vega-lite/build/src/guide.VlOnlyGuideConfig & vega-lite.vega-lite/build/src/axis.AxisConfigBaseWithConditionalAndSignal<ES> & {  disable :boolean | undefined} */
  @js.native
  trait AxisConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var bandPosition: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * Disable axis by default.
      */
    var disable: js.UndefOr[Boolean] = js.native
    
    var domain: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * When used with the default `"number"` and `"time"` format type, the text formatting pattern for labels of guides (axes, legends, headers) and text marks.
      *
      * - If the format type is `"number"` (e.g., for quantitative fields), this is D3's [number format pattern](https://github.com/d3/d3-format#locale_format).
      * - If the format type is `"time"` (e.g., for temporal fields), this is D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format).
      *
      * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more examples.
      *
      * When used with a [custom `formatType`](https://vega.github.io/vega-lite/docs/config.html#custom-format-type), this value will be passed as `format` alongside `datum.value` to the registered function.
      *
      * __Default value:__  Derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for number format and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for time format.
      */
    var format: js.UndefOr[String | Dict[_]] = js.native
    
    /**
      * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
      *
      * __Default value:__
      * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
      * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
      */
    var formatType: js.UndefOr[number | time | String] = js.native
    
    var grid: js.UndefOr[Boolean] = js.native
    
    var gridCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ] = js.native
    
    var labelAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ] = js.native
    
    var labelBound: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels text.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.native
    
    var labelFlush: js.UndefOr[Boolean | Double] = js.native
    
    var labelFlushOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ] = js.native
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelLineHeight: (js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ]) with (js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ]) = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labels: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var maxExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var minExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var orient: js.UndefOr[AxisOrient | ES] = js.native
    
    var position: js.UndefOr[Double | ES] = js.native
    
    var style: js.UndefOr[String | js.Array[String]] = js.native
    
    var tickBand: js.UndefOr[
        (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var tickCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.native
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickExtra: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickMinStep: js.UndefOr[Double | ES] = js.native
    
    var tickOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickRound: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var ticks: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * A title for the field. If `null`, the title will be removed.
      *
      * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
      *
      * __Notes__:
      *
      * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/docs/compile.html#field-title).
      *
      * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
      */
    /**
      * Set to null to disable title for the axis, legend, or header.
      */
    var title: (js.UndefOr[Text | Null | SignalRef]) with js.UndefOr[Null] = js.native
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var translate: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.native
    
    var zindex: js.UndefOr[Double] = js.native
  }
  object AxisConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](
      labelLineHeight: (js.UndefOr[
          (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
        ]) with (js.UndefOr[
          (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
        ]),
      title: (js.UndefOr[Text | Null | SignalRef]) with js.UndefOr[Null]
    ): AxisConfig[ES] = {
      val __obj = js.Dynamic.literal(labelLineHeight = labelLineHeight.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisConfig[ES]]
    }
    
    @scala.inline
    implicit class AxisConfigMutableBuilder[Self <: AxisConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with AxisConfig[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBandPosition(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      @scala.inline
      def setDescription(value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDomain(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      @scala.inline
      def setDomainColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      @scala.inline
      def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      @scala.inline
      def setDomainDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      @scala.inline
      def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      @scala.inline
      def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value :_*))
      
      @scala.inline
      def setDomainOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      @scala.inline
      def setFormat(value: String | Dict[_]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      @scala.inline
      def setGridColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      @scala.inline
      def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      @scala.inline
      def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
      
      @scala.inline
      def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelBound(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      @scala.inline
      def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      @scala.inline
      def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(
        value: (js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
            ]) with (js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
            ])
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLabels(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMaxExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      @scala.inline
      def setMinExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTickBand(
        value: (Exclude[
              js.UndefOr[center | extent | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      @scala.inline
      def setTickCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      @scala.inline
      def setTickColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      @scala.inline
      def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      @scala.inline
      def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      @scala.inline
      def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      @scala.inline
      def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
      
      @scala.inline
      def setTickExtra(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      @scala.inline
      def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      @scala.inline
      def setTickOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      @scala.inline
      def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      @scala.inline
      def setTickRound(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      @scala.inline
      def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      @scala.inline
      def setTicks(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTitle(value: (js.UndefOr[Text | Null | SignalRef]) with js.UndefOr[Null]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlign(value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      @scala.inline
      def setTitleY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined std.Omit<vega-lite.vega-lite/build/src/axis.BaseAxisNoValueRefs<ES>, vega-lite.vega-lite/build/src/axis.ConditionalAxisProp | 'title'> & vega-lite.vega-lite/build/src/axis.AxisPropsWithCondition<ES> */
  @js.native
  trait AxisConfigBaseWithConditionalAndSignal[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var bandPosition: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domain: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var grid: js.UndefOr[Boolean] = js.native
    
    var gridCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ] = js.native
    
    var labelAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ] = js.native
    
    var labelBound: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var labelExpr: js.UndefOr[String] = js.native
    
    var labelFlush: js.UndefOr[Boolean | Double] = js.native
    
    var labelFlushOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ] = js.native
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelLineHeight: (js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ]) with (js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ]) = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labels: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var maxExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var minExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var orient: js.UndefOr[AxisOrient | ES] = js.native
    
    var position: js.UndefOr[Double | ES] = js.native
    
    var style: js.UndefOr[String | js.Array[String]] = js.native
    
    var tickBand: js.UndefOr[
        (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var tickCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.native
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickExtra: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickMinStep: js.UndefOr[Double | ES] = js.native
    
    var tickOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickRound: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var ticks: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var title: js.UndefOr[Text | Null | SignalRef] = js.native
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var translate: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.native
    
    var zindex: js.UndefOr[Double] = js.native
  }
  object AxisConfigBaseWithConditionalAndSignal {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](
      labelLineHeight: (js.UndefOr[
          (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
        ]) with (js.UndefOr[
          (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
        ])
    ): AxisConfigBaseWithConditionalAndSignal[ES] = {
      val __obj = js.Dynamic.literal(labelLineHeight = labelLineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisConfigBaseWithConditionalAndSignal[ES]]
    }
    
    @scala.inline
    implicit class AxisConfigBaseWithConditionalAndSignalMutableBuilder[Self <: AxisConfigBaseWithConditionalAndSignal[_], ES /* <: ExprRef | SignalRef */] (val x: Self with AxisConfigBaseWithConditionalAndSignal[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBandPosition(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      @scala.inline
      def setDescription(value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDomain(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      @scala.inline
      def setDomainColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      @scala.inline
      def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      @scala.inline
      def setDomainDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      @scala.inline
      def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      @scala.inline
      def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value :_*))
      
      @scala.inline
      def setDomainOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      @scala.inline
      def setGridColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      @scala.inline
      def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      @scala.inline
      def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
      
      @scala.inline
      def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelBound(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      @scala.inline
      def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      @scala.inline
      def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(
        value: (js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
            ]) with (js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
            ])
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLabels(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMaxExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      @scala.inline
      def setMinExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTickBand(
        value: (Exclude[
              js.UndefOr[center | extent | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      @scala.inline
      def setTickCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      @scala.inline
      def setTickColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      @scala.inline
      def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      @scala.inline
      def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      @scala.inline
      def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      @scala.inline
      def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
      
      @scala.inline
      def setTickExtra(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      @scala.inline
      def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      @scala.inline
      def setTickOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      @scala.inline
      def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      @scala.inline
      def setTickRound(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      @scala.inline
      def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      @scala.inline
      def setTicks(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlign(value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      @scala.inline
      def setTitleX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      @scala.inline
      def setTitleY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  @js.native
  trait AxisConfigMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * Axis configuration, which determines default properties for all `x` and `y` [axes](https://vega.github.io/vega-lite/docs/axis.html). For a full list of axis configuration options, please see the [corresponding section of the axis documentation](https://vega.github.io/vega-lite/docs/axis.html#config).
      */
    var axis: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for axes with "band" scales.
      */
    var axisBand: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-axis along the bottom edge of the chart.
      */
    var axisBottom: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for axes with "point" or "band" scales.
      */
    var axisDiscrete: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-axis along the left edge of the chart.
      */
    var axisLeft: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for axes with "point" scales.
      */
    var axisPoint: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for quantitative axes.
      */
    var axisQuantitative: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-axis along the right edge of the chart.
      */
    var axisRight: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for temporal axes.
      */
    var axisTemporal: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-axis along the top edge of the chart.
      */
    var axisTop: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * X-axis specific config.
      */
    var axisX: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-axes with "band" scales.
      */
    var axisXBand: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-axes with "point" or "band" scales.
      */
    var axisXDiscrete: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-axes with "point" scales.
      */
    var axisXPoint: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-quantitative axes.
      */
    var axisXQuantitative: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for x-temporal axes.
      */
    var axisXTemporal: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Y-axis specific config.
      */
    var axisY: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-axes with "band" scales.
      */
    var axisYBand: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-axes with "point" or "band" scales.
      */
    var axisYDiscrete: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-axes with "point" scales.
      */
    var axisYPoint: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-quantitative axes.
      */
    var axisYQuantitative: js.UndefOr[AxisConfig[ES]] = js.native
    
    /**
      * Config for y-temporal axes.
      */
    var axisYTemporal: js.UndefOr[AxisConfig[ES]] = js.native
  }
  object AxisConfigMixins {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): AxisConfigMixins[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisConfigMixins[ES]]
    }
    
    @scala.inline
    implicit class AxisConfigMixinsMutableBuilder[Self <: AxisConfigMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with AxisConfigMixins[ES]) extends AnyVal {
      
      @scala.inline
      def setAxis(value: AxisConfig[ES]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisBand(value: AxisConfig[ES]): Self = StObject.set(x, "axisBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisBandUndefined: Self = StObject.set(x, "axisBand", js.undefined)
      
      @scala.inline
      def setAxisBottom(value: AxisConfig[ES]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      @scala.inline
      def setAxisDiscrete(value: AxisConfig[ES]): Self = StObject.set(x, "axisDiscrete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisDiscreteUndefined: Self = StObject.set(x, "axisDiscrete", js.undefined)
      
      @scala.inline
      def setAxisLeft(value: AxisConfig[ES]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      @scala.inline
      def setAxisPoint(value: AxisConfig[ES]): Self = StObject.set(x, "axisPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisPointUndefined: Self = StObject.set(x, "axisPoint", js.undefined)
      
      @scala.inline
      def setAxisQuantitative(value: AxisConfig[ES]): Self = StObject.set(x, "axisQuantitative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisQuantitativeUndefined: Self = StObject.set(x, "axisQuantitative", js.undefined)
      
      @scala.inline
      def setAxisRight(value: AxisConfig[ES]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      @scala.inline
      def setAxisTemporal(value: AxisConfig[ES]): Self = StObject.set(x, "axisTemporal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisTemporalUndefined: Self = StObject.set(x, "axisTemporal", js.undefined)
      
      @scala.inline
      def setAxisTop(value: AxisConfig[ES]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setAxisX(value: AxisConfig[ES]): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXBand(value: AxisConfig[ES]): Self = StObject.set(x, "axisXBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXBandUndefined: Self = StObject.set(x, "axisXBand", js.undefined)
      
      @scala.inline
      def setAxisXDiscrete(value: AxisConfig[ES]): Self = StObject.set(x, "axisXDiscrete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXDiscreteUndefined: Self = StObject.set(x, "axisXDiscrete", js.undefined)
      
      @scala.inline
      def setAxisXPoint(value: AxisConfig[ES]): Self = StObject.set(x, "axisXPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXPointUndefined: Self = StObject.set(x, "axisXPoint", js.undefined)
      
      @scala.inline
      def setAxisXQuantitative(value: AxisConfig[ES]): Self = StObject.set(x, "axisXQuantitative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXQuantitativeUndefined: Self = StObject.set(x, "axisXQuantitative", js.undefined)
      
      @scala.inline
      def setAxisXTemporal(value: AxisConfig[ES]): Self = StObject.set(x, "axisXTemporal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXTemporalUndefined: Self = StObject.set(x, "axisXTemporal", js.undefined)
      
      @scala.inline
      def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
      
      @scala.inline
      def setAxisY(value: AxisConfig[ES]): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYBand(value: AxisConfig[ES]): Self = StObject.set(x, "axisYBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYBandUndefined: Self = StObject.set(x, "axisYBand", js.undefined)
      
      @scala.inline
      def setAxisYDiscrete(value: AxisConfig[ES]): Self = StObject.set(x, "axisYDiscrete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYDiscreteUndefined: Self = StObject.set(x, "axisYDiscrete", js.undefined)
      
      @scala.inline
      def setAxisYPoint(value: AxisConfig[ES]): Self = StObject.set(x, "axisYPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYPointUndefined: Self = StObject.set(x, "axisYPoint", js.undefined)
      
      @scala.inline
      def setAxisYQuantitative(value: AxisConfig[ES]): Self = StObject.set(x, "axisYQuantitative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYQuantitativeUndefined: Self = StObject.set(x, "axisYQuantitative", js.undefined)
      
      @scala.inline
      def setAxisYTemporal(value: AxisConfig[ES]): Self = StObject.set(x, "axisYTemporal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYTemporalUndefined: Self = StObject.set(x, "axisYTemporal", js.undefined)
      
      @scala.inline
      def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    }
  }
  
  @js.native
  trait AxisEncoding extends StObject {
    
    /**
      * Custom encoding for the axis container.
      */
    var axis: js.UndefOr[GuideEncodingEntry] = js.native
    
    /**
      * Custom encoding for the axis domain rule mark.
      */
    var domain: js.UndefOr[GuideEncodingEntry] = js.native
    
    /**
      * Custom encoding for axis gridline rule marks.
      */
    var grid: js.UndefOr[GuideEncodingEntry] = js.native
    
    /**
      * Custom encoding for axis label text marks.
      */
    var labels: js.UndefOr[GuideEncodingEntry] = js.native
    
    /**
      * Custom encoding for axis tick rule marks.
      */
    var ticks: js.UndefOr[GuideEncodingEntry] = js.native
    
    /**
      * Custom encoding for the axis title text mark.
      */
    var title: js.UndefOr[GuideEncodingEntry] = js.native
  }
  object AxisEncoding {
    
    @scala.inline
    def apply(): AxisEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisEncoding]
    }
    
    @scala.inline
    implicit class AxisEncodingMutableBuilder[Self <: AxisEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: GuideEncodingEntry): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setDomain(value: GuideEncodingEntry): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setGrid(value: GuideEncodingEntry): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setLabels(value: GuideEncodingEntry): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setTicks(value: GuideEncodingEntry): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTitle(value: GuideEncodingEntry): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type AxisInternal = Axis[SignalRef]
  
  @js.native
  trait AxisOverrideMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * A boolean flag indicating if grid lines should be included as part of the axis
      *
      * __Default value:__ `true` for [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous) that are not binned; otherwise, `false`.
      */
    var grid: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
      *
      * __Default value:__ `true` for axis of a continuous x-scale. Otherwise, `false`.
      */
    var labelFlush: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `true` for non-nominal fields with non-log scales; `"greedy"` for log scales; otherwise `false`.
      */
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.native
    
    /**
      * The offset, in pixels, by which to displace the axis from the edge of the enclosing group or data rectangle.
      *
      * __Default value:__ derived from the [axis config](https://vega.github.io/vega-lite/docs/config.html#facet-scale-config)'s `offset` (`0` by default)
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y-axis oriented towards the right edge of the chart).
      *
      * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
      */
    var orient: js.UndefOr[AxisOrient | ES] = js.native
    
    /**
      * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
      *
      * __Default value__: `0`
      */
    var position: js.UndefOr[Double | ES] = js.native
    
    /**
      * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
      *
      * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and `"year"`. Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
      *
      * __Default value__: Determine using a formula `ceil(width/40)` for x and `ceil(height/40)` for y.
      *
      * @minimum 0
      */
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.native
    
    /**
      * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      */
    var tickMinStep: js.UndefOr[Double | ES] = js.native
    
    /**
      * Explicitly set the visible axis tick values.
      */
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.native
    
    /**
      * A non-negative integer indicating the z-index of the axis.
      * If zindex is 0, axes should be drawn behind all chart elements.
      * To put them in front, set `zindex` to `1` or more.
      *
      * __Default value:__ `0` (behind the marks).
      *
      * @TJS-type integer
      * @minimum 0
      */
    var zindex: js.UndefOr[Double] = js.native
  }
  object AxisOverrideMixins {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): AxisOverrideMixins[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisOverrideMixins[ES]]
    }
    
    @scala.inline
    implicit class AxisOverrideMixinsMutableBuilder[Self <: AxisOverrideMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with AxisOverrideMixins[ES]) extends AnyVal {
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      @scala.inline
      def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      @scala.inline
      def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.axis
    - typingsSlinky.vegaLite.vegaLiteStrings.domain
    - typingsSlinky.vegaLite.vegaLiteStrings.grid
    - typingsSlinky.vegaLite.vegaLiteStrings.labels
    - typingsSlinky.vegaLite.vegaLiteStrings.ticks
    - typingsSlinky.vegaLite.vegaLiteStrings.title
  */
  trait AxisPart extends StObject
  
  @js.native
  trait AxisPropsWithCondition[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ] = js.native
    
    var labelLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ] = js.native
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ] = js.native
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ] = js.native
    
    var title: js.UndefOr[Text | Null | SignalRef] = js.native
  }
  object AxisPropsWithCondition {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): AxisPropsWithCondition[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisPropsWithCondition[ES]]
    }
    
    @scala.inline
    implicit class AxisPropsWithConditionMutableBuilder[Self <: AxisPropsWithCondition[_], ES /* <: ExprRef | SignalRef */] (val x: Self with AxisPropsWithCondition[ES]) extends AnyVal {
      
      @scala.inline
      def setGridColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      @scala.inline
      def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      @scala.inline
      def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
      
      @scala.inline
      def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      @scala.inline
      def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setTickColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      @scala.inline
      def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      @scala.inline
      def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      @scala.inline
      def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      @scala.inline
      def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
      
      @scala.inline
      def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      @scala.inline
      def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      @scala.inline
      def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/axis.AxisOverrideMixins<ES> & vega-lite.vega-lite/build/src/axis.VLOnlyAxisMixins & std.Omit<vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<vega.vega.BaseAxis, ES>, 'labelOverlap'> */
  @js.native
  trait BaseAxisNoValueRefs[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var bandPosition: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domain: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var domainWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * A boolean flag indicating if grid lines should be included as part of the axis
      *
      * __Default value:__ `true` for [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous) that are not binned; otherwise, `false`.
      */
    var grid: js.UndefOr[Boolean] with (js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ]) = js.native
    
    var gridCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelBound: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.native
    
    /**
      * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
      *
      * __Default value:__ `true` for axis of a continuous x-scale. Otherwise, `false`.
      */
    var labelFlush: (js.UndefOr[Boolean | Double]) with (js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ]) = js.native
    
    var labelFlushOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `true` for non-nominal fields with non-log scales; `"greedy"` for log scales; otherwise `false`.
      */
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var labels: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var maxExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var minExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * The offset, in pixels, by which to displace the axis from the edge of the enclosing group or data rectangle.
      *
      * __Default value:__ derived from the [axis config](https://vega.github.io/vega-lite/docs/config.html#facet-scale-config)'s `offset` (`0` by default)
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y-axis oriented towards the right edge of the chart).
      *
      * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
      */
    var orient: js.UndefOr[AxisOrient | ES] = js.native
    
    /**
      * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
      *
      * __Default value__: `0`
      */
    var position: js.UndefOr[Double | ES] = js.native
    
    /**
      * A string or array of strings indicating the name of custom styles to apply to the axis. A style is a named collection of axis property defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles.
      *
      * __Default value:__ (none)
      * __Note:__ Any specified style will augment the default style. For example, an x-axis mark with `"style": "foo"` will use `config.axisX` and `config.style.foo` (the specified style `"foo"` has higher precedence).
      */
    var style: js.UndefOr[String | js.Array[String]] = js.native
    
    var tickBand: js.UndefOr[
        (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.native
    
    var tickCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
      *
      * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and `"year"`. Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
      *
      * __Default value__: Determine using a formula `ceil(width/40)` for x and `ceil(height/40)` for y.
      *
      * @minimum 0
      */
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.native
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickExtra: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      */
    var tickMinStep: js.UndefOr[Double | ES] = js.native
    
    var tickOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickRound: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var ticks: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var titleY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    var translate: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ] = js.native
    
    /**
      * Explicitly set the visible axis tick values.
      */
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.native
    
    /**
      * A non-negative integer indicating the z-index of the axis.
      * If zindex is 0, axes should be drawn behind all chart elements.
      * To put them in front, set `zindex` to `1` or more.
      *
      * __Default value:__ `0` (behind the marks).
      *
      * @TJS-type integer
      * @minimum 0
      */
    var zindex: js.UndefOr[Double] with (js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ]) = js.native
  }
  object BaseAxisNoValueRefs {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](
      grid: js.UndefOr[Boolean] with (js.UndefOr[
          (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
        ]),
      labelFlush: (js.UndefOr[Boolean | Double]) with (js.UndefOr[
          (Exclude[
            js.UndefOr[Double | Boolean | SignalRef], 
            ScaledValueRef[_] | NumericValueRef | ColorValueRef
          ]) | ES
        ]),
      zindex: js.UndefOr[Double] with (js.UndefOr[
          (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
        ])
    ): BaseAxisNoValueRefs[ES] = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], labelFlush = labelFlush.asInstanceOf[js.Any], zindex = zindex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAxisNoValueRefs[ES]]
    }
    
    @scala.inline
    implicit class BaseAxisNoValueRefsMutableBuilder[Self <: BaseAxisNoValueRefs[_], ES /* <: ExprRef | SignalRef */] (val x: Self with BaseAxisNoValueRefs[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBandPosition(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      @scala.inline
      def setDescription(value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDomain(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      @scala.inline
      def setDomainColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      @scala.inline
      def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      @scala.inline
      def setDomainDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      @scala.inline
      def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      @scala.inline
      def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value :_*))
      
      @scala.inline
      def setDomainOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      @scala.inline
      def setGrid(
        value: js.UndefOr[Boolean] with (js.UndefOr[
              (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
            ])
      ): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      @scala.inline
      def setGridColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      @scala.inline
      def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      @scala.inline
      def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
      
      @scala.inline
      def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      @scala.inline
      def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setLabelAlign(value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelBound(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      @scala.inline
      def setLabelColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      @scala.inline
      def setLabelFlush(
        value: (js.UndefOr[Boolean | Double]) with (js.UndefOr[
              (Exclude[
                js.UndefOr[Double | Boolean | SignalRef], 
                ScaledValueRef[_] | NumericValueRef | ColorValueRef
              ]) | ES
            ])
      ): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLabels(value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMaxExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      @scala.inline
      def setMinExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTickBand(
        value: (Exclude[
              js.UndefOr[center | extent | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      @scala.inline
      def setTickCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      @scala.inline
      def setTickColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      @scala.inline
      def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      @scala.inline
      def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      @scala.inline
      def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      @scala.inline
      def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
      
      @scala.inline
      def setTickExtra(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      @scala.inline
      def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      @scala.inline
      def setTickOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      @scala.inline
      def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      @scala.inline
      def setTickRound(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      @scala.inline
      def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      @scala.inline
      def setTicks(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTitleAlign(value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      @scala.inline
      def setTitleY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setZindex(
        value: js.UndefOr[Double] with (js.UndefOr[
              (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
            ])
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    }
  }
  
  type ConditionalAxisColor[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[Color | Null, ES]
  
  type ConditionalAxisLabelAlign[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[Align | Null, ES]
  
  type ConditionalAxisLabelBaseline[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[TextBaseline | Null, ES]
  
  type ConditionalAxisLabelFontStyle[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[FontStyle | Null, ES]
  
  type ConditionalAxisLabelFontWeight[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[FontWeight | Null, ES]
  
  type ConditionalAxisNumber[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[Double | Null, ES]
  
  type ConditionalAxisNumberArray[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[js.Array[Double] | Null, ES]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.labelAlign
    - typingsSlinky.vegaLite.vegaLiteStrings.labelBaseline
    - typingsSlinky.vegaLite.vegaLiteStrings.labelColor
    - typingsSlinky.vegaLite.vegaLiteStrings.labelFont
    - typingsSlinky.vegaLite.vegaLiteStrings.labelFontSize
    - typingsSlinky.vegaLite.vegaLiteStrings.labelFontStyle
    - typingsSlinky.vegaLite.vegaLiteStrings.labelFontWeight
    - typingsSlinky.vegaLite.vegaLiteStrings.labelOpacity
    - typingsSlinky.vegaLite.vegaLiteStrings.labelOffset
    - typingsSlinky.vegaLite.vegaLiteStrings.labelPadding
    - typingsSlinky.vegaLite.vegaLiteStrings.gridColor
    - typingsSlinky.vegaLite.vegaLiteStrings.gridDash
    - typingsSlinky.vegaLite.vegaLiteStrings.gridDashOffset
    - typingsSlinky.vegaLite.vegaLiteStrings.gridOpacity
    - typingsSlinky.vegaLite.vegaLiteStrings.gridWidth
    - typingsSlinky.vegaLite.vegaLiteStrings.tickColor
    - typingsSlinky.vegaLite.vegaLiteStrings.tickDash
    - typingsSlinky.vegaLite.vegaLiteStrings.tickDashOffset
    - typingsSlinky.vegaLite.vegaLiteStrings.tickOpacity
    - typingsSlinky.vegaLite.vegaLiteStrings.tickSize
    - typingsSlinky.vegaLite.vegaLiteStrings.tickWidth
  */
  trait ConditionalAxisProp extends StObject
  object ConditionalAxisProp {
    
    @scala.inline
    def gridColor: typingsSlinky.vegaLite.vegaLiteStrings.gridColor = "gridColor".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.gridColor]
    
    @scala.inline
    def gridDash: typingsSlinky.vegaLite.vegaLiteStrings.gridDash = "gridDash".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.gridDash]
    
    @scala.inline
    def gridDashOffset: typingsSlinky.vegaLite.vegaLiteStrings.gridDashOffset = "gridDashOffset".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.gridDashOffset]
    
    @scala.inline
    def gridOpacity: typingsSlinky.vegaLite.vegaLiteStrings.gridOpacity = "gridOpacity".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.gridOpacity]
    
    @scala.inline
    def gridWidth: typingsSlinky.vegaLite.vegaLiteStrings.gridWidth = "gridWidth".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.gridWidth]
    
    @scala.inline
    def labelAlign: typingsSlinky.vegaLite.vegaLiteStrings.labelAlign = "labelAlign".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelAlign]
    
    @scala.inline
    def labelBaseline: typingsSlinky.vegaLite.vegaLiteStrings.labelBaseline = "labelBaseline".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelBaseline]
    
    @scala.inline
    def labelColor: typingsSlinky.vegaLite.vegaLiteStrings.labelColor = "labelColor".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelColor]
    
    @scala.inline
    def labelFont: typingsSlinky.vegaLite.vegaLiteStrings.labelFont = "labelFont".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelFont]
    
    @scala.inline
    def labelFontSize: typingsSlinky.vegaLite.vegaLiteStrings.labelFontSize = "labelFontSize".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelFontSize]
    
    @scala.inline
    def labelFontStyle: typingsSlinky.vegaLite.vegaLiteStrings.labelFontStyle = "labelFontStyle".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelFontStyle]
    
    @scala.inline
    def labelFontWeight: typingsSlinky.vegaLite.vegaLiteStrings.labelFontWeight = "labelFontWeight".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelFontWeight]
    
    @scala.inline
    def labelOffset: typingsSlinky.vegaLite.vegaLiteStrings.labelOffset = "labelOffset".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelOffset]
    
    @scala.inline
    def labelOpacity: typingsSlinky.vegaLite.vegaLiteStrings.labelOpacity = "labelOpacity".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelOpacity]
    
    @scala.inline
    def labelPadding: typingsSlinky.vegaLite.vegaLiteStrings.labelPadding = "labelPadding".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.labelPadding]
    
    @scala.inline
    def tickColor: typingsSlinky.vegaLite.vegaLiteStrings.tickColor = "tickColor".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tickColor]
    
    @scala.inline
    def tickDash: typingsSlinky.vegaLite.vegaLiteStrings.tickDash = "tickDash".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tickDash]
    
    @scala.inline
    def tickDashOffset: typingsSlinky.vegaLite.vegaLiteStrings.tickDashOffset = "tickDashOffset".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tickDashOffset]
    
    @scala.inline
    def tickOpacity: typingsSlinky.vegaLite.vegaLiteStrings.tickOpacity = "tickOpacity".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tickOpacity]
    
    @scala.inline
    def tickSize: typingsSlinky.vegaLite.vegaLiteStrings.tickSize = "tickSize".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tickSize]
    
    @scala.inline
    def tickWidth: typingsSlinky.vegaLite.vegaLiteStrings.tickWidth = "tickWidth".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tickWidth]
  }
  
  type ConditionalAxisProperty[V /* <: (Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] = (ValueDef[V] | ES) with (Condition[V, ES])
  
  type ConditionalAxisString[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[String | Null, ES]
  
  @js.native
  trait VLOnlyAxisMixins extends StObject {
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.native
    
    /**
      * A string or array of strings indicating the name of custom styles to apply to the axis. A style is a named collection of axis property defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles.
      *
      * __Default value:__ (none)
      * __Note:__ Any specified style will augment the default style. For example, an x-axis mark with `"style": "foo"` will use `config.axisX` and `config.style.foo` (the specified style `"foo"` has higher precedence).
      */
    var style: js.UndefOr[String | js.Array[String]] = js.native
  }
  object VLOnlyAxisMixins {
    
    @scala.inline
    def apply(): VLOnlyAxisMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VLOnlyAxisMixins]
    }
    
    @scala.inline
    implicit class VLOnlyAxisMixinsMutableBuilder[Self <: VLOnlyAxisMixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
}
