package typingsSlinky.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackStrings.base64
import typingsSlinky.webpack.webpackStrings.hex
import typingsSlinky.webpack.webpackStrings.latin1
import typingsSlinky.webpack.webpackStrings.module
import typingsSlinky.webpack.webpackStrings.textSlashjavascript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /** When used in tandem with output.library and output.libraryTarget, this option allows users to insert comments within the export wrapper. */
  var auxiliaryComment: js.UndefOr[String | AuxiliaryCommentObject] = js.native
  /** The filename of non-entry chunks as relative path inside the output.path directory. */
  var chunkFilename: js.UndefOr[String] = js.native
  /** Number of milliseconds before chunk request expires, defaults to 120,000. */
  var chunkLoadTimeout: js.UndefOr[Double] = js.native
  /** This option enables cross-origin loading of chunks. */
  var crossOriginLoading: js.UndefOr[String | Boolean] = js.native
  /** Similar to output.devtoolModuleFilenameTemplate, but used in the case of duplicate module identifiers. */
  var devtoolFallbackModuleFilenameTemplate: js.UndefOr[String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String])] = js.native
  /**
    * Enable line to line mapped mode for all/specified modules.
    * Line to line mapped mode uses a simple SourceMap where each line of the generated source is mapped to the same line of the original source.
    * It’s a performance optimization. Only use it if your performance need to be better and you are sure that input lines match which generated lines.
    * true enables it for all modules (not recommended)
    */
  var devtoolLineToLine: js.UndefOr[Boolean] = js.native
  /** Filename template string of function for the sources array in a generated SourceMap. */
  var devtoolModuleFilenameTemplate: js.UndefOr[String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String])] = js.native
  /** This option determines the modules namespace used with the output.devtoolModuleFilenameTemplate. */
  var devtoolNamespace: js.UndefOr[String] = js.native
  /** The filename of the entry chunk as relative path inside the output.path directory. */
  var filename: js.UndefOr[String | (js.Function1[/* chunkData */ ChunkData, String])] = js.native
  /**
    * Use the future version of asset emitting logic, which allows freeing memory of assets after emitting.
    * It could break plugins which assume that assets are still readable after they were emitted.
    * @deprecated - will be removed in webpack v5.0.0 and this behaviour will become the new default.
    */
  var futureEmitAssets: js.UndefOr[Boolean] = js.native
  /** An expression which is used to address the global object/scope in runtime code. */
  var globalObject: js.UndefOr[String] = js.native
  /** The encoding to use when generating the hash, defaults to 'hex' */
  var hashDigest: js.UndefOr[hex | latin1 | base64] = js.native
  /** The prefix length of the hash digest to use, defaults to 20. */
  var hashDigestLength: js.UndefOr[Double] = js.native
  /** Algorithm used for generation the hash (see node.js crypto package) */
  var hashFunction: js.UndefOr[
    String | (js.Function2[/* algorithm */ String, /* options */ js.UndefOr[js.Any], _])
  ] = js.native
  /** An optional salt to update the hash via Node.JS' hash.update. */
  var hashSalt: js.UndefOr[String] = js.native
  /** The filename of the Hot Update Chunks. They are inside the output.path directory. */
  var hotUpdateChunkFilename: js.UndefOr[String] = js.native
  /** The JSONP function used by webpack for async loading of hot update chunks. */
  var hotUpdateFunction: js.UndefOr[String] = js.native
  /** The filename of the Hot Update Main File. It is inside the output.path directory. */
  var hotUpdateMainFilename: js.UndefOr[String] = js.native
  /** The JSONP function used by webpack for asnyc loading of chunks. */
  var jsonpFunction: js.UndefOr[String] = js.native
  /** Allows customization of the script type webpack injects script tags into the DOM to download async chunks. */
  var jsonpScriptType: js.UndefOr[textSlashjavascript | module] = js.native
  /** If set, export the bundle as library. output.library is the name. */
  var library: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.native
  /** Configure which module or modules will be exposed via the `libraryTarget` */
  var libraryExport: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Which format to export the library:
    * - "var" - Export by setting a variable: var Library = xxx (default)
    * - "this" - Export by setting a property of this: this["Library"] = xxx
    * - "commonjs" - Export by setting a property of exports: exports["Library"] = xxx
    * - "commonjs2" - Export by setting module.exports: module.exports = xxx
    * - "amd" - Export to AMD (optionally named)
    * - "umd" - Export to AMD, CommonJS2 or as property in root
    * - "window" - Assign to window
    * - "assign" - Assign to a global variable
    * - "jsonp" - Generate Webpack JSONP module
    * - "system" - Generate a SystemJS module
    */
  var libraryTarget: js.UndefOr[LibraryTarget] = js.native
  /** The output directory as absolute path. */
  var path: js.UndefOr[String] = js.native
  /** Include comments with information about the modules. */
  var pathinfo: js.UndefOr[Boolean] = js.native
  /** The output.path from the view of the Javascript / HTML page. */
  var publicPath: js.UndefOr[String] = js.native
  /** The filename of the SourceMaps for the JavaScript files. They are inside the output.path directory. */
  var sourceMapFilename: js.UndefOr[String] = js.native
  /** Prefixes every line of the source in the bundle with this string. */
  var sourcePrefix: js.UndefOr[String] = js.native
  /** If output.libraryTarget is set to umd and output.library is set, setting this to true will name the AMD module. */
  var umdNamedDefine: js.UndefOr[Boolean] = js.native
}

object Output {
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuxiliaryComment(value: String | AuxiliaryCommentObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryComment")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkLoadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOriginLoading(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOriginLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtoolFallbackModuleFilenameTemplateFunction1(value: /* info */ DevtoolModuleFilenameTemplateInfo => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolFallbackModuleFilenameTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDevtoolFallbackModuleFilenameTemplate(value: String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolFallbackModuleFilenameTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtoolFallbackModuleFilenameTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolFallbackModuleFilenameTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtoolLineToLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolLineToLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtoolLineToLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolLineToLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtoolModuleFilenameTemplateFunction1(value: /* info */ DevtoolModuleFilenameTemplateInfo => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolModuleFilenameTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDevtoolModuleFilenameTemplate(value: String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolModuleFilenameTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtoolModuleFilenameTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolModuleFilenameTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtoolNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtoolNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtoolNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameFunction1(value: /* chunkData */ ChunkData => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilename(value: String | (js.Function1[/* chunkData */ ChunkData, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFutureEmitAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureEmitAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFutureEmitAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureEmitAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalObject")(js.undefined)
        ret
    }
    @scala.inline
    def withHashDigest(value: hex | latin1 | base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withHashDigestLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigestLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashDigestLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigestLength")(js.undefined)
        ret
    }
    @scala.inline
    def withHashFunctionFunction2(value: (/* algorithm */ String, /* options */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHashFunction(value: String | (js.Function2[/* algorithm */ String, /* options */ js.UndefOr[js.Any], _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withHashSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashSalt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashSalt")(js.undefined)
        ret
    }
    @scala.inline
    def withHotUpdateChunkFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotUpdateChunkFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotUpdateChunkFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotUpdateChunkFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withHotUpdateFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotUpdateFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotUpdateFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotUpdateFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withHotUpdateMainFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotUpdateMainFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotUpdateMainFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotUpdateMainFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonpFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonpFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonpScriptType(value: textSlashjavascript | module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpScriptType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonpScriptType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpScriptType")(js.undefined)
        ret
    }
    @scala.inline
    def withLibrary(value: String | js.Array[String] | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("library")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("library")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryExport(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryExport")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryTarget(value: LibraryTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPathinfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathinfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withUmdNamedDefine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umdNamedDefine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUmdNamedDefine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umdNamedDefine")(js.undefined)
        ret
    }
  }
  
}

