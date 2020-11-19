package typingsSlinky.sourceListMap

import typingsSlinky.sourceListMap.anon.File
import typingsSlinky.sourceListMap.anon.Map
import typingsSlinky.sourceListMap.anon.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("source-list-map", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def fromStringWithSourceMap(code: String, map: Sources): SourceListMap = js.native
  
  @js.native
  class CodeNode protected () extends js.Object {
    def this(generatedCode: String) = this()
    
    def addGeneratedCode(generatedCode: String): Unit = js.native
    
    var generatedCode: String = js.native
    
    def getGeneratedCode(): String = js.native
    
    def getMappings(): String = js.native
    def getMappings(mappingsContext: MappingsContext): String = js.native
    
    def mapGeneratedCode(fn: js.Function1[/* code */ String, String]): Unit = js.native
  }
  
  @js.native
  class MappingsContext () extends js.Object {
    
    var currentOriginalLine: Double = js.native
    
    var currentSource: Double = js.native
    
    def ensureSource(source: String, originalSource: String): Double = js.native
    
    var hasSourceContent: Boolean = js.native
    
    var sources: js.Array[String] = js.native
    
    var sourcesContent: js.Array[String] = js.native
  }
  
  @js.native
  class SourceListMap () extends js.Object {
    def this(generatedCode: String) = this()
    def this(generatedCode: js.Array[SourceNode | CodeNode]) = this()
    def this(generatedCode: CodeNode) = this()
    def this(generatedCode: SourceListMap) = this()
    def this(generatedCode: SourceNode) = this()
    def this(generatedCode: js.UndefOr[scala.Nothing], source: String) = this()
    def this(generatedCode: String, source: String) = this()
    def this(generatedCode: CodeNode, source: String) = this()
    def this(generatedCode: SourceListMap, source: String) = this()
    def this(generatedCode: SourceNode, source: String) = this()
    def this(
      generatedCode: js.UndefOr[scala.Nothing],
      source: js.UndefOr[scala.Nothing],
      originalSource: String
    ) = this()
    def this(generatedCode: js.UndefOr[scala.Nothing], source: String, originalSource: String) = this()
    def this(generatedCode: String, source: js.UndefOr[scala.Nothing], originalSource: String) = this()
    def this(generatedCode: String, source: String, originalSource: String) = this()
    def this(generatedCode: CodeNode, source: js.UndefOr[scala.Nothing], originalSource: String) = this()
    def this(generatedCode: CodeNode, source: String, originalSource: String) = this()
    def this(generatedCode: SourceListMap, source: js.UndefOr[scala.Nothing], originalSource: String) = this()
    def this(generatedCode: SourceListMap, source: String, originalSource: String) = this()
    def this(generatedCode: SourceNode, source: js.UndefOr[scala.Nothing], originalSource: String) = this()
    def this(generatedCode: SourceNode, source: String, originalSource: String) = this()
    
    def add(generatedCode: String): Unit = js.native
    def add(generatedCode: String, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def add(generatedCode: String, source: String): Unit = js.native
    def add(generatedCode: String, source: String, originalSource: String): Unit = js.native
    def add(generatedCode: CodeNode): Unit = js.native
    def add(generatedCode: CodeNode, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def add(generatedCode: CodeNode, source: String): Unit = js.native
    def add(generatedCode: CodeNode, source: String, originalSource: String): Unit = js.native
    def add(generatedCode: SourceListMap): Unit = js.native
    def add(generatedCode: SourceListMap, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def add(generatedCode: SourceListMap, source: String): Unit = js.native
    def add(generatedCode: SourceListMap, source: String, originalSource: String): Unit = js.native
    def add(generatedCode: SourceNode): Unit = js.native
    def add(generatedCode: SourceNode, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def add(generatedCode: SourceNode, source: String): Unit = js.native
    def add(generatedCode: SourceNode, source: String, originalSource: String): Unit = js.native
    
    var children: js.Array[SourceNode | CodeNode] = js.native
    
    def mapGeneratedCode(fn: js.Function1[/* code */ String, String]): Unit = js.native
    
    def prepend(generatedCode: CodeNode): Unit = js.native
    def prepend(generatedCode: CodeNode, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def prepend(generatedCode: CodeNode, source: String): Unit = js.native
    def prepend(generatedCode: CodeNode, source: String, originalSource: String): Unit = js.native
    def prepend(generatedCode: SourceListMap): Unit = js.native
    def prepend(generatedCode: SourceListMap, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def prepend(generatedCode: SourceListMap, source: String): Unit = js.native
    def prepend(generatedCode: SourceListMap, source: String, originalSource: String): Unit = js.native
    def prepend(generatedCode: SourceNode): Unit = js.native
    def prepend(generatedCode: SourceNode, source: js.UndefOr[scala.Nothing], originalSource: String): Unit = js.native
    def prepend(generatedCode: SourceNode, source: String): Unit = js.native
    def prepend(generatedCode: SourceNode, source: String, originalSource: String): Unit = js.native
    
    def toStringWithSourceMap(options: File): Map = js.native
  }
  
  @js.native
  class SourceNode protected () extends js.Object {
    def this(generatedCode: String, source: String, originalSource: String) = this()
    def this(generatedCode: String, source: String, originalSource: String, startingLine: Double) = this()
    
    var generatedCode: String = js.native
    
    def getGeneratedCode(): String = js.native
    
    def getMappings(mappingsContext: MappingsContext): String = js.native
    
    def mapGeneratedCode(fn: js.Function1[/* code */ String, String]): Unit = js.native
    
    var originalSource: String = js.native
    
    var source: String = js.native
    
    var startingLine: Double = js.native
  }
}
