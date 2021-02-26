package typingsSlinky.yog2Kernel

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.nodeRal.mod.Config
import typingsSlinky.nodeRal.mod.ConfigNormalizer
import typingsSlinky.nodeRal.mod.RAL.RalRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CleanCache extends StObject {
    
    // 清除viewcache
    def cleanCache(): Unit = js.native
  }
  object CleanCache {
    
    @scala.inline
    def apply(cleanCache: () => Unit): CleanCache = {
      val __obj = js.Dynamic.literal(cleanCache = js.Any.fromFunction0(cleanCache))
      __obj.asInstanceOf[CleanCache]
    }
    
    @scala.inline
    implicit class CleanCacheMutableBuilder[Self <: CleanCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanCache(value: () => Unit): Self = StObject.set(x, "cleanCache", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofRAL extends StObject {
    
    def apply(serviceName: String): RalRunner = js.native
    def apply(serviceName: String, options: js.Object): RalRunner = js.native
    
    var NormalizerManager: Instantiable0[typingsSlinky.nodeRal.mod.RAL.NormalizerManager] = js.native
    
    var RalRunner: Instantiable1[/* serviceName */ String, typingsSlinky.nodeRal.mod.RAL.RalRunner] = js.native
    
    def appendExtPath(extPath: String): Unit = js.native
    
    def getConf(name: String): Config = js.native
    
    def getRawConf(name: String): Config = js.native
    
    def init(): Unit = js.native
    def init(options: js.Object): Unit = js.native
    
    def reload(): Unit = js.native
    def reload(options: js.Object): Unit = js.native
    
    def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = js.native
  }
  
  @js.native
  trait TypeofRALPromise extends StObject {
    
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
}
