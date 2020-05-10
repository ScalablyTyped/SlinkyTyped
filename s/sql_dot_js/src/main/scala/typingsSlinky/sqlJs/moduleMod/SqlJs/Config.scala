package typingsSlinky.sqlJs.moduleMod.SqlJs

import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.emscripten.Emscripten.EnvironmentType
import typingsSlinky.emscripten.Emscripten.WebAssemblyExports
import typingsSlinky.emscripten.Emscripten.WebAssemblyImports
import typingsSlinky.emscripten.WebAssembly.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<emscripten.EmscriptenModule> */
@js.native
trait Config extends js.Object {
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
  var `then`: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* module */ this.type, Unit], this.type]
  ] = js.native
  var wasmBinary: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAST_MEMORY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAST_MEMORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFAST_MEMORY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAST_MEMORY")(js.undefined)
        ret
    }
    @scala.inline
    def withFHEAP(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FHEAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFHEAP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FHEAP")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAP(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAP16(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAP16: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP16")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAP32(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAP32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP32")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAP8(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAP8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAP8")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAPF32(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPF32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAPF32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPF32")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAPF64(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPF64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAPF64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPF64")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAPU16(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPU16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAPU16: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPU16")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAPU32(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPU32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAPU32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPU32")(js.undefined)
        ret
    }
    @scala.inline
    def withHEAPU8(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPU8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHEAPU8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAPU8")(js.undefined)
        ret
    }
    @scala.inline
    def withIHEAP(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IHEAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIHEAP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IHEAP")(js.undefined)
        ret
    }
    @scala.inline
    def withTOTAL_MEMORY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_MEMORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTOTAL_MEMORY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_MEMORY")(js.undefined)
        ret
    }
    @scala.inline
    def withTOTAL_STACK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_STACK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTOTAL_STACK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_STACK")(js.undefined)
        ret
    }
    @scala.inline
    def with_free(value: /* ptr */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_free")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without_free: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_free")(js.undefined)
        ret
    }
    @scala.inline
    def with_malloc(value: /* size */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_malloc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without_malloc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_malloc")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnExit(value: /* cb */ js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnExit")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnInit(value: /* cb */ js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnPostRun(value: /* cb */ js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPostRun")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddOnPostRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPostRun")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnPreMain(value: /* cb */ js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPreMain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddOnPreMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPreMain")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnPreRun(value: /* cb */ js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPreRun")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddOnPreRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPreRun")(js.undefined)
        ret
    }
    @scala.inline
    def withArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* object */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: EnvironmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePackagePrefixURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePackagePrefixURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePackagePrefixURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePackagePrefixURL")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreloadedPackage(
      value: (/* remotePackageName */ String, /* remotePackageSize */ Double) => js.typedarray.ArrayBuffer
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreloadedPackage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPreloadedPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreloadedPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withInstantiateWasm(
      value: (/* imports */ WebAssemblyImports, /* successCallback */ js.Function1[/* module */ Module, Unit]) => WebAssemblyExports
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiateWasm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInstantiateWasm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiateWasm")(js.undefined)
        ret
    }
    @scala.inline
    def withLocateFile(value: (/* url */ String, /* scriptDirectory */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLocateFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLogReadFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logReadFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogReadFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logReadFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withNoExitRuntime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExitRuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoExitRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExitRuntime")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInitialRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInitialRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInitialRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInitialRun")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: /* what */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCustomMessage(value: /* event */ MessageEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCustomMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCustomMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRuntimeInitialized(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRuntimeInitialized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRuntimeInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRuntimeInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withPostRun(value: js.Array[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPreInit(value: js.Array[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preInit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRun(value: js.Array[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPreinitializedWebGLContext(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinitializedWebGLContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreinitializedWebGLContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinitializedWebGLContext")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadedAudios(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedAudios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadedAudios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedAudios")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadedImages(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadedImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: /* str */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintErr(value: /* str */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printErr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrintErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printErr")(js.undefined)
        ret
    }
    @scala.inline
    def withThen(value: /* callback */ js.Function1[Config, Unit] => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.undefined)
        ret
    }
    @scala.inline
    def withWasmBinary(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasmBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasmBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasmBinary")(js.undefined)
        ret
    }
  }
  
}

