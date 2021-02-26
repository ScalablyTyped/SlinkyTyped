package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Column
import typingsSlinky.vegaLite.anon.PartialRecordExtendedChan
import typingsSlinky.vegaLite.channelMod.Channel
import typingsSlinky.vegaLite.channelMod.ExtendedChannel
import typingsSlinky.vegaLite.channelMod.ScaleChannel
import typingsSlinky.vegaLite.channelMod.SingleDefChannel
import typingsSlinky.vegaLite.channeldefMod.FieldDef
import typingsSlinky.vegaLite.channeldefMod.FieldRefOption
import typingsSlinky.vegaLite.componentMod.AxisComponentIndex
import typingsSlinky.vegaLite.dataMod.DataComponent
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.layoutsizeComponentMod.LayoutSizeComponent
import typingsSlinky.vegaLite.layoutsizeComponentMod.LayoutSizeType
import typingsSlinky.vegaLite.legendComponentMod.LegendComponentIndex
import typingsSlinky.vegaLite.projectionComponentMod.ProjectionComponent
import typingsSlinky.vegaLite.scaleComponentMod.ScaleComponent
import typingsSlinky.vegaLite.scaleComponentMod.ScaleComponentIndex
import typingsSlinky.vegaLite.selectionMod.SelectionComponent
import typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns
import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import typingsSlinky.vegaLite.specBaseMod.SpecType
import typingsSlinky.vegaLite.specBaseMod.ViewBackground
import typingsSlinky.vegaLite.specMod.NormalizedSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcDataMod.Data
import typingsSlinky.vegaLite.srcDataMod.DataSourceType
import typingsSlinky.vegaLite.srcResolveMod.Resolve
import typingsSlinky.vegaLite.srcSelectionMod.SelectionType
import typingsSlinky.vegaLite.titleMod.TitleParams
import typingsSlinky.vegaLite.transformMod.Transform
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaSchemaMod.VgData
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaLite.vegaSchemaMod.VgLayout
import typingsSlinky.vegaLite.vegaSchemaMod.VgMarkGroup
import typingsSlinky.vegaTypings.axisMod.Axis
import typingsSlinky.vegaTypings.legendMod.Legend
import typingsSlinky.vegaTypings.projectionMod.Projection
import typingsSlinky.vegaTypings.signalMod.NewSignal
import typingsSlinky.vegaTypings.signalMod.Signal
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.titleMod.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("vega-lite/build/src/compile/model", "Model")
  @js.native
  abstract class Model protected () extends StObject {
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve
    ) = this()
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve,
      view: ViewBackground[ExprRef | SignalRef]
    ) = this()
    
    def assembleAxes(): js.Array[Axis] = js.native
    
    /* protected */ def assembleDefaultLayout(): VgLayout = js.native
    
    var assembleEncodeFromView: js.Any = js.native
    
    /**
      * Assemble the mark group for this model. We accept optional `signals` so that we can include concat top-level signals with the top-level model's local signals.
      */
    def assembleGroup(): js.Any = js.native
    def assembleGroup(signals: js.Array[Signal]): js.Any = js.native
    
    def assembleGroupEncodeEntry(isTopLevel: Boolean): VgEncodeEntry = js.native
    
    def assembleGroupStyle(): String | js.Array[String] = js.native
    
    def assembleHeaderMarks(): js.Array[VgMarkGroup] = js.native
    
    def assembleLayout(): VgLayout = js.native
    
    def assembleLayoutSignals(): js.Array[NewSignal] = js.native
    
    def assembleLegends(): js.Array[Legend] = js.native
    
    def assembleMarks(): js.Array[VgMarkGroup] = js.native
    
    def assembleProjections(): js.Array[Projection] = js.native
    
    def assembleSelectionData(data: js.Array[VgData]): js.Array[VgData] = js.native
    
    def assembleSelectionTopLevelSignals(signals: js.Array[NewSignal]): js.Array[NewSignal] = js.native
    
    def assembleSignals(): js.Array[NewSignal] = js.native
    
    def assembleTitle(): Title = js.native
    
    val children: js.Array[Model] = js.native
    
    val component: Component = js.native
    
    val config: Config[SignalRef] = js.native
    
    /**
      * Corrects the data references in marks after assemble.
      */
    def correctDataNames(mark: VgMarkGroup): js.Any = js.native
    
    val data: Data | Null = js.native
    
    val description: String = js.native
    
    def getDataName(`type`: DataSourceType): String = js.native
    
    def getName(text: String): String = js.native
    
    /**
      * Traverse a model's hierarchy to get the scale component for a particular channel.
      */
    def getScaleComponent(channel: ScaleChannel): ScaleComponent = js.native
    
    /**
      * Traverse a model's hierarchy to get a particular selection component.
      */
    def getSelectionComponent(variableName: String, origName: String): SelectionComponent[SelectionType] = js.native
    
    def getSignalName(oldSignalName: String): String = js.native
    
    def getSizeSignalRef(layoutSizeType: LayoutSizeType): SignalRef = js.native
    
    /**
      * Returns true if the model has a signalRef for an axis orient.
      */
    def hasAxisOrientSignalRef(): Boolean = js.native
    
    def height: SignalRef = js.native
    
    var initTitle: js.Any = js.native
    
    val layout: GenericCompositionLayoutWithColumns = js.native
    
    /**
      * Lookup the name of the datasource for an output node. You probably want to call this in assemble.
      */
    def lookupDataSource(name: String): String = js.native
    
    val name: String = js.native
    
    val parent: Model = js.native
    
    def parse(): Unit = js.native
    
    def parseAxesAndHeaders(): Unit = js.native
    
    def parseData(): Unit = js.native
    
    def parseLayoutSize(): Unit = js.native
    
    def parseLegends(): Unit = js.native
    
    def parseMarkGroup(): Unit = js.native
    
    def parseProjection(): Unit = js.native
    
    def parseScale(): Unit = js.native
    
    def parseSelections(): Unit = js.native
    
    /**
      * @return projection name after the projection has been parsed and named.
      */
    def projectionName(): String = js.native
    def projectionName(parse: Boolean): String = js.native
    
    /** Name map for projections, which can be renamed by a model's parent. */
    var projectionNameMap: NameMapInterface = js.native
    
    def renameProjection(oldName: String, newName: String): Unit = js.native
    
    def renameScale(oldName: String, newName: String): Unit = js.native
    
    def renameSignal(oldName: String, newName: String): Unit = js.native
    
    /**
      * Rename top-level spec's size to be just width / height, ignoring model name.
      * This essentially merges the top-level spec's width/height signals with the width/height signals
      * to help us reduce redundant signals declaration.
      */
    var renameTopLevelLayoutSizeSignal: js.Any = js.native
    
    /**
      * Request a data source name for the given data source type and mark that data source as required.
      * This method should be called in parse, so that all used data source can be correctly instantiated in assembleData().
      * You can lookup the correct dataset name in assemble with `lookupDataSource`.
      */
    def requestDataName(name: DataSourceType): String = js.native
    
    def scaleName(originalScaleName: String): String = js.native
    def scaleName(originalScaleName: String, parse: Boolean): String = js.native
    /**
      * @return scale name for a given channel after the scale has been parsed and named.
      */
    def scaleName(originalScaleName: ScaleChannel): String = js.native
    def scaleName(originalScaleName: ScaleChannel, parse: Boolean): String = js.native
    
    /** Name map for scales, which can be renamed by a model's parent. */
    var scaleNameMap: NameMapInterface = js.native
    
    /** Name map for signals, which can be renamed by a model's parent. */
    var signalNameMap: NameMapInterface = js.native
    
    var size: LayoutSizeMixins = js.native
    
    val title: TitleParams[SignalRef] = js.native
    
    val transforms: js.Array[Transform] = js.native
    
    val `type`: SpecType = js.native
    
    val view: js.UndefOr[ViewBackground[SignalRef]] = js.native
    
    def width: SignalRef = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/model", "ModelWithField")
  @js.native
  abstract class ModelWithField protected () extends Model {
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve
    ) = this()
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve,
      view: ViewBackground[ExprRef | SignalRef]
    ) = this()
    
    def channelHasField(channel: Channel): Boolean = js.native
    
    def fieldDef(channel: SingleDefChannel): FieldDef[_, _] = js.native
    
    def forEachFieldDef(f: js.Function2[/* fd */ FieldDef[String, _], /* c */ ExtendedChannel, Unit]): Unit = js.native
    def forEachFieldDef(f: js.Function2[/* fd */ FieldDef[String, _], /* c */ ExtendedChannel, Unit], t: js.Any): Unit = js.native
    
    /* protected */ def getMapping(): PartialRecordExtendedChan = js.native
    
    def reduceFieldDef[T, U](f: js.Function3[/* acc */ U, /* fd */ FieldDef[String, _], /* c */ Channel, U], init: T): T = js.native
    
    /** Get "field" reference for Vega */
    def vgField(channel: SingleDefChannel): String = js.native
    def vgField(channel: SingleDefChannel, opt: FieldRefOption): String = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/model", "NameMap")
  @js.native
  class NameMap () extends NameMapInterface {
    
    var nameMap: js.Any = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/model", "isConcatModel")
  @js.native
  def isConcatModel(model: Model): /* is vega-lite.vega-lite/build/src/compile/concat.ConcatModel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/model", "isFacetModel")
  @js.native
  def isFacetModel(model: Model): /* is vega-lite.vega-lite/build/src/compile/facet.FacetModel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/model", "isLayerModel")
  @js.native
  def isLayerModel(model: Model): /* is vega-lite.vega-lite/build/src/compile/layer.LayerModel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/model", "isUnitModel")
  @js.native
  def isUnitModel(model: Model): /* is vega-lite.vega-lite/build/src/compile/unit.UnitModel */ Boolean = js.native
  
  @js.native
  trait Component extends StObject {
    
    /** Dictionary mapping channel to VgAxis definition */
    var axes: AxisComponentIndex = js.native
    
    var data: DataComponent = js.native
    
    var layoutHeaders: Column = js.native
    
    var layoutSize: LayoutSizeComponent = js.native
    
    /** Dictionary mapping channel to VgLegend definition */
    var legends: LegendComponentIndex = js.native
    
    var mark: js.Array[VgMarkGroup] = js.native
    
    var projection: ProjectionComponent = js.native
    
    var resolve: Resolve = js.native
    
    var scales: ScaleComponentIndex = js.native
    
    var selection: Dict[SelectionComponent[SelectionType]] = js.native
  }
  object Component {
    
    @scala.inline
    def apply(
      axes: AxisComponentIndex,
      data: DataComponent,
      layoutHeaders: Column,
      layoutSize: LayoutSizeComponent,
      legends: LegendComponentIndex,
      mark: js.Array[VgMarkGroup],
      projection: ProjectionComponent,
      resolve: Resolve,
      scales: ScaleComponentIndex,
      selection: Dict[SelectionComponent[SelectionType]]
    ): Component = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], layoutHeaders = layoutHeaders.asInstanceOf[js.Any], layoutSize = layoutSize.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: AxisComponentIndex): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataComponent): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutHeaders(value: Column): Self = StObject.set(x, "layoutHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutSize(value: LayoutSizeComponent): Self = StObject.set(x, "layoutSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegends(value: LegendComponentIndex): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMark(value: js.Array[VgMarkGroup]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkVarargs(value: VgMarkGroup*): Self = StObject.set(x, "mark", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: ProjectionComponent): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScales(value: ScaleComponentIndex): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: Dict[SelectionComponent[SelectionType]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NameMapInterface extends StObject {
    
    def get(name: String): String = js.native
    
    def has(name: String): Boolean = js.native
    
    def rename(oldname: String, newName: String): Unit = js.native
  }
  object NameMapInterface {
    
    @scala.inline
    def apply(get: String => String, has: String => Boolean, rename: (String, String) => Unit): NameMapInterface = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), rename = js.Any.fromFunction2(rename))
      __obj.asInstanceOf[NameMapInterface]
    }
    
    @scala.inline
    implicit class NameMapInterfaceMutableBuilder[Self <: NameMapInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRename(value: (String, String) => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
    }
  }
}
