package typingsSlinky.tdweb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tdweb.tdwebStrings.asmjs
import typingsSlinky.tdweb.tdwebStrings.auto
import typingsSlinky.tdweb.tdwebStrings.debug
import typingsSlinky.tdweb.tdwebStrings.error
import typingsSlinky.tdweb.tdwebStrings.info
import typingsSlinky.tdweb.tdwebStrings.log
import typingsSlinky.tdweb.tdwebStrings.string
import typingsSlinky.tdweb.tdwebStrings.warning
import typingsSlinky.tdweb.tdwebStrings.wasm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * TDLib in a browser
    *
    * TDLib can be compiled to WebAssembly or asm.js using Emscripten compiler and used in a browser from JavaScript.
    * This is a convenient wrapper for TDLib in a browser which controls TDLib instance creation, handles interaction
    * with TDLib and manages a filesystem for persistent TDLib data.
    * TDLib instance is created in a Web Worker to run it in a separate thread.
    * TdClient just sends queries to the Web Worker and receives updates and results from it.
    *
    *
    * Differences from the TDLib JSON API:
    * 1. Added the update `updateFatalError error:string = Update;` which is sent whenever TDLib encounters a fatal error.
    * 2. Added the method `setJsLogVerbosityLevel new_verbosity_level:string = Ok;`,
    * which allows to change the verbosity level of tdweb logging.
    * 3. Added the possibility to use blobs as input files via the constructor `inputFileBlob data:<JavaScript blob> = InputFile;`.
    * 4. The class `filePart` contains data as a JavaScript blob instead of a base64-encoded string.
    * 5. The method `readFilePart` supports only `offset == count == 0`.
    * 6. The methods `getStorageStatistics`, `getStorageStatisticsFast`, `optimizeStorage`, `addProxy` and
    * `getFileDownloadedPrefixSize` are not supported.
    */
  @JSImport("tdweb", JSImport.Default)
  @js.native
  class default protected () extends TdClient {
    /**
      * Create TdClient.
      */
    def this(options: TdOptions) = this()
  }
  
  /**
    * TDLib in a browser
    *
    * TDLib can be compiled to WebAssembly or asm.js using Emscripten compiler and used in a browser from JavaScript.
    * This is a convenient wrapper for TDLib in a browser which controls TDLib instance creation, handles interaction
    * with TDLib and manages a filesystem for persistent TDLib data.
    * TDLib instance is created in a Web Worker to run it in a separate thread.
    * TdClient just sends queries to the Web Worker and receives updates and results from it.
    *
    *
    * Differences from the TDLib JSON API:
    * 1. Added the update `updateFatalError error:string = Update;` which is sent whenever TDLib encounters a fatal error.
    * 2. Added the method `setJsLogVerbosityLevel new_verbosity_level:string = Ok;`,
    * which allows to change the verbosity level of tdweb logging.
    * 3. Added the possibility to use blobs as input files via the constructor `inputFileBlob data:<JavaScript blob> = InputFile;`.
    * 4. The class `filePart` contains data as a JavaScript blob instead of a base64-encoded string.
    * 5. The method `readFilePart` supports only `offset == count == 0`.
    * 6. The methods `getStorageStatistics`, `getStorageStatisticsFast`, `optimizeStorage`, `addProxy` and
    * `getFileDownloadedPrefixSize` are not supported.
    */
  @js.native
  trait TdClient extends StObject {
    
    /**
      * Send a query to TDLib.
      * If the query contains the field '@extra', the same field will be added into the result.
      * @link https://github.com/tdlib/td/blob/master/td/generate/scheme/td_api.tl - td_api.tl scheme
      * @link https://core.telegram.org/tdlib/docs/td__api_8h.html - HTML documentation
      * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_function.html - a list of all available TDLib methods
      * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_object.html - a list of all available TDLib classes
      */
    def send(query: TdObject): js.Promise[TdError | TdObject] = js.native
  }
  object TdClient {
    
    @scala.inline
    def apply(send: TdObject => js.Promise[TdError | TdObject]): TdClient = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[TdClient]
    }
    
    @scala.inline
    implicit class TdClientMutableBuilder[Self <: TdClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSend(value: TdObject => js.Promise[TdError | TdObject]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TdError extends StObject {
    
    var `@extra`: js.UndefOr[string] = js.native
    
    var `@type`: error = js.native
    
    /**
      * Error code; subject to future changes. If the error code is 406, the error message
      * must not be processed in any way and must not be displayed to the user
      */
    var code: Double = js.native
    
    /** Error message; subject to future changes */
    var message: String = js.native
  }
  object TdError {
    
    @scala.inline
    def apply(`@type`: error, code: Double, message: String): TdError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TdError]
    }
    
    @scala.inline
    implicit class TdErrorMutableBuilder[Self <: TdError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@extra`(value: string): Self = StObject.set(x, "@extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@extraUndefined`: Self = StObject.set(x, "@extra", js.undefined)
      
      @scala.inline
      def `set@type`(value: error): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TdObject
    extends /* key */ StringDictionary[
          js.UndefOr[
            TdObject | (js.Array[Boolean | Double | String | TdObject]) | Double | String | Boolean
          ]
        ] {
    
    var `@extra`: js.UndefOr[String] = js.native
    
    var `@type`: String = js.native
  }
  object TdObject {
    
    @scala.inline
    def apply(`@type`: String): TdObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TdObject]
    }
    
    @scala.inline
    implicit class TdObjectMutableBuilder[Self <: TdObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@extra`(value: String): Self = StObject.set(x, "@extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@extraUndefined`: Self = StObject.set(x, "@extra", js.undefined)
      
      @scala.inline
      def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TdOptions extends StObject {
    
    /**
      * Name of the TDLib instance. Currently only one instance of TdClient with a given name is allowed.
      * All but one instances with the same name will be automatically closed. Usually, the newest non-background instance is kept alive.
      * Files will be stored in an IndexedDb table with the same name.
      */
    var instanceName: js.UndefOr[String] = js.native
    
    /**
      * Pass true, if the instance is opened from the background.
      */
    var isBackground: js.UndefOr[Boolean] = js.native
    
    /**
      * The initial verbosity level of the JavaScript part of the code (one of 'error', 'warning', 'info', 'log', 'debug').
      */
    var jsLogVerbosityLevel: js.UndefOr[error | warning | info | log | debug] = js.native
    
    /**
      * The initial verbosity level for the TDLib internal logging (0-1023).
      */
    var logVerbosityLevel: js.UndefOr[Double] = js.native
    
    /**
      * For debug only. The type of the TDLib build to use. 'asmjs' for asm.js and 'wasm' for WebAssembly.
      * If mode == 'auto' WebAbassembly will be used if supported by browser, asm.js otherwise.
      */
    var mode: js.UndefOr[auto | asmjs | wasm] = js.native
    
    /**
      * Callback for all incoming updates.
      */
    var onUpdate: js.UndefOr[js.Function1[/* update */ TdObject, _]] = js.native
    
    /**
      * For debug only. PaPass false to use TDLib without database and secret chats.
      * It will significantly improve loading time, but some functionality will be unavailable.ss true
      * to open TDLib database in read-only mode
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Pass false to use TDLib without database and secret chats. It will significantly improve loading time, but some functionality will be unavailable.
      */
    var useDatabase: js.UndefOr[Boolean] = js.native
  }
  object TdOptions {
    
    @scala.inline
    def apply(): TdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TdOptions]
    }
    
    @scala.inline
    implicit class TdOptionsMutableBuilder[Self <: TdOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
      
      @scala.inline
      def setIsBackground(value: Boolean): Self = StObject.set(x, "isBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBackgroundUndefined: Self = StObject.set(x, "isBackground", js.undefined)
      
      @scala.inline
      def setJsLogVerbosityLevel(value: error | warning | info | log | debug): Self = StObject.set(x, "jsLogVerbosityLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsLogVerbosityLevelUndefined: Self = StObject.set(x, "jsLogVerbosityLevel", js.undefined)
      
      @scala.inline
      def setLogVerbosityLevel(value: Double): Self = StObject.set(x, "logVerbosityLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogVerbosityLevelUndefined: Self = StObject.set(x, "logVerbosityLevel", js.undefined)
      
      @scala.inline
      def setMode(value: auto | asmjs | wasm): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* update */ TdObject => _): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setUseDatabase(value: Boolean): Self = StObject.set(x, "useDatabase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDatabaseUndefined: Self = StObject.set(x, "useDatabase", js.undefined)
    }
  }
}
