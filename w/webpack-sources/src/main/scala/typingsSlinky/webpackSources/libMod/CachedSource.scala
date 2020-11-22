package typingsSlinky.webpackSources.libMod

import typingsSlinky.webpackSources.cachedSourceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
  * Every other operation is delegated to the wrapped Source.
  */
@JSImport("webpack-sources/lib", "CachedSource")
@js.native
class CachedSource protected () extends ^ {
  def this(source: typingsSlinky.webpackSources.sourceMod.^) = this()
  def this(source: js.Function0[typingsSlinky.webpackSources.sourceMod.^], cachedData: CachedData) = this()
  def this(source: Null, cachedData: CachedData) = this()
}
