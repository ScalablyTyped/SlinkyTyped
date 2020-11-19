package typingsSlinky.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.std.PropertyKey
import typingsSlinky.vegaTypings.anon.Ast
import typingsSlinky.vegaTypings.anon.Background
import typingsSlinky.vegaTypings.configMod.Config
import typingsSlinky.vegaTypings.dataMod.Format
import typingsSlinky.vegaTypings.dataflowMod.Changeset_
import typingsSlinky.vegaTypings.rendererMod.RenderModule_
import typingsSlinky.vegaTypings.runtimeMod.LoaderOptions
import typingsSlinky.vegaTypings.runtimeMod.Loader_
import typingsSlinky.vegaTypings.runtimeMod.Runtime
import typingsSlinky.vegaTypings.runtimeMod.TypeInference
import typingsSlinky.vegaTypings.sceneMod.Scene
import typingsSlinky.vegaTypings.sceneMod.SceneGroup
import typingsSlinky.vegaTypings.sceneMod.SceneItem
import typingsSlinky.vegaTypings.specMod.Spec
import typingsSlinky.vegaTypings.vegaTypingsBooleans.`false`
import typingsSlinky.vegaTypings.vegaTypingsBooleans.`true`
import typingsSlinky.vegaTypings.vegaTypingsNumbers.`0`
import typingsSlinky.vegaTypings.vegaTypingsNumbers.`1`
import typingsSlinky.vegaTypings.vegaTypingsStrings.center
import typingsSlinky.vegaTypings.vegaTypingsStrings.left
import typingsSlinky.vegaTypings.vegaTypingsStrings.right
import typingsSlinky.vegaUtil.mod.AccessorFn
import typingsSlinky.vegaUtil.mod.FastMap_
import typingsSlinky.vegaUtil.mod.Fn
import typingsSlinky.vegaUtil.mod.LoggerInterface
import typingsSlinky.vegaUtil.mod.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Debug: Double = js.native
  
  @JSName("Error")
  val Error_ : Double = js.native
  
  val Info: Double = js.native
  
  val None: Double = js.native
  
  val Warn: Double = js.native
  
  def accessor[R](fn: Fn[R]): AccessorFn[R] = js.native
  def accessor[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
  
  def accessorFields(fn: AccessorFn[_]): js.Array[String] = js.native
  
  def accessorName(fn: AccessorFn[_]): String = js.native
  
  def array[T](v: T): js.Array[T] = js.native
  def array[T](v: js.Array[T]): js.Array[T] = js.native
  
  def changeset(): Changeset_ = js.native
  
  def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = js.native
  
  def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  
  def constant[V](v: V): js.Function0[V] = js.native
  
  def debounce[F /* <: js.Function */](delay: Double, func: F): F = js.native
  
  def error(msg: String): js.Error = js.native
  
  def expressionFunction(name: String): js.Any = js.native
  def expressionFunction(name: String, fn: js.UndefOr[scala.Nothing], visitor: js.Any): js.Any = js.native
  def expressionFunction(name: String, fn: js.Any): js.Any = js.native
  def expressionFunction(name: String, fn: js.Any, visitor: js.Any): js.Any = js.native
  
  def extend[T](target: T, source: Partial[T]*): T = js.native
  
  def extent(array: js.Array[Double]): js.Array[Double] = js.native
  def extent(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  def extentIndex(array: js.Array[Double]): js.Array[Double] = js.native
  def extentIndex(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  def falsy(): `false` = js.native
  
  def fastmap(): FastMap_ = js.native
  def fastmap(_underscore: js.Object): FastMap_ = js.native
  
  def field(field: String): AccessorFn[_] = js.native
  def field(field: String, name: String): AccessorFn[_] = js.native
  
  def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = js.native
  
  def formatLocale(definition: js.Object): Unit = js.native
  
  def hasOwnProperty(`object`: js.Object, property: PropertyKey): Boolean = js.native
  
  def id(_underscore: js.Object): js.Symbol = js.native
  
  def identity[V](v: V): V = js.native
  
  def inferType(values: js.Array[_]): TypeInference = js.native
  def inferType(values: js.Array[_], field: String): TypeInference = js.native
  
  def inferTypes(values: js.Array[_], fields: js.Array[String]): StringDictionary[TypeInference] = js.native
  
  def ingest(datum: js.Any): js.Any = js.native
  
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C with P = js.native
  
  def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = js.native
  
  def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = js.native
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
  
  def isBoolean(a: js.Any): /* is boolean */ Boolean = js.native
  
  def isDate(a: js.Any): /* is std.Date */ Boolean = js.native
  
  def isFunction(a: js.Any): /* is std.Function */ Boolean = js.native
  
  def isNumber(a: js.Any): /* is number */ Boolean = js.native
  
  def isObject(a: js.Any): /* is object */ Boolean = js.native
  
  def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = js.native
  
  def isString(a: js.Any): /* is string */ Boolean = js.native
  
  def isTuple(t: js.Any): Boolean = js.native
  
  def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = js.native
  def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = js.native
  
  def lerp(array: js.Array[Double], fraction: Double): Double = js.native
  
  def loader(): Loader_ = js.native
  def loader(opt: LoaderOptions): Loader_ = js.native
  
  def log(args: js.Any*): Unit = js.native
  
  def logger(): LoggerInterface = js.native
  def logger(_underscore: js.UndefOr[scala.Nothing], method: String): LoggerInterface = js.native
  def logger(_underscore: Double): LoggerInterface = js.native
  def logger(_underscore: Double, method: String): LoggerInterface = js.native
  
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): Unit = js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_],
    output: js.Array[_]
  ): Unit = js.native
  
  def mergeConfig[C /* <: js.Object */](c: C*): C = js.native
  
  @JSName("merge")
  def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): js.Array[_] = js.native
  
  def one(): `1` = js.native
  
  def pad(str: String, len: Double): String = js.native
  def pad(str: String, len: Double, char: String): String = js.native
  @JSName("pad")
  def pad_center(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: center): String = js.native
  @JSName("pad")
  def pad_center(str: String, len: Double, char: String, align: center): String = js.native
  @JSName("pad")
  def pad_left(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: left): String = js.native
  @JSName("pad")
  def pad_left(str: String, len: Double, char: String, align: left): String = js.native
  @JSName("pad")
  def pad_right(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: right): String = js.native
  @JSName("pad")
  def pad_right(str: String, len: Double, char: String, align: right): String = js.native
  
  def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = js.native
  
  def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = js.native
  
  def parse(spec: Spec): Runtime = js.native
  def parse(spec: Spec, config: js.UndefOr[scala.Nothing], opt: Ast): Runtime = js.native
  def parse(spec: Spec, config: Config): Runtime = js.native
  def parse(spec: Spec, config: Config, opt: Ast): Runtime = js.native
  
  def peek(array: js.Array[_]): js.Any = js.native
  
  def projection(`type`: String, projection: js.Any): typingsSlinky.vegaTypings.runtimeMod.View = js.native
  
  def quarter(date: Double): Double = js.native
  def quarter(date: js.Date): Double = js.native
  
  def read(data: String, schema: Format): js.Array[js.Object] = js.native
  def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, js.Date]): js.Array[js.Object] = js.native
  
  def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = js.native
  
  def repeat(str: String, count: Double): String = js.native
  
  def scale(`type`: String): js.Any = js.native
  def scale(`type`: String, scale: js.Any): js.Any = js.native
  
  def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  
  def scheme(name: String): js.Any = js.native
  def scheme(name: String, scheme: js.Any): js.Any = js.native
  
  def schemeDiscretized(name: String): js.Any = js.native
  def schemeDiscretized(name: String, scheme: js.UndefOr[scala.Nothing], interpolator: js.Any): js.Any = js.native
  def schemeDiscretized(name: String, scheme: js.Any): js.Any = js.native
  def schemeDiscretized(name: String, scheme: js.Any, interpolator: js.Any): js.Any = js.native
  
  def span(array: js.Array[Double]): Double = js.native
  
  def splitAccessPath(path: String): js.Array[String] = js.native
  
  def stringValue(a: js.Any): String = js.native
  
  def timeFormatLocale(definition: js.Object): Unit = js.native
  
  def toBoolean(a: js.Any): Boolean = js.native
  
  def toDate(a: js.Any): Double = js.native
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = js.native
  
  def toNumber(a: js.Any): Double = js.native
  
  def toSet[T](array: js.Array[T]): StringDictionary[`true`] = js.native
  
  def toString(a: js.Any): String = js.native
  
  def truncate(a: String, length: Double): String = js.native
  def truncate(a: String, length: Double, align: js.UndefOr[scala.Nothing], ellipsis: String): String = js.native
  @JSName("truncate")
  def truncate_center(a: String, length: Double, align: center): String = js.native
  @JSName("truncate")
  def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = js.native
  @JSName("truncate")
  def truncate_left(a: String, length: Double, align: left): String = js.native
  @JSName("truncate")
  def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = js.native
  @JSName("truncate")
  def truncate_right(a: String, length: Double, align: right): String = js.native
  @JSName("truncate")
  def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = js.native
  
  def truthy(): `true` = js.native
  
  def tupleid(t: js.Any): Double = js.native
  
  def utcquarter(date: Double): Double = js.native
  def utcquarter(date: js.Date): Double = js.native
  
  val version: String = js.native
  
  def visitArray(
    array: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  def visitArray(
    array: js.Array[_],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = js.native
  
  def zero(): `0` = js.native
  
  def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = js.native
  def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = js.native
  
  def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = js.native
  
  @js.native
  class Bounds ()
    extends typingsSlinky.vegaTypings.sceneMod.Bounds
  
  @js.native
  class CanvasHandler ()
    extends typingsSlinky.vegaTypings.rendererMod.Handler
  
  @js.native
  class Handler ()
    extends typingsSlinky.vegaTypings.rendererMod.Handler
  
  @js.native
  class Operator ()
    extends typingsSlinky.vegaTypings.runtimeMod.Operator {
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
  
  @js.native
  class Renderer protected ()
    extends typingsSlinky.vegaTypings.runtimeMod.Renderer {
    def this(loader: Loader_) = this()
  }
  
  @js.native
  class Transform ()
    extends typingsSlinky.vegaTypings.runtimeMod.Transform {
    def this(init: js.Any) = this()
    def this(init: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(init: js.Any, params: js.Any) = this()
  }
  
  @js.native
  class View protected ()
    extends typingsSlinky.vegaTypings.runtimeMod.View {
    def this(runtime: Runtime) = this()
    def this(runtime: Runtime, opt: Background) = this()
  }
  
  @js.native
  object transforms
    extends /* name */ StringDictionary[typingsSlinky.vegaTypings.dataflowMod.Transform]
}
