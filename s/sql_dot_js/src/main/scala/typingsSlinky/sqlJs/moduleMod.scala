package typingsSlinky.sqlJs

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.emscripten.Emscripten.EnvironmentType
import typingsSlinky.emscripten.Emscripten.WebAssemblyExports
import typingsSlinky.emscripten.Emscripten.WebAssemblyImports
import typingsSlinky.emscripten.WebAssembly.Module
import typingsSlinky.node.Buffer
import typingsSlinky.sqlJs.moduleMod.SqlJs.InitSqlJsStatic
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  object SqlJs {
    
    @JSImport("sql.js/module", "SqlJs.Database")
    @js.native
    class Database () extends StObject {
      def this(data: js.Array[Double]) = this()
      def this(data: js.typedarray.Uint8Array) = this()
      def this(data: Buffer) = this()
      
      def close(): Unit = js.native
      
      def create_function(name: String, func: js.Function): Unit = js.native
      
      def each(sql: String, callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
      def each(sql: String, params: js.Array[ValueType], callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
      def each(sql: String, params: ParamsObject, callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
      
      def exec(sql: String): js.Array[QueryResults] = js.native
      
      def export(): js.typedarray.Uint8Array = js.native
      
      def getRowsModified(): Double = js.native
      
      def prepare(sql: String): Statement = js.native
      def prepare(sql: String, params: js.Array[ValueType]): Statement = js.native
      def prepare(sql: String, params: ParamsObject): Statement = js.native
      
      def run(sql: String): Database = js.native
      def run(sql: String, params: js.Array[ValueType]): Database = js.native
      def run(sql: String, params: ParamsObject): Database = js.native
    }
    
    @JSImport("sql.js/module", "SqlJs.Statement")
    @js.native
    class Statement () extends StObject {
      
      def bind(): Boolean = js.native
      def bind(values: js.Array[ValueType]): Boolean = js.native
      def bind(values: ParamsObject): Boolean = js.native
      
      def free(): Boolean = js.native
      
      def freemem(): Unit = js.native
      
      def get(): js.Array[ValueType] = js.native
      def get(params: js.Array[ValueType]): js.Array[ValueType] = js.native
      def get(params: ParamsObject): js.Array[ValueType] = js.native
      
      def getAsObject(): ParamsObject = js.native
      def getAsObject(params: js.Array[ValueType]): ParamsObject = js.native
      def getAsObject(params: ParamsObject): ParamsObject = js.native
      
      def getColumnNames(): js.Array[String] = js.native
      
      def reset(): Unit = js.native
      
      def run(): Unit = js.native
      def run(values: js.Array[ValueType]): Unit = js.native
      def run(values: ParamsObject): Unit = js.native
      
      def step(): Boolean = js.native
    }
    
    /* Inlined std.Partial<emscripten.EmscriptenModule> */
    @js.native
    trait Config extends StObject {
      
      var FAST_MEMORY: js.UndefOr[Double] = js.native
      
      var FHEAP: js.UndefOr[js.typedarray.Float64Array] = js.native
      
      var HEAP: js.UndefOr[js.typedarray.Int32Array] = js.native
      
      var HEAP16: js.UndefOr[js.typedarray.Int16Array] = js.native
      
      var HEAP32: js.UndefOr[js.typedarray.Int32Array] = js.native
      
      var HEAP8: js.UndefOr[js.typedarray.Int8Array] = js.native
      
      var HEAPF32: js.UndefOr[js.typedarray.Float32Array] = js.native
      
      var HEAPF64: js.UndefOr[js.typedarray.Float64Array] = js.native
      
      var HEAPU16: js.UndefOr[js.typedarray.Uint16Array] = js.native
      
      var HEAPU32: js.UndefOr[js.typedarray.Uint32Array] = js.native
      
      var HEAPU8: js.UndefOr[js.typedarray.Uint8Array] = js.native
      
      var IHEAP: js.UndefOr[js.typedarray.Int32Array] = js.native
      
      var TOTAL_MEMORY: js.UndefOr[Double] = js.native
      
      var TOTAL_STACK: js.UndefOr[Double] = js.native
      
      var _free: js.UndefOr[js.Function1[/* ptr */ Double, Unit]] = js.native
      
      var _malloc: js.UndefOr[js.Function1[/* size */ Double, Double]] = js.native
      
      var addOnExit: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
      
      var addOnInit: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
      
      var addOnPostRun: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
      
      var addOnPreMain: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
      
      var addOnPreRun: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
      
      var arguments: js.UndefOr[js.Array[String]] = js.native
      
      var destroy: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.native
      
      var environment: js.UndefOr[EnvironmentType] = js.native
      
      var filePackagePrefixURL: js.UndefOr[String] = js.native
      
      var getPreloadedPackage: js.UndefOr[
            js.Function2[
              /* remotePackageName */ String, 
              /* remotePackageSize */ Double, 
              js.typedarray.ArrayBuffer
            ]
          ] = js.native
      
      var instantiateWasm: js.UndefOr[
            js.Function2[
              /* imports */ WebAssemblyImports, 
              /* successCallback */ js.Function1[/* module */ Module, Unit], 
              WebAssemblyExports
            ]
          ] = js.native
      
      var locateFile: js.UndefOr[js.Function2[/* url */ String, /* scriptDirectory */ String, String]] = js.native
      
      var logReadFiles: js.UndefOr[Boolean] = js.native
      
      var noExitRuntime: js.UndefOr[Boolean] = js.native
      
      var noInitialRun: js.UndefOr[Boolean] = js.native
      
      var onAbort: js.UndefOr[js.Function1[/* what */ js.Any, Unit]] = js.native
      
      var onCustomMessage: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.native
      
      var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.native
      
      var postRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
      
      var preInit: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
      
      var preRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
      
      var preinitializedWebGLContext: js.UndefOr[WebGLRenderingContext] = js.native
      
      var preloadedAudios: js.UndefOr[js.Any] = js.native
      
      var preloadedImages: js.UndefOr[js.Any] = js.native
      
      var print: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
      
      var printErr: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
      
      var wasmBinary: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddOnExit(value: /* cb */ js.Function0[_] => Unit): Self = StObject.set(x, "addOnExit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddOnExitUndefined: Self = StObject.set(x, "addOnExit", js.undefined)
        
        @scala.inline
        def setAddOnInit(value: /* cb */ js.Function0[_] => Unit): Self = StObject.set(x, "addOnInit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddOnInitUndefined: Self = StObject.set(x, "addOnInit", js.undefined)
        
        @scala.inline
        def setAddOnPostRun(value: /* cb */ js.Function0[_] => Unit): Self = StObject.set(x, "addOnPostRun", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddOnPostRunUndefined: Self = StObject.set(x, "addOnPostRun", js.undefined)
        
        @scala.inline
        def setAddOnPreMain(value: /* cb */ js.Function0[_] => Unit): Self = StObject.set(x, "addOnPreMain", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddOnPreMainUndefined: Self = StObject.set(x, "addOnPreMain", js.undefined)
        
        @scala.inline
        def setAddOnPreRun(value: /* cb */ js.Function0[_] => Unit): Self = StObject.set(x, "addOnPreRun", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddOnPreRunUndefined: Self = StObject.set(x, "addOnPreRun", js.undefined)
        
        @scala.inline
        def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
        
        @scala.inline
        def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
        
        @scala.inline
        def setDestroy(value: /* object */ js.Object => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
        
        @scala.inline
        def setEnvironment(value: EnvironmentType): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
        
        @scala.inline
        def setFAST_MEMORY(value: Double): Self = StObject.set(x, "FAST_MEMORY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFAST_MEMORYUndefined: Self = StObject.set(x, "FAST_MEMORY", js.undefined)
        
        @scala.inline
        def setFHEAP(value: js.typedarray.Float64Array): Self = StObject.set(x, "FHEAP", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFHEAPUndefined: Self = StObject.set(x, "FHEAP", js.undefined)
        
        @scala.inline
        def setFilePackagePrefixURL(value: String): Self = StObject.set(x, "filePackagePrefixURL", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilePackagePrefixURLUndefined: Self = StObject.set(x, "filePackagePrefixURL", js.undefined)
        
        @scala.inline
        def setGetPreloadedPackage(
          value: (/* remotePackageName */ String, /* remotePackageSize */ Double) => js.typedarray.ArrayBuffer
        ): Self = StObject.set(x, "getPreloadedPackage", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetPreloadedPackageUndefined: Self = StObject.set(x, "getPreloadedPackage", js.undefined)
        
        @scala.inline
        def setHEAP(value: js.typedarray.Int32Array): Self = StObject.set(x, "HEAP", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAP16(value: js.typedarray.Int16Array): Self = StObject.set(x, "HEAP16", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAP16Undefined: Self = StObject.set(x, "HEAP16", js.undefined)
        
        @scala.inline
        def setHEAP32(value: js.typedarray.Int32Array): Self = StObject.set(x, "HEAP32", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAP32Undefined: Self = StObject.set(x, "HEAP32", js.undefined)
        
        @scala.inline
        def setHEAP8(value: js.typedarray.Int8Array): Self = StObject.set(x, "HEAP8", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAP8Undefined: Self = StObject.set(x, "HEAP8", js.undefined)
        
        @scala.inline
        def setHEAPF32(value: js.typedarray.Float32Array): Self = StObject.set(x, "HEAPF32", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAPF32Undefined: Self = StObject.set(x, "HEAPF32", js.undefined)
        
        @scala.inline
        def setHEAPF64(value: js.typedarray.Float64Array): Self = StObject.set(x, "HEAPF64", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAPF64Undefined: Self = StObject.set(x, "HEAPF64", js.undefined)
        
        @scala.inline
        def setHEAPU16(value: js.typedarray.Uint16Array): Self = StObject.set(x, "HEAPU16", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAPU16Undefined: Self = StObject.set(x, "HEAPU16", js.undefined)
        
        @scala.inline
        def setHEAPU32(value: js.typedarray.Uint32Array): Self = StObject.set(x, "HEAPU32", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAPU32Undefined: Self = StObject.set(x, "HEAPU32", js.undefined)
        
        @scala.inline
        def setHEAPU8(value: js.typedarray.Uint8Array): Self = StObject.set(x, "HEAPU8", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHEAPU8Undefined: Self = StObject.set(x, "HEAPU8", js.undefined)
        
        @scala.inline
        def setHEAPUndefined: Self = StObject.set(x, "HEAP", js.undefined)
        
        @scala.inline
        def setIHEAP(value: js.typedarray.Int32Array): Self = StObject.set(x, "IHEAP", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIHEAPUndefined: Self = StObject.set(x, "IHEAP", js.undefined)
        
        @scala.inline
        def setInstantiateWasm(
          value: (/* imports */ WebAssemblyImports, /* successCallback */ js.Function1[/* module */ Module, Unit]) => WebAssemblyExports
        ): Self = StObject.set(x, "instantiateWasm", js.Any.fromFunction2(value))
        
        @scala.inline
        def setInstantiateWasmUndefined: Self = StObject.set(x, "instantiateWasm", js.undefined)
        
        @scala.inline
        def setLocateFile(value: (/* url */ String, /* scriptDirectory */ String) => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction2(value))
        
        @scala.inline
        def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
        
        @scala.inline
        def setLogReadFiles(value: Boolean): Self = StObject.set(x, "logReadFiles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogReadFilesUndefined: Self = StObject.set(x, "logReadFiles", js.undefined)
        
        @scala.inline
        def setNoExitRuntime(value: Boolean): Self = StObject.set(x, "noExitRuntime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoExitRuntimeUndefined: Self = StObject.set(x, "noExitRuntime", js.undefined)
        
        @scala.inline
        def setNoInitialRun(value: Boolean): Self = StObject.set(x, "noInitialRun", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoInitialRunUndefined: Self = StObject.set(x, "noInitialRun", js.undefined)
        
        @scala.inline
        def setOnAbort(value: /* what */ js.Any => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
        
        @scala.inline
        def setOnCustomMessage(value: /* event */ MessageEvent => Unit): Self = StObject.set(x, "onCustomMessage", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCustomMessageUndefined: Self = StObject.set(x, "onCustomMessage", js.undefined)
        
        @scala.inline
        def setOnRuntimeInitialized(value: () => Unit): Self = StObject.set(x, "onRuntimeInitialized", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnRuntimeInitializedUndefined: Self = StObject.set(x, "onRuntimeInitialized", js.undefined)
        
        @scala.inline
        def setPostRun(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "postRun", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostRunUndefined: Self = StObject.set(x, "postRun", js.undefined)
        
        @scala.inline
        def setPostRunVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "postRun", js.Array(value :_*))
        
        @scala.inline
        def setPreInit(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "preInit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreInitUndefined: Self = StObject.set(x, "preInit", js.undefined)
        
        @scala.inline
        def setPreInitVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "preInit", js.Array(value :_*))
        
        @scala.inline
        def setPreRun(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "preRun", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreRunUndefined: Self = StObject.set(x, "preRun", js.undefined)
        
        @scala.inline
        def setPreRunVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "preRun", js.Array(value :_*))
        
        @scala.inline
        def setPreinitializedWebGLContext(value: WebGLRenderingContext): Self = StObject.set(x, "preinitializedWebGLContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreinitializedWebGLContextUndefined: Self = StObject.set(x, "preinitializedWebGLContext", js.undefined)
        
        @scala.inline
        def setPreloadedAudios(value: js.Any): Self = StObject.set(x, "preloadedAudios", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreloadedAudiosUndefined: Self = StObject.set(x, "preloadedAudios", js.undefined)
        
        @scala.inline
        def setPreloadedImages(value: js.Any): Self = StObject.set(x, "preloadedImages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreloadedImagesUndefined: Self = StObject.set(x, "preloadedImages", js.undefined)
        
        @scala.inline
        def setPrint(value: /* str */ String => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPrintErr(value: /* str */ String => Unit): Self = StObject.set(x, "printErr", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPrintErrUndefined: Self = StObject.set(x, "printErr", js.undefined)
        
        @scala.inline
        def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
        
        @scala.inline
        def setTOTAL_MEMORY(value: Double): Self = StObject.set(x, "TOTAL_MEMORY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTOTAL_MEMORYUndefined: Self = StObject.set(x, "TOTAL_MEMORY", js.undefined)
        
        @scala.inline
        def setTOTAL_STACK(value: Double): Self = StObject.set(x, "TOTAL_STACK", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTOTAL_STACKUndefined: Self = StObject.set(x, "TOTAL_STACK", js.undefined)
        
        @scala.inline
        def setWasmBinary(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "wasmBinary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWasmBinaryUndefined: Self = StObject.set(x, "wasmBinary", js.undefined)
        
        @scala.inline
        def set_free(value: /* ptr */ Double => Unit): Self = StObject.set(x, "_free", js.Any.fromFunction1(value))
        
        @scala.inline
        def set_freeUndefined: Self = StObject.set(x, "_free", js.undefined)
        
        @scala.inline
        def set_malloc(value: /* size */ Double => Double): Self = StObject.set(x, "_malloc", js.Any.fromFunction1(value))
        
        @scala.inline
        def set_mallocUndefined: Self = StObject.set(x, "_malloc", js.undefined)
      }
    }
    
    @js.native
    trait InitSqlJsStatic
      extends js.Function {
      
      def apply(): js.Promise[SqlJsStatic] = js.native
      def apply(config: Config): js.Promise[SqlJsStatic] = js.native
      
      val default: this.type = js.native
    }
    
    type ParamsCallback = js.Function1[/* obj */ ParamsObject, Unit]
    
    type ParamsObject = Record[String, ValueType]
    
    @js.native
    trait QueryResults extends StObject {
      
      var columns: js.Array[String] = js.native
      
      var values: js.Array[js.Array[ValueType]] = js.native
    }
    object QueryResults {
      
      @scala.inline
      def apply(columns: js.Array[String], values: js.Array[js.Array[ValueType]]): QueryResults = {
        val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[QueryResults]
      }
      
      @scala.inline
      implicit class QueryResultsMutableBuilder[Self <: QueryResults] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
        
        @scala.inline
        def setValues(value: js.Array[js.Array[ValueType]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesVarargs(value: js.Array[ValueType]*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SqlJsStatic extends StObject {
      
      var Database: Instantiable0[typingsSlinky.sqlJs.moduleMod.SqlJs.Database] = js.native
      
      var Statement: Instantiable0[typingsSlinky.sqlJs.moduleMod.SqlJs.Statement] = js.native
    }
    object SqlJsStatic {
      
      @scala.inline
      def apply(Database: Instantiable0[Database], Statement: Instantiable0[Statement]): SqlJsStatic = {
        val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any])
        __obj.asInstanceOf[SqlJsStatic]
      }
      
      @scala.inline
      implicit class SqlJsStaticMutableBuilder[Self <: SqlJsStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDatabase(value: Instantiable0[Database]): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatement(value: Instantiable0[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      }
    }
    
    type ValueType = Double | String | js.typedarray.Uint8Array | Null
  }
  
  object global {
    
    @JSGlobal("initSqlJs")
    @js.native
    def initSqlJs: InitSqlJsStatic = js.native
    @scala.inline
    def initSqlJs_=(x: InitSqlJsStatic): Unit = js.Dynamic.global.updateDynamic("initSqlJs")(x.asInstanceOf[js.Any])
  }
}
