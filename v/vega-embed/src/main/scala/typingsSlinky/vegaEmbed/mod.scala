package typingsSlinky.vegaEmbed

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.fastJsonPatch.moduleCoreMod.Operation
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Extract
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.PropertyKey
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import typingsSlinky.vega.mod.View
import typingsSlinky.vegaEmbed.anon.Bottom
import typingsSlinky.vegaEmbed.anon.PartialCLICKTOVIEWACTIONS
import typingsSlinky.vegaEmbed.anon.Png
import typingsSlinky.vegaEmbed.anon.Svg
import typingsSlinky.vegaEmbed.vegaEmbedBooleans.`false`
import typingsSlinky.vegaEmbed.vegaEmbedBooleans.`true`
import typingsSlinky.vegaEmbed.vegaEmbedNumbers.`0`
import typingsSlinky.vegaEmbed.vegaEmbedNumbers.`1`
import typingsSlinky.vegaEmbed.vegaEmbedStrings.center
import typingsSlinky.vegaEmbed.vegaEmbedStrings.dark
import typingsSlinky.vegaEmbed.vegaEmbedStrings.datum
import typingsSlinky.vegaEmbed.vegaEmbedStrings.datumDotdatum
import typingsSlinky.vegaEmbed.vegaEmbedStrings.excel
import typingsSlinky.vegaEmbed.vegaEmbedStrings.ggplot2
import typingsSlinky.vegaEmbed.vegaEmbedStrings.left
import typingsSlinky.vegaEmbed.vegaEmbedStrings.parent
import typingsSlinky.vegaEmbed.vegaEmbedStrings.quartz
import typingsSlinky.vegaEmbed.vegaEmbedStrings.right
import typingsSlinky.vegaEmbed.vegaEmbedStrings.vox
import typingsSlinky.vegaLite.anon.Normalized
import typingsSlinky.vegaLite.compileMod.CompileOptions
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.logicalMod.LogicalComposition
import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import typingsSlinky.vegaLite.specMod.NormalizedSpec
import typingsSlinky.vegaLite.specMod.TopLevelSpec
import typingsSlinky.vegaLite.toplevelMod.TopLevel
import typingsSlinky.vegaLite.utilMod.DeepPartial
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaTooltip.mod.Options
import typingsSlinky.vegaTypings.anon.Ast
import typingsSlinky.vegaTypings.anon.Background
import typingsSlinky.vegaTypings.dataMod.Format
import typingsSlinky.vegaTypings.dataflowMod.Changeset_
import typingsSlinky.vegaTypings.encodeMod.EncodeEntryName
import typingsSlinky.vegaTypings.rendererMod.RenderModule_
import typingsSlinky.vegaTypings.rendererMod.Renderers
import typingsSlinky.vegaTypings.runtimeMod.Item
import typingsSlinky.vegaTypings.runtimeMod.LoaderOptions
import typingsSlinky.vegaTypings.runtimeMod.Loader_
import typingsSlinky.vegaTypings.runtimeMod.Runtime
import typingsSlinky.vegaTypings.runtimeMod.TooltipHandler
import typingsSlinky.vegaTypings.runtimeMod.TypeInference
import typingsSlinky.vegaTypings.sceneMod.Scene
import typingsSlinky.vegaTypings.sceneMod.SceneGroup
import typingsSlinky.vegaTypings.sceneMod.SceneItem
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.specMod.Spec
import typingsSlinky.vegaUtil.mod.AccessorFn
import typingsSlinky.vegaUtil.mod.FastMap_
import typingsSlinky.vegaUtil.mod.Fn
import typingsSlinky.vegaUtil.mod.LoggerInterface
import typingsSlinky.vegaUtil.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: String, spec: String): js.Promise[Result] = js.native
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: String, spec: String, opts: EmbedOptions[String]): js.Promise[Result] = js.native
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: String, spec: VisualizationSpec): js.Promise[Result] = js.native
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: String, spec: VisualizationSpec, opts: EmbedOptions[String]): js.Promise[Result] = js.native
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: HTMLElement, spec: String): js.Promise[Result] = js.native
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: HTMLElement, spec: String, opts: EmbedOptions[String]): js.Promise[Result] = js.native
  /**
    * Embed a Vega visualization component in a web page. This function returns a promise.
    *
    * @param el        DOM element in which to place component (DOM node or CSS selector).
    * @param spec      String : A URL string from which to load the Vega specification.
    *                  Object : The Vega/Vega-Lite specification as a parsed JSON object.
    * @param opts       A JavaScript object containing options for embedding.
    */
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: HTMLElement, spec: VisualizationSpec): js.Promise[Result] = js.native
  @JSImport("vega-embed", JSImport.Default)
  @js.native
  def default(el: HTMLElement, spec: VisualizationSpec, opts: EmbedOptions[String]): js.Promise[Result] = js.native
  
  object DEFAULT_ACTIONS {
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.compiled")
    @js.native
    def compiled: Boolean = js.native
    @scala.inline
    def compiled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compiled")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.editor")
    @js.native
    def editor: Boolean = js.native
    @scala.inline
    def editor_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.export")
    @js.native
    def export: Svg = js.native
    @scala.inline
    def export_=(x: Svg): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("export")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.source")
    @js.native
    def source: Boolean = js.native
    @scala.inline
    def source_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Try to guess the type of spec.
    *
    * @param spec Vega or Vega-Lite spec.
    */
  @JSImport("vega-embed", "guessMode")
  @js.native
  def guessMode(spec: VisualizationSpec): Mode = js.native
  @JSImport("vega-embed", "guessMode")
  @js.native
  def guessMode(spec: VisualizationSpec, providedMode: Mode): Mode = js.native
  
  /* was `typeof vegaImport` */
  object vega {
    
    @JSImport("vega-embed", "vega.Bounds")
    @js.native
    class Bounds ()
      extends typingsSlinky.vega.mod.Bounds
    
    @JSImport("vega-embed", "vega.CanvasHandler")
    @js.native
    class CanvasHandler ()
      extends typingsSlinky.vega.mod.CanvasHandler
    
    @JSImport("vega-embed", "vega.Debug")
    @js.native
    val Debug: Double = js.native
    
    @JSImport("vega-embed", "vega.Error")
    @js.native
    val Error_ : Double = js.native
    
    @JSImport("vega-embed", "vega.Handler")
    @js.native
    class Handler ()
      extends typingsSlinky.vega.mod.Handler
    
    @JSImport("vega-embed", "vega.Info")
    @js.native
    val Info: Double = js.native
    
    @JSImport("vega-embed", "vega.None")
    @js.native
    val None: Double = js.native
    
    @JSImport("vega-embed", "vega.Operator")
    @js.native
    class Operator ()
      extends typingsSlinky.vega.mod.Operator {
      def this(init: js.Any) = this()
      def this(init: js.UndefOr[scala.Nothing], update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
      def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
      def this(init: js.UndefOr[scala.Nothing], update: js.UndefOr[scala.Nothing], params: js.Any) = this()
      def this(
        init: js.UndefOr[scala.Nothing],
        update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
        params: js.Any
      ) = this()
      def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.Any) = this()
      def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _], params: js.Any) = this()
      def this(
        init: js.UndefOr[scala.Nothing],
        update: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        react: Boolean
      ) = this()
      def this(init: js.UndefOr[scala.Nothing], update: js.UndefOr[scala.Nothing], params: js.Any, react: Boolean) = this()
      def this(
        init: js.UndefOr[scala.Nothing],
        update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
        params: js.UndefOr[scala.Nothing],
        react: Boolean
      ) = this()
      def this(
        init: js.UndefOr[scala.Nothing],
        update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
        params: js.Any,
        react: Boolean
      ) = this()
      def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], react: Boolean) = this()
      def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.Any, react: Boolean) = this()
      def this(
        init: js.Any,
        update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
        params: js.UndefOr[scala.Nothing],
        react: Boolean
      ) = this()
      def this(
        init: js.Any,
        update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
        params: js.Any,
        react: Boolean
      ) = this()
    }
    
    @JSImport("vega-embed", "vega.Renderer")
    @js.native
    class Renderer protected ()
      extends typingsSlinky.vega.mod.Renderer {
      def this(loader: Loader_) = this()
    }
    
    @JSImport("vega-embed", "vega.Transform")
    @js.native
    class Transform ()
      extends typingsSlinky.vega.mod.Transform {
      def this(init: js.Any) = this()
      def this(init: js.UndefOr[scala.Nothing], params: js.Any) = this()
      def this(init: js.Any, params: js.Any) = this()
    }
    
    @JSImport("vega-embed", "vega.View")
    @js.native
    class View protected ()
      extends typingsSlinky.vega.mod.View {
      def this(runtime: Runtime) = this()
      def this(runtime: Runtime, opt: Background) = this()
    }
    
    @JSImport("vega-embed", "vega.Warn")
    @js.native
    val Warn: Double = js.native
    
    @JSImport("vega-embed", "vega.accessor")
    @js.native
    def accessor[R](fn: Fn[R]): AccessorFn[R] = js.native
    @JSImport("vega-embed", "vega.accessor")
    @js.native
    def accessor[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
    @JSImport("vega-embed", "vega.accessor")
    @js.native
    def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
    @JSImport("vega-embed", "vega.accessor")
    @js.native
    def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
    
    @JSImport("vega-embed", "vega.accessorFields")
    @js.native
    def accessorFields(fn: AccessorFn[_]): js.Array[String] = js.native
    
    @JSImport("vega-embed", "vega.accessorName")
    @js.native
    def accessorName(fn: AccessorFn[_]): String = js.native
    
    @JSImport("vega-embed", "vega.array")
    @js.native
    def array[T](v: T): js.Array[T] = js.native
    @JSImport("vega-embed", "vega.array")
    @js.native
    def array[T](v: js.Array[T]): js.Array[T] = js.native
    
    @JSImport("vega-embed", "vega.ascending")
    @js.native
    def ascending(a: js.Any, b: js.Any): Double = js.native
    
    @JSImport("vega-embed", "vega.changeset")
    @js.native
    def changeset(): Changeset_ = js.native
    
    @JSImport("vega-embed", "vega.clampRange")
    @js.native
    def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    @JSImport("vega-embed", "vega.compare")
    @js.native
    def compare(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    
    @JSImport("vega-embed", "vega.constant")
    @js.native
    def constant[V](v: V): js.Function0[V] = js.native
    
    @JSImport("vega-embed", "vega.debounce")
    @js.native
    def debounce[F /* <: js.Function */](delay: Double, func: F): F = js.native
    
    @JSImport("vega-embed", "vega.error")
    @js.native
    def error(msg: String): js.Error = js.native
    
    @JSImport("vega-embed", "vega.expressionFunction")
    @js.native
    def expressionFunction(name: String): js.Any = js.native
    @JSImport("vega-embed", "vega.expressionFunction")
    @js.native
    def expressionFunction(name: String, fn: js.UndefOr[scala.Nothing], visitor: js.Any): js.Any = js.native
    @JSImport("vega-embed", "vega.expressionFunction")
    @js.native
    def expressionFunction(name: String, fn: js.Any): js.Any = js.native
    @JSImport("vega-embed", "vega.expressionFunction")
    @js.native
    def expressionFunction(name: String, fn: js.Any, visitor: js.Any): js.Any = js.native
    
    @JSImport("vega-embed", "vega.extend")
    @js.native
    def extend[T](target: T, source: Partial[T]*): T = js.native
    
    @JSImport("vega-embed", "vega.extent")
    @js.native
    def extent(array: js.Array[Double]): js.Array[Double] = js.native
    @JSImport("vega-embed", "vega.extent")
    @js.native
    def extent(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.extentIndex")
    @js.native
    def extentIndex(array: js.Array[Double]): js.Array[Double] = js.native
    @JSImport("vega-embed", "vega.extentIndex")
    @js.native
    def extentIndex(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.falsy")
    @js.native
    def falsy(): `false` = js.native
    
    @JSImport("vega-embed", "vega.fastmap")
    @js.native
    def fastmap(): FastMap_ = js.native
    @JSImport("vega-embed", "vega.fastmap")
    @js.native
    def fastmap(_underscore: js.Object): FastMap_ = js.native
    
    @JSImport("vega-embed", "vega.field")
    @js.native
    def field(field: String): AccessorFn[_] = js.native
    @JSImport("vega-embed", "vega.field")
    @js.native
    def field(field: String, name: String): AccessorFn[_] = js.native
    
    @JSImport("vega-embed", "vega.flush")
    @js.native
    def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = js.native
    
    @JSImport("vega-embed", "vega.formatLocale")
    @js.native
    def formatLocale(definition: js.Object): Unit = js.native
    
    @JSImport("vega-embed", "vega.hasOwnProperty")
    @js.native
    def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = js.native
    
    @JSImport("vega-embed", "vega.id")
    @js.native
    def id(_underscore: js.Object): js.Symbol = js.native
    
    @JSImport("vega-embed", "vega.identity")
    @js.native
    def identity[V](v: V): V = js.native
    
    @JSImport("vega-embed", "vega.inferType")
    @js.native
    def inferType(values: js.Array[_]): TypeInference = js.native
    @JSImport("vega-embed", "vega.inferType")
    @js.native
    def inferType(values: js.Array[_], field: String): TypeInference = js.native
    
    @JSImport("vega-embed", "vega.inferTypes")
    @js.native
    def inferTypes(values: js.Array[_], fields: js.Array[String]): StringDictionary[TypeInference] = js.native
    
    @JSImport("vega-embed", "vega.ingest")
    @js.native
    def ingest(datum: js.Any): js.Any = js.native
    
    @JSImport("vega-embed", "vega.inherits")
    @js.native
    def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C with P = js.native
    @JSImport("vega-embed", "vega.inherits")
    @js.native
    def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C with P = js.native
    
    @JSImport("vega-embed", "vega.inrange")
    @js.native
    def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = js.native
    
    @JSImport("vega-embed", "vega.isArray")
    @js.native
    def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = js.native
    @JSImport("vega-embed", "vega.isArray")
    @js.native
    def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isBoolean")
    @js.native
    def isBoolean(a: js.Any): /* is boolean */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isDate")
    @js.native
    def isDate(a: js.Any): /* is std.Date */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isFunction")
    @js.native
    def isFunction(a: js.Any): /* is std.Function */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isIterable")
    @js.native
    def isIterable(a: js.Any): Boolean = js.native
    
    @JSImport("vega-embed", "vega.isNumber")
    @js.native
    def isNumber(a: js.Any): /* is number */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isObject")
    @js.native
    def isObject(a: js.Any): /* is object */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isRegExp")
    @js.native
    def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isString")
    @js.native
    def isString(a: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("vega-embed", "vega.isTuple")
    @js.native
    def isTuple(t: js.Any): Boolean = js.native
    
    @JSImport("vega-embed", "vega.key")
    @js.native
    def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = js.native
    @JSImport("vega-embed", "vega.key")
    @js.native
    def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = js.native
    
    @JSImport("vega-embed", "vega.lerp")
    @js.native
    def lerp(array: js.Array[Double], fraction: Double): Double = js.native
    
    @JSImport("vega-embed", "vega.loader")
    @js.native
    def loader(): Loader_ = js.native
    @JSImport("vega-embed", "vega.loader")
    @js.native
    def loader(opt: LoaderOptions): Loader_ = js.native
    
    @JSImport("vega-embed", "vega.log")
    @js.native
    def log(args: js.Any*): Unit = js.native
    
    @JSImport("vega-embed", "vega.logger")
    @js.native
    def logger(): LoggerInterface = js.native
    @JSImport("vega-embed", "vega.logger")
    @js.native
    def logger(_underscore: js.UndefOr[scala.Nothing], method: String): LoggerInterface = js.native
    @JSImport("vega-embed", "vega.logger")
    @js.native
    def logger(_underscore: Double): LoggerInterface = js.native
    @JSImport("vega-embed", "vega.logger")
    @js.native
    def logger(_underscore: Double, method: String): LoggerInterface = js.native
    
    @JSImport("vega-embed", "vega.merge")
    @js.native
    def merge(
      compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
      array1: js.Array[_],
      array2: js.Array[_]
    ): Unit = js.native
    @JSImport("vega-embed", "vega.merge")
    @js.native
    def merge(
      compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
      array1: js.Array[_],
      array2: js.Array[_],
      output: js.Array[_]
    ): Unit = js.native
    
    @JSImport("vega-embed", "vega.mergeConfig")
    @js.native
    def mergeConfig[C /* <: js.Object */](c: C*): C = js.native
    
    @JSImport("vega-embed", "vega.merge")
    @js.native
    def merge_Array(
      compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
      array1: js.Array[_],
      array2: js.Array[_]
    ): js.Array[_] = js.native
    
    @JSImport("vega-embed", "vega.one")
    @js.native
    def one(): `1` = js.native
    
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad(str: String, len: Double): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad(str: String, len: Double, char: String): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad_center(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: center): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad_center(str: String, len: Double, char: String, align: center): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad_left(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: left): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad_left(str: String, len: Double, char: String, align: left): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad_right(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: right): String = js.native
    @JSImport("vega-embed", "vega.pad")
    @js.native
    def pad_right(str: String, len: Double, char: String, align: right): String = js.native
    
    @JSImport("vega-embed", "vega.panLinear")
    @js.native
    def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.panLog")
    @js.native
    def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.panPow")
    @js.native
    def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.panSymlog")
    @js.native
    def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.parse")
    @js.native
    def parse(spec: Spec): Runtime = js.native
    @JSImport("vega-embed", "vega.parse")
    @js.native
    def parse(spec: Spec, config: js.UndefOr[scala.Nothing], opt: Ast): Runtime = js.native
    @JSImport("vega-embed", "vega.parse")
    @js.native
    def parse(spec: Spec, config: typingsSlinky.vegaTypings.configMod.Config): Runtime = js.native
    @JSImport("vega-embed", "vega.parse")
    @js.native
    def parse(spec: Spec, config: typingsSlinky.vegaTypings.configMod.Config, opt: Ast): Runtime = js.native
    
    @JSImport("vega-embed", "vega.peek")
    @js.native
    def peek(array: js.Array[_]): js.Any = js.native
    
    @JSImport("vega-embed", "vega.projection")
    @js.native
    def projection(`type`: String, projection: js.Any): typingsSlinky.vegaTypings.runtimeMod.View = js.native
    
    @JSImport("vega-embed", "vega.quarter")
    @js.native
    def quarter(date: js.Date): Double = js.native
    @JSImport("vega-embed", "vega.quarter")
    @js.native
    def quarter(date: Double): Double = js.native
    
    @JSImport("vega-embed", "vega.read")
    @js.native
    def read(data: String, schema: Format): js.Array[js.Object] = js.native
    @JSImport("vega-embed", "vega.read")
    @js.native
    def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, js.Date]): js.Array[js.Object] = js.native
    
    @JSImport("vega-embed", "vega.renderModule")
    @js.native
    def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = js.native
    
    @JSImport("vega-embed", "vega.repeat")
    @js.native
    def repeat(str: String, count: Double): String = js.native
    
    @JSImport("vega-embed", "vega.scale")
    @js.native
    def scale(`type`: String): js.Any = js.native
    @JSImport("vega-embed", "vega.scale")
    @js.native
    def scale(`type`: String, scale: js.Any): js.Any = js.native
    
    @JSImport("vega-embed", "vega.sceneVisit")
    @js.native
    def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
    @JSImport("vega-embed", "vega.sceneVisit")
    @js.native
    def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
    
    @JSImport("vega-embed", "vega.scheme")
    @js.native
    def scheme(name: String): js.Any = js.native
    @JSImport("vega-embed", "vega.scheme")
    @js.native
    def scheme(name: String, scheme: js.Any): js.Any = js.native
    
    @JSImport("vega-embed", "vega.schemeDiscretized")
    @js.native
    def schemeDiscretized(name: String): js.Any = js.native
    @JSImport("vega-embed", "vega.schemeDiscretized")
    @js.native
    def schemeDiscretized(name: String, scheme: js.UndefOr[scala.Nothing], interpolator: js.Any): js.Any = js.native
    @JSImport("vega-embed", "vega.schemeDiscretized")
    @js.native
    def schemeDiscretized(name: String, scheme: js.Any): js.Any = js.native
    @JSImport("vega-embed", "vega.schemeDiscretized")
    @js.native
    def schemeDiscretized(name: String, scheme: js.Any, interpolator: js.Any): js.Any = js.native
    
    @JSImport("vega-embed", "vega.span")
    @js.native
    def span(array: js.Array[Double]): Double = js.native
    
    @JSImport("vega-embed", "vega.splitAccessPath")
    @js.native
    def splitAccessPath(path: String): js.Array[String] = js.native
    
    @JSImport("vega-embed", "vega.stringValue")
    @js.native
    def stringValue(a: js.Any): String = js.native
    
    @JSImport("vega-embed", "vega.timeFormatLocale")
    @js.native
    def timeFormatLocale(definition: js.Object): Unit = js.native
    
    @JSImport("vega-embed", "vega.toBoolean")
    @js.native
    def toBoolean(a: js.Any): Boolean = js.native
    
    @JSImport("vega-embed", "vega.toDate")
    @js.native
    def toDate(a: js.Any): Double = js.native
    @JSImport("vega-embed", "vega.toDate")
    @js.native
    def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = js.native
    
    @JSImport("vega-embed", "vega.toNumber")
    @js.native
    def toNumber(a: js.Any): Double = js.native
    
    @JSImport("vega-embed", "vega.toSet")
    @js.native
    def toSet[T](array: js.Array[T]): StringDictionary[`true`] = js.native
    
    @JSImport("vega-embed", "vega.toString")
    @js.native
    def toString_(a: js.Any): String = js.native
    
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate(a: String, length: Double): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate(a: String, length: Double, align: js.UndefOr[scala.Nothing], ellipsis: String): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate_center(a: String, length: Double, align: center): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate_left(a: String, length: Double, align: left): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate_right(a: String, length: Double, align: right): String = js.native
    @JSImport("vega-embed", "vega.truncate")
    @js.native
    def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = js.native
    
    @JSImport("vega-embed", "vega.truthy")
    @js.native
    def truthy(): `true` = js.native
    
    @JSImport("vega-embed", "vega.tupleid")
    @js.native
    def tupleid(t: js.Any): Double = js.native
    
    @JSImport("vega-embed", "vega.utcquarter")
    @js.native
    def utcquarter(date: js.Date): Double = js.native
    @JSImport("vega-embed", "vega.utcquarter")
    @js.native
    def utcquarter(date: Double): Double = js.native
    
    @JSImport("vega-embed", "vega.version")
    @js.native
    val version: String = js.native
    
    @JSImport("vega-embed", "vega.visitArray")
    @js.native
    def visitArray(
      array: js.UndefOr[scala.Nothing],
      filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
      visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
    ): Unit = js.native
    @JSImport("vega-embed", "vega.visitArray")
    @js.native
    def visitArray(
      array: js.Array[_],
      filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
      visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
    ): Unit = js.native
    
    @JSImport("vega-embed", "vega.writeConfig")
    @js.native
    def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = js.native
    @JSImport("vega-embed", "vega.writeConfig")
    @js.native
    def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = js.native
    @JSImport("vega-embed", "vega.writeConfig")
    @js.native
    def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = js.native
    
    @JSImport("vega-embed", "vega.zero")
    @js.native
    def zero(): `0` = js.native
    
    @JSImport("vega-embed", "vega.zoomLinear")
    @js.native
    def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
    @JSImport("vega-embed", "vega.zoomLinear")
    @js.native
    def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.zoomLog")
    @js.native
    def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
    @JSImport("vega-embed", "vega.zoomLog")
    @js.native
    def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.zoomPow")
    @js.native
    def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = js.native
    @JSImport("vega-embed", "vega.zoomPow")
    @js.native
    def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = js.native
    
    @JSImport("vega-embed", "vega.zoomSymlog")
    @js.native
    def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = js.native
    @JSImport("vega-embed", "vega.zoomSymlog")
    @js.native
    def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = js.native
  }
  
  /* was `typeof vegaLiteImport` */
  object vegaLite {
    
    @JSImport("vega-embed", "vegaLite.accessPathDepth")
    @js.native
    def accessPathDepth(path: String): Double = js.native
    
    @JSImport("vega-embed", "vegaLite.accessPathWithDatum")
    @js.native
    def accessPathWithDatum(path: String): String = js.native
    @JSImport("vega-embed", "vegaLite.accessPathWithDatum")
    @js.native
    def accessPathWithDatum(path: String, datum: String): String = js.native
    
    @JSImport("vega-embed", "vegaLite.compile")
    @js.native
    def compile(inputSpec: TopLevelSpec): Normalized = js.native
    @JSImport("vega-embed", "vegaLite.compile")
    @js.native
    def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Normalized = js.native
    
    @JSImport("vega-embed", "vegaLite.contains")
    @js.native
    def contains[T](array: js.Array[T], item: T): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.deepEqual")
    @js.native
    def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.deleteNestedProperty")
    @js.native
    def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[String]): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.duplicate")
    @js.native
    val duplicate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof clone_ */ js.Any = js.native
    
    @JSImport("vega-embed", "vegaLite.entries")
    @js.native
    def entries(o: js.Object): js.Array[js.Tuple2[String, _]] = js.native
    @JSImport("vega-embed", "vegaLite.entries")
    @js.native
    def entries[T](o: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
    @JSImport("vega-embed", "vegaLite.entries")
    @js.native
    def entries[T](o: ArrayLike[T]): js.Array[js.Tuple2[String, T]] = js.native
    
    @JSImport("vega-embed", "vegaLite.every")
    @js.native
    def every[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
    ): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.fieldIntersection")
    @js.native
    def fieldIntersection(a: ReadonlySet[String], b: ReadonlySet[String]): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.flatAccessWithDatum")
    @js.native
    def flatAccessWithDatum(path: String): String = js.native
    @JSImport("vega-embed", "vegaLite.flatAccessWithDatum")
    @js.native
    def flatAccessWithDatum_datum(path: String, datum: datum): String = js.native
    @JSImport("vega-embed", "vegaLite.flatAccessWithDatum")
    @js.native
    def flatAccessWithDatum_datumdatum(path: String, datum: datumDotdatum): String = js.native
    @JSImport("vega-embed", "vegaLite.flatAccessWithDatum")
    @js.native
    def flatAccessWithDatum_parent(path: String, datum: parent): String = js.native
    
    @JSImport("vega-embed", "vegaLite.getFirstDefined")
    @js.native
    def getFirstDefined[T](args: T*): js.UndefOr[T] = js.native
    
    @JSImport("vega-embed", "vegaLite.hasIntersection")
    @js.native
    def hasIntersection[T](a: ReadonlySet[T], b: ReadonlySet[T]): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.hash")
    @js.native
    def hash(a: js.Any): String | Double = js.native
    
    @JSImport("vega-embed", "vegaLite.internalField")
    @js.native
    def internalField(name: String): String = js.native
    
    @JSImport("vega-embed", "vegaLite.isBoolean")
    @js.native
    def isBoolean(b: js.Any): /* is boolean */ Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.isEmpty")
    @js.native
    def isEmpty(obj: js.Object): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.isEqual")
    @js.native
    def isEqual[T](dict: Dict[T], other: Dict[T]): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.isInternalField")
    @js.native
    def isInternalField(name: String): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.isNullOrFalse")
    @js.native
    def isNullOrFalse(x: js.Any): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.isNumeric")
    @js.native
    def isNumeric(value: String): Boolean = js.native
    @JSImport("vega-embed", "vegaLite.isNumeric")
    @js.native
    def isNumeric(value: Double): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.keys")
    @js.native
    def keys[T](o: T): js.Array[Extract[/* keyof T */ String, String]] = js.native
    
    @JSImport("vega-embed", "vegaLite.logicalExpr")
    @js.native
    def logicalExpr[T](op: LogicalComposition[T], cb: js.Function1[/* repeated */ js.Any, String]): String = js.native
    
    @JSImport("vega-embed", "vegaLite.mergeDeep")
    @js.native
    def mergeDeep[T](dest: T, src: DeepPartial[T]*): T = js.native
    
    @JSImport("vega-embed", "vegaLite.normalize")
    @js.native
    def normalize(spec: TopLevelSpec with LayoutSizeMixins): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
    @JSImport("vega-embed", "vegaLite.normalize")
    @js.native
    def normalize(
      spec: TopLevelSpec with LayoutSizeMixins,
      config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef]
    ): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
    
    @JSImport("vega-embed", "vegaLite.normalizeAngle")
    @js.native
    def normalizeAngle(angle: Double): Double = js.native
    
    @JSImport("vega-embed", "vegaLite.omit")
    @js.native
    def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Omit[T, K] = js.native
    
    @JSImport("vega-embed", "vegaLite.pick")
    @js.native
    def pick[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Pick[T, K] = js.native
    
    @JSImport("vega-embed", "vegaLite.prefixGenerator")
    @js.native
    def prefixGenerator(a: ReadonlySet[String]): ReadonlySet[String] = js.native
    
    @JSImport("vega-embed", "vegaLite.removePathFromField")
    @js.native
    def removePathFromField(path: String): String = js.native
    
    @JSImport("vega-embed", "vegaLite.replaceAll")
    @js.native
    def replaceAll(string: String, find: String, replacement: String): String = js.native
    
    @JSImport("vega-embed", "vegaLite.replacePathInField")
    @js.native
    def replacePathInField(path: String): String = js.native
    
    @JSImport("vega-embed", "vegaLite.resetIdCounter")
    @js.native
    def resetIdCounter(): Unit = js.native
    
    @JSImport("vega-embed", "vegaLite.setEqual")
    @js.native
    def setEqual[T](a: Set[T], b: Set[T]): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.some")
    @js.native
    def some[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
    ): Boolean = js.native
    
    @JSImport("vega-embed", "vegaLite.stringify")
    @js.native
    val stringify: js.Function1[/* obj */ js.Any, String] = js.native
    
    @JSImport("vega-embed", "vegaLite.titleCase")
    @js.native
    def titleCase(s: String): String = js.native
    
    @JSImport("vega-embed", "vegaLite.unique")
    @js.native
    def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = js.native
    
    @JSImport("vega-embed", "vegaLite.uniqueId")
    @js.native
    def uniqueId(): String | Double = js.native
    @JSImport("vega-embed", "vegaLite.uniqueId")
    @js.native
    def uniqueId(prefix: String): String | Double = js.native
    
    @JSImport("vega-embed", "vegaLite.vals")
    @js.native
    def vals(o: js.Object): js.Array[_] = js.native
    @JSImport("vega-embed", "vegaLite.vals")
    @js.native
    def vals[T](o: StringDictionary[T]): js.Array[T] = js.native
    @JSImport("vega-embed", "vegaLite.vals")
    @js.native
    def vals[T](o: ArrayLike[T]): js.Array[T] = js.native
    
    @JSImport("vega-embed", "vegaLite.varName")
    @js.native
    def varName(s: String): String = js.native
  }
  
  @js.native
  trait Actions extends StObject {
    
    var compiled: js.UndefOr[Boolean] = js.native
    
    var editor: js.UndefOr[Boolean] = js.native
    
    var export: js.UndefOr[Boolean | Png] = js.native
    
    var source: js.UndefOr[Boolean] = js.native
  }
  object Actions {
    
    @scala.inline
    def apply(): Actions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions]
    }
    
    @scala.inline
    implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      @scala.inline
      def setEditor(value: Boolean): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setExport(value: Boolean | Png): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      @scala.inline
      def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type Config = (typingsSlinky.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]) | typingsSlinky.vegaTypings.configMod.Config
  
  @js.native
  trait EmbedOptions[S] extends StObject {
    
    var actions: js.UndefOr[Boolean | Actions] = js.native
    
    var ast: js.UndefOr[Boolean] = js.native
    
    var config: js.UndefOr[S | Config] = js.native
    
    var defaultStyle: js.UndefOr[Boolean | String] = js.native
    
    var downloadFileName: js.UndefOr[String] = js.native
    
    var editorUrl: js.UndefOr[String] = js.native
    
    var formatLocale: js.UndefOr[Record[String, _]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hover: js.UndefOr[Boolean | Hover] = js.native
    
    var i18n: js.UndefOr[PartialCLICKTOVIEWACTIONS] = js.native
    
    var loader: js.UndefOr[Loader_ | LoaderOptions] = js.native
    
    var logLevel: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
    
    var padding: js.UndefOr[Double | Bottom] = js.native
    
    var patch: js.UndefOr[S | PatchFunc | js.Array[Operation]] = js.native
    
    var renderer: js.UndefOr[Renderers] = js.native
    
    var scaleFactor: js.UndefOr[Double] = js.native
    
    var sourceFooter: js.UndefOr[String] = js.native
    
    var sourceHeader: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[excel | ggplot2 | quartz | vox | dark] = js.native
    
    var timeFormatLocale: js.UndefOr[Record[String, _]] = js.native
    
    var tooltip: js.UndefOr[TooltipHandler | Options | Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object EmbedOptions {
    
    @scala.inline
    def apply[S](): EmbedOptions[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedOptions[S]]
    }
    
    @scala.inline
    implicit class EmbedOptionsMutableBuilder[Self <: EmbedOptions[_], S] (val x: Self with EmbedOptions[S]) extends AnyVal {
      
      @scala.inline
      def setActions(value: Boolean | Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setConfig(value: S | Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: Boolean | String): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setDownloadFileName(value: String): Self = StObject.set(x, "downloadFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadFileNameUndefined: Self = StObject.set(x, "downloadFileName", js.undefined)
      
      @scala.inline
      def setEditorUrl(value: String): Self = StObject.set(x, "editorUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorUrlUndefined: Self = StObject.set(x, "editorUrl", js.undefined)
      
      @scala.inline
      def setFormatLocale(value: Record[String, _]): Self = StObject.set(x, "formatLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatLocaleUndefined: Self = StObject.set(x, "formatLocale", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHover(value: Boolean | Hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setI18n(value: PartialCLICKTOVIEWACTIONS): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      @scala.inline
      def setLoader(value: Loader_ | LoaderOptions): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPatch(value: S | PatchFunc | js.Array[Operation]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchFunction1(value: /* spec */ Spec => Spec): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setPatchVarargs(value: Operation*): Self = StObject.set(x, "patch", js.Array(value :_*))
      
      @scala.inline
      def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      @scala.inline
      def setSourceFooter(value: String): Self = StObject.set(x, "sourceFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFooterUndefined: Self = StObject.set(x, "sourceFooter", js.undefined)
      
      @scala.inline
      def setSourceHeader(value: String): Self = StObject.set(x, "sourceHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceHeaderUndefined: Self = StObject.set(x, "sourceHeader", js.undefined)
      
      @scala.inline
      def setTheme(value: excel | ggplot2 | quartz | vox | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTimeFormatLocale(value: Record[String, _]): Self = StObject.set(x, "timeFormatLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatLocaleUndefined: Self = StObject.set(x, "timeFormatLocale", js.undefined)
      
      @scala.inline
      def setTooltip(value: TooltipHandler | Options | Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFunction4(
        value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
      ): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Hover extends StObject {
    
    var hoverSet: js.UndefOr[EncodeEntryName] = js.native
    
    var updateSet: js.UndefOr[EncodeEntryName] = js.native
  }
  object Hover {
    
    @scala.inline
    def apply(): Hover = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hover]
    }
    
    @scala.inline
    implicit class HoverMutableBuilder[Self <: Hover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHoverSet(value: EncodeEntryName): Self = StObject.set(x, "hoverSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverSetUndefined: Self = StObject.set(x, "hoverSet", js.undefined)
      
      @scala.inline
      def setUpdateSet(value: EncodeEntryName): Self = StObject.set(x, "updateSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateSetUndefined: Self = StObject.set(x, "updateSet", js.undefined)
    }
  }
  
  @js.native
  trait MessageData extends StObject {
    
    var config: js.UndefOr[Config] = js.native
    
    var file: js.UndefOr[js.Any] = js.native
    
    var mode: Mode = js.native
    
    var renderer: js.UndefOr[Renderers] = js.native
    
    var spec: String = js.native
  }
  object MessageData {
    
    @scala.inline
    def apply(mode: Mode, spec: String): MessageData = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData]
    }
    
    @scala.inline
    implicit class MessageDataMutableBuilder[Self <: MessageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaEmbed.vegaEmbedStrings.vega
    - typingsSlinky.vegaEmbed.vegaEmbedStrings.`vega-lite`
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def vega: typingsSlinky.vegaEmbed.vegaEmbedStrings.vega = "vega".asInstanceOf[typingsSlinky.vegaEmbed.vegaEmbedStrings.vega]
    
    @scala.inline
    def `vega-lite`: typingsSlinky.vegaEmbed.vegaEmbedStrings.`vega-lite` = "vega-lite".asInstanceOf[typingsSlinky.vegaEmbed.vegaEmbedStrings.`vega-lite`]
  }
  
  type PatchFunc = js.Function1[/* spec */ Spec, Spec]
  
  @js.native
  trait Result extends StObject {
    
    /** The input specification. */
    var spec: VisualizationSpec = js.native
    
    /** The compiled and patched Vega specification. */
    var vgSpec: Spec = js.native
    
    /** The Vega view. */
    var view: View = js.native
  }
  object Result {
    
    @scala.inline
    def apply(spec: VisualizationSpec, vgSpec: Spec, view: View): Result = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any], vgSpec = vgSpec.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVgSpec(value: Spec): Self = StObject.set(x, "vgSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type VisualizationSpec = TopLevelSpec | Spec
}
