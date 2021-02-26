package typingsSlinky.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object channeldefMod {
  
  type ChannelDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = js.UndefOr[
    typingsSlinky.vegaLite.channeldefMod.TextDef[F] | typingsSlinky.vegaLite.channeldefMod.PositionDef[F] | typingsSlinky.vegaLite.channeldefMod.Position2Def[F] | (typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale[F, typingsSlinky.vegaLite.srcTypeMod.StandardType]) | typingsSlinky.vegaLite.channeldefMod.NumericArrayMarkPropDef[F] | typingsSlinky.vegaLite.channeldefMod.StringFieldDefWithCondition[F] | (typingsSlinky.vegaLite.channeldefMod.StringValueDefWithCondition[F, typingsSlinky.vegaLite.srcTypeMod.StandardType]) | typingsSlinky.vegaLite.channeldefMod.OrderFieldDef[F] | (js.Array[
      (typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale[F, typingsSlinky.vegaLite.srcTypeMod.StandardType]) | typingsSlinky.vegaLite.channeldefMod.OrderFieldDef[F] | typingsSlinky.vegaLite.channeldefMod.StringFieldDef[F]
    ]) | typingsSlinky.vegaLite.channeldefMod.OrderValueDef | typingsSlinky.vegaLite.channeldefMod.PolarDef[F] | typingsSlinky.vegaLite.channeldefMod.LatLongDef[F] | typingsSlinky.vegaLite.channeldefMod.NumericMarkPropDef[F] | scala.Null | typingsSlinky.vegaLite.channeldefMod.ColorDef[F] | typingsSlinky.vegaLite.channeldefMod.ShapeDef[F]
  ]
  
  type ColorDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.MarkPropDef[
    F, 
    typingsSlinky.vegaTypings.encodeMod.Gradient | java.lang.String | scala.Null, 
    typingsSlinky.vegaLite.srcTypeMod.StandardType
  ]
  
  type Conditional[CD /* <: (typingsSlinky.vegaLite.channeldefMod.FieldDef[_, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) | typingsSlinky.vegaLite.channeldefMod.ValueDef[_] | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef */] = typingsSlinky.vegaLite.channeldefMod.ConditionalPredicate[CD] | typingsSlinky.vegaLite.channeldefMod.ConditionalSelection[CD]
  
  type ConditionalPredicate[CD /* <: (typingsSlinky.vegaLite.channeldefMod.FieldDef[_, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) | typingsSlinky.vegaLite.channeldefMod.ValueDef[_] | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef */] = typingsSlinky.vegaLite.anon.Test with CD
  
  type ConditionalSelection[CD /* <: (typingsSlinky.vegaLite.channeldefMod.FieldDef[_, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) | typingsSlinky.vegaLite.channeldefMod.ValueDef[_] | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef */] = typingsSlinky.vegaLite.anon.Selection with CD
  
  type Field = typingsSlinky.vegaLite.channeldefMod.FieldName | typingsSlinky.vegaLite.channeldefMod.RepeatRef
  
  type FieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */] = typingsSlinky.vegaLite.channeldefMod.SecondaryFieldDef[F] | (typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
    F, 
    T, 
    scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
  ])
  
  type FieldDefWithoutScale[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */] = typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
    F, 
    T, 
    scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
  ]
  
  type FieldName = java.lang.String
  
  type FieldOrDatumDefWithCondition[F /* <: (typingsSlinky.vegaLite.channeldefMod.FieldDef[_, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    _, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) */, V /* <: typingsSlinky.vegaLite.channeldefMod.Value[
    typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ] */] = F with (typingsSlinky.vegaLite.channeldefMod.ConditionValueDefMixins[
    V | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ])
  
  type FieldTitleFormatter = js.Function2[
    /* fieldDef */ typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin], 
    /* config */ typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ], 
    java.lang.String
  ]
  
  type HiddenCompositeAggregate = typingsSlinky.vegaLite.compositemarkMod.CompositeAggregate
  
  type LatLongDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.LatLongFieldDef[F] | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    F, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) | typingsSlinky.vegaLite.channeldefMod.NumericValueDef
  
  type MarkPropDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, V /* <: typingsSlinky.vegaLite.channeldefMod.Value[
    typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ] */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */] = (typingsSlinky.vegaLite.channeldefMod.FieldOrDatumDefWithCondition[
    (typingsSlinky.vegaLite.channeldefMod.DatumDef[
      F, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]) | (typingsSlinky.vegaLite.channeldefMod.MarkPropFieldDef[F, T]), 
    V
  ]) | (typingsSlinky.vegaLite.channeldefMod.ValueDefWithCondition[typingsSlinky.vegaLite.channeldefMod.MarkPropFieldOrDatumDef[F, T], V])
  
  type MarkPropFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */] = (typingsSlinky.vegaLite.channeldefMod.ScaleFieldDef[F, T, scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | scala.Null]) with typingsSlinky.vegaLite.channeldefMod.LegendMixins
  
  type MarkPropFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */] = (typingsSlinky.vegaLite.channeldefMod.MarkPropFieldDef[F, T]) | typingsSlinky.vegaLite.channeldefMod.MarkPropDatumDef[F]
  
  type NumericArrayMarkPropDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.MarkPropDef[F, js.Array[scala.Double], typingsSlinky.vegaLite.srcTypeMod.StandardType]
  
  type NumericMarkPropDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.MarkPropDef[F, scala.Double, typingsSlinky.vegaLite.srcTypeMod.StandardType]
  
  type NumericValueDef = typingsSlinky.vegaLite.channeldefMod.ValueDef[
    scala.Double | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]
  
  type OrderValueDef = typingsSlinky.vegaLite.channeldefMod.ConditionValueDefMixins[scala.Double] with typingsSlinky.vegaLite.channeldefMod.NumericValueDef
  
  type PolarDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.PositionFieldDefBase[F] | typingsSlinky.vegaLite.channeldefMod.PositionDatumDefBase[F] | typingsSlinky.vegaLite.channeldefMod.PositionValueDef
  
  type Position2Def[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.SecondaryFieldDef[F] | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    F, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) | typingsSlinky.vegaLite.channeldefMod.PositionValueDef
  
  type PositionDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.PositionFieldDef[F] | typingsSlinky.vegaLite.channeldefMod.PositionDatumDef[F] | typingsSlinky.vegaLite.channeldefMod.PositionValueDef
  
  type PositionFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.PositionFieldDefBase[F] with typingsSlinky.vegaLite.channeldefMod.PositionMixins
  
  type PositionFieldDefBase[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = (typingsSlinky.vegaLite.channeldefMod.ScaleFieldDef[
    F, 
    typingsSlinky.vegaLite.srcTypeMod.StandardType, 
    scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
  ]) with typingsSlinky.vegaLite.channeldefMod.PositionBaseMixins
  
  type PositionValueDef = typingsSlinky.vegaLite.channeldefMod.ValueDef[
    scala.Double | typingsSlinky.vegaLite.vegaLiteStrings.width | typingsSlinky.vegaLite.vegaLiteStrings.height | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]
  
  type PrimitiveValue = scala.Double | java.lang.String | scala.Boolean | scala.Null
  
  type ScaleFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */, B /* <: typingsSlinky.vegaLite.binMod.Bin */] = (typingsSlinky.vegaLite.channeldefMod.SortableFieldDef[F, T, B]) with typingsSlinky.vegaLite.channeldefMod.ScaleMixins
  
  type SecondaryChannelDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = js.UndefOr[typingsSlinky.vegaLite.channeldefMod.Position2Def[F]]
  
  type SecondaryFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = (typingsSlinky.vegaLite.channeldefMod.FieldDefBase[F, scala.Null]) with typingsSlinky.vegaLite.srcGuideMod.TitleMixins
  
  type ShapeDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.MarkPropDef[F, java.lang.String | scala.Null, typingsSlinky.vegaLite.channeldefMod.TypeForShape]
  
  type StringFieldDefWithCondition[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = typingsSlinky.vegaLite.channeldefMod.FieldOrDatumDefWithCondition[typingsSlinky.vegaLite.channeldefMod.StringFieldDef[F], java.lang.String]
  
  type TextDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] = (typingsSlinky.vegaLite.channeldefMod.FieldOrDatumDefWithCondition[
    typingsSlinky.vegaLite.channeldefMod.StringDatumDef[F] | typingsSlinky.vegaLite.channeldefMod.StringFieldDef[F], 
    typingsSlinky.vegaTypings.encodeMod.Text
  ]) | (typingsSlinky.vegaLite.channeldefMod.ValueDefWithCondition[
    typingsSlinky.vegaLite.channeldefMod.StringFieldDef[F], 
    typingsSlinky.vegaTypings.encodeMod.Text
  ])
  
  type TypedFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, T /* <: typingsSlinky.vegaLite.srcTypeMod.Type */, B /* <: typingsSlinky.vegaLite.binMod.Bin */] = (typingsSlinky.vegaLite.channeldefMod.FieldDefBase[F, B]) with typingsSlinky.vegaLite.srcGuideMod.TitleMixins with typingsSlinky.vegaLite.channeldefMod.TypeMixins[T]
  
  type Value[ES /* <: typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef */] = typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | js.Array[scala.Double] | typingsSlinky.vegaTypings.encodeMod.Gradient | typingsSlinky.vegaTypings.encodeMod.Text | ES
  
  @scala.inline
  def binRequiresRange(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _],
    channel: typingsSlinky.vegaLite.channelMod.Channel
  ): scala.Boolean = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("binRequiresRange")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def channelCompatibility_binned(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      typingsSlinky.vegaLite.channeldefMod.Field, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel
  ): typingsSlinky.vegaLite.anon.Compatible = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("channelCompatibility")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.anon.Compatible]
  
  @scala.inline
  def channelDefType[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): js.UndefOr[typingsSlinky.vegaLite.srcTypeMod.Type] = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("channelDefType")(channelDef.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.vegaLite.srcTypeMod.Type]]
  
  @scala.inline
  def defaultTitle(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin],
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultTitle")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def defaultTitleFormatter: typingsSlinky.vegaLite.channeldefMod.FieldTitleFormatter = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTitleFormatter").asInstanceOf[typingsSlinky.vegaLite.channeldefMod.FieldTitleFormatter]
  
  @scala.inline
  def defaultType[T /* <: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
    typingsSlinky.vegaLite.channeldefMod.Field, 
    _, 
    scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
  ] */](fieldDef: T, channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel): typingsSlinky.vegaLite.srcTypeMod.Type = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultType")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.srcTypeMod.Type]
  
  @scala.inline
  def functionalTitleFormatter(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin]
  ): java.lang.String = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("functionalTitleFormatter")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getBand(hasChannelFieldDefFieldDef2MarkDefStackConfigIsMidPoint: typingsSlinky.vegaLite.anon.Channel): scala.Double = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBand")(hasChannelFieldDefFieldDef2MarkDefStackConfigIsMidPoint.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): typingsSlinky.vegaLite.channeldefMod.FieldDef[F, _] = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.channeldefMod.FieldDef[F, _]]
  
  @scala.inline
  def getFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */, CD /* <: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F] */](channelDef: CD): (typingsSlinky.vegaLite.channeldefMod.FieldDef[F, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    F, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[(typingsSlinky.vegaLite.channeldefMod.FieldDef[F, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    F, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ])]
  
  @scala.inline
  def getFormatMixins(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): typingsSlinky.vegaLite.anon.Format = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.anon.Format]
  
  @scala.inline
  def getFormatMixins_binned(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      java.lang.String, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ]
  ): typingsSlinky.vegaLite.anon.Format = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.anon.Format]
  
  @scala.inline
  def getGuide(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): typingsSlinky.vegaLite.srcGuideMod.Guide = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.srcGuideMod.Guide]
  @scala.inline
  def getGuide(fieldDef: typingsSlinky.vegaLite.channeldefMod.SecondaryFieldDef[java.lang.String]): typingsSlinky.vegaLite.srcGuideMod.Guide = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.srcGuideMod.Guide]
  
  @scala.inline
  def getGuide_binned(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      java.lang.String, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ]
  ): typingsSlinky.vegaLite.srcGuideMod.Guide = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.srcGuideMod.Guide]
  
  @scala.inline
  def hasBand(
    channel: typingsSlinky.vegaLite.channelMod.Channel,
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _],
    fieldDef2: typingsSlinky.vegaLite.channeldefMod.SecondaryChannelDef[java.lang.String],
    stack: typingsSlinky.vegaLite.srcStackMod.StackProperties,
    markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[
      typingsSlinky.vegaLite.srcMarkMod.Mark, 
      typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    config: typingsSlinky.vegaLite.srcConfigMod.Config[typingsSlinky.vegaTypings.signalMod.SignalRef]
  ): scala.Boolean = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBand")(channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], fieldDef2.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasConditionalFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.std.Partial[typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]]): /* is vega-lite.anon.0<F> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.0<F> */ scala.Boolean]
  
  @scala.inline
  def hasConditionalFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.anon.0<F> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.0<F> */ scala.Boolean]
  
  @scala.inline
  def hasConditionalValueDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.anon.ValueDefanyconditionCondi */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.ValueDefanyconditionCondi */ scala.Boolean]
  
  @scala.inline
  def initChannelDef(
    channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[java.lang.String],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel,
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): typingsSlinky.vegaLite.channeldefMod.ChannelDef[java.lang.String] = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.channeldefMod.ChannelDef[java.lang.String]]
  @scala.inline
  def initChannelDef(
    channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[java.lang.String],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel,
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    opt: typingsSlinky.vegaLite.anon.CompositeMark
  ): typingsSlinky.vegaLite.channeldefMod.ChannelDef[java.lang.String] = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.channeldefMod.ChannelDef[java.lang.String]]
  
  @scala.inline
  def initFieldDef(
    fd: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel
  ): typingsSlinky.vegaLite.anon.Aggregate | typingsSlinky.vegaLite.anon.Band | typingsSlinky.vegaLite.anon.Bin | typingsSlinky.vegaLite.anon.Field | typingsSlinky.vegaLite.anon.Header = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.anon.Aggregate | typingsSlinky.vegaLite.anon.Band | typingsSlinky.vegaLite.anon.Bin | typingsSlinky.vegaLite.anon.Field | typingsSlinky.vegaLite.anon.Header]
  @scala.inline
  def initFieldDef(
    fd: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel,
    hasCompositeMark: typingsSlinky.vegaLite.anon.CompositeMark
  ): typingsSlinky.vegaLite.anon.Aggregate | typingsSlinky.vegaLite.anon.Band | typingsSlinky.vegaLite.anon.Bin | typingsSlinky.vegaLite.anon.Field | typingsSlinky.vegaLite.anon.Header = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], hasCompositeMark.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.anon.Aggregate | typingsSlinky.vegaLite.anon.Band | typingsSlinky.vegaLite.anon.Bin | typingsSlinky.vegaLite.anon.Field | typingsSlinky.vegaLite.anon.Header]
  
  @scala.inline
  def initFieldOrDatumDef(
    fd: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel,
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    opt: typingsSlinky.vegaLite.anon.CompositeMark
  ): (typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ])]
  @scala.inline
  def initFieldOrDatumDef(
    fd: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _],
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel,
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    opt: typingsSlinky.vegaLite.anon.CompositeMark
  ): (typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ]) = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _]) | (typingsSlinky.vegaLite.channeldefMod.DatumDef[
    java.lang.String, 
    typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ])]
  
  @scala.inline
  def isConditionalDef(channelDef: typingsSlinky.vegaLite.exprMod.ExprRef): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isConditionalDef(channelDef: typingsSlinky.vegaTypings.signalMod.SignalRef): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isConditionalDef[CD /* <: js.UndefOr[
    typingsSlinky.vegaLite.channeldefMod.Position2Def[_] | typingsSlinky.vegaLite.channeldefMod.TextDef[_] | typingsSlinky.vegaLite.channeldefMod.ColorDef[_] | typingsSlinky.vegaLite.channeldefMod.PositionDef[_] | typingsSlinky.vegaLite.channeldefMod.OrderFieldDef[_] | (js.Array[
      (typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale[_, typingsSlinky.vegaLite.srcTypeMod.StandardType]) | typingsSlinky.vegaLite.channeldefMod.OrderFieldDef[_] | typingsSlinky.vegaLite.channeldefMod.StringFieldDef[_]
    ]) | typingsSlinky.vegaLite.channeldefMod.OrderValueDef | typingsSlinky.vegaLite.channeldefMod.NumericArrayMarkPropDef[_] | typingsSlinky.vegaLite.channeldefMod.LatLongDef[_] | (typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale[_, typingsSlinky.vegaLite.srcTypeMod.StandardType]) | typingsSlinky.vegaLite.channeldefMod.ShapeDef[_] | typingsSlinky.vegaLite.channeldefMod.StringFieldDefWithCondition[_] | (typingsSlinky.vegaLite.channeldefMod.StringValueDefWithCondition[_, typingsSlinky.vegaLite.srcTypeMod.StandardType]) | typingsSlinky.vegaLite.channeldefMod.NumericMarkPropDef[_] | typingsSlinky.vegaLite.channeldefMod.PolarDef[_] | scala.Null | ((typingsSlinky.vegaLite.channeldefMod.ValueDef[
      typingsSlinky.vegaLite.channeldefMod.Value[
        typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
      ]
    ]) with (typingsSlinky.vegaLite.channeldefMod.ConditionValueDefMixins[
      typingsSlinky.vegaLite.channeldefMod.Value[
        typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
      ]
    ]))
  ] */](channelDef: CD): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isConditionalSelection[T](c: typingsSlinky.vegaLite.channeldefMod.Conditional[T]): /* is vega-lite.vega-lite/build/src/channeldef.ConditionalSelection<T> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalSelection")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ConditionalSelection<T> */ scala.Boolean]
  
  @scala.inline
  def isContinuousFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](cd: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isContinuousFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isContinuous_binned(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      typingsSlinky.vegaLite.channeldefMod.Field, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ]
  ): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isContinuous")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCount(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[typingsSlinky.vegaLite.channeldefMod.Field, typingsSlinky.vegaLite.binMod.Bin]
  ): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCount")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.std.Partial[typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean]
  @scala.inline
  def isDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[F, _]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean]
  @scala.inline
  def isDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](
    channelDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[F, typingsSlinky.vegaLite.binMod.Bin]
  ): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean]
  
  @scala.inline
  def isDiscrete(`def`: typingsSlinky.vegaLite.channeldefMod.DatumDef[_, _]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isDiscrete_binned(
    `def`: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      typingsSlinky.vegaLite.channeldefMod.Field, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ]
  ): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.std.Partial[typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[F, _]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](
    channelDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[F, typingsSlinky.vegaLite.binMod.Bin]
  ): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.std.Partial[typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isFieldOrDatumDefForTimeFormat(
    fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isFieldOrDatumDefForTimeFormat(fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isMarkPropFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkPropFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNumericDataDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](cd: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, number> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumericDataDef")(cd.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, number> */ scala.Boolean]
  
  @scala.inline
  def isPositionFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPositionFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isQuantitativeFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](cd: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isQuantitativeFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isRepeatRef(field: js.Any): /* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatRef")(field.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean]
  @scala.inline
  def isRepeatRef(field: typingsSlinky.vegaLite.channeldefMod.Field): /* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatRef")(field.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean]
  
  @scala.inline
  def isScaleFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.ScaleFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isScaleFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ScaleFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean]
  
  @scala.inline
  def isSortableFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[F, _]): /* is vega-lite.vega-lite/build/src/channeldef.SortableFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSortableFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.SortableFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean]
  
  @scala.inline
  def isStringFieldOrDatumDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStringFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTimeFieldDef(
    `def`: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isTimeFieldDef(`def`: typingsSlinky.vegaLite.channeldefMod.FieldDef[_, _]): scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypedFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.TypedFieldDef<F, any, boolean | vega-lite.vega-lite/build/src/bin.BinParams | 'binned' | null> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypedFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.TypedFieldDef<F, any, boolean | vega-lite.vega-lite/build/src/bin.BinParams | 'binned' | null> */ scala.Boolean]
  
  @scala.inline
  def isValueDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](channelDef: typingsSlinky.std.Partial[typingsSlinky.vegaLite.channeldefMod.ChannelDef[F]]): /* is vega-lite.vega-lite/build/src/channeldef.ValueDef<any> */ scala.Boolean = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ValueDef<any> */ scala.Boolean]
  
  @scala.inline
  def normalizeBin(bin: scala.Boolean): typingsSlinky.vegaLite.binMod.BinParams = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.binMod.BinParams]
  @scala.inline
  def normalizeBin(bin: scala.Boolean, channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel): typingsSlinky.vegaLite.binMod.BinParams = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.binMod.BinParams]
  @scala.inline
  def normalizeBin(bin: typingsSlinky.vegaLite.binMod.BinParams): typingsSlinky.vegaLite.binMod.BinParams = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.binMod.BinParams]
  @scala.inline
  def normalizeBin(
    bin: typingsSlinky.vegaLite.binMod.BinParams,
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel
  ): typingsSlinky.vegaLite.binMod.BinParams = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.binMod.BinParams]
  
  @scala.inline
  def normalizeBin_binned(bin: typingsSlinky.vegaLite.vegaLiteStrings.binned): typingsSlinky.vegaLite.binMod.BinParams = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.binMod.BinParams]
  @scala.inline
  def normalizeBin_binned(
    bin: typingsSlinky.vegaLite.vegaLiteStrings.binned,
    channel: typingsSlinky.vegaLite.channelMod.ExtendedChannel
  ): typingsSlinky.vegaLite.binMod.BinParams = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.binMod.BinParams]
  
  @scala.inline
  def resetTitleFormatter(): scala.Unit = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("resetTitleFormatter")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setTitleFormatter(formatter: typingsSlinky.vegaLite.channeldefMod.FieldTitleFormatter): scala.Unit = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("setTitleFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def title(
    fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    hasAllowDisablingIncludeDefault: typingsSlinky.vegaLite.anon.AllowDisabling
  ): java.lang.String | js.Array[java.lang.String] | typingsSlinky.vegaTypings.signalMod.SignalRef = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String] | typingsSlinky.vegaTypings.signalMod.SignalRef]
  @scala.inline
  def title(
    fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.SecondaryFieldDef[java.lang.String],
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    hasAllowDisablingIncludeDefault: typingsSlinky.vegaLite.anon.AllowDisabling
  ): java.lang.String | js.Array[java.lang.String] | typingsSlinky.vegaTypings.signalMod.SignalRef = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String] | typingsSlinky.vegaTypings.signalMod.SignalRef]
  
  @scala.inline
  def title_binned(
    fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      java.lang.String, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ],
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    hasAllowDisablingIncludeDefault: typingsSlinky.vegaLite.anon.AllowDisabling
  ): java.lang.String | js.Array[java.lang.String] | typingsSlinky.vegaTypings.signalMod.SignalRef = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String] | typingsSlinky.vegaTypings.signalMod.SignalRef]
  
  @scala.inline
  def toFieldDefBase(fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[java.lang.String, _]): typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin] = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("toFieldDefBase")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin]]
  
  @scala.inline
  def toStringFieldDef[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[F, _]): typingsSlinky.vegaLite.channeldefMod.StringFieldDef[F] = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("toStringFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vegaLite.channeldefMod.StringFieldDef[F]]
  
  @scala.inline
  def valueArray(
    fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.DatumDef[
      java.lang.String, 
      typingsSlinky.vegaLite.channeldefMod.PrimitiveValue | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ],
    values: js.Array[
      scala.Double | java.lang.String | scala.Boolean | typingsSlinky.vegaLite.datetimeMod.DateTime
    ]
  ): js.Array[
    java.lang.String | scala.Double | scala.Boolean | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.anon.Signal
  ] = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    java.lang.String | scala.Double | scala.Boolean | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.anon.Signal
  ]]
  
  @scala.inline
  def valueArray_binned(
    fieldOrDatumDef: typingsSlinky.vegaLite.channeldefMod.TypedFieldDef[
      java.lang.String, 
      _, 
      scala.Boolean | typingsSlinky.vegaLite.binMod.BinParams | typingsSlinky.vegaLite.vegaLiteStrings.binned | scala.Null
    ],
    values: js.Array[
      scala.Double | java.lang.String | scala.Boolean | typingsSlinky.vegaLite.datetimeMod.DateTime
    ]
  ): js.Array[
    java.lang.String | scala.Double | scala.Boolean | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.anon.Signal
  ] = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    java.lang.String | scala.Double | scala.Boolean | typingsSlinky.vegaLite.datetimeMod.DateTime | typingsSlinky.vegaLite.anon.Signal
  ]]
  
  @scala.inline
  def valueExpr(
    v: java.lang.String,
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def valueExpr(
    v: js.Array[scala.Double],
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def valueExpr(
    v: scala.Boolean,
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def valueExpr(
    v: scala.Double,
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def valueExpr(
    v: typingsSlinky.vegaLite.datetimeMod.DateTime,
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def valueExpr(
    v: typingsSlinky.vegaLite.exprMod.ExprRef,
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def valueExpr(
    v: typingsSlinky.vegaTypings.signalMod.SignalRef,
    hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typingsSlinky.vegaLite.anon.TimeUnit
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def verbalTitleFormatter(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin],
    config: typingsSlinky.vegaLite.srcConfigMod.Config[
      typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
    ]
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("verbalTitleFormatter")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def vgField(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin]
  ): java.lang.String = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def vgField(
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typingsSlinky.vegaLite.binMod.Bin],
    opt: typingsSlinky.vegaLite.channeldefMod.FieldRefOption
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def vgField(fieldDef: typingsSlinky.vegaLite.transformMod.AggregatedFieldDef): java.lang.String = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def vgField(
    fieldDef: typingsSlinky.vegaLite.transformMod.AggregatedFieldDef,
    opt: typingsSlinky.vegaLite.channeldefMod.FieldRefOption
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def vgField(fieldDef: typingsSlinky.vegaLite.transformMod.WindowFieldDef): java.lang.String = typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def vgField(
    fieldDef: typingsSlinky.vegaLite.transformMod.WindowFieldDef,
    opt: typingsSlinky.vegaLite.channeldefMod.FieldRefOption
  ): java.lang.String = (typingsSlinky.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
