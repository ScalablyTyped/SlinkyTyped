package typingsSlinky.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("source-map", "SourceNode")
@js.native
class SourceNode () extends StObject {
  def this(
    line: Double | Null,
    column: Double | Null,
    source: String | Null,
    chunks: js.UndefOr[(js.Array[String | SourceNode]) | SourceNode | String],
    name: js.UndefOr[String]
  ) = this()
  
  def add(chunk: String): SourceNode = js.native
  def add(chunk: js.Array[String | SourceNode]): SourceNode = js.native
  def add(chunk: SourceNode): SourceNode = js.native
  
  var children: js.Array[SourceNode] = js.native
  
  var column: Double = js.native
  
  def join(sep: String): SourceNode = js.native
  
  var line: Double = js.native
  
  var name: String = js.native
  
  def prepend(chunk: String): SourceNode = js.native
  def prepend(chunk: js.Array[String | SourceNode]): SourceNode = js.native
  def prepend(chunk: SourceNode): SourceNode = js.native
  
  def replaceRight(pattern: String, replacement: String): SourceNode = js.native
  
  def setSourceContent(sourceFile: String, sourceContent: String): Unit = js.native
  
  var source: String = js.native
  
  var sourceContents: js.Any = js.native
  
  def toStringWithSourceMap(): CodeWithSourceMap = js.native
  def toStringWithSourceMap(startOfSourceMap: StartOfSourceMap): CodeWithSourceMap = js.native
  
  def walk(fn: js.Function2[/* chunk */ String, /* mapping */ MappedPosition, Unit]): Unit = js.native
  
  def walkSourceContents(fn: js.Function2[/* file */ String, /* content */ String, Unit]): Unit = js.native
}
/* static members */
object SourceNode {
  
  @JSImport("source-map", "SourceNode.fromStringWithSourceMap")
  @js.native
  def fromStringWithSourceMap(code: String, sourceMapConsumer: typingsSlinky.sourceMap.mod.SourceMapConsumer): SourceNode = js.native
  @JSImport("source-map", "SourceNode.fromStringWithSourceMap")
  @js.native
  def fromStringWithSourceMap(
    code: String,
    sourceMapConsumer: typingsSlinky.sourceMap.mod.SourceMapConsumer,
    relativePath: String
  ): SourceNode = js.native
}
