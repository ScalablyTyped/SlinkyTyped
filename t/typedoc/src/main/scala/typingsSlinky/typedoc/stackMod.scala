package typingsSlinky.typedoc

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/utils/resources/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  
  @js.native
  abstract class Resource protected () extends js.Object {
    def this(origin: ResourceOrigin[_], name: String, fileName: String) = this()
    
    var fileName: String = js.native
    
    def getName(): String = js.native
    
    var name: String = js.native
    
    var origin: ResourceOrigin[_] = js.native
  }
  
  @js.native
  trait ResourceClass[T /* <: Resource */]
    extends js.Function
       with Instantiable3[/* origin */ ResourceOrigin[T], /* name */ String, /* fileName */ String, T]
  
  @js.native
  class ResourceOrigin[T /* <: Resource */] protected () extends js.Object {
    def this(stack: ResourceStack[T], name: String, path: String) = this()
    
    var findResources: js.Any = js.native
    
    def getName(): String = js.native
    
    def getResource(name: String): js.UndefOr[T] = js.native
    
    def hasResource(name: String): Boolean = js.native
    
    def mergeResources(target: ResourceMap[T]): Unit = js.native
    
    var name: js.Any = js.native
    
    var path: js.Any = js.native
    
    var resources: js.Any = js.native
    
    var stack: js.Any = js.native
  }
  
  @js.native
  abstract class ResourceStack[T /* <: Resource */] protected () extends js.Object {
    def this(resourceClass: ResourceClass[T]) = this()
    def this(resourceClass: ResourceClass[T], resourceRegExp: js.RegExp) = this()
    
    def activate(): Boolean = js.native
    
    def addOrigin(name: String, path: String): Unit = js.native
    def addOrigin(name: String, path: String, ignoreErrors: Boolean): Unit = js.native
    
    def deactivate(): Boolean = js.native
    
    def getAllResources(): ResourceMap[T] = js.native
    
    def getOrigin(name: String): js.UndefOr[ResourceOrigin[T]] = js.native
    
    def getResource(name: String): js.UndefOr[T] = js.native
    
    def getResourceClass(): ResourceClass[T] = js.native
    
    def getResourceRegExp(): js.RegExp = js.native
    
    def hasOrigin(name: String): Boolean = js.native
    
    var isActive: js.Any = js.native
    
    var origins: js.Any = js.native
    
    def removeAllOrigins(): Unit = js.native
    
    def removeOrigin(name: String): Unit = js.native
    
    var resourceClass: js.Any = js.native
    
    var resourceRegExp: js.Any = js.native
  }
  
  type ResourceMap[T /* <: Resource */] = StringDictionary[T]
}
