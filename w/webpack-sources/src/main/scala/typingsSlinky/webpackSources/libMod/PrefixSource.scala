package typingsSlinky.webpackSources.libMod

import typingsSlinky.webpackSources.prefixSourceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prefix every line of the decorated Source with a provided string.
  */
@JSImport("webpack-sources/lib", "PrefixSource")
@js.native
class PrefixSource protected () extends ^ {
  def this(prefix: String, source: String) = this()
  def this(prefix: String, source: typingsSlinky.webpackSources.sourceMod.^) = this()
  def this(prefix: typingsSlinky.webpackSources.sourceMod.^, source: String) = this()
  def this(prefix: typingsSlinky.webpackSources.sourceMod.^, source: typingsSlinky.webpackSources.sourceMod.^) = this()
}
