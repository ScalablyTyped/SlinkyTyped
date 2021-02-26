package typingsSlinky.sharp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  //#region Constructor functions
  /**
    * Creates a sharp instance from an image
    * @param input Buffer containing JPEG, PNG, WebP, GIF, SVG, TIFF or raw pixel image data, or String containing the path to an JPEG, PNG, WebP, GIF, SVG or TIFF image file.
    * @param options Object with optional attributes.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  @scala.inline
  def apply(): typingsSlinky.sharp.mod.Sharp = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  @scala.inline
  def apply(input: js.UndefOr[scala.Nothing], options: typingsSlinky.sharp.mod.SharpOptions): typingsSlinky.sharp.mod.Sharp = (typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  @scala.inline
  def apply(input: java.lang.String): typingsSlinky.sharp.mod.Sharp = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  @scala.inline
  def apply(input: java.lang.String, options: typingsSlinky.sharp.mod.SharpOptions): typingsSlinky.sharp.mod.Sharp = (typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  @scala.inline
  def apply(input: typingsSlinky.node.Buffer): typingsSlinky.sharp.mod.Sharp = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  @scala.inline
  def apply(input: typingsSlinky.node.Buffer, options: typingsSlinky.sharp.mod.SharpOptions): typingsSlinky.sharp.mod.Sharp = (typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  @scala.inline
  def apply(options: typingsSlinky.sharp.mod.SharpOptions): typingsSlinky.sharp.mod.Sharp = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sharp.mod.Sharp]
  
  type Color = java.lang.String | typingsSlinky.sharp.mod.RGBA
  
  type Gravity_ = scala.Double | java.lang.String
  
  type Matrix3x3 = js.Tuple3[
    js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Tuple3[scala.Double, scala.Double, scala.Double]
  ]
  
  @scala.inline
  def bool: typingsSlinky.sharp.mod.BoolEnum = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bool").asInstanceOf[typingsSlinky.sharp.mod.BoolEnum]
  
  //#endregion
  //#region Utility functions
  /**
    * Gets or, when options are provided, sets the limits of libvips' operation cache.
    * Existing entries in the cache will be trimmed after any change in limits.
    * This method always returns cache statistics, useful for determining how much working memory is required for a particular task.
    * @param options Object with the following attributes, or Boolean where true uses default cache settings and false removes all caching (optional, default true)
    * @returns The cache results.
    */
  @scala.inline
  def cache(): typingsSlinky.sharp.mod.CacheResult = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cache")().asInstanceOf[typingsSlinky.sharp.mod.CacheResult]
  @scala.inline
  def cache(options: scala.Boolean): typingsSlinky.sharp.mod.CacheResult = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cache")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sharp.mod.CacheResult]
  @scala.inline
  def cache(options: typingsSlinky.sharp.mod.CacheOptions): typingsSlinky.sharp.mod.CacheResult = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cache")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sharp.mod.CacheResult]
  
  /**
    * Gets or sets the number of threads libvips' should create to process each image.
    * The default value is the number of CPU cores. A value of 0 will reset to this default.
    * The maximum number of images that can be processed in parallel is limited by libuv's UV_THREADPOOL_SIZE environment variable.
    * @param concurrency The new concurrency value.
    * @returns The current concurrency value.
    */
  @scala.inline
  def concurrency(): scala.Double = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("concurrency")().asInstanceOf[scala.Double]
  @scala.inline
  def concurrency(concurrency: scala.Double): scala.Double = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("concurrency")(concurrency.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  /**
    * Provides access to internal task counters.
    * @returns Object containing task counters
    */
  @scala.inline
  def counters(): typingsSlinky.sharp.mod.SharpCounters = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("counters")().asInstanceOf[typingsSlinky.sharp.mod.SharpCounters]
  
  @scala.inline
  def fit: typingsSlinky.sharp.mod.FitEnum = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fit").asInstanceOf[typingsSlinky.sharp.mod.FitEnum]
  
  /** Object containing nested boolean values representing the available input and output formats/methods. */
  @scala.inline
  def format: typingsSlinky.sharp.mod.FormatEnum = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("format").asInstanceOf[typingsSlinky.sharp.mod.FormatEnum]
  
  //#endregion
  @scala.inline
  def gravity: typingsSlinky.sharp.mod.GravityEnum = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("gravity").asInstanceOf[typingsSlinky.sharp.mod.GravityEnum]
  
  @scala.inline
  def kernel: typingsSlinky.sharp.mod.KernelEnum = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("kernel").asInstanceOf[typingsSlinky.sharp.mod.KernelEnum]
  
  /** An EventEmitter that emits a change event when a task is either queued, waiting for libuv to provide a worker thread, complete */
  @scala.inline
  def queue: typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("queue").asInstanceOf[typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter]
  
  /**
    * Get and set use of SIMD vector unit instructions. Requires libvips to have been compiled with liborc support.
    * Improves the performance of resize, blur and sharpen operations by taking advantage of the SIMD vector unit of the CPU, e.g. Intel SSE and ARM NEON.
    * @param enable enable or disable use of SIMD vector unit instructions
    * @returns true if usage of SIMD vector unit instructions is enabled
    */
  @scala.inline
  def simd(): scala.Boolean = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("simd")().asInstanceOf[scala.Boolean]
  @scala.inline
  def simd(enable: scala.Boolean): scala.Boolean = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("simd")(enable.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def strategy: typingsSlinky.sharp.mod.StrategyEnum = typingsSlinky.sharp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("strategy").asInstanceOf[typingsSlinky.sharp.mod.StrategyEnum]
}
