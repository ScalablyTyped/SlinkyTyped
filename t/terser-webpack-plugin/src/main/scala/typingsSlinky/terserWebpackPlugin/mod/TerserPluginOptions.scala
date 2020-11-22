package typingsSlinky.terserWebpackPlugin.mod

import typingsSlinky.terser.mod.MinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerserPluginOptions extends js.Object {
  
  /**
    * Files to exclude.
    * @default undefined
    */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  
  /**
    * Whether comments shall be extracted to a separate file, (see details).
    * By default extract only comments using /^\**!|@preserve|@license|@cc_on/i regexp condition and remove remaining comments.
    * If the original file is named foo.js, then the comments will be stored to foo.js.LICENSE.txt.
    * The terserOptions.output.comments option specifies whether the comment will be preserved,
    * i.e. it is possible to preserve some comments (e.g. annotations) while extracting others or even preserving comments that have been extracted
    * @default true
    */
  var extractComments: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentFn | ExtractCommentOptions] = js.native
  
  /**
    * Files to include.
    * @default undefined
    */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  
  /**
    * Allows you to override default minify function.
    * By default plugin uses terser package. Useful for using and testing unpublished versions or forks
    * @default undefined
    */
  var minify: js.UndefOr[
    js.Function3[
      /* file */ js.Any, 
      /* sourceMap */ js.Any, 
      /* minimizerOptions */ js.UndefOr[MinifyOptions], 
      MinifyResult
    ]
  ] = js.native
  
  /**
    * Enable/disable multi-process parallel running.
    * Use multi-process parallel running to improve the build speed. Default number of concurrent runs: os.cpus().length - 1.
    * @default true
    */
  var parallel: js.UndefOr[Boolean | Double] = js.native
  
  /**
    * Terser minify {@link https://github.com/terser/terser#minify-options|options}.
    */
  var terserOptions: js.UndefOr[MinifyOptions] = js.native
  
  /**
    * Test to match files against.
    * @default /\.m?js(\?.*)?$/i
    */
  var test: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
}
object TerserPluginOptions {
  
  @scala.inline
  def apply(): TerserPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerserPluginOptions]
  }
  
  @scala.inline
  implicit class TerserPluginOptionsOps[Self <: TerserPluginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludeVarargs(value: (String | js.RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeRegExp(value: js.RegExp): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtractCommentsFunction2(value: (/* astNode */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = this.set("extractComments", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExtractCommentsRegExp(value: js.RegExp): Self = this.set("extractComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractComments(value: Boolean | String | js.RegExp | ExtractCommentFn | ExtractCommentOptions): Self = this.set("extractComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractComments: Self = this.set("extractComments", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | js.RegExp)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRegExp(value: js.RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMinify(
      value: (/* file */ js.Any, /* sourceMap */ js.Any, /* minimizerOptions */ js.UndefOr[MinifyOptions]) => MinifyResult
    ): Self = this.set("minify", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean | Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setTerserOptions(value: MinifyOptions): Self = this.set("terserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerserOptions: Self = this.set("terserOptions", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: (String | js.RegExp)*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTestRegExp(value: js.RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
