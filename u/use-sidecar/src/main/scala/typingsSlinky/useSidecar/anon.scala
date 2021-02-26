package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useSidecar.typesMod.MediumCallback
import typingsSlinky.useSidecar.typesMod.removeCb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children[T /* <: js.Array[_] */] extends StObject {
    
    def children(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
    ): js.Any = js.native
  }
  object Children {
    
    @scala.inline
    def apply[T /* <: js.Array[_] */](children: T => js.Any): Children[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children[T]]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children[_], T /* <: js.Array[_] */] (val x: Self with Children[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: T => js.Any): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Default[T] extends StObject {
    
    var default: T = js.native
  }
  object Default {
    
    @scala.inline
    def apply[T](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[_], T] (val x: Self with Default[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/config.IConfig> */
  @js.native
  trait PartialIConfig extends StObject {
    
    var onError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
  }
  object PartialIConfig {
    
    @scala.inline
    def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    @scala.inline
    implicit class PartialIConfigMutableBuilder[Self <: PartialIConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnError(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
  @js.native
  trait ReadonlySideCarMedium extends StObject {
    
    val assignMedium: js.Function1[/* handler */ MediumCallback[ReactComponentClass[js.Object]], Unit] = js.native
    
    val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ReactComponentClass[js.Object]], Unit] = js.native
    
    val options: js.UndefOr[js.Object] = js.native
    
    val read: js.Function0[js.UndefOr[ReactComponentClass[js.Object]]] = js.native
    
    val useMedium: js.Function1[/* effect */ ReactComponentClass[js.Object], removeCb] = js.native
  }
  object ReadonlySideCarMedium {
    
    @scala.inline
    def apply(
      assignMedium: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit,
      assignSyncMedium: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit,
      read: () => js.UndefOr[ReactComponentClass[js.Object]],
      useMedium: /* effect */ ReactComponentClass[js.Object] => removeCb
    ): ReadonlySideCarMedium = {
      val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
      __obj.asInstanceOf[ReadonlySideCarMedium]
    }
    
    @scala.inline
    implicit class ReadonlySideCarMediumMutableBuilder[Self <: ReadonlySideCarMedium] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignMedium(value: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit): Self = StObject.set(x, "assignMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAssignSyncMedium(value: /* handler */ MediumCallback[ReactComponentClass[js.Object]] => Unit): Self = StObject.set(x, "assignSyncMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRead(value: () => js.UndefOr[ReactComponentClass[js.Object]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUseMedium(value: /* effect */ ReactComponentClass[js.Object] => removeCb): Self = StObject.set(x, "useMedium", js.Any.fromFunction1(value))
    }
  }
}
