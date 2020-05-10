package typingsSlinky.webpack.mod.Options

import typingsSlinky.webpack.mod.Plugin
import typingsSlinky.webpack.webpackBooleans.`false`
import typingsSlinky.webpack.webpackStrings.`total-size`
import typingsSlinky.webpack.webpackStrings.hashed
import typingsSlinky.webpack.webpackStrings.multiple
import typingsSlinky.webpack.webpackStrings.named
import typingsSlinky.webpack.webpackStrings.natural
import typingsSlinky.webpack.webpackStrings.single
import typingsSlinky.webpack.webpackStrings.size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optimization extends js.Object {
  /** Tells webpack which algorithm to use when choosing chunk ids. Default false. */
  var chunkIds: js.UndefOr[Boolean | natural | named | size | `total-size`] = js.native
  /** Tries to find segments of the module graph which can be safely concatenated into a single module. Depends on optimization.providedExports and optimization.usedExports. */
  var concatenateModules: js.UndefOr[Boolean] = js.native
  /** Chunks which are subsets of other chunks are determined and flagged in a way that subsets don’t have to be loaded when the bigger chunk has been loaded. */
  var flagIncludedChunks: js.UndefOr[Boolean] = js.native
  /** Equal chunks are merged. This results in less code generation and faster builds. */
  var mergeDuplicateChunks: js.UndefOr[Boolean] = js.native
  /** Use the minimizer (optimization.minimizer, by default uglify-js) to minimize output assets. */
  var minimize: js.UndefOr[Boolean] = js.native
  /** Minimizer(s) to use for minimizing the output */
  var minimizer: js.UndefOr[js.Array[Plugin | typingsSlinky.tapable.mod.Tapable.Plugin]] = js.native
  /** Tells webpack which algorithm to use when choosing module ids. Default false. */
  var moduleIds: js.UndefOr[Boolean | natural | named | hashed | size | `total-size`] = js.native
  /** Instead of numeric ids, give chunks readable names for better debugging. */
  var namedChunks: js.UndefOr[Boolean] = js.native
  /** Instead of numeric ids, give modules readable names for better debugging. */
  var namedModules: js.UndefOr[Boolean] = js.native
  /** Avoid emitting assets when errors occur. */
  var noEmitOnErrors: js.UndefOr[Boolean] = js.native
  /** Defines the process.env.NODE_ENV constant to a compile-time-constant value. This allows to remove development only code from code. */
  var nodeEnv: js.UndefOr[String | `false`] = js.native
  /** Give more often used ids smaller (shorter) values. */
  var occurrenceOrder: js.UndefOr[Boolean] = js.native
  /** Generate records with relative paths to be able to move the context folder". */
  var portableRecords: js.UndefOr[Boolean] = js.native
  /** Determine exports for each module when possible. This information is used by other optimizations or code generation. I. e. to generate more efficient code for export * from. */
  var providedExports: js.UndefOr[Boolean] = js.native
  /**
    *  Modules are removed from chunks when they are already available in all parent chunk groups.
    *  This reduces asset size. Smaller assets also result in faster builds since less code generation has to be performed.
    */
  var removeAvailableModules: js.UndefOr[Boolean] = js.native
  /** Empty chunks are removed. This reduces load in filesystem and results in faster builds. */
  var removeEmptyChunks: js.UndefOr[Boolean] = js.native
  /** Create a separate chunk for the webpack runtime code and chunk hash maps. This chunk should be inlined into the HTML */
  var runtimeChunk: js.UndefOr[Boolean | single | multiple | RuntimeChunkOptions] = js.native
  /**
    *  Recognise the sideEffects flag in package.json or rules to eliminate modules. This depends on optimization.providedExports and optimization.usedExports.
    *  These dependencies have a cost, but eliminating modules has positive impact on performance because of less code generation. It depends on your codebase.
    *  Try it for possible performance wins.
    */
  var sideEffects: js.UndefOr[Boolean] = js.native
  /** Finds modules which are shared between chunk and splits them into separate chunks to reduce duplication or separate vendor modules from application modules. */
  var splitChunks: js.UndefOr[SplitChunksOptions | `false`] = js.native
  /**
    *  Determine used exports for each module. This depends on optimization.providedExports. This information is used by other optimizations or code generation.
    *  I. e. exports are not generated for unused exports, export names are mangled to single char identifiers when all usages are compatible.
    *  DCE in minimizers will benefit from this and can remove unused exports.
    */
  var usedExports: js.UndefOr[Boolean] = js.native
}

object Optimization {
  @scala.inline
  def apply(): Optimization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optimization]
  }
  @scala.inline
  implicit class OptimizationOps[Self <: Optimization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkIds(value: Boolean | natural | named | size | `total-size`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIds")(js.undefined)
        ret
    }
    @scala.inline
    def withConcatenateModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatenateModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcatenateModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatenateModules")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagIncludedChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagIncludedChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagIncludedChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagIncludedChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeDuplicateChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeDuplicateChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeDuplicateChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeDuplicateChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizer(value: js.Array[Plugin | typingsSlinky.tapable.mod.Tapable.Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizer")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleIds(value: Boolean | natural | named | hashed | size | `total-size`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmitOnErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmitOnErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeEnv(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeEnv")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPortableRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portableRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortableRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portableRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAvailableModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAvailableModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAvailableModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAvailableModules")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEmptyChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEmptyChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeChunk(value: Boolean | single | multiple | RuntimeChunkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitChunks(value: SplitChunksOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedExports")(js.undefined)
        ret
    }
  }
  
}

