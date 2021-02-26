package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.vegaTypingsStrings.aggregate
import typingsSlinky.vegaTypings.vegaTypingsStrings.bin
import typingsSlinky.vegaTypings.vegaTypingsStrings.collect
import typingsSlinky.vegaTypings.vegaTypingsStrings.countpattern
import typingsSlinky.vegaTypings.vegaTypingsStrings.cross
import typingsSlinky.vegaTypings.vegaTypingsStrings.crossfilter
import typingsSlinky.vegaTypings.vegaTypingsStrings.density
import typingsSlinky.vegaTypings.vegaTypingsStrings.dotbin
import typingsSlinky.vegaTypings.vegaTypingsStrings.extent
import typingsSlinky.vegaTypings.vegaTypingsStrings.filter
import typingsSlinky.vegaTypings.vegaTypingsStrings.flatten
import typingsSlinky.vegaTypings.vegaTypingsStrings.fold
import typingsSlinky.vegaTypings.vegaTypingsStrings.force
import typingsSlinky.vegaTypings.vegaTypingsStrings.formula
import typingsSlinky.vegaTypings.vegaTypingsStrings.geojson
import typingsSlinky.vegaTypings.vegaTypingsStrings.geopath
import typingsSlinky.vegaTypings.vegaTypingsStrings.geopoint
import typingsSlinky.vegaTypings.vegaTypingsStrings.geoshape
import typingsSlinky.vegaTypings.vegaTypingsStrings.graticule
import typingsSlinky.vegaTypings.vegaTypingsStrings.heatmap
import typingsSlinky.vegaTypings.vegaTypingsStrings.identifier
import typingsSlinky.vegaTypings.vegaTypingsStrings.impute
import typingsSlinky.vegaTypings.vegaTypingsStrings.isocontour
import typingsSlinky.vegaTypings.vegaTypingsStrings.joinaggregate
import typingsSlinky.vegaTypings.vegaTypingsStrings.kde
import typingsSlinky.vegaTypings.vegaTypingsStrings.kde2d
import typingsSlinky.vegaTypings.vegaTypingsStrings.label
import typingsSlinky.vegaTypings.vegaTypingsStrings.linkpath
import typingsSlinky.vegaTypings.vegaTypingsStrings.loess
import typingsSlinky.vegaTypings.vegaTypingsStrings.lookup
import typingsSlinky.vegaTypings.vegaTypingsStrings.nest
import typingsSlinky.vegaTypings.vegaTypingsStrings.pack
import typingsSlinky.vegaTypings.vegaTypingsStrings.partition
import typingsSlinky.vegaTypings.vegaTypingsStrings.pie
import typingsSlinky.vegaTypings.vegaTypingsStrings.pivot
import typingsSlinky.vegaTypings.vegaTypingsStrings.project
import typingsSlinky.vegaTypings.vegaTypingsStrings.quantile
import typingsSlinky.vegaTypings.vegaTypingsStrings.regression
import typingsSlinky.vegaTypings.vegaTypingsStrings.resolvefilter
import typingsSlinky.vegaTypings.vegaTypingsStrings.sample
import typingsSlinky.vegaTypings.vegaTypingsStrings.sequence
import typingsSlinky.vegaTypings.vegaTypingsStrings.stack
import typingsSlinky.vegaTypings.vegaTypingsStrings.stratify
import typingsSlinky.vegaTypings.vegaTypingsStrings.timeunit
import typingsSlinky.vegaTypings.vegaTypingsStrings.tree
import typingsSlinky.vegaTypings.vegaTypingsStrings.treelinks
import typingsSlinky.vegaTypings.vegaTypingsStrings.treemap
import typingsSlinky.vegaTypings.vegaTypingsStrings.voronoi
import typingsSlinky.vegaTypings.vegaTypingsStrings.window
import typingsSlinky.vegaTypings.vegaTypingsStrings.wordcloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Transforms extends StObject
object _Transforms {
  
  @scala.inline
  def AggregateTransform(`type`: aggregate): typingsSlinky.vegaTypings.transformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.AggregateTransform]
  }
  
  @scala.inline
  def BinTransform(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef, `type`: bin): typingsSlinky.vegaTypings.transformMod.BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.BinTransform]
  }
  
  @scala.inline
  def CollectTransform(sort: Compare, `type`: collect): typingsSlinky.vegaTypings.transformMod.CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.CollectTransform]
  }
  
  @scala.inline
  def CountPatternTransform(field: FieldRef, `type`: countpattern): typingsSlinky.vegaTypings.transformMod.CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.CountPatternTransform]
  }
  
  @scala.inline
  def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef,
    `type`: crossfilter
  ): typingsSlinky.vegaTypings.transformMod.CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.CrossFilterTransform]
  }
  
  @scala.inline
  def CrossTransform(`type`: cross): typingsSlinky.vegaTypings.transformMod.CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.CrossTransform]
  }
  
  @scala.inline
  def DensityTransform(`type`: density): typingsSlinky.vegaTypings.transformMod.DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DensityTransform]
  }
  
  @scala.inline
  def DotBinTransform(field: FieldRef, `type`: dotbin): typingsSlinky.vegaTypings.transformMod.DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.DotBinTransform]
  }
  
  @scala.inline
  def ExtentTransform(field: FieldRef, `type`: extent): typingsSlinky.vegaTypings.transformMod.ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.ExtentTransform]
  }
  
  @scala.inline
  def FilterTransform(expr: ExprString, `type`: filter): typingsSlinky.vegaTypings.transformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.FilterTransform]
  }
  
  @scala.inline
  def FlattenTransform(fields: js.Array[FieldRef] | SignalRef, `type`: flatten): typingsSlinky.vegaTypings.transformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.FlattenTransform]
  }
  
  @scala.inline
  def FoldTransform(fields: js.Array[FieldRef] | SignalRef, `type`: fold): typingsSlinky.vegaTypings.transformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.FoldTransform]
  }
  
  @scala.inline
  def ForceTransform(`type`: force): typingsSlinky.vegaTypings.transformMod.ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.ForceTransform]
  }
  
  @scala.inline
  def FormulaTransform(as: String | SignalRef, expr: ExprString, `type`: formula): typingsSlinky.vegaTypings.transformMod.FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.FormulaTransform]
  }
  
  @scala.inline
  def GeoJSONTransform(`type`: geojson): typingsSlinky.vegaTypings.transformMod.GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.GeoJSONTransform]
  }
  
  @scala.inline
  def GeoPathTransform(`type`: geopath): typingsSlinky.vegaTypings.transformMod.GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.GeoPathTransform]
  }
  
  @scala.inline
  def GeoPointTransform(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName, `type`: geopoint): typingsSlinky.vegaTypings.transformMod.GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.GeoPointTransform]
  }
  
  @scala.inline
  def GeoShapeTransform(`type`: geoshape): typingsSlinky.vegaTypings.transformMod.GeoShapeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.GeoShapeTransform]
  }
  
  @scala.inline
  def GraticuleTransform(`type`: graticule): typingsSlinky.vegaTypings.transformMod.GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.GraticuleTransform]
  }
  
  @scala.inline
  def HeatmapTransform(`type`: heatmap): typingsSlinky.vegaTypings.transformMod.HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.HeatmapTransform]
  }
  
  @scala.inline
  def IdentifierTransform(as: String | SignalRef, `type`: identifier): typingsSlinky.vegaTypings.transformMod.IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.IdentifierTransform]
  }
  
  @scala.inline
  def ImputeTransform(field: FieldRef, key: FieldRef, `type`: impute): typingsSlinky.vegaTypings.transformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.ImputeTransform]
  }
  
  @scala.inline
  def IsocontourTransform(`type`: isocontour): typingsSlinky.vegaTypings.transformMod.IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.IsocontourTransform]
  }
  
  @scala.inline
  def JoinAggregateTransform(`type`: joinaggregate): typingsSlinky.vegaTypings.transformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.JoinAggregateTransform]
  }
  
  @scala.inline
  def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField
  ): typingsSlinky.vegaTypings.transformMod.KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.KDE2DTransform]
  }
  
  @scala.inline
  def KDETransform(field: FieldRef, `type`: kde): typingsSlinky.vegaTypings.transformMod.KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.KDETransform]
  }
  
  @scala.inline
  def LabelTransform(size: (Vector2[Double | SignalRef]) | SignalRef, `type`: label): typingsSlinky.vegaTypings.transformMod.LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.LabelTransform]
  }
  
  @scala.inline
  def LinkPathTransform(`type`: linkpath): typingsSlinky.vegaTypings.transformMod.LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.LinkPathTransform]
  }
  
  @scala.inline
  def LoessTransform(`type`: loess, x: FieldRef, y: FieldRef): typingsSlinky.vegaTypings.transformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.LoessTransform]
  }
  
  @scala.inline
  def LookupTransform(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef, `type`: lookup): typingsSlinky.vegaTypings.transformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.LookupTransform]
  }
  
  @scala.inline
  def NestTransform(`type`: nest): typingsSlinky.vegaTypings.transformMod.NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.NestTransform]
  }
  
  @scala.inline
  def PackTransform(`type`: pack): typingsSlinky.vegaTypings.transformMod.PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.PackTransform]
  }
  
  @scala.inline
  def PartitionTransform(`type`: partition): typingsSlinky.vegaTypings.transformMod.PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.PartitionTransform]
  }
  
  @scala.inline
  def PieTransform(`type`: pie): typingsSlinky.vegaTypings.transformMod.PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.PieTransform]
  }
  
  @scala.inline
  def PivotTransform(field: FieldRef, `type`: pivot, value: FieldRef): typingsSlinky.vegaTypings.transformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.PivotTransform]
  }
  
  @scala.inline
  def ProjectTransform(`type`: project): typingsSlinky.vegaTypings.transformMod.ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.ProjectTransform]
  }
  
  @scala.inline
  def QuantileTransform(field: FieldRef, `type`: quantile): typingsSlinky.vegaTypings.transformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.QuantileTransform]
  }
  
  @scala.inline
  def RegressionTransform(`type`: regression, x: FieldRef, y: FieldRef): typingsSlinky.vegaTypings.transformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.RegressionTransform]
  }
  
  @scala.inline
  def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): typingsSlinky.vegaTypings.transformMod.ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.ResolveFilterTransform]
  }
  
  @scala.inline
  def SampleTransform(size: Double | SignalRef, `type`: sample): typingsSlinky.vegaTypings.transformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.SampleTransform]
  }
  
  @scala.inline
  def SequenceTransform(start: Double | SignalRef, stop: Double | SignalRef, `type`: sequence): typingsSlinky.vegaTypings.transformMod.SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.SequenceTransform]
  }
  
  @scala.inline
  def StackTransform(`type`: stack): typingsSlinky.vegaTypings.transformMod.StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.StackTransform]
  }
  
  @scala.inline
  def StratifyTransform(key: FieldRef, parentKey: FieldRef, `type`: stratify): typingsSlinky.vegaTypings.transformMod.StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.StratifyTransform]
  }
  
  @scala.inline
  def TimeUnitTransform(field: FieldRef, `type`: timeunit): typingsSlinky.vegaTypings.transformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.TimeUnitTransform]
  }
  
  @scala.inline
  def TreeLinksTransform(`type`: treelinks): typingsSlinky.vegaTypings.transformMod.TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.TreeLinksTransform]
  }
  
  @scala.inline
  def TreeTransform(`type`: tree): typingsSlinky.vegaTypings.transformMod.TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.TreeTransform]
  }
  
  @scala.inline
  def TreemapTransform(`type`: treemap): typingsSlinky.vegaTypings.transformMod.TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.TreemapTransform]
  }
  
  @scala.inline
  def VoronoiTransform(`type`: voronoi, x: FieldRef, y: FieldRef): typingsSlinky.vegaTypings.transformMod.VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.VoronoiTransform]
  }
  
  @scala.inline
  def WindowTransform(`type`: window): typingsSlinky.vegaTypings.transformMod.WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.WindowTransform]
  }
  
  @scala.inline
  def WordcloudTransform(`type`: wordcloud): typingsSlinky.vegaTypings.transformMod.WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.WordcloudTransform]
  }
}
