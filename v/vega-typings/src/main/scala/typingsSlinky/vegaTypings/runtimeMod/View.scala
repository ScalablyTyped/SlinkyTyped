package typingsSlinky.vegaTypings.runtimeMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vegaTypings.anon.Background
import typingsSlinky.vegaTypings.anon.Data
import typingsSlinky.vegaTypings.anon.Signals
import typingsSlinky.vegaTypings.dataflowMod.Changeset_
import typingsSlinky.vegaTypings.encodeMod.EncodeEntryName
import typingsSlinky.vegaTypings.paddingMod.Padding
import typingsSlinky.vegaTypings.rendererMod.Renderers
import typingsSlinky.vegaTypings.sceneMod.Scene
import typingsSlinky.vegaTypings.signalMod.SignalValue
import typingsSlinky.vegaUtil.mod.LoggerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/runtime", "View")
@js.native
class View protected () extends js.Object {
  def this(runtime: Runtime) = this()
  def this(runtime: Runtime, opt: Background) = this()
  
  def addDataListener(name: String, handler: DataListenerHandler): this.type = js.native
  
  def addEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
  
  def addResizeListener(handler: ResizeHandler): this.type = js.native
  
  def addSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
  
  def change(name: String, changeset: Changeset_): this.type = js.native
  
  def changeset(): js.Any = js.native
  
  def container(): HTMLElement | Null = js.native
  
  def data(name: String): js.Array[_] = js.native
  def data(name: String, tuples: js.Any): this.type = js.native
  
  def description(): String = js.native
  def description(s: String): this.type = js.native
  
  def getState(): Signals = js.native
  def getState(options: Data): Signals = js.native
  
  def height(): Double = js.native
  def height(h: Double): this.type = js.native
  
  def hover(): this.type = js.native
  def hover(hoverSet: js.UndefOr[scala.Nothing], leaveSet: EncodeEntryName): this.type = js.native
  def hover(hoverSet: EncodeEntryName): this.type = js.native
  def hover(hoverSet: EncodeEntryName, leaveSet: EncodeEntryName): this.type = js.native
  
  def initialize(): this.type = js.native
  def initialize(container: js.UndefOr[scala.Nothing], bindContainer: String): this.type = js.native
  def initialize(container: js.UndefOr[scala.Nothing], bindContainer: Element): this.type = js.native
  def initialize(container: String): this.type = js.native
  def initialize(container: String, bindContainer: String): this.type = js.native
  def initialize(container: String, bindContainer: Element): this.type = js.native
  def initialize(container: Element): this.type = js.native
  def initialize(container: Element, bindContainer: String): this.type = js.native
  def initialize(container: Element, bindContainer: Element): this.type = js.native
  
  def insert(name: String, tuples: js.Any): this.type = js.native
  
  def loader(): Loader_ = js.native
  def loader(loader: Loader_): this.type = js.native
  
  def locale(): LocaleFormatters = js.native
  def locale(locale: LocaleFormatters): this.type = js.native
  
  def logLevel(): Double = js.native
  def logLevel(level: Double): this.type = js.native
  
  def logger(): LoggerInterface = js.native
  def logger(logger: LoggerInterface): this.type = js.native
  
  def origin(): js.Tuple2[Double, Double] = js.native
  
  def padding(): Padding = js.native
  def padding(p: Padding): this.type = js.native
  
  def remove(name: String, tuples: js.Any): this.type = js.native
  
  def removeDataListener(name: String, handler: DataListenerHandler): this.type = js.native
  
  def removeEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
  
  def removeResizeListener(handler: ResizeHandler): this.type = js.native
  
  def removeSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
  
  def renderer(): Renderers = js.native
  def renderer(renderer: Renderers): this.type = js.native
  
  def resize(): this.type = js.native
  
  def run(): this.type = js.native
  def run(encode: String): this.type = js.native
  
  def runAfter(callback: js.Function1[/* view */ this.type, Unit]): this.type = js.native
  def runAfter(
    callback: js.Function1[/* view */ this.type, Unit],
    enqueue: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean, priority: Double): this.type = js.native
  
  def runAsync(): js.Promise[View] = js.native
  
  def scenegraph(): Scene = js.native
  
  def setState(state: Signals): this.type = js.native
  
  def signal(name: String): SignalValue = js.native
  def signal(name: String, value: SignalValue): this.type = js.native
  
  def toCanvas(): js.Promise[HTMLCanvasElement] = js.native
  def toCanvas(scaleFactor: js.UndefOr[scala.Nothing], options: ToCanvasOptions): js.Promise[HTMLCanvasElement] = js.native
  def toCanvas(scaleFactor: Double): js.Promise[HTMLCanvasElement] = js.native
  def toCanvas(scaleFactor: Double, options: ToCanvasOptions): js.Promise[HTMLCanvasElement] = js.native
  
  def toImageURL(`type`: String): js.Promise[String] = js.native
  def toImageURL(`type`: String, scaleFactor: Double): js.Promise[String] = js.native
  
  def toSVG(): js.Promise[String] = js.native
  def toSVG(scaleFactor: Double): js.Promise[String] = js.native
  
  def tooltip(handler: TooltipHandler): this.type = js.native
  
  def width(): Double = js.native
  def width(w: Double): this.type = js.native
}
