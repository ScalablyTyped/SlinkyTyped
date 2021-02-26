package typingsSlinky.sourceListMap

import typingsSlinky.sourceListMap.mod.CodeNode
import typingsSlinky.sourceListMap.mod.SourceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait File extends StObject {
    
    var file: js.Any = js.native
  }
  object File {
    
    @scala.inline
    def apply(file: js.Any): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Map extends StObject {
    
    var map: Mappings = js.native
    
    var source: String = js.native
  }
  object Map {
    
    @scala.inline
    def apply(map: Mappings, source: String): Map = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: Mappings): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mappings extends StObject {
    
    var file: js.Any = js.native
    
    var mappings: String = js.native
    
    var sources: js.Array[String] = js.native
    
    var sourcesContent: js.Array[String] = js.native
    
    var version: Double = js.native
  }
  object Mappings {
    
    @scala.inline
    def apply(
      file: js.Any,
      mappings: String,
      sources: js.Array[String],
      sourcesContent: js.Array[String],
      version: Double
    ): Mappings = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mappings]
    }
    
    @scala.inline
    implicit class MappingsMutableBuilder[Self <: Mappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sources extends StObject {
    
    var mappings: String = js.native
    
    var sources: js.Array[String | SourceNode | CodeNode] = js.native
    
    var sourcesContent: js.Array[String] = js.native
  }
  object Sources {
    
    @scala.inline
    def apply(
      mappings: String,
      sources: js.Array[String | SourceNode | CodeNode],
      sourcesContent: js.Array[String]
    ): Sources = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sources]
    }
    
    @scala.inline
    implicit class SourcesMutableBuilder[Self <: Sources] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[String | SourceNode | CodeNode]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: (String | SourceNode | CodeNode)*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
}
