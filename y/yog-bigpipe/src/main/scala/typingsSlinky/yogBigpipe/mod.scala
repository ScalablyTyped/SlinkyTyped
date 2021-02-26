package typingsSlinky.yogBigpipe

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.yogBigpipe.anon.Default
import typingsSlinky.yogBigpipe.anon.Dictkey
import typingsSlinky.yogBigpipe.mod.Pagelet.mode
import typingsSlinky.yogBigpipe.mod.Pagelet.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yog-bigpipe", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("yog-bigpipe", JSImport.Namespace)
  @js.native
  def apply(option: BigPipeOption): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("yog-bigpipe", "BigPipe")
  @js.native
  class BigPipe () extends Readable {
    def this(option: BigPipeOption) = this()
    
    var Pagelet: PageletConstructor[typingsSlinky.yogBigpipe.mod.Pagelet] = js.native
    
    def _checkFinish(): Unit = js.native
    
    def _markPageletRendered(pagelet: Pagelet): Unit = js.native
    
    def _onPageletDone(pagelet: Pagelet): Unit = js.native
    
    def addPagelet(obj: AddPageletConfig): Unit = js.native
    
    def addQuicklingPagelets(pagelets: js.Array[String]): Unit = js.native
    
    def bind(id: String, fn: Callback): BigPipe = js.native
    
    def bindPageOnly(fn: Callback): Unit = js.native
    
    def format(pagelet: Pagelet): String = js.native
    
    def isQuickingMode(): Boolean = js.native
    
    def isQuicklingMode(): Boolean = js.native
    
    def isQuicklingWidget(item: Dictkey): Unit = js.native
    
    var map: StringDictionary[Pagelet] = js.native
    
    def outputPagelet(pagelet: Pagelet): Unit = js.native
    
    var pagelets: js.Array[Pagelet] = js.native
    
    var parentQuicklings: js.Array[String] = js.native
    
    var pipelines: js.Array[Pagelet] = js.native
    
    def prepareAllSources(): js.Promise[_] = js.native
    
    def preparePageOnly(): js.Promise[_] = js.native
    
    def render(): Unit = js.native
    
    def renderPagelet(pagelet: Pagelet): Unit = js.native
    
    var rendered: js.Array[Pagelet] = js.native
    
    var state: status = js.native
  }
  
  @JSImport("yog-bigpipe", "Pagelet")
  @js.native
  class Pagelet protected () extends EventEmitter {
    def this(obj: PageletOption) = this()
    
    def addCss(css: String): Unit = js.native
    def addCss(css: js.Array[String]): Unit = js.native
    
    def addCsses(css: String): Unit = js.native
    def addCsses(css: js.Array[String]): Unit = js.native
    
    def addJs(css: String): Unit = js.native
    def addJs(css: js.Array[String]): Unit = js.native
    
    def addJses(css: String): Unit = js.native
    def addJses(css: js.Array[String]): Unit = js.native
    
    def addScript(css: String): Unit = js.native
    def addScript(css: js.Array[String]): Unit = js.native
    
    def addScripts(css: String): Unit = js.native
    def addScripts(css: js.Array[String]): Unit = js.native
    
    def addStyle(css: String): Unit = js.native
    def addStyle(css: js.Array[String]): Unit = js.native
    
    def addStyles(css: String): Unit = js.native
    def addStyles(css: js.Array[String]): Unit = js.native
    
    var compiled: Boolean = js.native
    
    var container: String = js.native
    
    var css: js.Array[String] = js.native
    
    def destroy(): Unit = js.native
    
    var html: String = js.native
    
    var id: String = js.native
    
    @JSName("js")
    var js_ : js.Array[String] = js.native
    
    var mode: mode = js.native
    
    var reqID: String = js.native
    
    var scripts: js.Array[String] = js.native
    
    var skipAnalysis: Boolean = js.native
    
    def start(provider: js.Promise[_], sync: Boolean): Unit = js.native
    
    var state: status = js.native
    
    var styles: js.Array[String] = js.native
    
    def toJson(): PageletData = js.native
  }
  object Pagelet {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.async
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.pipeline
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.quickling
    */
    trait mode extends StObject
    object mode {
      
      @scala.inline
      def async: typingsSlinky.yogBigpipe.yogBigpipeStrings.async = "async".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.async]
      
      @scala.inline
      def pipeline: typingsSlinky.yogBigpipe.yogBigpipeStrings.pipeline = "pipeline".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.pipeline]
      
      @scala.inline
      def quickling: typingsSlinky.yogBigpipe.yogBigpipeStrings.quickling = "quickling".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.quickling]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.pending
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.rendering
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.fulfilled
      - typingsSlinky.yogBigpipe.yogBigpipeStrings.failed
    */
    trait status extends StObject
    object status {
      
      @scala.inline
      def failed: typingsSlinky.yogBigpipe.yogBigpipeStrings.failed = "failed".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.failed]
      
      @scala.inline
      def fulfilled: typingsSlinky.yogBigpipe.yogBigpipeStrings.fulfilled = "fulfilled".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.fulfilled]
      
      @scala.inline
      def pending: typingsSlinky.yogBigpipe.yogBigpipeStrings.pending = "pending".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.pending]
      
      @scala.inline
      def rendering: typingsSlinky.yogBigpipe.yogBigpipeStrings.rendering = "rendering".asInstanceOf[typingsSlinky.yogBigpipe.yogBigpipeStrings.rendering]
    }
  }
  
  @js.native
  trait AddPageletConfig extends StObject {
    
    var id: String = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[typingsSlinky.yogBigpipe.mod.Pagelet.mode] = js.native
  }
  object AddPageletConfig {
    
    @scala.inline
    def apply(id: String): AddPageletConfig = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPageletConfig]
    }
    
    @scala.inline
    implicit class AddPageletConfigMutableBuilder[Self <: AddPageletConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait BigPipeOption extends StObject {
    
    var skipAnalysis: js.UndefOr[Boolean] = js.native
    
    var tpl: js.UndefOr[Default] = js.native
  }
  object BigPipeOption {
    
    @scala.inline
    def apply(): BigPipeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BigPipeOption]
    }
    
    @scala.inline
    implicit class BigPipeOptionMutableBuilder[Self <: BigPipeOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipAnalysis(value: Boolean): Self = StObject.set(x, "skipAnalysis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipAnalysisUndefined: Self = StObject.set(x, "skipAnalysis", js.undefined)
      
      @scala.inline
      def setTpl(value: Default): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* done */ js.Function2[/* err */ js.Any, /* data */ js.Any, js.Any], js.Any]
  
  type PageletConstructor[T] = Instantiable1[/* obj */ PageletOption, T]
  
  @js.native
  trait PageletData extends StObject {
    
    var container: String = js.native
    
    var css: js.Array[String] = js.native
    
    var html: String = js.native
    
    var id: String = js.native
    
    @JSName("js")
    var js_ : js.Array[String] = js.native
    
    var reqID: String = js.native
    
    var scripts: js.Array[String] = js.native
    
    var styles: js.Array[String] = js.native
  }
  object PageletData {
    
    @scala.inline
    def apply(
      container: String,
      css: js.Array[String],
      html: String,
      id: String,
      js_ : js.Array[String],
      reqID: String,
      scripts: js.Array[String],
      styles: js.Array[String]
    ): PageletData = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageletData]
    }
    
    @scala.inline
    implicit class PageletDataMutableBuilder[Self <: PageletData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      @scala.inline
      def setReqID(value: String): Self = StObject.set(x, "reqID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PageletOption extends StObject {
    
    var compiled: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[String] = js.native
    
    var `for`: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var locals: js.UndefOr[js.Object] = js.native
    
    var mode: js.UndefOr[typingsSlinky.yogBigpipe.mod.Pagelet.mode] = js.native
    
    var reqID: String = js.native
    
    var skipAnalysis: Boolean = js.native
  }
  object PageletOption {
    
    @scala.inline
    def apply(id: String, reqID: String, skipAnalysis: Boolean): PageletOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], skipAnalysis = skipAnalysis.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageletOption]
    }
    
    @scala.inline
    implicit class PageletOptionMutableBuilder[Self <: PageletOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setReqID(value: String): Self = StObject.set(x, "reqID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipAnalysis(value: Boolean): Self = StObject.set(x, "skipAnalysis", value.asInstanceOf[js.Any])
    }
  }
}
