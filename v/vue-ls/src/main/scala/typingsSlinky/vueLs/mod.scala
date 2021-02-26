package typingsSlinky.vueLs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.vue.pluginMod.PluginObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-ls", JSImport.Default)
  @js.native
  val default: PluginObject[Options] = js.native
  
  @js.native
  sealed trait Types extends StObject
  @JSImport("vue-ls", "Types")
  @js.native
  object Types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Types with String] = js.native
    
    @js.native
    sealed trait Local extends Types
    /* "local" */ val Local: typingsSlinky.vueLs.mod.Types.Local with String = js.native
    
    @js.native
    sealed trait Memory extends Types
    /* "memory" */ val Memory: typingsSlinky.vueLs.mod.Types.Memory with String = js.native
    
    @js.native
    sealed trait Session extends Types
    /* "session" */ val Session: typingsSlinky.vueLs.mod.Types.Session with String = js.native
  }
  
  @JSImport("vue-ls", "WebStorage")
  @js.native
  class WebStorage protected () extends StObject {
    def this(storage: Types) = this()
    
    def clear(): Unit = js.native
    
    def get(name: String): js.Any = js.native
    def get(name: String, `def`: js.Any): js.Any = js.native
    
    def key(index: Double): String | Null = js.native
    
    var length: Double = js.native
    
    def off(name: String, callback: js.Function0[Unit]): Unit = js.native
    
    def on(name: String, callback: js.Function0[Unit]): Unit = js.native
    
    def remove(name: String): Unit = js.native
    
    def set(name: String, value: js.Any): Unit = js.native
    def set(name: String, value: js.Any, expire: Double): Unit = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: Options): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var storage: js.UndefOr[Types] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setStorage(value: Types): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  type _To = PluginObject[Options]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginObject[Options] = default
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$ls")
      var $ls: WebStorage = js.native
    }
    object Vue {
      
      @scala.inline
      def apply($ls: WebStorage): Vue = {
        val __obj = js.Dynamic.literal($ls = $ls.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vue]
      }
      
      @scala.inline
      implicit class VueMutableBuilder[Self <: Vue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$ls(value: WebStorage): Self = StObject.set(x, "$ls", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait VueConstructor extends StObject {
      
      var ls: WebStorage = js.native
    }
    object VueConstructor {
      
      @scala.inline
      def apply(ls: WebStorage): VueConstructor = {
        val __obj = js.Dynamic.literal(ls = ls.asInstanceOf[js.Any])
        __obj.asInstanceOf[VueConstructor]
      }
      
      @scala.inline
      implicit class VueConstructorMutableBuilder[Self <: VueConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLs(value: WebStorage): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
      }
    }
  }
}
