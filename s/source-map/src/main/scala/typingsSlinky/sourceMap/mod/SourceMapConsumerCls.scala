package typingsSlinky.sourceMap.mod

import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("source-map", "SourceMapConsumer")
@js.native
class SourceMapConsumerCls protected () extends Promise[BasicSourceMapConsumer] {
  def this(rawSourceMap: RawSourceMap) = this()
  def this(rawSourceMap: RawSourceMap, sourceMapUrl: SourceMapUrl) = this()
}
