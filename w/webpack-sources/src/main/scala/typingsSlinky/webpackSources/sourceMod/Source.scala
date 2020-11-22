package typingsSlinky.webpackSources.sourceMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.Hash
import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.webpackSources.libMod.MapOptions
import typingsSlinky.webpackSources.libMod.SourceAndMapResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all sources.
  * A Source can be asked for source code, size, source map and hash.
  */
@js.native
trait Source extends js.Object {
  
  /**
    * Returns the represented source code as Buffer. Strings are converted to utf-8.
    */
  def buffer(): Buffer = js.native
  
  /**
    * Returns the SourceMap of the represented source code as JSON.
    * May return `null` if no SourceMap is available.
    */
  def map(): RawSourceMap | Null = js.native
  def map(options: MapOptions): RawSourceMap | Null = js.native
  
  /**
    * Returns the size in chars of the represented source code.
    */
  def size(): Double = js.native
  
  /**
    * Returns the represented source code as string.
    */
  def source(): String | js.typedarray.ArrayBuffer = js.native
  
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  def sourceAndMap(): SourceAndMapResult = js.native
  def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
  
  /**
    * Updates the provided Hash object with the content of the represented source code.
    * (Hash is an object with an update method, which is called with string values)
    */
  def updateHash(hash: Hash): Unit = js.native
}
