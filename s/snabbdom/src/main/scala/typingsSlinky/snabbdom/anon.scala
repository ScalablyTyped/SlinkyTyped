package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.hooksMod.CreateHook
import typingsSlinky.snabbdom.hooksMod.DestroyHook
import typingsSlinky.snabbdom.hooksMod.PostHook
import typingsSlinky.snabbdom.hooksMod.PreHook
import typingsSlinky.snabbdom.hooksMod.RemoveHook
import typingsSlinky.snabbdom.hooksMod.UpdateHook
import typingsSlinky.snabbdom.vnodeMod.VNode_
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Delayed extends StObject {
    
    var delayed: js.UndefOr[Record[String, String]] = js.native
    
    var remove: js.UndefOr[Record[String, String]] = js.native
  }
  object Delayed {
    
    @scala.inline
    def apply(): Delayed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delayed]
    }
    
    @scala.inline
    implicit class DelayedMutableBuilder[Self <: Delayed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayed(value: Record[String, String]): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
      
      @scala.inline
      def setRemove(value: Record[String, String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  /* Inlined std.Partial<snabbdom.snabbdom/build/package/modules/module.Module> */
  @js.native
  trait PartialModule extends StObject {
    
    var create: js.UndefOr[CreateHook] = js.native
    
    var destroy: js.UndefOr[DestroyHook] = js.native
    
    var post: js.UndefOr[PostHook] = js.native
    
    var pre: js.UndefOr[PreHook] = js.native
    
    var remove: js.UndefOr[RemoveHook] = js.native
    
    var update: js.UndefOr[UpdateHook] = js.native
  }
  object PartialModule {
    
    @scala.inline
    def apply(): PartialModule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModule]
    }
    
    @scala.inline
    implicit class PartialModuleMutableBuilder[Self <: PartialModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* vNode */ VNode_ => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setPost(value: () => js.Any): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPre(value: () => js.Any): Self = StObject.set(x, "pre", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
