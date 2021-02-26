package typingsSlinky.zipkin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.zipkin.anon.Ipv4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object model {
  
  @JSImport("zipkin", "model.Endpoint")
  @js.native
  class Endpoint protected () extends StObject {
    def this(args: Ipv4) = this()
    
    def isEmpty(): Boolean = js.native
    
    def setIpv4(ipv4: String): Unit = js.native
    
    def setPort(port: Double): Unit = js.native
    
    def setServiceName(serviceName: String): Unit = js.native
  }
  
  @JSImport("zipkin", "model.Span")
  @js.native
  class Span protected () extends StObject {
    def this(traceId: TraceId) = this()
    
    def addAnnotation(timestamp: Double, value: String): Unit = js.native
    
    val annotations: js.Array[typingsSlinky.zipkin.mod.model.Annotation] = js.native
    
    val debug: Boolean = js.native
    
    val duration: js.UndefOr[Double] = js.native
    
    val id: String = js.native
    
    val kind: js.UndefOr[String] = js.native
    
    val localEndpoint: js.UndefOr[Endpoint] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val parentId: js.UndefOr[String] = js.native
    
    def putTag(key: String, value: String): Unit = js.native
    
    val remoteEndpoint: js.UndefOr[Endpoint] = js.native
    
    def setDebug(debug: Boolean): Unit = js.native
    
    def setDuration(duration: Double): Unit = js.native
    
    def setKind(kind: String): Unit = js.native
    
    def setLocalEndpoint(endpoint: Endpoint): Unit = js.native
    
    def setName(name: String): Unit = js.native
    
    def setRemoteEndpoint(endpoint: Endpoint): Unit = js.native
    
    def setShared(shared: Boolean): Unit = js.native
    
    def setTimestamp(timestamp: Double): Unit = js.native
    
    val shared: Boolean = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val timestamp: js.UndefOr[Double] = js.native
    
    val traceId: String = js.native
  }
  
  @js.native
  trait Annotation extends StObject {
    
    var timestamp: Double = js.native
    
    var value: String = js.native
  }
  object Annotation {
    
    @scala.inline
    def apply(timestamp: Double, value: String): typingsSlinky.zipkin.mod.model.Annotation = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.zipkin.mod.model.Annotation]
    }
    
    @scala.inline
    implicit class AnnotationMutableBuilder[Self <: typingsSlinky.zipkin.mod.model.Annotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
